package w9;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.Cells.c1;
public final class s {
    public final SharedPreferences f49004a;
    public final k9.h f49005b;
    public final Object f49006c;
    public TaskCompletionSource d;
    public boolean f49007e;
    public boolean f49008f;
    public Boolean f49009g;
    public final TaskCompletionSource h;

    public s(k9.h r8) {
        throw new UnsupportedOperationException("Method not decompiled: w9.s.<init>(k9.h):void");
    }

    public final synchronized boolean a() {
        boolean z10;
        String str;
        String str2;
        Boolean bool = this.f49009g;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            try {
                z10 = this.f49005b.h();
            } catch (IllegalStateException unused) {
                z10 = false;
            }
        }
        if (z10) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f49009g == null) {
            str2 = "global Firebase setting";
        } else if (this.f49008f) {
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
