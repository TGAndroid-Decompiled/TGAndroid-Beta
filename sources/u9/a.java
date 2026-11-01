package u9;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import r9.p;
import rh.d0;
import sc.e;
import z9.b1;
public final class a {
    public static final c f50204c = new Object();
    public final p f50205a;
    public final AtomicReference f50206b = new AtomicReference(null);

    public a(p pVar) {
        this.f50205a = pVar;
        pVar.a(new d0(this, 20));
    }

    public final c a(String str) {
        a aVar = (a) this.f50206b.get();
        if (aVar == null) {
            return f50204c;
        }
        return aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f50206b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        a aVar = (a) this.f50206b.get();
        if (aVar != null && aVar.c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j10, b1 b1Var) {
        String h = e.h("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", h, null);
        }
        this.f50205a.a(new org.telegram.messenger.voip.d0(str, j10, b1Var, 10));
    }
}
