package w9;

import aa.r;
import aa.t;
import aa.w;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class b {
    public final t f59646a;

    public b(t tVar) {
        this.f59646a = tVar;
    }

    public final void a() {
        t tVar = this.f59646a;
        Boolean bool = Boolean.TRUE;
        w wVar = tVar.f854b;
        synchronized (wVar) {
            wVar.f879f = false;
            wVar.f880g = bool;
            SharedPreferences.Editor edit = wVar.f875a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (wVar.f877c) {
                if (wVar.a()) {
                    if (!wVar.f878e) {
                        wVar.d.trySetResult(null);
                        wVar.f878e = true;
                    }
                } else if (wVar.f878e) {
                    wVar.d = new TaskCompletionSource();
                    wVar.f878e = false;
                }
            }
        }
    }

    public final void b(String str, String str2) {
        t tVar = this.f59646a;
        tVar.f864n.f3058a.a(new r((Object) tVar, (Object) str, (Object) str2, 0));
    }
}
