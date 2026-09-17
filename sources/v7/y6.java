package v7;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class y6 {
    public static SharedPreferences f47666a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f47666a == null) {
                    f47666a = (SharedPreferences) w7.g0.a(new c5.x(context, 1));
                }
                sharedPreferences = f47666a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
