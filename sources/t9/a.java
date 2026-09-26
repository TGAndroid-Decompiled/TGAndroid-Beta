package t9;

import android.util.Log;
import ci.q9;
import java.util.concurrent.atomic.AtomicReference;
import q9.p;
import r5.d;
import v7.j;
import y9.b1;
public final class a {
    public static final b f43335c = new Object();
    public final p f43336a;
    public final AtomicReference f43337b = new AtomicReference(null);

    public a(p pVar) {
        this.f43336a = pVar;
        pVar.a(new d(this, 4));
    }

    public final b a(String str) {
        a aVar = (a) this.f43337b.get();
        if (aVar == null) {
            return f43335c;
        }
        return aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f43337b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        a aVar = (a) this.f43337b.get();
        if (aVar != null && aVar.c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j3, b1 b1Var) {
        String g10 = j.g("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", g10, null);
        }
        this.f43336a.a(new q9(str, j3, b1Var, 9));
    }
}
