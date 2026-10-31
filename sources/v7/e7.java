package v7;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class e7 {
    public static SharedPreferences f50435a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f50435a == null) {
                    f50435a = (SharedPreferences) w7.j0.a(new c5.t(context, 1));
                }
                sharedPreferences = f50435a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
