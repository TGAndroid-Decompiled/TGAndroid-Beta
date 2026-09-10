package t9;

import android.util.Log;
import bi.bb;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.j;
import org.telegram.ui.Cells.r6;
import q9.p;
import y9.b1;
public final class a {
    public static final b f42117c = new Object();
    public final p f42118a;
    public final AtomicReference f42119b = new AtomicReference(null);

    public a(p pVar) {
        this.f42118a = pVar;
        pVar.a(new j(this, 29));
    }

    public final b a(String str) {
        a aVar = (a) this.f42119b.get();
        if (aVar == null) {
            return f42117c;
        }
        return aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f42119b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        a aVar = (a) this.f42119b.get();
        if (aVar != null && aVar.c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j3, b1 b1Var) {
        String i10 = r6.i("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", i10, null);
        }
        this.f42118a.a(new bb(str, j3, b1Var, 9));
    }
}
