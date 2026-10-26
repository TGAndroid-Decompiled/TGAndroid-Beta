package y2;

import a8.yb;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import org.telegram.ui.Components.cy0;
public final class l implements m {
    public static final k4.d d = new k4.d(0, -9223372036854775807L, false);
    public static final k4.d e = new k4.d(2, -9223372036854775807L, false);
    public static final k4.d f51963f = new k4.d(3, -9223372036854775807L, false);
    public final z2.a f51964a;
    public h f51965b;
    public IOException f51966c;

    public l(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: y2.l.<init>(java.lang.String):void");
    }

    public final void a() {
        h hVar = this.f51965b;
        hVar.getClass();
        hVar.a(false);
    }

    public final boolean b() {
        if (this.f51966c != null) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f51965b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        IOException iOException = this.f51966c;
        if (iOException == null) {
            h hVar = this.f51965b;
            if (hVar != null) {
                int i10 = hVar.f51956a;
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f51959f > i10) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void e(j jVar) {
        h hVar = this.f51965b;
        if (hVar != null) {
            hVar.a(true);
        }
        z2.a aVar = this.f51964a;
        if (jVar != null) {
            aVar.execute(new cy0(jVar, 19));
        }
        aVar.f52634b.accept(aVar.f52633a);
    }

    public final void f(i iVar, g gVar, int i10) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.f51966c = null;
        h hVar = new h(this, myLooper, iVar, gVar, i10, SystemClock.elapsedRealtime());
        if (this.f51965b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.p(z10);
        this.f51965b = hVar;
        hVar.b();
    }

    public l(z2.a aVar) {
        this.f51964a = aVar;
    }
}
