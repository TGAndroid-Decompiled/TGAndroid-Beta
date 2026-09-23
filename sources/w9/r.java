package w9;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.Cells.q3;
public final class r {
    public final SharedPreferences f44922a;
    public final k9.h f44923b;
    public final Object f44924c;
    public TaskCompletionSource d;
    public boolean e;
    public boolean f44925f;
    public Boolean f44926g;
    public final TaskCompletionSource h;

    public r(k9.h r8) {
        throw new UnsupportedOperationException("Method not decompiled: w9.r.<init>(k9.h):void");
    }

    public final synchronized boolean a() {
        boolean z10;
        String str;
        String str2;
        Boolean bool = this.f44926g;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            try {
                z10 = this.f44923b.h();
            } catch (IllegalStateException unused) {
                z10 = false;
            }
        }
        if (z10) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f44926g == null) {
            str2 = "global Firebase setting";
        } else if (this.f44925f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String j3 = q3.j("Crashlytics automatic data collection ", str, " by ", str2, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", j3, null);
        }
        return z10;
    }
}
