package autocompletetextviewdb.settingpage;

/**
 * Created by Dell on 14-10-2016.
 */
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class UserSettingActivity extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.settings);

    }
}
