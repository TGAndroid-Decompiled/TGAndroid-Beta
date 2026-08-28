package t5;

import android.os.Build;
import android.util.Log;
public final class f extends ClassLoader {
    @Override
    public final Class loadClass(String str, boolean z10) {
        if (str != "com.google.android.gms.iid.MessengerCompat" && (str == null || !str.equals("com.google.android.gms.iid.MessengerCompat"))) {
            return super.loadClass(str, z10);
        }
        if (Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3))) {
            Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
            return g.class;
        }
        return g.class;
    }
}
