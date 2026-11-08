package w9;

import aa.s;
import aa.u;
import aa.x;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class b {
    public final u f57620a;

    public b(u uVar) {
        this.f57620a = uVar;
    }

    public final void a() {
        u uVar = this.f57620a;
        Boolean bool = Boolean.TRUE;
        x xVar = uVar.f858b;
        synchronized (xVar) {
            xVar.f883f = false;
            xVar.f884g = bool;
            SharedPreferences.Editor edit = xVar.f879a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (xVar.f881c) {
                if (xVar.a()) {
                    if (!xVar.f882e) {
                        xVar.d.trySetResult(null);
                        xVar.f882e = true;
                    }
                } else if (xVar.f882e) {
                    xVar.d = new TaskCompletionSource();
                    xVar.f882e = false;
                }
            }
        }
    }

    public final void b(String str, String str2) {
        u uVar = this.f57620a;
        uVar.f868n.f3135a.a(new s((Object) uVar, (Object) str, (Object) str2, 0));
    }
}
