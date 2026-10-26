package y9;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.Components.b10;
public final class s {
    public final SharedPreferences f52478a;
    public final m9.h f52479b;
    public final Object f52480c;
    public TaskCompletionSource d;
    public boolean e;
    public boolean f52481f;
    public Boolean f52482g;
    public final TaskCompletionSource h;

    public s(m9.h r8) {
        throw new UnsupportedOperationException("Method not decompiled: y9.s.<init>(m9.h):void");
    }

    public final synchronized boolean a() {
        boolean z10;
        String str;
        String str2;
        Boolean bool = this.f52482g;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            try {
                z10 = this.f52479b.h();
            } catch (IllegalStateException unused) {
                z10 = false;
            }
        }
        if (z10) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f52482g == null) {
            str2 = "global Firebase setting";
        } else if (this.f52481f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String k10 = b10.k("Crashlytics automatic data collection ", str, " by ", str2, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", k10, null);
        }
        return z10;
    }
}
