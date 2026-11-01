package v7;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class e7 {
    public static SharedPreferences f50449a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f50449a == null) {
                    f50449a = (SharedPreferences) w7.j0.a(new c5.t(context, 1));
                }
                sharedPreferences = f50449a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
