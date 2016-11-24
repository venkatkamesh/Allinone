package com.venkatkamesh.allinone;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.Button;
import android.widget.TextView;

public class MySortAsyncTask extends AsyncTask<int[], String, String[]> {

    private Activity activity;
    private int view;
    private TextView tvBS, tvSS, tvMS, tvIS, tvQS, tvHS,tvResult;
    private long start, end;

    public MySortAsyncTask(Activity activity, int view){
        this.activity = activity;
        this.view = view;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        tvBS=(TextView)activity.findViewById(R.id.tvBS);
        tvSS=(TextView)activity.findViewById(R.id.tvSS);
        tvMS=(TextView)activity.findViewById(R.id.tvMS);
        tvIS=(TextView)activity.findViewById(R.id.tvIS);
        tvQS=(TextView)activity.findViewById(R.id.tvQS);
        tvHS=(TextView)activity.findViewById(R.id.tvHS);
    }

    @Override
    protected String[] doInBackground(int[]... array) {
        String[] result = new String[6];
        switch (view){
            case R.id.btnBS:
                tvResult=(TextView)activity.findViewById(R.id.tvBS);
                publishProgress("");
                start=System.currentTimeMillis();
                SortArray.bubbleSort(array[0]);
                end=System.currentTimeMillis();
                result[0]= ""+(end-start);
                return result;
            case R.id.btnSS:
                tvResult=(TextView)activity.findViewById(R.id.tvSS);
                publishProgress("");
                start=System.currentTimeMillis();
                SortArray.selectionSort(array[0]);
                end=System.currentTimeMillis();
                result[0]= ""+(end-start);
                return result;
            case R.id.btnMS:
                tvResult=(TextView)activity.findViewById(R.id.tvMS);
                publishProgress("");
                start=System.currentTimeMillis();
                SortArray.mergeSort(array[0]);
                end=System.currentTimeMillis();
                result[0]= ""+(end-start);
                return result;
            case R.id.btnIS:
                tvResult=(TextView)activity.findViewById(R.id.tvIS);
                publishProgress("");
                start=System.currentTimeMillis();
                SortArray.insertionSort(array[0]);
                end=System.currentTimeMillis();
                result[0]= ""+(end-start);
                return result;
            case R.id.btnQS:
                tvResult=(TextView)activity.findViewById(R.id.tvQS);
                publishProgress("");
                start=System.currentTimeMillis();
                SortArray.quickSort(array[0]);
                end=System.currentTimeMillis();
                result[0]= ""+(end-start);
                return result;
            case R.id.btnHS:
                tvResult=(TextView)activity.findViewById(R.id.tvHS);
                publishProgress("");
                start=System.currentTimeMillis();
                SortArray.heapSort(array[0]);
                end=System.currentTimeMillis();
                result[0]= ""+(end-start);
                return result;
            case R.id.btnBM:
                tvResult=(TextView)activity.findViewById(R.id.tvBS);
                publishProgress("");
                start=System.currentTimeMillis();
                SortArray.bubbleSort(array[0]);
                end=System.currentTimeMillis();
                result[0]= ""+(end-start);

                tvResult=(TextView)activity.findViewById(R.id.tvSS);
                publishProgress("");
                start=System.currentTimeMillis();
                SortArray.selectionSort(array[0]);
                end=System.currentTimeMillis();
                result[1]= ""+(end-start);

                tvResult=(TextView)activity.findViewById(R.id.tvMS);
                publishProgress("");
                start=System.currentTimeMillis();
                SortArray.mergeSort(array[0]);
                end=System.currentTimeMillis();
                result[2]= ""+(end-start);

                tvResult=(TextView)activity.findViewById(R.id.tvIS);
                publishProgress("");
                start=System.currentTimeMillis();
                SortArray.insertionSort(array[0]);
                end=System.currentTimeMillis();
                result[3]= ""+(end-start);

                tvResult=(TextView)activity.findViewById(R.id.tvQS);
                publishProgress("");
                start=System.currentTimeMillis();
                SortArray.quickSort(array[0]);
                end=System.currentTimeMillis();
                result[4]= ""+(end-start);

                tvResult=(TextView)activity.findViewById(R.id.tvHS);
                publishProgress("");
                start=System.currentTimeMillis();
                SortArray.heapSort(array[0]);
                end=System.currentTimeMillis();
                result[5]= ""+(end-start);

                return result;
        }
        return null;
    }

    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
        tvResult.setText("In Progress...");
    }

    protected void onPostExecute(String[] array) {

        if (array[1]==null){
            tvResult.setText(array[0]+" ms");
        }else{
            tvBS.setText(array[0]+ " ms");
            tvSS.setText(array[1]+ " ms");
            tvMS.setText(array[2]+ " ms");
            tvIS.setText(array[3]+ " ms");
            tvQS.setText(array[4]+ " ms");
            tvHS.setText(array[5]+ " ms");
        }
    }
}
