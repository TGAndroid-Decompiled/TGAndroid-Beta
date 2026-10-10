package w9;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.Cells.c1;
public final class r {
    public final SharedPreferences f50329a;
    public final k9.h f50330b;
    public final Object f50331c;
    public TaskCompletionSource d;
    public boolean f50332e;
    public boolean f50333f;
    public Boolean f50334g;
    public final TaskCompletionSource h;

    public r(k9.h r8) {
        throw new UnsupportedOperationException("Method not decompiled: w9.r.<init>(k9.h):void");
    }

    public final synchronized boolean a() {
        boolean z10;
        String str;
        String str2;
        Boolean bool = this.f50334g;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            try {
                z10 = this.f50330b.h();
            } catch (IllegalStateException unused) {
                z10 = false;
            }
        }
        if (z10) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f50334g == null) {
            str2 = "global Firebase setting";
        } else if (this.f50333f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String i10 = c1.i("Crashlytics automatic data collection ", str, " by ", str2, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", i10, null);
        }
        return z10;
    }
}
