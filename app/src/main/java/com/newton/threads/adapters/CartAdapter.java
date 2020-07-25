package com.newton.threads.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.newton.threads.R;
import com.newton.threads.models.CartItem;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartAdapterViewHolder> {

    List<CartItem> itemList;
    Context context;

    public CartAdapter(List<CartItem> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;
    }

    @NonNull
    @Override
    public CartAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_items_layout,parent,false);
        return new CartAdapterViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CartAdapterViewHolder holder, int position) {
        final CartItem shoppingItem = itemList.get(position);

        holder.txtQuantity.setText(shoppingItem.getQuantity());
        holder.txtName.setText(shoppingItem.getName());
        holder.txtPrice.setText(new StringBuilder().append("Ksh. ").append(shoppingItem.getPrice()));
        holder.txtDesc.setText(new StringBuilder().append("Code: ").append(shoppingItem.getDescription()));
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class CartAdapterViewHolder extends ViewHolder {
        TextView txtName, txtDesc, txtPrice, txtQuantity;
        public CartAdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txt_name);
            txtDesc = itemView.findViewById(R.id.txt_desc);
            txtPrice = itemView.findViewById(R.id.txt_price);
            txtQuantity = itemView.findViewById(R.id.txt_quantity);
        }
    }
}

/*
List<ShoppingItem> itemList;
    Context context;
    DBHelper dbHelper;
    public ItemsAdapter(List<ShoppingItem> itemList, Context context, DBHelper dbHelper) {
        this.itemList = itemList;
        this.context = context;
        this.dbHelper = dbHelper;
    }

    @NonNull
    @Override
    public ItemsAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_layout,parent,false);
        return new ItemsAdapterViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ItemsAdapterViewHolder holder, final int position) {
        final ShoppingItem shoppingItem = itemList.get(position);

        holder.txtQuantity.setText(shoppingItem.getQuantity());
        holder.txtName.setText(shoppingItem.getName());
        holder.txtPrice.setText(new StringBuilder().append("Ksh. ").append(shoppingItem.getPrice()));
        holder.txtCode.setText(new StringBuilder().append("Code: ").append(shoppingItem.getCode()));
        holder.btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(context)
                        .setMessage("Are you sure you want to remove " + shoppingItem.getName())
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dbHelper.deleteRow(shoppingItem.getId(),"items");
                                itemList.remove(position);
                            }
                        })
                        .setNegativeButton("No", null)
                        .create()
                        .show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ItemsAdapterViewHolder extends RecyclerView.ViewHolder {

        TextView txtName, txtQuantity, txtPrice,txtCode;
        ImageButton btn_edit, btn_delete;

        public ItemsAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtView_name);
            txtCode = itemView.findViewById(R.id.txtView_code);
            txtPrice = itemView.findViewById(R.id.txtView_price);
            txtQuantity = itemView.findViewById(R.id.txtView_quantity);
            btn_edit = itemView.findViewById(R.id.btn_edit_item);
            btn_delete = itemView.findViewById(R.id.btn_delete_item);
        }
    }
*/
