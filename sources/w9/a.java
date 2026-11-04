package w9;

import android.util.Log;
import ca.p1;
import ci.i;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.ActionBar.e3;
import t9.p;
public final class a {
    public static final c f57420c = new Object();
    public final p f57421a;
    public final AtomicReference f57422b = new AtomicReference(null);

    public a(p pVar) {
        this.f57421a = pVar;
        pVar.a(new e3(this, 28));
    }

    public final c a(String str) {
        a aVar = (a) this.f57422b.get();
        if (aVar == null) {
            return f57420c;
        }
        return aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f57422b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        a aVar = (a) this.f57422b.get();
        if (aVar != null && aVar.c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j10, p1 p1Var) {
        String f10 = t4.c.f("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", f10, null);
        }
        this.f57421a.a(new i(str, j10, p1Var, 11));
    }
}
