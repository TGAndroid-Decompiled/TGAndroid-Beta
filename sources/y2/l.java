package y2;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import v7.u6;
public final class l implements m {
    public static final k4.d d = new k4.d(0, -9223372036854775807L, false);
    public static final k4.d e = new k4.d(2, -9223372036854775807L, false);
    public static final k4.d f49923f = new k4.d(3, -9223372036854775807L, false);
    public final z2.a f49924a;
    public h f49925b;
    public IOException f49926c;

    public l(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: y2.l.<init>(java.lang.String):void");
    }

    @Override
    public final void a() {
        IOException iOException = this.f49926c;
        if (iOException == null) {
            h hVar = this.f49925b;
            if (hVar != null) {
                int i10 = hVar.f49916a;
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f49919f > i10) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void b() {
        h hVar = this.f49925b;
        hVar.getClass();
        hVar.a(false);
    }

    public final boolean c() {
        if (this.f49926c != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f49925b != null) {
            return true;
        }
        return false;
    }

    public final void e(j jVar) {
        h hVar = this.f49925b;
        if (hVar != null) {
            hVar.a(true);
        }
        z2.a aVar = this.f49924a;
        if (jVar != null) {
            aVar.execute(new p8.b(jVar, 11));
        }
        aVar.f50625b.accept(aVar.f50624a);
    }

    public final void f(i iVar, g gVar, int i10) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.f49926c = null;
        h hVar = new h(this, myLooper, iVar, gVar, i10, SystemClock.elapsedRealtime());
        if (this.f49925b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        this.f49925b = hVar;
        hVar.b();
    }

    public l(z2.a aVar) {
        this.f49924a = aVar;
    }
}
