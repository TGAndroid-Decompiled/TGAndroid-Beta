package x9;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class r {
    public final SharedPreferences f49747a;
    public final l9.h f49748b;
    public final Object f49749c;
    public TaskCompletionSource d;
    public boolean e;
    public boolean f49750f;
    public Boolean f49751g;
    public final TaskCompletionSource h;

    public r(l9.h r8) {
        throw new UnsupportedOperationException("Method not decompiled: x9.r.<init>(l9.h):void");
    }

    public final synchronized boolean a() {
        boolean z10;
        String str;
        String str2;
        Boolean bool = this.f49751g;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            try {
                z10 = this.f49748b.h();
            } catch (IllegalStateException unused) {
                z10 = false;
            }
        }
        if (z10) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f49751g == null) {
            str2 = "global Firebase setting";
        } else if (this.f49750f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String h = r.c.h("Crashlytics automatic data collection ", str, " by ", str2, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", h, null);
        }
        return z10;
    }
}
