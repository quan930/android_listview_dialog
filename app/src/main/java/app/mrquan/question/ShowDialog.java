package app.mrquan.question;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daquan on 2018/11/20.
 */

public class ShowDialog {
    public void showPopup(final Context context, View view, final Car car, final CarAdapter carAdapter){
        final Dialog dialog = new Dialog(context);
        //popupWindow.setOutsideTouchable(true);
        dialog.setCanceledOnTouchOutside(false);//外部触摸

        dialog.setContentView(R.layout.top_up);
        TextView carNumber = dialog.findViewById(R.id.car_number);
        final EditText editText = dialog.findViewById(R.id.car_money);
        Button buttonOK = dialog.findViewById(R.id.car_ok);
        Button buttonCancel = dialog.findViewById(R.id.car_cancel);
        carNumber.setText(car.getPlateNumber());
        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int m;
                try {
                    m = Integer.parseInt(editText.getText().toString());
                }catch (NumberFormatException e){
                    m=0;
                }
                if (m == 0) {
                    dialog.dismiss();
                }else {
                    car.setBalance(car.getBalance()+m);
                    carAdapter.notifyDataSetChanged();
                    dialog.dismiss();
                }
            }
        });
        dialog.show();
    }
}