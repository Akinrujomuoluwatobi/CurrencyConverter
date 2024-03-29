
package com.royalteck.progtobi.currencyconverter.Model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//The Rates Model Also Used for Creating The Database Entity(Table) to Store Values for Currency
@Entity
public class Rates implements Parcelable
{
    @PrimaryKey(autoGenerate = true)
    public int rid;

    @SerializedName("AED")
    @Expose
    private Double aED;
    @SerializedName("AFN")
    @Expose
    private Double aFN;
    @SerializedName("ALL")
    @Expose
    private Double aLL;
    @SerializedName("AMD")
    @Expose
    private Double aMD;
    @SerializedName("ANG")
    @Expose
    private Double aNG;
    @SerializedName("AOA")
    @Expose
    private Double aOA;
    @SerializedName("ARS")
    @Expose
    private Double aRS;
    @SerializedName("AUD")
    @Expose
    private Double aUD;
    @SerializedName("AWG")
    @Expose
    private Double aWG;
    @SerializedName("AZN")
    @Expose
    private Double aZN;
    @SerializedName("BAM")
    @Expose
    private Double bAM;
    @SerializedName("BBD")
    @Expose
    private Double bBD;
    @SerializedName("BDT")
    @Expose
    private Double bDT;
    @SerializedName("BGN")
    @Expose
    private Double bGN;
    @SerializedName("BHD")
    @Expose
    private Double bHD;
    @SerializedName("BIF")
    @Expose
    private Double bIF;
    @SerializedName("BMD")
    @Expose
    private Double bMD;
    @SerializedName("BND")
    @Expose
    private Double bND;
    @SerializedName("BOB")
    @Expose
    private Double bOB;
    @SerializedName("BRL")
    @Expose
    private Double bRL;
    @SerializedName("BSD")
    @Expose
    private Double bSD;
    @SerializedName("BTC")
    @Expose
    private Double bTC;
    @SerializedName("BTN")
    @Expose
    private Double bTN;
    @SerializedName("BWP")
    @Expose
    private Double bWP;
    @SerializedName("BYN")
    @Expose
    private Double bYN;
    @SerializedName("BYR")
    @Expose
    private Double bYR;
    @SerializedName("BZD")
    @Expose
    private Double bZD;
    @SerializedName("CAD")
    @Expose
    private Double cAD;
    @SerializedName("CDF")
    @Expose
    private Double cDF;
    @SerializedName("CHF")
    @Expose
    private Double cHF;
    @SerializedName("CLF")
    @Expose
    private Double cLF;
    @SerializedName("CLP")
    @Expose
    private Double cLP;
    @SerializedName("CNY")
    @Expose
    private Double cNY;
    @SerializedName("COP")
    @Expose
    private Double cOP;
    @SerializedName("CRC")
    @Expose
    private Double cRC;
    @SerializedName("CUC")
    @Expose
    private Double cUC;
    @SerializedName("CUP")
    @Expose
    private Double cUP;
    @SerializedName("CVE")
    @Expose
    private Double cVE;
    @SerializedName("CZK")
    @Expose
    private Double cZK;
    @SerializedName("DJF")
    @Expose
    private Double dJF;
    @SerializedName("DKK")
    @Expose
    private Double dKK;
    @SerializedName("DOP")
    @Expose
    private Double dOP;
    @SerializedName("DZD")
    @Expose
    private Double dZD;
    @SerializedName("EGP")
    @Expose
    private Double eGP;
    @SerializedName("ERN")
    @Expose
    private Double eRN;
    @SerializedName("ETB")
    @Expose
    private Double eTB;
    @SerializedName("EUR")
    @Expose
    private Integer eUR;
    @SerializedName("FJD")
    @Expose
    private Double fJD;
    @SerializedName("FKP")
    @Expose
    private Double fKP;
    @SerializedName("GBP")
    @Expose
    private Double gBP;
    @SerializedName("GEL")
    @Expose
    private Double gEL;
    @SerializedName("GGP")
    @Expose
    private Double gGP;
    @SerializedName("GHS")
    @Expose
    private Double gHS;
    @SerializedName("GIP")
    @Expose
    private Double gIP;
    @SerializedName("GMD")
    @Expose
    private Double gMD;
    @SerializedName("GNF")
    @Expose
    private Double gNF;
    @SerializedName("GTQ")
    @Expose
    private Double gTQ;
    @SerializedName("GYD")
    @Expose
    private Double gYD;
    @SerializedName("HKD")
    @Expose
    private Double hKD;
    @SerializedName("HNL")
    @Expose
    private Double hNL;
    @SerializedName("HRK")
    @Expose
    private Double hRK;
    @SerializedName("HTG")
    @Expose
    private Double hTG;
    @SerializedName("HUF")
    @Expose
    private Double hUF;
    @SerializedName("IDR")
    @Expose
    private Double iDR;
    @SerializedName("ILS")
    @Expose
    private Double iLS;
    @SerializedName("IMP")
    @Expose
    private Double iMP;
    @SerializedName("INR")
    @Expose
    private Double iNR;
    @SerializedName("IQD")
    @Expose
    private Double iQD;
    @SerializedName("IRR")
    @Expose
    private Double iRR;
    @SerializedName("ISK")
    @Expose
    private Double iSK;
    @SerializedName("JEP")
    @Expose
    private Double jEP;
    @SerializedName("JMD")
    @Expose
    private Double jMD;
    @SerializedName("JOD")
    @Expose
    private Double jOD;
    @SerializedName("JPY")
    @Expose
    private Double jPY;
    @SerializedName("KES")
    @Expose
    private Double kES;
    @SerializedName("KGS")
    @Expose
    private Double kGS;
    @SerializedName("KHR")
    @Expose
    private Double kHR;
    @SerializedName("KMF")
    @Expose
    private Double kMF;
    @SerializedName("KPW")
    @Expose
    private Double kPW;
    @SerializedName("KRW")
    @Expose
    private Double kRW;
    @SerializedName("KWD")
    @Expose
    private Double kWD;
    @SerializedName("KYD")
    @Expose
    private Double kYD;
    @SerializedName("KZT")
    @Expose
    private Double kZT;
    @SerializedName("LAK")
    @Expose
    private Double lAK;
    @SerializedName("LBP")
    @Expose
    private Double lBP;
    @SerializedName("LKR")
    @Expose
    private Double lKR;
    @SerializedName("LRD")
    @Expose
    private Double lRD;
    @SerializedName("LSL")
    @Expose
    private Double lSL;
    @SerializedName("LTL")
    @Expose
    private Double lTL;
    @SerializedName("LVL")
    @Expose
    private Double lVL;
    @SerializedName("LYD")
    @Expose
    private Double lYD;
    @SerializedName("MAD")
    @Expose
    private Double mAD;
    @SerializedName("MDL")
    @Expose
    private Double mDL;
    @SerializedName("MGA")
    @Expose
    private Double mGA;
    @SerializedName("MKD")
    @Expose
    private Double mKD;
    @SerializedName("MMK")
    @Expose
    private Double mMK;
    @SerializedName("MNT")
    @Expose
    private Double mNT;
    @SerializedName("MOP")
    @Expose
    private Double mOP;
    @SerializedName("MRO")
    @Expose
    private Double mRO;
    @SerializedName("MUR")
    @Expose
    private Double mUR;
    @SerializedName("MVR")
    @Expose
    private Double mVR;
    @SerializedName("MWK")
    @Expose
    private Double mWK;
    @SerializedName("MXN")
    @Expose
    private Double mXN;
    @SerializedName("MYR")
    @Expose
    private Double mYR;
    @SerializedName("MZN")
    @Expose
    private Double mZN;
    @SerializedName("NAD")
    @Expose
    private Double nAD;
    @SerializedName("NGN")
    @Expose
    private Double nGN;
    @SerializedName("NIO")
    @Expose
    private Double nIO;
    @SerializedName("NOK")
    @Expose
    private Double nOK;
    @SerializedName("NPR")
    @Expose
    private Double nPR;
    @SerializedName("NZD")
    @Expose
    private Double nZD;
    @SerializedName("OMR")
    @Expose
    private Double oMR;
    @SerializedName("PAB")
    @Expose
    private Double pAB;
    @SerializedName("PEN")
    @Expose
    private Double pEN;
    @SerializedName("PGK")
    @Expose
    private Double pGK;
    @SerializedName("PHP")
    @Expose
    private Double pHP;
    @SerializedName("PKR")
    @Expose
    private Double pKR;
    @SerializedName("PLN")
    @Expose
    private Double pLN;
    @SerializedName("PYG")
    @Expose
    private Double pYG;
    @SerializedName("QAR")
    @Expose
    private Double qAR;
    @SerializedName("RON")
    @Expose
    private Double rON;
    @SerializedName("RSD")
    @Expose
    private Double rSD;
    @SerializedName("RUB")
    @Expose
    private Double rUB;
    @SerializedName("RWF")
    @Expose
    private Double rWF;
    @SerializedName("SAR")
    @Expose
    private Double sAR;
    @SerializedName("SBD")
    @Expose
    private Double sBD;
    @SerializedName("SCR")
    @Expose
    private Double sCR;
    @SerializedName("SDG")
    @Expose
    private Double sDG;
    @SerializedName("SEK")
    @Expose
    private Double sEK;
    @SerializedName("SGD")
    @Expose
    private Double sGD;
    @SerializedName("SHP")
    @Expose
    private Double sHP;
    @SerializedName("SLL")
    @Expose
    private Double sLL;
    @SerializedName("SOS")
    @Expose
    private Double sOS;
    @SerializedName("SRD")
    @Expose
    private Double sRD;
    @SerializedName("STD")
    @Expose
    private Double sTD;
    @SerializedName("SVC")
    @Expose
    private Double sVC;
    @SerializedName("SYP")
    @Expose
    private Double sYP;
    @SerializedName("SZL")
    @Expose
    private Double sZL;
    @SerializedName("THB")
    @Expose
    private Double tHB;
    @SerializedName("TJS")
    @Expose
    private Double tJS;
    @SerializedName("TMT")
    @Expose
    private Double tMT;
    @SerializedName("TND")
    @Expose
    private Double tND;
    @SerializedName("TOP")
    @Expose
    private Double tOP;
    @SerializedName("TRY")
    @Expose
    private Double tRY;
    @SerializedName("TTD")
    @Expose
    private Double tTD;
    @SerializedName("TWD")
    @Expose
    private Double tWD;
    @SerializedName("TZS")
    @Expose
    private Double tZS;
    @SerializedName("UAH")
    @Expose
    private Double uAH;
    @SerializedName("UGX")
    @Expose
    private Double uGX;
    @SerializedName("USD")
    @Expose
    private Double uSD;
    @SerializedName("UYU")
    @Expose
    private Double uYU;
    @SerializedName("UZS")
    @Expose
    private Double uZS;
    @SerializedName("VEF")
    @Expose
    private Double vEF;
    @SerializedName("VND")
    @Expose
    private Double vND;
    @SerializedName("VUV")
    @Expose
    private Double vUV;
    @SerializedName("WST")
    @Expose
    private Double wST;
    @SerializedName("XAF")
    @Expose
    private Double xAF;
    @SerializedName("XAG")
    @Expose
    private Double xAG;
    @SerializedName("XAU")
    @Expose
    private Double xAU;
    @SerializedName("XCD")
    @Expose
    private Double xCD;
    @SerializedName("XDR")
    @Expose
    private Double xDR;
    @SerializedName("XOF")
    @Expose
    private Double xOF;
    @SerializedName("XPF")
    @Expose
    private Double xPF;
    @SerializedName("YER")
    @Expose
    private Double yER;
    @SerializedName("ZAR")
    @Expose
    private Double zAR;
    @SerializedName("ZMK")
    @Expose
    private Double zMK;
    @SerializedName("ZMW")
    @Expose
    private Double zMW;
    @SerializedName("ZWL")
    @Expose
    private Double zWL;
    public final static Creator<Rates> CREATOR = new Creator<Rates>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Rates createFromParcel(Parcel in) {
            return new Rates(in);
        }

