package brauliomendez.com.mimonitest.util;

import android.app.Activity;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Braulio on 14/01/2017.
 */

public class JsonUtil {

    public static String getDataFromAssets(Activity activity, String nameFile) {
        String json = null;
        try {
            InputStream is = activity.getAssets().open(nameFile);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            return null;
        }
        return json;
    }
}
