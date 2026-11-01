package y2;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import v7.t6;
public final class l implements m {
    public static final k4.d d = new k4.d(0, -9223372036854775807L, false);
    public static final k4.d e = new k4.d(2, -9223372036854775807L, false);
    public static final k4.d f54184f = new k4.d(3, -9223372036854775807L, false);
    public final z2.a f54185a;
    public h f54186b;
    public IOException f54187c;

    public l(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: y2.l.<init>(java.lang.String):void");
    }

    @Override
    public final void a() {
        IOException iOException = this.f54187c;
        if (iOException == null) {
            h hVar = this.f54186b;
            if (hVar != null) {
                int i10 = hVar.f54177a;
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f54180f > i10) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void b() {
        h hVar = this.f54186b;
        hVar.getClass();
        hVar.a(false);
    }

    public final boolean c() {
        if (this.f54187c != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f54186b != null) {
            return true;
        }
        return false;
    }

    public final void e(j jVar) {
        h hVar = this.f54186b;
        if (hVar != null) {
            hVar.a(true);
        }
        z2.a aVar = this.f54185a;
        if (jVar != null) {
            aVar.execute(new u0.b(jVar, 4));
        }
        aVar.f54562b.accept(aVar.f54561a);
    }

    public final void f(i iVar, g gVar, int i10) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.f54187c = null;
        h hVar = new h(this, myLooper, iVar, gVar, i10, SystemClock.elapsedRealtime());
        if (this.f54186b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.p(z10);
        this.f54186b = hVar;
        hVar.b();
    }

    public l(z2.a aVar) {
        this.f54185a = aVar;
    }
}
