package t9;

import android.util.Log;
import di.s9;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Cells.p6;
import q9.p;
import rg.p2;
import y9.b1;
public final class a {
    public static final b f46504c = new Object();
    public final p f46505a;
    public final AtomicReference f46506b = new AtomicReference(null);

    public a(p pVar) {
        this.f46505a = pVar;
        pVar.a(new p2(this, 3));
    }

    public final b a(String str) {
        a aVar = (a) this.f46506b.get();
        if (aVar == null) {
            return f46504c;
        }
        return aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f46506b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        a aVar = (a) this.f46506b.get();
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
        this.f46505a.a(new s9(str, j3, b1Var, 9));
    }
}
