package in.avimarine.orccertificatesimporter;

import android.util.Log;

import androidx.annotation.Nullable;

import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * This file is part of an
 * Avi Marine Innovations project: sailscore
 * first created by aayaffe on 26/07/2018.
 */
public class ORCCertObj {
  private static final String TAG = "ORCCertObj";
  private String NatAuth;
  private String CertNo;
  private String RefNo;
  private String SailNo;
  private String YachtsName;
  private String YachtsClass;
  private ORCCertificateType CertType;
  private String Division;
  private Date IssueDate;
  private int AgeYear;
  private double LOA;
  private double TMFInshore;
  private double TMFOffshore;
  private double ILCWA; //ToD Inshore
  private double OSN; //ToD Offshore
  private double CDL;
  private double TNOffshoreLow;
  private double TNOffshoreMedium;
  private double TNOffshoreHigh;
  private double TNInshoreLow;
  private double TNInshoreMedium;
  private double TNInshoreHigh;
  private double TNDOffshoreLow;
  private double TNDOffshoreMedium;
  private double TNDOffshoreHigh;
  private double TNDInshoreLow;
  private double TNDInshoreMedium;
  private double TNDInshoreHigh;
  private ORCAllowancesObj Allowances;

  public String getNatAuth() {
    return NatAuth;
  }

  public void setNatAuth(String natAuth) {
    NatAuth = natAuth;
  }

  public String getCertNo() {
    return CertNo;
  }

  public void setCertNo(String certNo) {
    CertNo = certNo;
  }

  public String getRefNo() {
    return RefNo;
  }

  public void setRefNo(String refNo) {
    RefNo = refNo;
  }

  public String getSailNo() {
    return SailNo;
  }

  public void setSailNo(String sailNo) {
    SailNo = sailNo;
  }

  public String getYachtsName() {
    return YachtsName;
  }

  public void setYachtsName(String yachtsName) {
    YachtsName = yachtsName;
  }

  public String getYachtsClass() {
    return YachtsClass;
  }

  public void setYachtsClass(String yachtsClass) {
    YachtsClass = yachtsClass;
  }

  public ORCCertificateType getCertType() {
    return CertType;
  }

  public void setCertType(ORCCertificateType certType) {
    CertType = certType;
  }

  public String getDivision() {
    return Division;
  }

  public void setDivision(String division) {
    Division = division;
  }

  public Date getIssueDate() {
    return IssueDate;
  }

  public void setIssueDate(Date issueDate) {
    IssueDate = issueDate;
  }

  public int getAgeYear() {
    return AgeYear;
  }

  public void setAgeYear(int ageYear) {
    AgeYear = ageYear;
  }

  public double getLOA() {
    return LOA;
  }

  public void setLOA(double LOA) {
    this.LOA = LOA;
  }

  public double getTMFInshore() {
    return TMFInshore;
  }

  public void setTMFInshore(double TMFInshore) {
    this.TMFInshore = TMFInshore;
  }

  public double getTMFOffshore() {
    return TMFOffshore;
  }

  public void setTMFOffshore(double TMFOffshore) {
    this.TMFOffshore = TMFOffshore;
  }

  public double getILCWA() {
    return ILCWA;
  }

  public void setILCWA(double ILCWA) {
    this.ILCWA = ILCWA;
  }

  public double getOSN() {
    return OSN;
  }

  public void setOSN(double OSN) {
    this.OSN = OSN;
  }

  public double getCDL() {
    return CDL;
  }

  public void setCDL(double CDL) {
    this.CDL = CDL;
  }

  public double getTNOffshoreLow() {
    return TNOffshoreLow;
  }

  public void setTNOffshoreLow(double TNOffshoreLow) {
    this.TNOffshoreLow = TNOffshoreLow;
  }

  public double getTNOffshoreMedium() {
    return TNOffshoreMedium;
  }

  public void setTNOffshoreMedium(double TNOffshoreMedium) {
    this.TNOffshoreMedium = TNOffshoreMedium;
  }

  public double getTNOffshoreHigh() {
    return TNOffshoreHigh;
  }

  public void setTNOffshoreHigh(double TNOffshoreHigh) {
    this.TNOffshoreHigh = TNOffshoreHigh;
  }

  public double getTNInshoreLow() {
    return TNInshoreLow;
  }

  public void setTNInshoreLow(double TNInshoreLow) {
    this.TNInshoreLow = TNInshoreLow;
  }

  public double getTNInshoreMedium() {
    return TNInshoreMedium;
  }

  public void setTNInshoreMedium(double TNInshoreMedium) {
    this.TNInshoreMedium = TNInshoreMedium;
  }

  public double getTNInshoreHigh() {
    return TNInshoreHigh;
  }

  public void setTNInshoreHigh(double TNInshoreHigh) {
    this.TNInshoreHigh = TNInshoreHigh;
  }

  public double getTNDOffshoreLow() {
    return TNDOffshoreLow;
  }

  public void setTNDOffshoreLow(double TNDOffshoreLow) {
    this.TNDOffshoreLow = TNDOffshoreLow;
  }

  public double getTNDOffshoreMedium() {
    return TNDOffshoreMedium;
  }

  public void setTNDOffshoreMedium(double TNDOffshoreMedium) {
    this.TNDOffshoreMedium = TNDOffshoreMedium;
  }

  public double getTNDOffshoreHigh() {
    return TNDOffshoreHigh;
  }

