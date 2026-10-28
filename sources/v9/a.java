package v9;

import aa.d1;
import android.util.Log;
import bi.i;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.voip.j1;
import s9.q;
public final class a {
    public static final b f50132c = new Object();
    public final q f50133a;
    public final AtomicReference f50134b = new AtomicReference(null);

    public a(q qVar) {
        this.f50133a = qVar;
        qVar.a(new j1(this, 23));
    }

    public final b a(String str) {
        a aVar = (a) this.f50134b.get();
        if (aVar == null) {
            return f50132c;
        }
        return aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f50134b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        a aVar = (a) this.f50134b.get();
        if (aVar != null && aVar.c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j10, d1 d1Var) {
        String j11 = b10.j("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", j11, null);
        }
        this.f50133a.a(new i(str, j10, d1Var, 11));
    }
}
