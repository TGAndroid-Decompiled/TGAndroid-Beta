package v7;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class z6 {
    public static SharedPreferences f44477a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f44477a == null) {
                    f44477a = (SharedPreferences) w7.h0.a(new c5.x(context, 1));
                }
                sharedPreferences = f44477a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
