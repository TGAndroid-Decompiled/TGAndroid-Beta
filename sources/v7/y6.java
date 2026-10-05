package v7;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class y6 {
    public static SharedPreferences f48161a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f48161a == null) {
                    f48161a = (SharedPreferences) w7.i0.a(new c5.x(context, 1));
                }
                sharedPreferences = f48161a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
