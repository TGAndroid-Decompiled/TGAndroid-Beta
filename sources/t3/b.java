package t3;

import h5.d0;
import h5.w;
import r3.k;
import r3.l;
import r3.m;
public final class b implements k {
    public int f47880c;
    public c f47881e;
    public long h;
    public e f47884i;
    public int f47888m;
    public boolean f47889n;
    public final w f47878a = new w(12);
    public final e8.a f47879b = new Object();
    public m d = new db.a(21);
    public e[] f47883g = new e[0];
    public long f47886k = -1;
    public long f47887l = -1;
    public int f47885j = -1;
    public long f47882f = -9223372036854775807L;

    @Override
    public final void d(long j10, long j11) {
        e[] eVarArr;
        this.h = -1L;
        this.f47884i = null;
        for (e eVar : this.f47883g) {
            if (eVar.f47904j == 0) {
                eVar.h = 0;
            } else {
                eVar.h = eVar.f47906l[d0.e(eVar.f47905k, j10, true)];
            }
        }
        if (j10 == 0) {
            if (this.f47883g.length == 0) {
                this.f47880c = 0;
                return;
            } else {
                this.f47880c = 3;
                return;
            }
        }
        this.f47880c = 6;
    }

    @Override
    public final void e(m mVar) {
        this.f47880c = 0;
        this.d = mVar;
        this.h = -1L;
    }

    @Override
    public final int h(r3.l r23, org.telegram.ui.Components.jb r24) {
        throw new UnsupportedOperationException("Method not decompiled: t3.b.h(r3.l, org.telegram.ui.Components.jb):int");
    }

    @Override
    public final boolean i(l lVar) {
        w wVar = this.f47878a;
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
