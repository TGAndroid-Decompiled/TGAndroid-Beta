package y2;

import a8.yb;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import org.telegram.ui.Components.cy0;
public final class l implements m {
    public static final k4.d d = new k4.d(0, -9223372036854775807L, false);
    public static final k4.d e = new k4.d(2, -9223372036854775807L, false);
    public static final k4.d f51960f = new k4.d(3, -9223372036854775807L, false);
    public final z2.a f51961a;
    public h f51962b;
    public IOException f51963c;

    public l(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: y2.l.<init>(java.lang.String):void");
    }

    public final void a() {
        h hVar = this.f51962b;
        hVar.getClass();
        hVar.a(false);
    }

    public final boolean b() {
        if (this.f51963c != null) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f51962b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        IOException iOException = this.f51963c;
        if (iOException == null) {
            h hVar = this.f51962b;
            if (hVar != null) {
                int i10 = hVar.f51953a;
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f51956f > i10) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void e(j jVar) {
        h hVar = this.f51962b;
        if (hVar != null) {
            hVar.a(true);
        }
        z2.a aVar = this.f51961a;
        if (jVar != null) {
            aVar.execute(new cy0(jVar, 19));
        }
        aVar.f52631b.accept(aVar.f52630a);
    }

    public final void f(i iVar, g gVar, int i10) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.f51963c = null;
        h hVar = new h(this, myLooper, iVar, gVar, i10, SystemClock.elapsedRealtime());
        if (this.f51962b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.p(z10);
        this.f51962b = hVar;
        hVar.b();
    }

    public l(z2.a aVar) {
        this.f51961a = aVar;
    }
}
