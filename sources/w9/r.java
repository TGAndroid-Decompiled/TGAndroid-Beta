package w9;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.Cells.p6;
public final class r {
    public final SharedPreferences f48443a;
    public final k9.h f48444b;
    public final Object f48445c;
    public TaskCompletionSource d;
    public boolean f48446e;
    public boolean f48447f;
    public Boolean f48448g;
    public final TaskCompletionSource h;

    public r(k9.h r8) {
        throw new UnsupportedOperationException("Method not decompiled: w9.r.<init>(k9.h):void");
    }

    public final synchronized boolean a() {
        boolean z10;
        String str;
        String str2;
        Boolean bool = this.f48448g;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            try {
                z10 = this.f48444b.h();
            } catch (IllegalStateException unused) {
                z10 = false;
            }
        }
        if (z10) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f48448g == null) {
            str2 = "global Firebase setting";
        } else if (this.f48447f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String j3 = p6.j("Crashlytics automatic data collection ", str, " by ", str2, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", j3, null);
        }
        return z10;
    }
}
