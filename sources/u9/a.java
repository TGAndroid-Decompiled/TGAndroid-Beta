package u9;

import ai.f;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import qg.g0;
import r9.p;
import si.o0;
import z9.b1;
public final class a {
    public static final b f48070c = new Object();
    public final p f48071a;
    public final AtomicReference f48072b = new AtomicReference(null);

    public a(p pVar) {
        this.f48071a = pVar;
        pVar.a(new g0(this, 18));
    }

    public final b a(String str) {
        a aVar = (a) this.f48072b.get();
        if (aVar == null) {
            return f48070c;
        }
        return aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f48072b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        a aVar = (a) this.f48072b.get();
        if (aVar != null && aVar.c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j10, b1 b1Var) {
        String h = o0.h("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", h, null);
        }
        this.f48071a.a(new f(str, j10, b1Var, 11));
    }
}
