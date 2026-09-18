package t9;

import android.util.Log;
import ci.t9;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Cells.p6;
import q9.p;
import r5.d;
import y9.b1;
public final class a {
    public static final b f43075c = new Object();
    public final p f43076a;
    public final AtomicReference f43077b = new AtomicReference(null);

    public a(p pVar) {
        this.f43076a = pVar;
        pVar.a(new d(this, 4));
    }

    public final b a(String str) {
        a aVar = (a) this.f43077b.get();
        if (aVar == null) {
            return f43075c;
        }
        return aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f43077b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        a aVar = (a) this.f43077b.get();
        if (aVar != null && aVar.c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j3, b1 b1Var) {
        String i10 = p6.i("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", i10, null);
        }
        this.f43076a.a(new t9(str, j3, b1Var, 9));
    }
}
