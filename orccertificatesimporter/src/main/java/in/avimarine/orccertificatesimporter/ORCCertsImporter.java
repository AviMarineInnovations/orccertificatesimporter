package in.avimarine.orccertificatesimporter;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * This file is part of an Avi Marine Innovations project: RaceCommittee first created by aayaffe on
 * 29/09/2018.
 */
public class ORCCertsImporter {

  private static final String TAG = "ORCCertsImporter";

  static public void getCertsByCountry(CountryObj c, final CertsResponse cr){
    getCertsByCountry(c.getId(),cr);
  }
  static public void getCert (String name, String countryId, String sailNo, final CertsResponse cr){
    if (cr==null){
      Log.e(TAG, "Delegate is null");
      return;
    }

    RetrieveStreamTask rst = new RetrieveStreamTask();
    rst.delegate = new AsyncResponse() {
      @Override
      public void processFinish(String output) {
        String json = output;
        List<ORCCertObj> ret = new ArrayList<>();
        if (json!=null){
          try {
            JSONObject root = new JSONObject(json);
            JSONArray certsJson = root.getJSONArray("rms");

            for (int i=0; i<certsJson.length(); i++) {
              JSONObject jo = certsJson.getJSONObject(i);
              ORCCertObj cert = ORCCertObj.fromJSON(jo);
              ret.add(cert);
            }

          } catch (Exception e) {
            Log.d(TAG,"Error parsing certificates",e);
          }
          cr.response(ret);
        }
      }
    };
    rst.execute("http://data.orc.org/public/WPub.dll?action=DownBoatRMS&YachtName="+name+"&SailNo="+sailNo+"&CountryId="+countryId+"&ext=json");
  }

  static public void getCountries(final CountriesResponse cr) {
    if (cr==null){
      Log.e(TAG, "Delegate is null");
      return;
    }
    RetrieveStreamTask rst = new RetrieveStreamTask();
    rst.delegate = new AsyncResponse() {
      @Override
      public void processFinish(String output) {
        String xml = output;
        List<CountryObj> ret = new ArrayList<>();
        if (xml != null) {
          try {
            InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(is);
            Element element = doc.getDocumentElement();
            element.normalize();
//            NodeList data = doc.getElementsByTagName("DATA");
            NodeList nList = doc.getElementsByTagName("ROW");
            for (int i = 0; i < nList.getLength(); i++) {
              CountryObj co = new CountryObj();
              Node node = nList.item(i);
              if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element2 = (Element) node;
                String countryId = getValue("CountryId", element2);
                if (countryId==null){
                  continue;
                }
                co.setId(countryId);
                co.setName(getValue("CountryName", element2));
                Date date1=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSS").parse(getValue("LastUpdate",element2));
                co.setLastUpdate(date1);
                co.setCertificatesCount(Integer.valueOf(getValue("CertCount", element2)));
//                co.setClubCertCount(Integer.valueOf(getValue("ClubCert", element2)));
              }
              ret.add(co);
            }
          cr.response(ret);

          } catch (Exception e) {
            Log.e(TAG, "Error parsing countries XML", e);
          }
        }
      }
    };
    rst.execute("https://data.orc.org/public/WPub.dll");
  }

  static public void getCertsByCountry(String countryCode, final CertsResponse cr) {
    if (cr==null){
      Log.e(TAG, "Delegate is null");
      return;
    }
    else if(GeneralUtils.isNullOrEmpty(countryCode)){
      Log.e(TAG, "Country code is null or empty");
      return;
    }
    RetrieveStreamTask rst = new RetrieveStreamTask();
    rst.delegate = new AsyncResponse() {
      @Override
      public void processFinish(String output) {
        String json = output;
        List<ORCCertObj> ret = new ArrayList<>();
        if (json!=null){
          try {
            JSONObject root = new JSONObject(json);
            JSONArray certsJson = root.getJSONArray("rms");

            for (int i=0; i<certsJson.length(); i++) {
              JSONObject jo = certsJson.getJSONObject(i);
              ORCCertObj cert = ORCCertObj.fromJSON(jo);
              ret.add(cert);
            }
            cr.response(ret);
          } catch (Exception e) {
            Log.e(TAG,"Error parsing countries XML",e);
          }
        }
      }
    };
    rst.execute("http://data.orc.org/public/WPub.dll?action=DownRMS&CountryId="+countryCode+"&ext=json");
  }


  private static String getValue(String tag, Element element) {
    if (element==null)
      return null;
    try {
    NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
    Node node = nodeList.item(0);
    return node.getNodeValue();
    } catch (Exception e){
      return null;
    }
  }

}
