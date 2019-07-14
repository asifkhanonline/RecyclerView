package com.lco.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseviewHolder>{
   // private String[] data;
   // public  CourseAdapter(String[] data){
   //     this.data=data;

   // }
    private int[] images;
    public CourseAdapter(int[] images){
        this.images=images;
    }
    @NonNull
    @Override
    public CourseviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item,parent,false);
        return new CourseviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseviewHolder holder, int position) {
       //String title=data[position];
       // holder.textView.setText(title);
        int image_id=images[position];
        holder.imageView.setImageResource(image_id);
        holder.textView.setText("Image :"+position);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class CourseviewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;

        public CourseviewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
            textView=itemView.findViewById(R.id.textView);
        }
    }
}
