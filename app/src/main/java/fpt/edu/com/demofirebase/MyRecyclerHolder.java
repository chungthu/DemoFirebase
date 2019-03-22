package fpt.edu.com.demofirebase;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MyRecyclerHolder extends RecyclerView.ViewHolder {
    TextView txt_title,txt_content;

    public MyRecyclerHolder(@NonNull View itemView) {
        super(itemView);
        txt_title = itemView.findViewById(R.id.item_title);
        txt_content = itemView.findViewById(R.id.item_content);
    }
}
