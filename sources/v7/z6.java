package v7;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class z6 {
    public static SharedPreferences f44584a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f44584a == null) {
                    f44584a = (SharedPreferences) w7.h0.a(new c5.x(context, 1));
                }
                sharedPreferences = f44584a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
