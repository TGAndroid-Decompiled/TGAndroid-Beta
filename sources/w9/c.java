package w9;

import android.util.Log;
public final class c {
    public static final c f57426a = new Object();

    public boolean a(int i3) {
        if (4 > i3 && !Log.isLoggable("FirebaseCrashlytics", i3)) {
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
