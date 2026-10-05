package y2;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import pg.c1;
public final class l implements m {
    public static final k4.d d = new k4.d(0, -9223372036854775807L, false);
    public static final k4.d f50413e = new k4.d(2, -9223372036854775807L, false);
    public static final k4.d f50414f = new k4.d(3, -9223372036854775807L, false);
    public final z2.a f50415a;
    public h f50416b;
    public IOException f50417c;

    public l(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: y2.l.<init>(java.lang.String):void");
    }

    @Override
    public final void a() {
        IOException iOException = this.f50417c;
        if (iOException == null) {
            h hVar = this.f50416b;
            if (hVar != null) {
                int i10 = hVar.f50405a;
                IOException iOException2 = hVar.f50408e;
                if (iOException2 != null && hVar.f50409f > i10) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void b() {
        h hVar = this.f50416b;
        e2.d.h(hVar);
        hVar.a(false);
    }

    public final boolean c() {
        if (this.f50417c != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f50416b != null) {
            return true;
        }
        return false;
    }

    public final void e(j jVar) {
        h hVar = this.f50416b;
        if (hVar != null) {
            hVar.a(true);
        }
        z2.a aVar = this.f50415a;
        if (jVar != null) {
            aVar.execute(new c1(jVar, 9));
        }
        aVar.f52378b.accept(aVar.f52377a);
    }

    public final void f(i iVar, g gVar, int i10) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        e2.d.h(myLooper);
        this.f50417c = null;
        h hVar = new h(this, myLooper, iVar, gVar, i10, SystemClock.elapsedRealtime());
        if (this.f50416b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        this.f50416b = hVar;
        hVar.b();
    }

    public l(z2.a aVar) {
        this.f50415a = aVar;
    }
}
