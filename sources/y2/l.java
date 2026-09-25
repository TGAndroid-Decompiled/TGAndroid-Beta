package y2;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import pg.c1;
public final class l implements m {
    public static final k4.d d = new k4.d(0, -9223372036854775807L, false);
    public static final k4.d e = new k4.d(2, -9223372036854775807L, false);
    public static final k4.d f46574f = new k4.d(3, -9223372036854775807L, false);
    public final z2.a f46575a;
    public h f46576b;
    public IOException f46577c;

    public l(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: y2.l.<init>(java.lang.String):void");
    }

    @Override
    public final void a() {
        IOException iOException = this.f46577c;
        if (iOException == null) {
            h hVar = this.f46576b;
            if (hVar != null) {
                int i10 = hVar.f46567a;
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f46570f > i10) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void b() {
        h hVar = this.f46576b;
        e2.d.h(hVar);
        hVar.a(false);
    }

    public final boolean c() {
        if (this.f46577c != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f46576b != null) {
            return true;
        }
        return false;
    }

    public final void e(j jVar) {
        h hVar = this.f46576b;
        if (hVar != null) {
            hVar.a(true);
        }
        z2.a aVar = this.f46575a;
        if (jVar != null) {
            aVar.execute(new c1(jVar, 9));
        }
        aVar.f48350b.accept(aVar.f48349a);
    }

    public final void f(i iVar, g gVar, int i10) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        e2.d.h(myLooper);
        this.f46577c = null;
        h hVar = new h(this, myLooper, iVar, gVar, i10, SystemClock.elapsedRealtime());
        if (this.f46576b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        this.f46576b = hVar;
        hVar.b();
    }

    public l(z2.a aVar) {
        this.f46575a = aVar;
    }
}
