package y2;

import a8.yb;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import org.telegram.ui.Components.dy0;
public final class l implements m {
    public static final k4.d d = new k4.d(0, -9223372036854775807L, false);
    public static final k4.d e = new k4.d(2, -9223372036854775807L, false);
    public static final k4.d f52021f = new k4.d(3, -9223372036854775807L, false);
    public final z2.a f52022a;
    public h f52023b;
    public IOException f52024c;

    public l(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: y2.l.<init>(java.lang.String):void");
    }

    public final void a() {
        h hVar = this.f52023b;
        hVar.getClass();
        hVar.a(false);
    }

    public final boolean b() {
        if (this.f52024c != null) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f52023b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        IOException iOException = this.f52024c;
        if (iOException == null) {
            h hVar = this.f52023b;
            if (hVar != null) {
                int i10 = hVar.f52014a;
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f52017f > i10) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void e(j jVar) {
        h hVar = this.f52023b;
        if (hVar != null) {
            hVar.a(true);
        }
        z2.a aVar = this.f52022a;
        if (jVar != null) {
            aVar.execute(new dy0(jVar, 19));
        }
        aVar.f52692b.accept(aVar.f52691a);
    }

    public final void f(i iVar, g gVar, int i10) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.f52024c = null;
        h hVar = new h(this, myLooper, iVar, gVar, i10, SystemClock.elapsedRealtime());
        if (this.f52023b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.p(z10);
        this.f52023b = hVar;
        hVar.b();
    }

    public l(z2.a aVar) {
        this.f52022a = aVar;
    }
}
