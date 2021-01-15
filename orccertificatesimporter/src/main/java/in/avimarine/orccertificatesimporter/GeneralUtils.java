package in.avimarine.orccertificatesimporter;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;

import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Patterns;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.Contract;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Avi Marine Innovations - www.avimarine.in
 *
 * Created by Amit Y. on 02/10/2015.
 */
public class GeneralUtils {

  public static boolean isNullOrEmpty(String s) {
    return s == null || s.isEmpty();
  }

}