  public void setTNDOffshoreHigh(double TNDOffshoreHigh) {
    this.TNDOffshoreHigh = TNDOffshoreHigh;
  }

  public double getTNDInshoreLow() {
    return TNDInshoreLow;
  }

  public void setTNDInshoreLow(double TNDInshoreLow) {
    this.TNDInshoreLow = TNDInshoreLow;
  }

  public double getTNDInshoreMedium() {
    return TNDInshoreMedium;
  }

  public void setTNDInshoreMedium(double TNDInshoreMedium) {
    this.TNDInshoreMedium = TNDInshoreMedium;
  }

  public double getTNDInshoreHigh() {
    return TNDInshoreHigh;
  }

  public void setTNDInshoreHigh(double TNDInshoreHigh) {
    this.TNDInshoreHigh = TNDInshoreHigh;
  }

  public ORCAllowancesObj getAllowances() {
    return Allowances;
  }

  public void setAllowances(ORCAllowancesObj allowances) {
    Allowances = allowances;
  }



  @Nullable
  static public ORCCertObj fromJSON(JSONObject jo) {
    if (jo == null)
      return null;
    ORCCertObj ret = new ORCCertObj();
    try{
      ret.setNatAuth(jo.getString("NatAuth"));
      ret.setCertNo(jo.getString("CertNo"));
      ret.setRefNo(jo.getString("RefNo"));
      ret.setSailNo(jo.getString("SailNo"));
      ret.setYachtsName(jo.getString("YachtName"));
      ret.setYachtsClass(jo.getString("Class"));
      ret.setCertType(ORCCertificateType.fromString(jo.getString("C_Type")));
      ret.setDivision(jo.getString("Division"));
      Date date1=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSS'Z'").parse(jo.getString("IssueDate"));
      ret.setIssueDate(date1);
      ret.setAgeYear(jo.getInt("Age_Year"));
      ret.setLOA(jo.getDouble("LOA"));
      ret.setCDL(jo.getDouble("CDL"));
      ret.setTMFInshore(jo.getDouble("TMF_Inshore"));
      ret.setTMFOffshore(jo.getDouble("TMF_Offshore"));
      ret.setILCWA(jo.getDouble("ILCWA"));
      ret.setOSN(jo.getDouble("OSN"));
      ret.setTNInshoreLow(jo.getDouble("TN_Inshore_Low"));
      ret.setTNInshoreMedium(jo.getDouble("TN_Inshore_Medium"));
      ret.setTNInshoreHigh(jo.getDouble("TN_Inshore_High"));
      ret.setTNOffshoreLow(jo.getDouble("TN_Offshore_Low"));
      ret.setTNOffshoreMedium(jo.getDouble("TN_Offshore_Medium"));
      ret.setTNOffshoreHigh(jo.getDouble("TN_Offshore_High"));
      ret.setTNDInshoreLow(jo.getDouble("TND_Inshore_Low"));
      ret.setTNDInshoreMedium(jo.getDouble("TND_Inshore_Medium"));
      ret.setTNDInshoreHigh(jo.getDouble("TND_Inshore_High"));
      ret.setTNDOffshoreLow(jo.getDouble("TND_Offshore_Low"));
      ret.setTNDOffshoreMedium(jo.getDouble("TND_Offshore_Medium"));
      ret.setTNDOffshoreHigh(jo.getDouble("TND_Offshore_High"));
      ORCAllowancesObj oao = new ORCAllowancesObj();
      JSONObject allowances = jo.getJSONObject("Allowances");
      oao.setWindSpeeds(JsonHelper.toList(allowances.getJSONArray("WindSpeeds")));
      oao.setWindAngles(JsonHelper.toList(allowances.getJSONArray("WindAngles")));
      oao.setBeat(JsonHelper.toList(allowances.getJSONArray("Beat")));
      oao.setRun(JsonHelper.toList(allowances.getJSONArray("Run")));
      oao.setBeatAngle(JsonHelper.toList(allowances.getJSONArray("BeatAngle")));
      oao.setGybeAngle(JsonHelper.toList(allowances.getJSONArray("GybeAngle")));
      oao.setWl(JsonHelper.toList(allowances.getJSONArray("WL")));
      oao.setCr(JsonHelper.toList(allowances.getJSONArray("CR")));
      oao.setOc(JsonHelper.toList(allowances.getJSONArray("OC")));
      oao.setNs(JsonHelper.toList(allowances.getJSONArray("NS")));
      oao.setOl(JsonHelper.toList(allowances.getJSONArray("OL")));
      oao.setR52(JsonHelper.toList(allowances.getJSONArray("R52")));
      oao.setR60(JsonHelper.toList(allowances.getJSONArray("R60")));
      oao.setR75(JsonHelper.toList(allowances.getJSONArray("R75")));
      oao.setR90(JsonHelper.toList(allowances.getJSONArray("R90")));
      oao.setR110(JsonHelper.toList(allowances.getJSONArray("R110")));
      oao.setR120(JsonHelper.toList(allowances.getJSONArray("R120")));
      oao.setR135(JsonHelper.toList(allowances.getJSONArray("R135")));
      oao.setR150(JsonHelper.toList(allowances.getJSONArray("R150")));
      ret.setAllowances(oao);

    }catch (Exception e){
      Log.e(TAG,"Error converting json to cert",e);
      return null;
    }

    return ret;
  }
}
