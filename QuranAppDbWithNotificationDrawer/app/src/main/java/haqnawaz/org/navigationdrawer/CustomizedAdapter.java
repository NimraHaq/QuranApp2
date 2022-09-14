package haqnawaz.org.navigationdrawer;

import android.content.Context;
import android.media.TimedText;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
public class CustomizedAdapter extends ArrayAdapter<tayah> {
    public ArrayList<tayah> ayahs;
    public CustomizedAdapter(@NonNull Context context, ArrayList<tayah> a) {
        super(context, 0,a);
        this.ayahs =a;
    }

    @Nullable
    @Override
    public tayah getItem(int position) {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       tayah cur=getItem(position);
       convertView= LayoutInflater.from(getContext()).inflate(R.layout.customizedview,parent,false);

       TextView AyahID = convertView.findViewById(R.id.AyahID);
       TextView ayah = convertView.findViewById(R.id.ayah);
       TextView urduFetehM = convertView.findViewById(R.id.urduByFatehM);
       TextView urduMehmoodH = convertView.findViewById(R.id.UrduByMehmoodH);
       TextView engByDr = convertView.findViewById(R.id.EnglishByDr);
       TextView engByMuftiTaqi = convertView.findViewById(R.id.EnglishByMuftiTaqi);

       AyahID.setText(Integer.toString(cur.ayahId));
       ayah.setText(cur.ArabicText);
       urduFetehM.setText(cur.UrduTarajamaFatehM);
       urduMehmoodH.setText(cur.UrduTarajamaMehmoodH);
       engByDr.setText(cur.EnlishTarjamaDr);
       engByMuftiTaqi.setText(cur.EnlishTarjamaMuftiTaqi);


        return  convertView;
    }
}