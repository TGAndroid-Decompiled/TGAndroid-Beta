package y2;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import rg.b0;
public final class m implements n {
    public static final k4.d d = new k4.d(0, -9223372036854775807L, false);
    public static final k4.d f49516e = new k4.d(2, -9223372036854775807L, false);
    public static final k4.d f49517f = new k4.d(3, -9223372036854775807L, false);
    public final z2.a f49518a;
    public i f49519b;
    public IOException f49520c;

    public m(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: y2.m.<init>(java.lang.String):void");
    }

    public final void a() {
        i iVar = this.f49519b;
        e2.d.h(iVar);
        iVar.a(false);
    }

    @Override
    public final void b() {
        IOException iOException = this.f49520c;
        if (iOException == null) {
            i iVar = this.f49519b;
            if (iVar != null) {
                int i10 = iVar.f49508a;
                IOException iOException2 = iVar.f49511e;
                if (iOException2 != null && iVar.f49512f > i10) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final boolean c() {
        if (this.f49520c != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f49519b != null) {
            return true;
        }
        return false;
    }

    public final void e(k kVar) {
        i iVar = this.f49519b;
        if (iVar != null) {
            iVar.a(true);
        }
        z2.a aVar = this.f49518a;
        if (kVar != null) {
            aVar.execute(new b0(kVar, 8));
        }
        aVar.f50677b.accept(aVar.f50676a);
    }

    public final void f(j jVar, h hVar, int i10) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        e2.d.h(myLooper);
        this.f49520c = null;
        i iVar = new i(this, myLooper, jVar, hVar, i10, SystemClock.elapsedRealtime());
        if (this.f49519b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        this.f49519b = iVar;
        iVar.b();
    }

    public m(z2.a aVar) {
        this.f49518a = aVar;
    }
}
