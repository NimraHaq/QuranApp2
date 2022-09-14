package haqnawaz.org.navigationdrawer;

public class tayah {
    public int ayahId;
    public int SurahId;
    public String ArabicText;
    public String UrduTarajamaFatehM;
    public String UrduTarajamaMehmoodH;
    public String EnlishTarjamaDr;
    public String EnlishTarjamaMuftiTaqi;
    public int ParaId;

    public tayah(int ayahId, int surahId, String arabicText, String urduTarajamaFatehM, String urduTarajamaMehmoodH, String enlishTarjamaDr, String enlishTarjamaMuftiTaqi, int paraId) {
        this.ayahId = ayahId;
        SurahId = surahId;
        ArabicText = arabicText;
        UrduTarajamaFatehM = urduTarajamaFatehM;
        UrduTarajamaMehmoodH = urduTarajamaMehmoodH;
        EnlishTarjamaDr = enlishTarjamaDr;
        EnlishTarjamaMuftiTaqi = enlishTarjamaMuftiTaqi;
        ParaId = paraId;
    }

    public String getUrduTarajamaFatehM() {
        return UrduTarajamaFatehM;
    }

    public void setUrduTarajamaFatehM(String urduTarajamaFatehM) {
        UrduTarajamaFatehM = urduTarajamaFatehM;
    }

    public String getUrduTarajamaMehmoodH() {
        return UrduTarajamaMehmoodH;
    }

    public void setUrduTarajamaMehmoodH(String urduTarajamaMehmoodH) {
        UrduTarajamaMehmoodH = urduTarajamaMehmoodH;
    }

    public String getEnlishTarjamaDr() {
        return EnlishTarjamaDr;
    }

    public void setEnlishTarjamaDr(String enlishTarjamaDr) {
        EnlishTarjamaDr = enlishTarjamaDr;
    }

    public String getEnlishTarjamaMuftiTaqi() {
        return EnlishTarjamaMuftiTaqi;
    }

    public void setEnlishTarjamaMuftiTaqi(String enlishTarjamaMuftiTaqi) {
        EnlishTarjamaMuftiTaqi = enlishTarjamaMuftiTaqi;
    }


    public int getAyahId() {
        return ayahId;
    }

    public void setAyahId(int ayahId) {
        this.ayahId = ayahId;
    }

    public int getSurahId() {
        return SurahId;
    }

    public void setSurahId(int surahId) {
        SurahId = surahId;
    }

    public String getArabicText() {
        return ArabicText;
    }

    public void setArabicText(String arabicText) {
        ArabicText = arabicText;
    }

   public int getParaId() {
        return ParaId;
    }

    public void setParaId(int paraId) {
        ParaId = paraId;
    }
}
