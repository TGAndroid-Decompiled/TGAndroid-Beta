package u9;

import android.util.Log;
import di.p9;
import java.util.concurrent.atomic.AtomicReference;
import r9.p;
import rg.b0;
import z9.b1;
public final class a {
    public static final b f46232c = new Object();
    public final p f46233a;
    public final AtomicReference f46234b = new AtomicReference(null);

    public a(p pVar) {
        this.f46233a = pVar;
        pVar.a(new b0(this, 9));
    }

    public final b a(String str) {
        a aVar = (a) this.f46234b.get();
        if (aVar == null) {
            return f46232c;
        }
        return aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f46234b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        a aVar = (a) this.f46234b.get();
        if (aVar != null && aVar.c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j10, b1 b1Var) {
        String h = t8.b.h("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", h, null);
        }
        this.f46233a.a(new p9(str, j10, b1Var, 9));
    }
}
