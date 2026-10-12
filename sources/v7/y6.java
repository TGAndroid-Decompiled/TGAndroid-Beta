package v7;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class y6 {
    public static SharedPreferences f49651a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f49651a == null) {
                    f49651a = (SharedPreferences) w7.e0.a(new c5.x(context, 1));
                }
                sharedPreferences = f49651a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
