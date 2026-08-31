package t3;

import h5.d0;
import h5.w;
import r3.k;
import r3.l;
import r3.m;
public final class b implements k {
    public int f47844c;
    public c f47845e;
    public long h;
    public e f47848i;
    public int f47852m;
    public boolean f47853n;
    public final w f47842a = new w(12);
    public final e8.a f47843b = new Object();
    public m d = new db.a(21);
    public e[] f47847g = new e[0];
    public long f47850k = -1;
    public long f47851l = -1;
    public int f47849j = -1;
    public long f47846f = -9223372036854775807L;

    @Override
    public final void d(long j10, long j11) {
        e[] eVarArr;
        this.h = -1L;
        this.f47848i = null;
        for (e eVar : this.f47847g) {
            if (eVar.f47868j == 0) {
                eVar.h = 0;
            } else {
                eVar.h = eVar.f47870l[d0.e(eVar.f47869k, j10, true)];
            }
        }
        if (j10 == 0) {
            if (this.f47847g.length == 0) {
                this.f47844c = 0;
                return;
            } else {
                this.f47844c = 3;
                return;
            }
        }
        this.f47844c = 6;
    }

    @Override
    public final void e(m mVar) {
        this.f47844c = 0;
        this.d = mVar;
        this.h = -1L;
    }

    @Override
    public final int h(r3.l r23, org.telegram.ui.Components.jb r24) {
        throw new UnsupportedOperationException("Method not decompiled: t3.b.h(r3.l, org.telegram.ui.Components.jb):int");
    }

    @Override
    public final boolean i(l lVar) {
        w wVar = this.f47842a;
        lVar.b(0, 12, wVar.f7308a);
        wVar.F(0);
        if (wVar.i() == 1179011410) {
            wVar.G(4);
            if (wVar.i() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void release() {
    }
}
