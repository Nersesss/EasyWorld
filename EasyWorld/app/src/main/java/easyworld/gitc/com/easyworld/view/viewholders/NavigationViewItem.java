package easyworld.gitc.com.easyworld.view.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import easyworld.gitc.com.easyworld.R;
import easyworld.gitc.com.easyworld.view.helpers.NavViewItem;

/**
 * Created by User on 01.06.2017.
 */

public class NavigationViewItem extends RecyclerView.ViewHolder {
    private ImageView item;
    private TextView itemName;
    private TextView number;

    public NavigationViewItem(View itemView) {
        super(itemView);

        this.item = (ImageView) itemView.findViewById(R.id.imgMenu);
        this.itemName = (TextView) itemView.findViewById(R.id.txtName);
        this.number = (TextView) itemView.findViewById(R.id.txtNumber);
    }

    public void initDate(NavViewItem navItem) {
        item.setImageResource(navItem.getImgURL());
        itemName.setText(navItem.getName());
        number.setText(navItem.getNum());
    }
}
