package u9;

import ai.f;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import qg.g0;
import r9.p;
import z9.b1;
public final class a {
    public static final b f47640c = new Object();
    public final p f47641a;
    public final AtomicReference f47642b = new AtomicReference(null);

    public a(p pVar) {
        this.f47641a = pVar;
        pVar.a(new g0(this, 18));
    }

    public final b a(String str) {
        a aVar = (a) this.f47642b.get();
        if (aVar == null) {
            return f47640c;
        }
        return aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f47642b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        a aVar = (a) this.f47642b.get();
        if (aVar != null && aVar.c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j10, b1 b1Var) {
        String g10 = r.c.g("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", g10, null);
        }
        this.f47641a.a(new f(str, j10, b1Var, 10));
    }
}
