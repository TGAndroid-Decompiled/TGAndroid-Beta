package y2;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import v7.u6;
public final class l implements m {
    public static final k4.d d = new k4.d(0, -9223372036854775807L, false);
    public static final k4.d e = new k4.d(2, -9223372036854775807L, false);
    public static final k4.d f49934f = new k4.d(3, -9223372036854775807L, false);
    public final z2.a f49935a;
    public h f49936b;
    public IOException f49937c;

    public l(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: y2.l.<init>(java.lang.String):void");
    }

    @Override
    public final void a() {
        IOException iOException = this.f49937c;
        if (iOException == null) {
            h hVar = this.f49936b;
            if (hVar != null) {
                int i10 = hVar.f49927a;
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f49930f > i10) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void b() {
        h hVar = this.f49936b;
        hVar.getClass();
        hVar.a(false);
    }

    public final boolean c() {
        if (this.f49937c != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f49936b != null) {
            return true;
        }
        return false;
    }

    public final void e(j jVar) {
        h hVar = this.f49936b;
        if (hVar != null) {
            hVar.a(true);
        }
        z2.a aVar = this.f49935a;
        if (jVar != null) {
            aVar.execute(new p8.b(jVar, 11));
        }
        aVar.f50636b.accept(aVar.f50635a);
    }

    public final void f(i iVar, g gVar, int i10) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.f49937c = null;
        h hVar = new h(this, myLooper, iVar, gVar, i10, SystemClock.elapsedRealtime());
        if (this.f49936b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        this.f49936b = hVar;
        hVar.b();
    }

    public l(z2.a aVar) {
        this.f49935a = aVar;
    }
}
