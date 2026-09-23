package t9;

import android.util.Log;
import ci.q9;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Cells.q3;
import q9.p;
import r5.d;
import y9.b1;
public final class a {
    public static final b f42999c = new Object();
    public final p f43000a;
    public final AtomicReference f43001b = new AtomicReference(null);

    public a(p pVar) {
        this.f43000a = pVar;
        pVar.a(new d(this, 4));
    }

    public final b a(String str) {
        a aVar = (a) this.f43001b.get();
        if (aVar == null) {
            return f42999c;
        }
        return aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f43001b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        a aVar = (a) this.f43001b.get();
        if (aVar != null && aVar.c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j3, b1 b1Var) {
        String i10 = q3.i("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", i10, null);
        }
        this.f43000a.a(new q9(str, j3, b1Var, 9));
    }
}
