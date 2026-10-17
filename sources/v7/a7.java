package v7;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class a7 {
    public static SharedPreferences f47984a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f47984a == null) {
                    f47984a = (SharedPreferences) w7.h0.a(new c5.x(context, 1));
                }
                sharedPreferences = f47984a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
