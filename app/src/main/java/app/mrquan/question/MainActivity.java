package app.mrquan.question;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private CarAdapter carAdapter;
    private List<Car> cars = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        cars.add(new Car(1,R.drawable.benchi,"辽A:10001","张三",0));
        cars.add(new Car(2,R.drawable.bmw,"辽A:10002","李四",100));
        cars.add(new Car(3,R.drawable.mazda,"辽A:10003","王五",80));
        cars.add(new Car(4,R.drawable.zhonghua,"辽A:10004","赵六",30));
        carAdapter = new CarAdapter(MainActivity.this,R.layout.my_listview,cars);
        listView.setAdapter(carAdapter);
    }
}
