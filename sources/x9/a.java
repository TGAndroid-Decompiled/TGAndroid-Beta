package x9;

import android.util.Log;
import da.p1;
import di.h;
import java.util.concurrent.atomic.AtomicReference;
import tg.z1;
import u9.o;
public final class a {
    public static final b f59853c = new Object();
    public final o f59854a;
    public final AtomicReference f59855b = new AtomicReference(null);

    public a(o oVar) {
        this.f59854a = oVar;
        oVar.a(new z1(this, 15));
    }

    public final b a(String str) {
        a aVar = (a) this.f59855b.get();
        if (aVar == null) {
            return f59853c;
        }
        return aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f59855b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        a aVar = (a) this.f59855b.get();
        if (aVar != null && aVar.c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j3, p1 p1Var) {
        String k10 = r.b.k("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", k10, null);
        }
        this.f59854a.a(new h(str, j3, p1Var, 11));
    }
}
