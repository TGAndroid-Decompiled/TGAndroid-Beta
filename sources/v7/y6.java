package v7;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class y6 {
    public static SharedPreferences f44137a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f44137a == null) {
                    f44137a = (SharedPreferences) w7.g0.a(new c5.x(context, 1));
                }
                sharedPreferences = f44137a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
