package v7;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class a7 {
    public static SharedPreferences f46576a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f46576a == null) {
                    f46576a = (SharedPreferences) w7.i0.a(new c5.y(context, 1));
                }
                sharedPreferences = f46576a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
