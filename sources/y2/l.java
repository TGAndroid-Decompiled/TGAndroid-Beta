package y2;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import p4.s0;
import v7.u6;
public final class l implements m {
    public static final k4.d d = new k4.d(0, -9223372036854775807L, false);
    public static final k4.d e = new k4.d(2, -9223372036854775807L, false);
    public static final k4.d f48541f = new k4.d(3, -9223372036854775807L, false);
    public final z2.a f48542a;
    public h f48543b;
    public IOException f48544c;

    public l(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: y2.l.<init>(java.lang.String):void");
    }

    public final void a() {
        h hVar = this.f48543b;
        hVar.getClass();
        hVar.a(false);
    }

    @Override
    public final void b() {
        IOException iOException = this.f48544c;
        if (iOException == null) {
            h hVar = this.f48543b;
            if (hVar != null) {
                int i10 = hVar.f48534a;
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f48537f > i10) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final boolean c() {
        if (this.f48544c != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f48543b != null) {
            return true;
        }
        return false;
    }

    public final void e(j jVar) {
        h hVar = this.f48543b;
        if (hVar != null) {
            hVar.a(true);
        }
        z2.a aVar = this.f48542a;
        if (jVar != null) {
            aVar.execute(new s0(jVar, 12));
        }
        aVar.f49242b.accept(aVar.f49241a);
    }

    public final void f(i iVar, g gVar, int i10) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.f48544c = null;
        h hVar = new h(this, myLooper, iVar, gVar, i10, SystemClock.elapsedRealtime());
        if (this.f48543b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        this.f48543b = hVar;
        hVar.b();
    }

    public l(z2.a aVar) {
        this.f48542a = aVar;
    }
}
