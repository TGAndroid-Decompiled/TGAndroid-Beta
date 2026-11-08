package x9;

import android.util.Log;
import bi.i;
import da.p1;
import java.util.concurrent.atomic.AtomicReference;
import u5.e;
import u9.p;
public final class a {
    public static final b f58663c = new Object();
    public final p f58664a;
    public final AtomicReference f58665b = new AtomicReference(null);

    public a(p pVar) {
        this.f58664a = pVar;
        pVar.a(new e(this, 11));
    }

    public final b a(String str) {
        a aVar = (a) this.f58665b.get();
        if (aVar == null) {
            return f58663c;
        }
        return aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f58665b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        a aVar = (a) this.f58665b.get();
        if (aVar != null && aVar.c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j3, p1 p1Var) {
        String i7 = rf.b.i("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", i7, null);
        }
        this.f58664a.a(new i(str, j3, p1Var, 11));
    }
}
