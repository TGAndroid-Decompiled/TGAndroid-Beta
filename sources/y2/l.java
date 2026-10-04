package y2;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import pg.c1;
public final class l implements m {
    public static final k4.d d = new k4.d(0, -9223372036854775807L, false);
    public static final k4.d f50397e = new k4.d(2, -9223372036854775807L, false);
    public static final k4.d f50398f = new k4.d(3, -9223372036854775807L, false);
    public final z2.a f50399a;
    public h f50400b;
    public IOException f50401c;

    public l(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: y2.l.<init>(java.lang.String):void");
    }

    @Override
    public final void a() {
        IOException iOException = this.f50401c;
        if (iOException == null) {
            h hVar = this.f50400b;
            if (hVar != null) {
                int i10 = hVar.f50389a;
                IOException iOException2 = hVar.f50392e;
                if (iOException2 != null && hVar.f50393f > i10) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void b() {
        h hVar = this.f50400b;
        e2.d.h(hVar);
        hVar.a(false);
    }

    public final boolean c() {
        if (this.f50401c != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f50400b != null) {
            return true;
        }
        return false;
    }

    public final void e(j jVar) {
        h hVar = this.f50400b;
        if (hVar != null) {
            hVar.a(true);
        }
        z2.a aVar = this.f50399a;
        if (jVar != null) {
            aVar.execute(new c1(jVar, 9));
        }
        aVar.f52349b.accept(aVar.f52348a);
    }

    public final void f(i iVar, g gVar, int i10) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        e2.d.h(myLooper);
        this.f50401c = null;
        h hVar = new h(this, myLooper, iVar, gVar, i10, SystemClock.elapsedRealtime());
        if (this.f50400b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        this.f50400b = hVar;
        hVar.b();
    }

    public l(z2.a aVar) {
        this.f50399a = aVar;
    }
}
