package in.ruks.myintent;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Gallery = (Button) findViewById(R.id.button_gallery);
        Button CallLog = (Button) findViewById(R.id.button_calllog);
        Button Contacts = (Button) findViewById(R.id.button_contacts);
        Button Map = (Button) findViewById(R.id.button_map);
        Button Dail = (Button) findViewById(R.id.button_Dail);
        Button Broswer = (Button) findViewById(R.id.button_browser);

        Contacts.setOnClickListener(new Button.OnClickListener(){

            @SuppressWarnings("deprecation")
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent myIntent = new Intent();

                myIntent.setAction(Intent.ACTION_VIEW);
                myIntent.setData(android.provider.Contacts.People.CONTENT_URI);
                startActivity(myIntent);

            }
        });

        Gallery.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent myIntent = new Intent();

                myIntent.setAction(Intent.ACTION_VIEW);
                myIntent.setData(android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                startActivity(myIntent);

            }
        });
        Dail.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

				/*Intent myIntent = new Intent();

				myIntent.setAction(Intent.ACTION_VIEW);
				myIntent.setData(android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI);
				startActivity(myIntent);*/

                Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                        Uri.parse("tel:+918147656011"));
                startActivity(i);
            }
        });
        CallLog.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent myIntent = new Intent();

                myIntent.setAction(Intent.ACTION_CALL_BUTTON);
                startActivity(myIntent);
            }
        });

        Broswer.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent i = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("http://www.openglprojects.in"));
                startActivity(i);
            }
        });

        Map.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent myIntent = new Intent();

                myIntent.setAction(Intent.ACTION_VIEW);
                myIntent.setData(Uri.parse("geo:37.827500,-122.481670"));
                startActivity(myIntent);

            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        //return super.onOptionsItemSelected(item);
        if(item.getItemId()==R.id.action_exit){
            this.finish();
            return true;
        }
        return false;
    }


}
