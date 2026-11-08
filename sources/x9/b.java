package x9;

import android.util.Log;
public final class b {
    public static final b f58665a = new Object();

    public boolean a(int i7) {
        if (4 > i7 && !Log.isLoggable("FirebaseCrashlytics", i7)) {
            return false;
        }
        return true;
    }

    public void b(String str) {
        if (a(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public void c(String str) {
        if (a(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void d(String str, Exception exc) {
        if (a(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }
}
