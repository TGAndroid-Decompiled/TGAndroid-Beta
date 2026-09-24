package y2;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import pg.c1;
public final class m implements n {
    public static final k4.d d = new k4.d(0, -9223372036854775807L, false);
    public static final k4.d e = new k4.d(2, -9223372036854775807L, false);
    public static final k4.d f46562f = new k4.d(3, -9223372036854775807L, false);
    public final z2.a f46563a;
    public i f46564b;
    public IOException f46565c;

    public m(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: y2.m.<init>(java.lang.String):void");
    }

    @Override
    public final void a() {
        IOException iOException = this.f46565c;
        if (iOException == null) {
            i iVar = this.f46564b;
            if (iVar != null) {
                int i10 = iVar.f46555a;
                IOException iOException2 = iVar.e;
                if (iOException2 != null && iVar.f46558f > i10) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void b() {
        i iVar = this.f46564b;
        e2.d.h(iVar);
        iVar.a(false);
    }

    public final boolean c() {
        if (this.f46565c != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f46564b != null) {
            return true;
        }
        return false;
    }

    public final void e(k kVar) {
        i iVar = this.f46564b;
        if (iVar != null) {
            iVar.a(true);
        }
        z2.a aVar = this.f46563a;
        if (kVar != null) {
            aVar.execute(new c1(kVar, 9));
        }
        aVar.f48338b.accept(aVar.f48337a);
    }

    public final void f(j jVar, h hVar, int i10) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        e2.d.h(myLooper);
        this.f46565c = null;
        i iVar = new i(this, myLooper, jVar, hVar, i10, SystemClock.elapsedRealtime());
        if (this.f46564b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        this.f46564b = iVar;
        iVar.b();
    }

    public m(z2.a aVar) {
        this.f46563a = aVar;
    }
}
