package customfont.gaurav.com.customfont;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text);
        Typeface myCustomFont =  Typeface.createFromAsset(getAssets(), "OpenSans-Bold.ttf");
        textView.setTypeface(myCustomFont);
        textView.setText("This is an example to show how we can add custom fonts in any android application");
    }


}
