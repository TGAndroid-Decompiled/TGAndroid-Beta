package v9;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;
import z9.o;
import z9.p;
import z9.s;
public final class b {
    public final p f56485a;

    public b(p pVar) {
        this.f56485a = pVar;
    }

    public final void a() {
        p pVar = this.f56485a;
        Boolean bool = Boolean.TRUE;
        s sVar = pVar.f60217b;
        synchronized (sVar) {
            sVar.f60242f = false;
            sVar.f60243g = bool;
            SharedPreferences.Editor edit = sVar.f60238a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (sVar.f60240c) {
                if (sVar.a()) {
                    if (!sVar.f60241e) {
                        sVar.d.trySetResult(null);
                        sVar.f60241e = true;
                    }
                } else if (sVar.f60241e) {
                    sVar.d = new TaskCompletionSource();
                    sVar.f60241e = false;
                }
            }
        }
    }

    public final void b(String str, String str2) {
        p pVar = this.f56485a;
        pVar.f60227n.f286a.a(new o(pVar, str, str2, 0));
    }
}
