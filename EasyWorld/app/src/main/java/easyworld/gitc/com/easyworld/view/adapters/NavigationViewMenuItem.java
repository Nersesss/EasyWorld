package easyworld.gitc.com.easyworld.view.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import easyworld.gitc.com.easyworld.R;
import easyworld.gitc.com.easyworld.view.helpers.NavViewItem;
import easyworld.gitc.com.easyworld.view.viewholders.NavigationViewItem;

/**
 * Created by User on 01.06.2017.
 */

public class NavigationViewMenuItem extends RecyclerView.Adapter<NavigationViewItem> {

    private Context context;
    private List<NavViewItem> itemList;

    public NavigationViewMenuItem(Context context, List<NavViewItem> navItem) {
        this.context = context;
        this.itemList = navItem;
    }


    @Override
    public NavigationViewItem onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.menu_item, viewGroup, false);
        return new NavigationViewItem(view);
    }

    @Override
    public void onBindViewHolder(NavigationViewItem holder, int position) {
        NavViewItem items = getItem(position);
        holder.initDate(items);

    }

    @Override
    public int getItemCount() {
        if (itemList == null) {
            itemList = new ArrayList<>();
        }
        return itemList.size();
    }

    private NavViewItem getItem(int position) {
        if (itemList != null && position >= 0 && position < itemList.size()) {
            return itemList.get(position);
        } else {
            return null;
        }
    }

}
