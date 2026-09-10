package v7;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class z6 {
    public static SharedPreferences f43220a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f43220a == null) {
                    f43220a = (SharedPreferences) w7.g0.a(new c5.x(context, 1));
                }
                sharedPreferences = f43220a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
