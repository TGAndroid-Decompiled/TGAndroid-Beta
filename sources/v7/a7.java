package v7;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class a7 {
    public static SharedPreferences f47973a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f47973a == null) {
                    f47973a = (SharedPreferences) w7.h0.a(new c5.y(context, 1));
                }
                sharedPreferences = f47973a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
