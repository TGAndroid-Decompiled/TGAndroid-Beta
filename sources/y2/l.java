package y2;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import p4.s0;
import v7.u6;
public final class l implements m {
    public static final k4.d d = new k4.d(0, -9223372036854775807L, false);
    public static final k4.d e = new k4.d(2, -9223372036854775807L, false);
    public static final k4.d f49946f = new k4.d(3, -9223372036854775807L, false);
    public final z2.a f49947a;
    public h f49948b;
    public IOException f49949c;

    public l(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: y2.l.<init>(java.lang.String):void");
    }

    @Override
    public final void a() {
        IOException iOException = this.f49949c;
        if (iOException == null) {
            h hVar = this.f49948b;
            if (hVar != null) {
                int i10 = hVar.f49939a;
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f49942f > i10) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void b() {
        h hVar = this.f49948b;
        hVar.getClass();
        hVar.a(false);
    }

    public final boolean c() {
        if (this.f49949c != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f49948b != null) {
            return true;
        }
        return false;
    }

    public final void e(j jVar) {
        h hVar = this.f49948b;
        if (hVar != null) {
            hVar.a(true);
        }
        z2.a aVar = this.f49947a;
        if (jVar != null) {
            aVar.execute(new s0(jVar, 12));
        }
        aVar.f50648b.accept(aVar.f50647a);
    }

    public final void f(i iVar, g gVar, int i10) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.f49949c = null;
        h hVar = new h(this, myLooper, iVar, gVar, i10, SystemClock.elapsedRealtime());
        if (this.f49948b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        this.f49948b = hVar;
        hVar.b();
    }

    public l(z2.a aVar) {
        this.f49947a = aVar;
    }
}
