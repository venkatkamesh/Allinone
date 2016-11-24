package com.venkatkamesh.allinone;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

/**
 * Created by AnilKumar on 27-10-2016.
 */

public class Sensorsc extends Activity {

    private TextView mSensorsTot;
    private SensorManager mSensorManager;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensorsc);
        mSensorManager= (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mSensorsTot = (TextView) findViewById(R.id.tvsensor);

        List<Sensor> msensorList = mSensorManager.getSensorList(Sensor.TYPE_ALL);
        StringBuilder list = new StringBuilder();
        for (Sensor ani:msensorList) {
            list.append("\n\n" + "Name: " + ani.getName() + "Vendor: " + ani.getVendor());
        }
        mSensorsTot.setText(list);
    }
}
