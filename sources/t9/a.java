package t9;

import android.util.Log;
import ci.p9;
import java.util.concurrent.atomic.AtomicReference;
import q9.p;
import r2.s;
import sa.e;
import y9.b1;
public final class a {
    public static final b f46948c = new Object();
    public final p f46949a;
    public final AtomicReference f46950b = new AtomicReference(null);

    public a(p pVar) {
        this.f46949a = pVar;
        pVar.a(new s(this, 6));
    }

    public final b a(String str) {
        a aVar = (a) this.f46950b.get();
        if (aVar == null) {
            return f46948c;
        }
        return aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f46950b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        a aVar = (a) this.f46950b.get();
        if (aVar != null && aVar.c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j3, b1 b1Var) {
        String i10 = e.i("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", i10, null);
        }
        this.f46949a.a(new p9(str, j3, b1Var, 9));
    }
}
