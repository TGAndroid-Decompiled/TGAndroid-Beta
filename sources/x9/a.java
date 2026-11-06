package x9;

import android.util.Log;
import bi.i;
import da.p1;
import java.util.concurrent.atomic.AtomicReference;
import u5.e;
import u9.o;
public final class a {
    public static final b f58568c = new Object();
    public final o f58569a;
    public final AtomicReference f58570b = new AtomicReference(null);

    public a(o oVar) {
        this.f58569a = oVar;
        oVar.a(new e(this, 11));
    }

    public final b a(String str) {
        a aVar = (a) this.f58570b.get();
        if (aVar == null) {
            return f58568c;
        }
        return aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f58570b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        a aVar = (a) this.f58570b.get();
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
        this.f58569a.a(new i(str, j3, p1Var, 11));
    }
}
