package com.venkatkamesh.allinone;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContactsView extends AppCompatActivity {
        private static final int RQS_PICK_CONTACT =1 ;
        private TextView contactNumber;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_contacts_view);

            contactNumber = (TextView)findViewById(R.id.contactnumber);

            Button buttonPickContact = (Button)findViewById(R.id.pickcontact);
            buttonPickContact.setOnClickListener(new Button.OnClickListener(){

                @Override
                public void onClick(View arg0) {
                    // TODO Auto-generated method stub


                    Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                    intent.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE);
                    startActivityForResult(intent, 1);


                }});
        }

        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            // TODO Auto-generated method stub
            super.onActivityResult(requestCode, resultCode, data);


            if(requestCode == RQS_PICK_CONTACT){
                if(resultCode == RESULT_OK){
                    Uri contactData = data.getData();
                    Cursor cursor = getContentResolver().query(contactData, null, null, null, null);
                    cursor.moveToFirst();

                    String number =       cursor.getString(cursor.getColumnIndexOrThrow(ContactsContract.CommonDataKinds.Phone.NUMBER));

                    //contactName.setText(name);
                    contactNumber.setText(number);
                    //contactEmail.setText(email);
                }
            }
        }


}
