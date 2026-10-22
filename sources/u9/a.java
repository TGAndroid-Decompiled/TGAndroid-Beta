package u9;

import ai.f;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import qg.h0;
import r9.p;
import z9.b1;
public final class a {
    public static final b f47629c = new Object();
    public final p f47630a;
    public final AtomicReference f47631b = new AtomicReference(null);

    public a(p pVar) {
        this.f47630a = pVar;
        pVar.a(new h0(this, 18));
    }

    public final b a(String str) {
        a aVar = (a) this.f47631b.get();
        if (aVar == null) {
            return f47629c;
        }
        return aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f47631b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        a aVar = (a) this.f47631b.get();
        if (aVar != null && aVar.c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j10, b1 b1Var) {
        String h = r4.c.h("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", h, null);
        }
        this.f47630a.a(new f(str, j10, b1Var, 11));
    }
}