        public Rates[] newArray(int size) {
            return (new Rates[size]);
        }

    }
    ;

    protected Rates(Parcel in) {
        this.aED = ((Double) in.readValue((Double.class.getClassLoader())));
        this.aFN = ((Double) in.readValue((Double.class.getClassLoader())));
        this.aLL = ((Double) in.readValue((Double.class.getClassLoader())));
        this.aMD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.aNG = ((Double) in.readValue((Double.class.getClassLoader())));
        this.aOA = ((Double) in.readValue((Double.class.getClassLoader())));
        this.aRS = ((Double) in.readValue((Double.class.getClassLoader())));
        this.aUD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.aWG = ((Double) in.readValue((Double.class.getClassLoader())));
        this.aZN = ((Double) in.readValue((Double.class.getClassLoader())));
        this.bAM = ((Double) in.readValue((Double.class.getClassLoader())));
        this.bBD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.bDT = ((Double) in.readValue((Double.class.getClassLoader())));
        this.bGN = ((Double) in.readValue((Double.class.getClassLoader())));
        this.bHD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.bIF = ((Double) in.readValue((Double.class.getClassLoader())));
        this.bMD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.bND = ((Double) in.readValue((Double.class.getClassLoader())));
        this.bOB = ((Double) in.readValue((Double.class.getClassLoader())));
        this.bRL = ((Double) in.readValue((Double.class.getClassLoader())));
        this.bSD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.bTC = ((Double) in.readValue((Double.class.getClassLoader())));
        this.bTN = ((Double) in.readValue((Double.class.getClassLoader())));
        this.bWP = ((Double) in.readValue((Double.class.getClassLoader())));
        this.bYN = ((Double) in.readValue((Double.class.getClassLoader())));
        this.bYR = ((Double) in.readValue((Double.class.getClassLoader())));
        this.bZD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.cAD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.cDF = ((Double) in.readValue((Double.class.getClassLoader())));
        this.cHF = ((Double) in.readValue((Double.class.getClassLoader())));
        this.cLF = ((Double) in.readValue((Double.class.getClassLoader())));
        this.cLP = ((Double) in.readValue((Double.class.getClassLoader())));
        this.cNY = ((Double) in.readValue((Double.class.getClassLoader())));
        this.cOP = ((Double) in.readValue((Double.class.getClassLoader())));
        this.cRC = ((Double) in.readValue((Double.class.getClassLoader())));
        this.cUC = ((Double) in.readValue((Double.class.getClassLoader())));
        this.cUP = ((Double) in.readValue((Double.class.getClassLoader())));
        this.cVE = ((Double) in.readValue((Double.class.getClassLoader())));
        this.cZK = ((Double) in.readValue((Double.class.getClassLoader())));
        this.dJF = ((Double) in.readValue((Double.class.getClassLoader())));
        this.dKK = ((Double) in.readValue((Double.class.getClassLoader())));
        this.dOP = ((Double) in.readValue((Double.class.getClassLoader())));
        this.dZD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.eGP = ((Double) in.readValue((Double.class.getClassLoader())));
        this.eRN = ((Double) in.readValue((Double.class.getClassLoader())));
        this.eTB = ((Double) in.readValue((Double.class.getClassLoader())));
        this.eUR = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.fJD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.fKP = ((Double) in.readValue((Double.class.getClassLoader())));
        this.gBP = ((Double) in.readValue((Double.class.getClassLoader())));
        this.gEL = ((Double) in.readValue((Double.class.getClassLoader())));
        this.gGP = ((Double) in.readValue((Double.class.getClassLoader())));
        this.gHS = ((Double) in.readValue((Double.class.getClassLoader())));
        this.gIP = ((Double) in.readValue((Double.class.getClassLoader())));
        this.gMD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.gNF = ((Double) in.readValue((Double.class.getClassLoader())));
        this.gTQ = ((Double) in.readValue((Double.class.getClassLoader())));
        this.gYD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.hKD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.hNL = ((Double) in.readValue((Double.class.getClassLoader())));
        this.hRK = ((Double) in.readValue((Double.class.getClassLoader())));
        this.hTG = ((Double) in.readValue((Double.class.getClassLoader())));
        this.hUF = ((Double) in.readValue((Double.class.getClassLoader())));
        this.iDR = ((Double) in.readValue((Double.class.getClassLoader())));
        this.iLS = ((Double) in.readValue((Double.class.getClassLoader())));
        this.iMP = ((Double) in.readValue((Double.class.getClassLoader())));
        this.iNR = ((Double) in.readValue((Double.class.getClassLoader())));
        this.iQD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.iRR = ((Double) in.readValue((Double.class.getClassLoader())));
        this.iSK = ((Double) in.readValue((Double.class.getClassLoader())));
        this.jEP = ((Double) in.readValue((Double.class.getClassLoader())));
        this.jMD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.jOD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.jPY = ((Double) in.readValue((Double.class.getClassLoader())));
        this.kES = ((Double) in.readValue((Double.class.getClassLoader())));
        this.kGS = ((Double) in.readValue((Double.class.getClassLoader())));
        this.kHR = ((Double) in.readValue((Double.class.getClassLoader())));
        this.kMF = ((Double) in.readValue((Double.class.getClassLoader())));
        this.kPW = ((Double) in.readValue((Double.class.getClassLoader())));
        this.kRW = ((Double) in.readValue((Double.class.getClassLoader())));
        this.kWD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.kYD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.kZT = ((Double) in.readValue((Double.class.getClassLoader())));
        this.lAK = ((Double) in.readValue((Double.class.getClassLoader())));
        this.lBP = ((Double) in.readValue((Double.class.getClassLoader())));
        this.lKR = ((Double) in.readValue((Double.class.getClassLoader())));
        this.lRD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.lSL = ((Double) in.readValue((Double.class.getClassLoader())));
        this.lTL = ((Double) in.readValue((Double.class.getClassLoader())));
        this.lVL = ((Double) in.readValue((Double.class.getClassLoader())));
        this.lYD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.mAD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.mDL = ((Double) in.readValue((Double.class.getClassLoader())));
        this.mGA = ((Double) in.readValue((Double.class.getClassLoader())));
        this.mKD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.mMK = ((Double) in.readValue((Double.class.getClassLoader())));
        this.mNT = ((Double) in.readValue((Double.class.getClassLoader())));
        this.mOP = ((Double) in.readValue((Double.class.getClassLoader())));
        this.mRO = ((Double) in.readValue((Double.class.getClassLoader())));
        this.mUR = ((Double) in.readValue((Double.class.getClassLoader())));
        this.mVR = ((Double) in.readValue((Double.class.getClassLoader())));
        this.mWK = ((Double) in.readValue((Double.class.getClassLoader())));
        this.mXN = ((Double) in.readValue((Double.class.getClassLoader())));
        this.mYR = ((Double) in.readValue((Double.class.getClassLoader())));
        this.mZN = ((Double) in.readValue((Double.class.getClassLoader())));
        this.nAD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.nGN = ((Double) in.readValue((Double.class.getClassLoader())));
        this.nIO = ((Double) in.readValue((Double.class.getClassLoader())));
        this.nOK = ((Double) in.readValue((Double.class.getClassLoader())));
        this.nPR = ((Double) in.readValue((Double.class.getClassLoader())));
        this.nZD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.oMR = ((Double) in.readValue((Double.class.getClassLoader())));
        this.pAB = ((Double) in.readValue((Double.class.getClassLoader())));
        this.pEN = ((Double) in.readValue((Double.class.getClassLoader())));
        this.pGK = ((Double) in.readValue((Double.class.getClassLoader())));
        this.pHP = ((Double) in.readValue((Double.class.getClassLoader())));
        this.pKR = ((Double) in.readValue((Double.class.getClassLoader())));
        this.pLN = ((Double) in.readValue((Double.class.getClassLoader())));
        this.pYG = ((Double) in.readValue((Double.class.getClassLoader())));
        this.qAR = ((Double) in.readValue((Double.class.getClassLoader())));
        this.rON = ((Double) in.readValue((Double.class.getClassLoader())));
        this.rSD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.rUB = ((Double) in.readValue((Double.class.getClassLoader())));
        this.rWF = ((Double) in.readValue((Double.class.getClassLoader())));
        this.sAR = ((Double) in.readValue((Double.class.getClassLoader())));
        this.sBD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.sCR = ((Double) in.readValue((Double.class.getClassLoader())));
        this.sDG = ((Double) in.readValue((Double.class.getClassLoader())));
        this.sEK = ((Double) in.readValue((Double.class.getClassLoader())));
        this.sGD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.sHP = ((Double) in.readValue((Double.class.getClassLoader())));
        this.sLL = ((Double) in.readValue((Double.class.getClassLoader())));
        this.sOS = ((Double) in.readValue((Double.class.getClassLoader())));
        this.sRD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.sTD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.sVC = ((Double) in.readValue((Double.class.getClassLoader())));
        this.sYP = ((Double) in.readValue((Double.class.getClassLoader())));
        this.sZL = ((Double) in.readValue((Double.class.getClassLoader())));
        this.tHB = ((Double) in.readValue((Double.class.getClassLoader())));
        this.tJS = ((Double) in.readValue((Double.class.getClassLoader())));
        this.tMT = ((Double) in.readValue((Double.class.getClassLoader())));
        this.tND = ((Double) in.readValue((Double.class.getClassLoader())));
        this.tOP = ((Double) in.readValue((Double.class.getClassLoader())));
        this.tRY = ((Double) in.readValue((Double.class.getClassLoader())));
        this.tTD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.tWD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.tZS = ((Double) in.readValue((Double.class.getClassLoader())));
        this.uAH = ((Double) in.readValue((Double.class.getClassLoader())));
        this.uGX = ((Double) in.readValue((Double.class.getClassLoader())));
        this.uSD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.uYU = ((Double) in.readValue((Double.class.getClassLoader())));
        this.uZS = ((Double) in.readValue((Double.class.getClassLoader())));
        this.vEF = ((Double) in.readValue((Double.class.getClassLoader())));
        this.vND = ((Double) in.readValue((Double.class.getClassLoader())));
        this.vUV = ((Double) in.readValue((Double.class.getClassLoader())));
        this.wST = ((Double) in.readValue((Double.class.getClassLoader())));
        this.xAF = ((Double) in.readValue((Double.class.getClassLoader())));
        this.xAG = ((Double) in.readValue((Double.class.getClassLoader())));
        this.xAU = ((Double) in.readValue((Double.class.getClassLoader())));
        this.xCD = ((Double) in.readValue((Double.class.getClassLoader())));
        this.xDR = ((Double) in.readValue((Double.class.getClassLoader())));
        this.xOF = ((Double) in.readValue((Double.class.getClassLoader())));
        this.xPF = ((Double) in.readValue((Double.class.getClassLoader())));
        this.yER = ((Double) in.readValue((Double.class.getClassLoader())));
        this.zAR = ((Double) in.readValue((Double.class.getClassLoader())));
        this.zMK = ((Double) in.readValue((Double.class.getClassLoader())));
        this.zMW = ((Double) in.readValue((Double.class.getClassLoader())));
        this.zWL = ((Double) in.readValue((Double.class.getClassLoader())));
    }

    public Rates() {
    }

    public Double getAED() {
        return aED;
    }

    public void setAED(Double aED) {
        this.aED = aED;
    }

    public Double getAFN() {
        return aFN;
    }

    public void setAFN(Double aFN) {
        this.aFN = aFN;
    }

    public Double getALL() {
        return aLL;
    }

    public void setALL(Double aLL) {
        this.aLL = aLL;
    }

    public Double getAMD() {
        return aMD;
    }

    public void setAMD(Double aMD) {
        this.aMD = aMD;
    }

    public Double getANG() {
        return aNG;
    }

    public void setANG(Double aNG) {
        this.aNG = aNG;
    }

    public Double getAOA() {
        return aOA;
    }

    public void setAOA(Double aOA) {
        this.aOA = aOA;
    }

    public Double getARS() {
        return aRS;
    }

    public void setARS(Double aRS) {
        this.aRS = aRS;
    }

    public Double getAUD() {
        return aUD;
    }

    public void setAUD(Double aUD) {
        this.aUD = aUD;
    }

    public Double getAWG() {
        return aWG;
    }

    public void setAWG(Double aWG) {
        this.aWG = aWG;
    }

    public Double getAZN() {
        return aZN;
    }

    public void setAZN(Double aZN) {
        this.aZN = aZN;
    }

    public Double getBAM() {
        return bAM;
    }

    public void setBAM(Double bAM) {
        this.bAM = bAM;
    }

    public Double getBBD() {
        return bBD;
    }

    public void setBBD(Double bBD) {
        this.bBD = bBD;
    }

    public Double getBDT() {
        return bDT;
    }

    public void setBDT(Double bDT) {
        this.bDT = bDT;
    }

    public Double getBGN() {
        return bGN;
    }

    public void setBGN(Double bGN) {
        this.bGN = bGN;
    }

    public Double getBHD() {
        return bHD;
    }

    public void setBHD(Double bHD) {
        this.bHD = bHD;
    }

    public Double getBIF() {
        return bIF;
    }

    public void setBIF(Double bIF) {
        this.bIF = bIF;
    }

    public Double getBMD() {
        return bMD;
    }

    public void setBMD(Double bMD) {
        this.bMD = bMD;
    }

    public Double getBND() {
        return bND;
    }

    public void setBND(Double bND) {
        this.bND = bND;
    }

    public Double getBOB() {
        return bOB;
    }

    public void setBOB(Double bOB) {
        this.bOB = bOB;
    }

    public Double getBRL() {
        return bRL;
    }

    public void setBRL(Double bRL) {
        this.bRL = bRL;
    }

    public Double getBSD() {
        return bSD;
    }

    public void setBSD(Double bSD) {
        this.bSD = bSD;
    }

    public Double getBTC() {
        return bTC;
    }

    public void setBTC(Double bTC) {
        this.bTC = bTC;
    }

    public Double getBTN() {
        return bTN;
    }

    public void setBTN(Double bTN) {
        this.bTN = bTN;
    }

    public Double getBWP() {
        return bWP;
    }

    public void setBWP(Double bWP) {
        this.bWP = bWP;
    }

    public Double getBYN() {
        return bYN;
    }

    public void setBYN(Double bYN) {
        this.bYN = bYN;
    }

    public Double getBYR() {
        return bYR;
    }

    public void setBYR(Double bYR) {
        this.bYR = bYR;
    }

    public Double getBZD() {
        return bZD;
    }

    public void setBZD(Double bZD) {
        this.bZD = bZD;
    }

    public Double getCAD() {
        return cAD;
    }

    public void setCAD(Double cAD) {
        this.cAD = cAD;
    }

    public Double getCDF() {
        return cDF;
    }

    public void setCDF(Double cDF) {
        this.cDF = cDF;
    }

    public Double getCHF() {
        return cHF;
    }

    public void setCHF(Double cHF) {
        this.cHF = cHF;
    }

    public Double getCLF() {
        return cLF;
    }

    public void setCLF(Double cLF) {
        this.cLF = cLF;
    }

    public Double getCLP() {
        return cLP;
    }

    public void setCLP(Double cLP) {
        this.cLP = cLP;
    }

    public Double getCNY() {
        return cNY;
    }

    public void setCNY(Double cNY) {
        this.cNY = cNY;
    }

    public Double getCOP() {
        return cOP;
    }

    public void setCOP(Double cOP) {
        this.cOP = cOP;
    }

    public Double getCRC() {
        return cRC;
    }

    public void setCRC(Double cRC) {
        this.cRC = cRC;
    }

    public Double getCUC() {
        return cUC;
    }

    public void setCUC(Double cUC) {
        this.cUC = cUC;
    }

    public Double getCUP() {
        return cUP;
    }

    public void setCUP(Double cUP) {
        this.cUP = cUP;
    }

    public Double getCVE() {
        return cVE;
    }

    public void setCVE(Double cVE) {
        this.cVE = cVE;
    }

    public Double getCZK() {
        return cZK;
    }

    public void setCZK(Double cZK) {
        this.cZK = cZK;
    }

    public Double getDJF() {
        return dJF;
    }

    public void setDJF(Double dJF) {
        this.dJF = dJF;
    }

    public Double getDKK() {
        return dKK;
    }

    public void setDKK(Double dKK) {
        this.dKK = dKK;
    }

    public Double getDOP() {
        return dOP;
    }

    public void setDOP(Double dOP) {
        this.dOP = dOP;
    }

    public Double getDZD() {
        return dZD;
    }

    public void setDZD(Double dZD) {
        this.dZD = dZD;
    }

    public Double getEGP() {
        return eGP;
    }

    public void setEGP(Double eGP) {
        this.eGP = eGP;
    }

    public Double getERN() {
        return eRN;
    }

    public void setERN(Double eRN) {
        this.eRN = eRN;
    }

    public Double getETB() {
        return eTB;
    }

    public void setETB(Double eTB) {
        this.eTB = eTB;
    }

    public Integer getEUR() {
        return eUR;
    }

    public void setEUR(Integer eUR) {
        this.eUR = eUR;
    }

    public Double getFJD() {
        return fJD;
    }

    public void setFJD(Double fJD) {
        this.fJD = fJD;
    }

    public Double getFKP() {
        return fKP;
    }

    public void setFKP(Double fKP) {
        this.fKP = fKP;
    }

    public Double getGBP() {
        return gBP;
    }

    public void setGBP(Double gBP) {
        this.gBP = gBP;
    }

    public Double getGEL() {
        return gEL;
    }

    public void setGEL(Double gEL) {
        this.gEL = gEL;
    }

    public Double getGGP() {
        return gGP;
    }

    public void setGGP(Double gGP) {
        this.gGP = gGP;
    }

    public Double getGHS() {
        return gHS;
    }

    public void setGHS(Double gHS) {
        this.gHS = gHS;
    }

    public Double getGIP() {
        return gIP;
    }

    public void setGIP(Double gIP) {
        this.gIP = gIP;
    }

    public Double getGMD() {
        return gMD;
    }

    public void setGMD(Double gMD) {
        this.gMD = gMD;
    }

    public Double getGNF() {
        return gNF;
    }

    public void setGNF(Double gNF) {
        this.gNF = gNF;
    }

    public Double getGTQ() {
        return gTQ;
    }

    public void setGTQ(Double gTQ) {
        this.gTQ = gTQ;
    }

    public Double getGYD() {
        return gYD;
    }

    public void setGYD(Double gYD) {
        this.gYD = gYD;
    }

    public Double getHKD() {
        return hKD;
    }

    public void setHKD(Double hKD) {
        this.hKD = hKD;
    }

    public Double getHNL() {
        return hNL;
    }

    public void setHNL(Double hNL) {
        this.hNL = hNL;
    }

    public Double getHRK() {
        return hRK;
    }

    public void setHRK(Double hRK) {
        this.hRK = hRK;
    }

    public Double getHTG() {
        return hTG;
    }

    public void setHTG(Double hTG) {
        this.hTG = hTG;
    }

    public Double getHUF() {
        return hUF;
    }

    public void setHUF(Double hUF) {
        this.hUF = hUF;
    }

    public Double getIDR() {
        return iDR;
    }

    public void setIDR(Double iDR) {
        this.iDR = iDR;
    }

    public Double getILS() {
        return iLS;
    }

    public void setILS(Double iLS) {
        this.iLS = iLS;
    }

    public Double getIMP() {
        return iMP;
    }

    public void setIMP(Double iMP) {
        this.iMP = iMP;
    }

    public Double getINR() {
        return iNR;
    }

    public void setINR(Double iNR) {
        this.iNR = iNR;
    }

    public Double getIQD() {
        return iQD;
    }

    public void setIQD(Double iQD) {
        this.iQD = iQD;
    }

    public Double getIRR() {
        return iRR;
    }

    public void setIRR(Double iRR) {
        this.iRR = iRR;
    }

    public Double getISK() {
        return iSK;
    }

    public void setISK(Double iSK) {
        this.iSK = iSK;
    }

    public Double getJEP() {
        return jEP;
    }

    public void setJEP(Double jEP) {
        this.jEP = jEP;
    }

    public Double getJMD() {
        return jMD;
    }

    public void setJMD(Double jMD) {
        this.jMD = jMD;
    }

    public Double getJOD() {
        return jOD;
    }

    public void setJOD(Double jOD) {
        this.jOD = jOD;
    }

    public Double getJPY() {
        return jPY;
    }

    public void setJPY(Double jPY) {
        this.jPY = jPY;
    }

    public Double getKES() {
        return kES;
    }

    public void setKES(Double kES) {
        this.kES = kES;
    }

    public Double getKGS() {
        return kGS;
    }

    public void setKGS(Double kGS) {
        this.kGS = kGS;
    }

    public Double getKHR() {
        return kHR;
    }

    public void setKHR(Double kHR) {
        this.kHR = kHR;
    }

    public Double getKMF() {
        return kMF;
    }

    public void setKMF(Double kMF) {
        this.kMF = kMF;
    }

    public Double getKPW() {
        return kPW;
    }

    public void setKPW(Double kPW) {
        this.kPW = kPW;
    }

    public Double getKRW() {
        return kRW;
    }

    public void setKRW(Double kRW) {
        this.kRW = kRW;
    }

    public Double getKWD() {
        return kWD;
    }

    public void setKWD(Double kWD) {
        this.kWD = kWD;
    }

    public Double getKYD() {
        return kYD;
    }

    public void setKYD(Double kYD) {
        this.kYD = kYD;
    }

    public Double getKZT() {
        return kZT;
    }

    public void setKZT(Double kZT) {
        this.kZT = kZT;
    }

    public Double getLAK() {
        return lAK;
    }

    public void setLAK(Double lAK) {
        this.lAK = lAK;
    }

    public Double getLBP() {
        return lBP;
    }

    public void setLBP(Double lBP) {
        this.lBP = lBP;
    }

    public Double getLKR() {
        return lKR;
    }

    public void setLKR(Double lKR) {
        this.lKR = lKR;
    }

    public Double getLRD() {
        return lRD;
    }

    public void setLRD(Double lRD) {
        this.lRD = lRD;
    }

    public Double getLSL() {
        return lSL;
    }

    public void setLSL(Double lSL) {
        this.lSL = lSL;
    }

    public Double getLTL() {
        return lTL;
    }

    public void setLTL(Double lTL) {
        this.lTL = lTL;
    }

    public Double getLVL() {
        return lVL;
    }

    public void setLVL(Double lVL) {
        this.lVL = lVL;
    }

    public Double getLYD() {
        return lYD;
    }

    public void setLYD(Double lYD) {
        this.lYD = lYD;
    }

    public Double getMAD() {
        return mAD;
    }

    public void setMAD(Double mAD) {
        this.mAD = mAD;
    }

    public Double getMDL() {
        return mDL;
    }

    public void setMDL(Double mDL) {
        this.mDL = mDL;
    }

    public Double getMGA() {
        return mGA;
    }

    public void setMGA(Double mGA) {
        this.mGA = mGA;
    }

    public Double getMKD() {
        return mKD;
    }

    public void setMKD(Double mKD) {
        this.mKD = mKD;
    }

    public Double getMMK() {
        return mMK;
    }

    public void setMMK(Double mMK) {
        this.mMK = mMK;
    }

    public Double getMNT() {
        return mNT;
    }

    public void setMNT(Double mNT) {
        this.mNT = mNT;
    }

    public Double getMOP() {
        return mOP;
    }

    public void setMOP(Double mOP) {
        this.mOP = mOP;
    }

    public Double getMRO() {
        return mRO;
    }

    public void setMRO(Double mRO) {
        this.mRO = mRO;
    }

    public Double getMUR() {
        return mUR;
    }

    public void setMUR(Double mUR) {
        this.mUR = mUR;
    }

    public Double getMVR() {
        return mVR;
    }

    public void setMVR(Double mVR) {
        this.mVR = mVR;
    }

    public Double getMWK() {
        return mWK;
    }

    public void setMWK(Double mWK) {
        this.mWK = mWK;
    }

    public Double getMXN() {
        return mXN;
    }

    public void setMXN(Double mXN) {
        this.mXN = mXN;
    }

    public Double getMYR() {
        return mYR;
    }

    public void setMYR(Double mYR) {
        this.mYR = mYR;
    }

    public Double getMZN() {
        return mZN;
    }

    public void setMZN(Double mZN) {
        this.mZN = mZN;
    }

    public Double getNAD() {
        return nAD;
    }

    public void setNAD(Double nAD) {
        this.nAD = nAD;
    }

    public Double getNGN() {
        return nGN;
    }

    public void setNGN(Double nGN) {
        this.nGN = nGN;
    }

    public Double getNIO() {
        return nIO;
    }

    public void setNIO(Double nIO) {
        this.nIO = nIO;
    }

    public Double getNOK() {
        return nOK;
    }

    public void setNOK(Double nOK) {
        this.nOK = nOK;
    }

    public Double getNPR() {
        return nPR;
    }

    public void setNPR(Double nPR) {
        this.nPR = nPR;
    }

    public Double getNZD() {
        return nZD;
    }

    public void setNZD(Double nZD) {
        this.nZD = nZD;
    }

    public Double getOMR() {
        return oMR;
    }

    public void setOMR(Double oMR) {
        this.oMR = oMR;
    }

    public Double getPAB() {
        return pAB;
    }

    public void setPAB(Double pAB) {
        this.pAB = pAB;
    }

    public Double getPEN() {
        return pEN;
    }

    public void setPEN(Double pEN) {
        this.pEN = pEN;
    }

    public Double getPGK() {
        return pGK;
    }

    public void setPGK(Double pGK) {
        this.pGK = pGK;
    }

    public Double getPHP() {
        return pHP;
    }

    public void setPHP(Double pHP) {
        this.pHP = pHP;
    }

    public Double getPKR() {
        return pKR;
    }

    public void setPKR(Double pKR) {
        this.pKR = pKR;
    }

    public Double getPLN() {
        return pLN;
    }

    public void setPLN(Double pLN) {
        this.pLN = pLN;
    }

    public Double getPYG() {
        return pYG;
    }

    public void setPYG(Double pYG) {
        this.pYG = pYG;
    }

    public Double getQAR() {
        return qAR;
    }

    public void setQAR(Double qAR) {
        this.qAR = qAR;
    }

    public Double getRON() {
        return rON;
    }

    public void setRON(Double rON) {
        this.rON = rON;
    }

    public Double getRSD() {
        return rSD;
    }

    public void setRSD(Double rSD) {
        this.rSD = rSD;
    }

    public Double getRUB() {
        return rUB;
    }

    public void setRUB(Double rUB) {
        this.rUB = rUB;
    }

    public Double getRWF() {
        return rWF;
    }

    public void setRWF(Double rWF) {
        this.rWF = rWF;
    }

    public Double getSAR() {
        return sAR;
    }

    public void setSAR(Double sAR) {
        this.sAR = sAR;
    }

    public Double getSBD() {
        return sBD;
    }

    public void setSBD(Double sBD) {
        this.sBD = sBD;
    }

    public Double getSCR() {
        return sCR;
    }

    public void setSCR(Double sCR) {
        this.sCR = sCR;
    }

    public Double getSDG() {
        return sDG;
    }

    public void setSDG(Double sDG) {
        this.sDG = sDG;
    }

    public Double getSEK() {
        return sEK;
    }

    public void setSEK(Double sEK) {
        this.sEK = sEK;
    }

    public Double getSGD() {
        return sGD;
    }

    public void setSGD(Double sGD) {
        this.sGD = sGD;
    }

    public Double getSHP() {
        return sHP;
    }

    public void setSHP(Double sHP) {
        this.sHP = sHP;
    }

    public Double getSLL() {
        return sLL;
    }

    public void setSLL(Double sLL) {
        this.sLL = sLL;
    }

    public Double getSOS() {
        return sOS;
    }

    public void setSOS(Double sOS) {
        this.sOS = sOS;
    }

    public Double getSRD() {
        return sRD;
    }

    public void setSRD(Double sRD) {
        this.sRD = sRD;
    }

    public Double getSTD() {
        return sTD;
    }

    public void setSTD(Double sTD) {
        this.sTD = sTD;
    }

    public Double getSVC() {
        return sVC;
    }

    public void setSVC(Double sVC) {
        this.sVC = sVC;
    }

    public Double getSYP() {
        return sYP;
    }

    public void setSYP(Double sYP) {
        this.sYP = sYP;
    }

    public Double getSZL() {
        return sZL;
    }

    public void setSZL(Double sZL) {
        this.sZL = sZL;
    }

    public Double getTHB() {
        return tHB;
    }

    public void setTHB(Double tHB) {
        this.tHB = tHB;
    }

    public Double getTJS() {
        return tJS;
    }

    public void setTJS(Double tJS) {
        this.tJS = tJS;
    }

    public Double getTMT() {
        return tMT;
    }

    public void setTMT(Double tMT) {
        this.tMT = tMT;
    }

    public Double getTND() {
        return tND;
    }

    public void setTND(Double tND) {
        this.tND = tND;
    }

    public Double getTOP() {
        return tOP;
    }

    public void setTOP(Double tOP) {
        this.tOP = tOP;
    }

    public Double getTRY() {
        return tRY;
    }

    public void setTRY(Double tRY) {
        this.tRY = tRY;
    }

    public Double getTTD() {
        return tTD;
    }

    public void setTTD(Double tTD) {
        this.tTD = tTD;
    }

    public Double getTWD() {
        return tWD;
    }

    public void setTWD(Double tWD) {
        this.tWD = tWD;
    }

    public Double getTZS() {
        return tZS;
    }

    public void setTZS(Double tZS) {
        this.tZS = tZS;
    }

    public Double getUAH() {
        return uAH;
    }

    public void setUAH(Double uAH) {
        this.uAH = uAH;
    }

    public Double getUGX() {
        return uGX;
    }

    public void setUGX(Double uGX) {
        this.uGX = uGX;
    }

    public Double getUSD() {
        return uSD;
    }

    public void setUSD(Double uSD) {
        this.uSD = uSD;
    }

    public Double getUYU() {
        return uYU;
    }

    public void setUYU(Double uYU) {
        this.uYU = uYU;
    }

    public Double getUZS() {
        return uZS;
    }

    public void setUZS(Double uZS) {
        this.uZS = uZS;
    }

    public Double getVEF() {
        return vEF;
    }

    public void setVEF(Double vEF) {
        this.vEF = vEF;
    }

    public Double getVND() {
        return vND;
    }

    public void setVND(Double vND) {
        this.vND = vND;
    }

    public Double getVUV() {
        return vUV;
    }

    public void setVUV(Double vUV) {
        this.vUV = vUV;
    }

    public Double getWST() {
        return wST;
    }

    public void setWST(Double wST) {
        this.wST = wST;
    }

    public Double getXAF() {
        return xAF;
    }

    public void setXAF(Double xAF) {
        this.xAF = xAF;
    }

    public Double getXAG() {
        return xAG;
    }

    public void setXAG(Double xAG) {
        this.xAG = xAG;
    }

    public Double getXAU() {
        return xAU;
    }

    public void setXAU(Double xAU) {
        this.xAU = xAU;
    }

    public Double getXCD() {
        return xCD;
    }

    public void setXCD(Double xCD) {
        this.xCD = xCD;
    }

    public Double getXDR() {
        return xDR;
    }

    public void setXDR(Double xDR) {
        this.xDR = xDR;
    }

    public Double getXOF() {
        return xOF;
    }

    public void setXOF(Double xOF) {
        this.xOF = xOF;
    }

    public Double getXPF() {
        return xPF;
    }

    public void setXPF(Double xPF) {
        this.xPF = xPF;
    }

    public Double getYER() {
        return yER;
    }

    public void setYER(Double yER) {
        this.yER = yER;
    }

    public Double getZAR() {
        return zAR;
    }

    public void setZAR(Double zAR) {
        this.zAR = zAR;
    }

    public Double getZMK() {
        return zMK;
    }

    public void setZMK(Double zMK) {
        this.zMK = zMK;
    }

    public Double getZMW() {
        return zMW;
    }

    public void setZMW(Double zMW) {
        this.zMW = zMW;
    }

    public Double getZWL() {
        return zWL;
    }

    public void setZWL(Double zWL) {
        this.zWL = zWL;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(aED);
        dest.writeValue(aFN);
        dest.writeValue(aLL);
        dest.writeValue(aMD);
        dest.writeValue(aNG);
        dest.writeValue(aOA);
        dest.writeValue(aRS);
        dest.writeValue(aUD);
        dest.writeValue(aWG);
        dest.writeValue(aZN);
        dest.writeValue(bAM);
        dest.writeValue(bBD);
        dest.writeValue(bDT);
        dest.writeValue(bGN);
        dest.writeValue(bHD);
        dest.writeValue(bIF);
        dest.writeValue(bMD);
        dest.writeValue(bND);
        dest.writeValue(bOB);
        dest.writeValue(bRL);
        dest.writeValue(bSD);
        dest.writeValue(bTC);
        dest.writeValue(bTN);
        dest.writeValue(bWP);
        dest.writeValue(bYN);
        dest.writeValue(bYR);
        dest.writeValue(bZD);
        dest.writeValue(cAD);
        dest.writeValue(cDF);
        dest.writeValue(cHF);
        dest.writeValue(cLF);
        dest.writeValue(cLP);
        dest.writeValue(cNY);
        dest.writeValue(cOP);
        dest.writeValue(cRC);
        dest.writeValue(cUC);
        dest.writeValue(cUP);
        dest.writeValue(cVE);
        dest.writeValue(cZK);
        dest.writeValue(dJF);
        dest.writeValue(dKK);
        dest.writeValue(dOP);
        dest.writeValue(dZD);
        dest.writeValue(eGP);
        dest.writeValue(eRN);
        dest.writeValue(eTB);
        dest.writeValue(eUR);
        dest.writeValue(fJD);
        dest.writeValue(fKP);
        dest.writeValue(gBP);
        dest.writeValue(gEL);
        dest.writeValue(gGP);
        dest.writeValue(gHS);
        dest.writeValue(gIP);
        dest.writeValue(gMD);
        dest.writeValue(gNF);
        dest.writeValue(gTQ);
        dest.writeValue(gYD);
        dest.writeValue(hKD);
        dest.writeValue(hNL);
        dest.writeValue(hRK);
        dest.writeValue(hTG);
        dest.writeValue(hUF);
        dest.writeValue(iDR);
        dest.writeValue(iLS);
        dest.writeValue(iMP);
        dest.writeValue(iNR);
        dest.writeValue(iQD);
        dest.writeValue(iRR);
        dest.writeValue(iSK);
        dest.writeValue(jEP);
        dest.writeValue(jMD);
        dest.writeValue(jOD);
        dest.writeValue(jPY);
        dest.writeValue(kES);
        dest.writeValue(kGS);
        dest.writeValue(kHR);
        dest.writeValue(kMF);
        dest.writeValue(kPW);
        dest.writeValue(kRW);
        dest.writeValue(kWD);
        dest.writeValue(kYD);
        dest.writeValue(kZT);
        dest.writeValue(lAK);
        dest.writeValue(lBP);
        dest.writeValue(lKR);
        dest.writeValue(lRD);
        dest.writeValue(lSL);
        dest.writeValue(lTL);
        dest.writeValue(lVL);
        dest.writeValue(lYD);
        dest.writeValue(mAD);
        dest.writeValue(mDL);
        dest.writeValue(mGA);
        dest.writeValue(mKD);
        dest.writeValue(mMK);
        dest.writeValue(mNT);
        dest.writeValue(mOP);
        dest.writeValue(mRO);
        dest.writeValue(mUR);
        dest.writeValue(mVR);
        dest.writeValue(mWK);
        dest.writeValue(mXN);
        dest.writeValue(mYR);
        dest.writeValue(mZN);
        dest.writeValue(nAD);
        dest.writeValue(nGN);
        dest.writeValue(nIO);
        dest.writeValue(nOK);
        dest.writeValue(nPR);
        dest.writeValue(nZD);
        dest.writeValue(oMR);
        dest.writeValue(pAB);
        dest.writeValue(pEN);
        dest.writeValue(pGK);
        dest.writeValue(pHP);
        dest.writeValue(pKR);
        dest.writeValue(pLN);
        dest.writeValue(pYG);
        dest.writeValue(qAR);
        dest.writeValue(rON);
        dest.writeValue(rSD);
        dest.writeValue(rUB);
        dest.writeValue(rWF);
        dest.writeValue(sAR);
        dest.writeValue(sBD);
        dest.writeValue(sCR);
        dest.writeValue(sDG);
        dest.writeValue(sEK);
        dest.writeValue(sGD);
        dest.writeValue(sHP);
        dest.writeValue(sLL);
        dest.writeValue(sOS);
        dest.writeValue(sRD);
        dest.writeValue(sTD);
        dest.writeValue(sVC);
        dest.writeValue(sYP);
        dest.writeValue(sZL);
        dest.writeValue(tHB);
        dest.writeValue(tJS);
        dest.writeValue(tMT);
        dest.writeValue(tND);
        dest.writeValue(tOP);
        dest.writeValue(tRY);
        dest.writeValue(tTD);
        dest.writeValue(tWD);
        dest.writeValue(tZS);
        dest.writeValue(uAH);
        dest.writeValue(uGX);
        dest.writeValue(uSD);
        dest.writeValue(uYU);
        dest.writeValue(uZS);
        dest.writeValue(vEF);
        dest.writeValue(vND);
        dest.writeValue(vUV);
        dest.writeValue(wST);
        dest.writeValue(xAF);
        dest.writeValue(xAG);
        dest.writeValue(xAU);
        dest.writeValue(xCD);
        dest.writeValue(xDR);
        dest.writeValue(xOF);
        dest.writeValue(xPF);
        dest.writeValue(yER);
        dest.writeValue(zAR);
        dest.writeValue(zMK);
        dest.writeValue(zMW);
        dest.writeValue(zWL);
    }

    public int describeContents() {
        return  0;
    }

}
