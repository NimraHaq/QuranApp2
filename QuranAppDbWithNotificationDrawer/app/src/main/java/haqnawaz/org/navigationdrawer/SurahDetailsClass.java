package haqnawaz.org.navigationdrawer;

public class SurahDetailsClass
{
    int SurahID;

    public SurahDetailsClass(int surahID, String surahIntro, String surahNameEng, String surahNameUrdu) {
        SurahID = surahID;
        SurahIntro = surahIntro;
        SurahNameEng = surahNameEng;
        SurahNameUrdu = surahNameUrdu;
    }

    String SurahIntro;
    String SurahNameEng;
    String SurahNameUrdu;

    public int getSurahID() {
        return SurahID;
    }

    public void setSurahID(int surahID) {
        SurahID = surahID;
    }

    public String getSurahIntro() {
        return SurahIntro;
    }

    public void setSurahIntro(String surahIntro) {
        SurahIntro = surahIntro;
    }

    public String getSurahNameEng() {
        return SurahNameEng;
    }

    public void setSurahNameEng(String surahNameEng) {
        SurahNameEng = surahNameEng;
    }

    public String getSurahNameUrdu() {
        return SurahNameUrdu;
    }

    public void setSurahNameUrdu(String surahNameUrdu) {
        SurahNameUrdu = surahNameUrdu;
    }
}
