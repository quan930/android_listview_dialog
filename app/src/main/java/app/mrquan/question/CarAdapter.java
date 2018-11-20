package app.mrquan.question;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by daquan on 2018/11/20.
 */

public class CarAdapter extends ArrayAdapter<Car> {
    private int resourceId;
//    private Context context;
    public CarAdapter(@NonNull Context context, int resource, @NonNull List<Car> objects) {
        super(context, resource, objects);
        this.resourceId = resource;
//        this.context = context;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull final ViewGroup parent) {
        if (convertView==null){
            Log.d("更新","～～～～～");
            convertView = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);//加载子布局
        }
        final Car car = getItem(position);
        TextView id = convertView.findViewById(R.id.id);
        ImageView imageView = convertView.findViewById(R.id.car_image);
        TextView plateNumber = convertView.findViewById(R.id.plateNumber);
        TextView personName = convertView.findViewById(R.id.personName);
        TextView balance = convertView.findViewById(R.id.balance);
        Button button = convertView.findViewById(R.id.button);

        id.setText(car.getId()+"");
        imageView.setImageResource(car.getImageID());
        plateNumber.setText(car.getPlateNumber());
        personName.setText(car.getPersonName());
        balance.setText(car.getBalance()+"");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Log.d("点击", "onClick: "+position);
//                car.setBalance(car.getBalance()+1);
                CarAdapter.this.notifyDataSetChanged();
                new ShowDialog().showPopup(CarAdapter.this.getContext(),v,car,CarAdapter.this);
            }
        });
        return convertView;
    }
}
