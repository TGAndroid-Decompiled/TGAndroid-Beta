package y2;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import org.telegram.ui.Wallet.p5;
public final class l implements m {
    public static final k4.d d = new k4.d(0, -9223372036854775807L, false);
    public static final k4.d f51781e = new k4.d(2, -9223372036854775807L, false);
    public static final k4.d f51782f = new k4.d(3, -9223372036854775807L, false);
    public final z2.a f51783a;
    public h f51784b;
    public IOException f51785c;

    public l(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: y2.l.<init>(java.lang.String):void");
    }

    @Override
    public final void a() {
        IOException iOException = this.f51785c;
        if (iOException == null) {
            h hVar = this.f51784b;
            if (hVar != null) {
                int i10 = hVar.f51773a;
                IOException iOException2 = hVar.f51776e;
                if (iOException2 != null && hVar.f51777f > i10) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void b() {
        h hVar = this.f51784b;
        e2.d.h(hVar);
        hVar.a(false);
    }

    public final boolean c() {
        if (this.f51785c != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f51784b != null) {
            return true;
        }
        return false;
    }

    public final void e(j jVar) {
        h hVar = this.f51784b;
        if (hVar != null) {
            hVar.a(true);
        }
        z2.a aVar = this.f51783a;
        if (jVar != null) {
            aVar.execute(new p5(jVar, 12));
        }
        aVar.f53571b.accept(aVar.f53570a);
    }

    public final void f(i iVar, g gVar, int i10) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        e2.d.h(myLooper);
        this.f51785c = null;
        h hVar = new h(this, myLooper, iVar, gVar, i10, SystemClock.elapsedRealtime());
        if (this.f51784b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        this.f51784b = hVar;
        hVar.b();
    }

    public l(z2.a aVar) {
        this.f51783a = aVar;
    }
}
