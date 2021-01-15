package in.avimarine.orccertificatesimporter;

import com.google.common.base.Charsets;
import com.google.common.io.CharStreams;

import junit.framework.Assert;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

class ORCCertObjTest {

    JSONObject testJson;
    public static final String UTF8_BOM = "\uFEFF";

    private static String removeUTF8BOM(String s) {
        if (s.startsWith(UTF8_BOM)) {
            s = s.substring(1);
        }
        return s;
    }
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        try {
            InputStream in = this.getClass().getClassLoader().getResourceAsStream("test.json");
            String content = CharStreams.toString(new InputStreamReader(
                    in, Charsets.UTF_8));
            content = removeUTF8BOM(content);
            testJson = new JSONObject(content.trim());

        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }

    @org.junit.jupiter.api.Test
    void fromJSON() throws JSONException {
        JSONArray certsJson = testJson.getJSONArray("rms");
        JSONObject jo = certsJson.getJSONObject(0);
        ORCCertObj cert = ORCCertObj.fromJSON(jo);

        Assert.assertEquals(1992,cert.getAgeYear());
        Assert.assertEquals(1.3298,cert.getTNOffshoreLow());
        Assert.assertEquals(399.4, cert.getAllowances().getR75().get(0));
    }
}