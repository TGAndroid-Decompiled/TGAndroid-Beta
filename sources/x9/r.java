package x9;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.Cells.c1;
public final class r {
    public final SharedPreferences f49725a;
    public final l9.h f49726b;
    public final Object f49727c;
    public TaskCompletionSource d;
    public boolean e;
    public boolean f49728f;
    public Boolean f49729g;
    public final TaskCompletionSource h;

    public r(l9.h r8) {
        throw new UnsupportedOperationException("Method not decompiled: x9.r.<init>(l9.h):void");
    }

    public final synchronized boolean a() {
        boolean z10;
        String str;
        String str2;
        Boolean bool = this.f49729g;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            try {
                z10 = this.f49726b.h();
            } catch (IllegalStateException unused) {
                z10 = false;
            }
        }
        if (z10) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f49729g == null) {
            str2 = "global Firebase setting";
        } else if (this.f49728f) {
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
