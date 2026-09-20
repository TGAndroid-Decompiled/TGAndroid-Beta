package v7;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class z6 {
    public static SharedPreferences f44492a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f44492a == null) {
                    f44492a = (SharedPreferences) w7.h0.a(new c5.x(context, 1));
                }
                sharedPreferences = f44492a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
