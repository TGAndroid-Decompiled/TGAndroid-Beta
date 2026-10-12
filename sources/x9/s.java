package x9;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.Cells.d0;
public final class s {
    public final SharedPreferences f48341a;
    public final l9.h f48342b;
    public final Object f48343c;
    public TaskCompletionSource d;
    public boolean e;
    public boolean f48344f;
    public Boolean f48345g;
    public final TaskCompletionSource h;

    public s(l9.h r8) {
        throw new UnsupportedOperationException("Method not decompiled: x9.s.<init>(l9.h):void");
    }

    public final synchronized boolean a() {
        boolean z10;
        String str;
        String str2;
        Boolean bool = this.f48345g;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            try {
                z10 = this.f48342b.h();
            } catch (IllegalStateException unused) {
                z10 = false;
            }
        }
        if (z10) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f48345g == null) {
            str2 = "global Firebase setting";
        } else if (this.f48344f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String j10 = d0.j("Crashlytics automatic data collection ", str, " by ", str2, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", j10, null);
        }
        return z10;
    }
}
