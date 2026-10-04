package w9;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.Cells.c1;
public final class s {
    public final SharedPreferences f48988a;
    public final k9.h f48989b;
    public final Object f48990c;
    public TaskCompletionSource d;
    public boolean f48991e;
    public boolean f48992f;
    public Boolean f48993g;
    public final TaskCompletionSource h;

    public s(k9.h r8) {
        throw new UnsupportedOperationException("Method not decompiled: w9.s.<init>(k9.h):void");
    }

    public final synchronized boolean a() {
        boolean z10;
        String str;
        String str2;
        Boolean bool = this.f48993g;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            try {
                z10 = this.f48989b.h();
            } catch (IllegalStateException unused) {
                z10 = false;
            }
        }
        if (z10) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f48993g == null) {
            str2 = "global Firebase setting";
        } else if (this.f48992f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String k10 = c1.k("Crashlytics automatic data collection ", str, " by ", str2, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", k10, null);
        }
        return z10;
    }
}
