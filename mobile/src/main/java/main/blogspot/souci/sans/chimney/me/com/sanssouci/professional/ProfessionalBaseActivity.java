package main.blogspot.souci.sans.chimney.me.com.sanssouci.professional;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import main.blogspot.souci.sans.chimney.me.com.sanssouci.R;

/**
 * Created by Shivani Shastri on 2/4/17.
 * <p>
 * This is the Base Activity for Professional Section of the profile. This section has a "Teal" theme of Material Design Palatte
 * and follows Data Binding as a principle (MVVM Design Pattern). This has 3 tabs : Playstore Projects , Projects Completed and Technical Skills
 *
 */

public class ProfessionalBaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //App.get()
        setContentView(R.layout.activity_professional);
    }
}
