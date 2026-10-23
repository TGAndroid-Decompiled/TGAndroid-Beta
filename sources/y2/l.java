package y2;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import org.telegram.ui.Wallet.m4;
import v7.u6;
public final class l implements m {
    public static final k4.d d = new k4.d(0, -9223372036854775807L, false);
    public static final k4.d e = new k4.d(2, -9223372036854775807L, false);
    public static final k4.d f50374f = new k4.d(3, -9223372036854775807L, false);
    public final z2.a f50375a;
    public h f50376b;
    public IOException f50377c;

    public l(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: y2.l.<init>(java.lang.String):void");
    }

    @Override
    public final void a() {
        IOException iOException = this.f50377c;
        if (iOException == null) {
            h hVar = this.f50376b;
            if (hVar != null) {
                int i10 = hVar.f50367a;
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f50370f > i10) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void b() {
        h hVar = this.f50376b;
        hVar.getClass();
        hVar.a(false);
    }

    public final boolean c() {
        if (this.f50377c != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f50376b != null) {
            return true;
        }
        return false;
    }

    public final void e(j jVar) {
        h hVar = this.f50376b;
        if (hVar != null) {
            hVar.a(true);
        }
        z2.a aVar = this.f50375a;
        if (jVar != null) {
            aVar.execute(new m4(jVar, 15));
        }
        aVar.f51095b.accept(aVar.f51094a);
    }

    public final void f(i iVar, g gVar, int i10) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.f50377c = null;
        h hVar = new h(this, myLooper, iVar, gVar, i10, SystemClock.elapsedRealtime());
        if (this.f50376b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        this.f50376b = hVar;
        hVar.b();
    }

    public l(z2.a aVar) {
        this.f50375a = aVar;
    }
}
