package w9;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.Cells.r6;
public final class r {
    public final SharedPreferences f43931a;
    public final k9.h f43932b;
    public final Object f43933c;
    public TaskCompletionSource d;
    public boolean e;
    public boolean f43934f;
    public Boolean f43935g;
    public final TaskCompletionSource h;

    public r(k9.h r8) {
        throw new UnsupportedOperationException("Method not decompiled: w9.r.<init>(k9.h):void");
    }

    public final synchronized boolean a() {
        boolean z10;
        String str;
        String str2;
        Boolean bool = this.f43935g;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            try {
                z10 = this.f43932b.h();
            } catch (IllegalStateException unused) {
                z10 = false;
            }
        }
        if (z10) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f43935g == null) {
            str2 = "global Firebase setting";
        } else if (this.f43934f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String j3 = r6.j("Crashlytics automatic data collection ", str, " by ", str2, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", j3, null);
        }
        return z10;
    }
}
