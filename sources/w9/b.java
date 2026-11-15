package w9;

import aa.r;
import aa.t;
import aa.w;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class b {
    public final t f59073a;

    public b(t tVar) {
        this.f59073a = tVar;
    }

    public final void a() {
        t tVar = this.f59073a;
        Boolean bool = Boolean.TRUE;
        w wVar = tVar.f855b;
        synchronized (wVar) {
            wVar.f880f = false;
            wVar.f881g = bool;
            SharedPreferences.Editor edit = wVar.f876a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (wVar.f878c) {
                if (wVar.a()) {
                    if (!wVar.f879e) {
                        wVar.d.trySetResult(null);
                        wVar.f879e = true;
                    }
                } else if (wVar.f879e) {
                    wVar.d = new TaskCompletionSource();
                    wVar.f879e = false;
                }
            }
        }
    }

    public final void b(String str, String str2) {
        t tVar = this.f59073a;
        tVar.f865n.f3090a.a(new r((Object) tVar, (Object) str, (Object) str2, 0));
    }
}
