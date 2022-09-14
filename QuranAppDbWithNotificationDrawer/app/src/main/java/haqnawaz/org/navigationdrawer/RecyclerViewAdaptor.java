package haqnawaz.org.navigationdrawer;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptor extends RecyclerView.Adapter<RecyclerViewAdaptor.ViewHolder>
{
    Context context;
    List<String> names;
    int Position;
    public RecyclerViewAdaptor(Context c, List<String> list)
    {
        this.context = c;
        this.names = list;
    }
    @NonNull
    @Override
    public RecyclerViewAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdaptor.ViewHolder holder, int position) {
        String name = names.get(position);
        this.Position = position;
        holder.nameView.setText(name);
    }

    @Override
    public int getItemCount() {
        return names.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View

            .OnClickListener {
        public TextView nameView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameView = itemView.findViewById(R.id.name);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            Toast.makeText(RecyclerViewAdaptor.ViewHolder.this, "clicked on ", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(, DisplayContent.class);
                    intent.putExtra("Search", "ByParaNo");
                    intent.putExtra("Input", data.get(i));
                    startActivity(intent);
        }
    }
}
