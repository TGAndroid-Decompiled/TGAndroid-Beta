package y2;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import rg.b0;
public final class m implements n {
    public static final k4.d d = new k4.d(0, -9223372036854775807L, false);
    public static final k4.d f49517e = new k4.d(2, -9223372036854775807L, false);
    public static final k4.d f49518f = new k4.d(3, -9223372036854775807L, false);
    public final z2.a f49519a;
    public i f49520b;
    public IOException f49521c;

    public m(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: y2.m.<init>(java.lang.String):void");
    }

    public final void a() {
        i iVar = this.f49520b;
        e2.d.h(iVar);
        iVar.a(false);
    }

    @Override
    public final void b() {
        IOException iOException = this.f49521c;
        if (iOException == null) {
            i iVar = this.f49520b;
            if (iVar != null) {
                int i10 = iVar.f49509a;
                IOException iOException2 = iVar.f49512e;
                if (iOException2 != null && iVar.f49513f > i10) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final boolean c() {
        if (this.f49521c != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f49520b != null) {
            return true;
        }
        return false;
    }

    public final void e(k kVar) {
        i iVar = this.f49520b;
        if (iVar != null) {
            iVar.a(true);
        }
        z2.a aVar = this.f49519a;
        if (kVar != null) {
            aVar.execute(new b0(kVar, 8));
        }
        aVar.f50678b.accept(aVar.f50677a);
    }

    public final void f(j jVar, h hVar, int i10) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        e2.d.h(myLooper);
        this.f49521c = null;
        i iVar = new i(this, myLooper, jVar, hVar, i10, SystemClock.elapsedRealtime());
        if (this.f49520b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        this.f49520b = iVar;
        iVar.b();
    }

    public m(z2.a aVar) {
        this.f49519a = aVar;
    }
}
