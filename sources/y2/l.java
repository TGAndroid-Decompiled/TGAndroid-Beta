package y2;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import org.telegram.ui.Wallet.m5;
import v7.u6;
public final class l implements m {
    public static final k4.d d = new k4.d(0, -9223372036854775807L, false);
    public static final k4.d e = new k4.d(2, -9223372036854775807L, false);
    public static final k4.d f48542f = new k4.d(3, -9223372036854775807L, false);
    public final z2.a f48543a;
    public h f48544b;
    public IOException f48545c;

    public l(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: y2.l.<init>(java.lang.String):void");
    }

    public final void a() {
        h hVar = this.f48544b;
        hVar.getClass();
        hVar.a(false);
    }

    public final boolean b() {
        if (this.f48545c != null) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f48544b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        IOException iOException = this.f48545c;
        if (iOException == null) {
            h hVar = this.f48544b;
            if (hVar != null) {
                int i10 = hVar.f48535a;
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f48538f > i10) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void e(j jVar) {
        h hVar = this.f48544b;
        if (hVar != null) {
            hVar.a(true);
        }
        z2.a aVar = this.f48543a;
        if (jVar != null) {
            aVar.execute(new m5(jVar, 12));
        }
        aVar.f49243b.accept(aVar.f49242a);
    }

    public final void f(i iVar, g gVar, int i10) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.f48545c = null;
        h hVar = new h(this, myLooper, iVar, gVar, i10, SystemClock.elapsedRealtime());
        if (this.f48544b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        this.f48544b = hVar;
        hVar.b();
    }

    public l(z2.a aVar) {
        this.f48543a = aVar;
    }
}
