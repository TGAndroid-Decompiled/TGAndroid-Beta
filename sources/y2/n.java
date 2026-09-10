package y2;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import sg.a1;
public final class n implements o {
    public static final k4.d d = new k4.d(0, -9223372036854775807L, false);
    public static final k4.d e = new k4.d(2, -9223372036854775807L, false);
    public static final k4.d f46444f = new k4.d(3, -9223372036854775807L, false);
    public final z2.a f46445a;
    public j f46446b;
    public IOException f46447c;

    public n(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: y2.n.<init>(java.lang.String):void");
    }

    @Override
    public final void a() {
        IOException iOException = this.f46447c;
        if (iOException == null) {
            j jVar = this.f46446b;
            if (jVar != null) {
                int i10 = jVar.f46437a;
                IOException iOException2 = jVar.e;
                if (iOException2 != null && jVar.f46440f > i10) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void b() {
        j jVar = this.f46446b;
        e2.d.h(jVar);
        jVar.a(false);
    }

    public final boolean c() {
        if (this.f46447c != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f46446b != null) {
            return true;
        }
        return false;
    }

    public final void e(l lVar) {
        j jVar = this.f46446b;
        if (jVar != null) {
            jVar.a(true);
        }
        z2.a aVar = this.f46445a;
        if (lVar != null) {
            aVar.execute(new a1(lVar, 7));
        }
        aVar.f47192b.accept(aVar.f47191a);
    }

    public final void f(k kVar, i iVar, int i10) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        e2.d.h(myLooper);
        this.f46447c = null;
        j jVar = new j(this, myLooper, kVar, iVar, i10, SystemClock.elapsedRealtime());
        if (this.f46446b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        this.f46446b = jVar;
        jVar.b();
    }

    public n(z2.a aVar) {
        this.f46445a = aVar;
    }
}
