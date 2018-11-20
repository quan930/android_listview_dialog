package app.mrquan.question;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * Created by daquan on 2018/11/20.
 */

public class Car {
    private Integer id;
    private Integer imageID;
    private String plateNumber;
    private String personName;
    private Integer balance;



    public Car() {
    }

    public Car(Integer id, Integer imageID, String plateNumber, String personName, Integer balance) {
        this.id = id;
        this.imageID = imageID;
        this.plateNumber = plateNumber;
        this.personName = personName;
        this.balance = balance;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImageID() {
        return imageID;
    }

    public void setImageID(Integer imageID) {
        this.imageID = imageID;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
