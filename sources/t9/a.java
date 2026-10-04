package t9;

import android.util.Log;
import ci.p9;
import java.util.concurrent.atomic.AtomicReference;
import q9.p;
import r2.s;
import y9.b1;
public final class a {
    public static final b f46933c = new Object();
    public final p f46934a;
    public final AtomicReference f46935b = new AtomicReference(null);

    public a(p pVar) {
        this.f46934a = pVar;
        pVar.a(new s(this, 6));
    }

    public final b a(String str) {
        a aVar = (a) this.f46935b.get();
        if (aVar == null) {
            return f46933c;
        }
        return aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f46935b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        a aVar = (a) this.f46935b.get();
        if (aVar != null && aVar.c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j3, b1 b1Var) {
        String i10 = t8.b.i("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", i10, null);
        }
        this.f46934a.a(new p9(str, j3, b1Var, 9));
    }
}
