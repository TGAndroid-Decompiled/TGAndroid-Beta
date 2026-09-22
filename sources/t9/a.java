package t9;

import android.util.Log;
import ci.t9;
import java.util.concurrent.atomic.AtomicReference;
import q9.q;
import r5.d;
import v7.j0;
import y9.b1;
public final class a {
    public static final b f43370c = new Object();
    public final q f43371a;
    public final AtomicReference f43372b = new AtomicReference(null);

    public a(q qVar) {
        this.f43371a = qVar;
        qVar.a(new d(this, 4));
    }

    public final b a(String str) {
        a aVar = (a) this.f43372b.get();
        if (aVar == null) {
            return f43370c;
        }
        return aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f43372b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        a aVar = (a) this.f43372b.get();
        if (aVar != null && aVar.c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j3, b1 b1Var) {
        String g10 = j0.g("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", g10, null);
        }
        this.f43371a.a(new t9(str, j3, b1Var, 9));
    }
}
