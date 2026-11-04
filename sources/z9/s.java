package z9;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.Cells.f1;
public final class s {
    public final SharedPreferences f60238a;
    public final n9.h f60239b;
    public final Object f60240c;
    public TaskCompletionSource d;
    public boolean f60241e;
    public boolean f60242f;
    public Boolean f60243g;
    public final TaskCompletionSource h;

    public s(n9.h r8) {
        throw new UnsupportedOperationException("Method not decompiled: z9.s.<init>(n9.h):void");
    }

    public final synchronized boolean a() {
        boolean z10;
        String str;
        String str2;
        Boolean bool = this.f60243g;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            try {
                z10 = this.f60239b.h();
            } catch (IllegalStateException unused) {
                z10 = false;
            }
        }
        if (z10) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f60243g == null) {
            str2 = "global Firebase setting";
        } else if (this.f60242f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String q10 = f1.q("Crashlytics automatic data collection ", str, " by ", str2, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", q10, null);
        }
        return z10;
    }
}
