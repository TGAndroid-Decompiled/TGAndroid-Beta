package t3;

import h5.d0;
import h5.w;
import r3.k;
import r3.l;
import r3.m;
public final class b implements k {
    public int f44507c;
    public c e;
    public long h;
    public e f44510i;
    public int f44514m;
    public boolean f44515n;
    public final w f44505a = new w(12);
    public final e8.a f44506b = new Object();
    public m d = new cb.b(21);
    public e[] f44509g = new e[0];
    public long f44512k = -1;
    public long f44513l = -1;
    public int f44511j = -1;
    public long f44508f = -9223372036854775807L;

    @Override
    public final void d(long j10, long j11) {
        e[] eVarArr;
        this.h = -1L;
        this.f44510i = null;
        for (e eVar : this.f44509g) {
            if (eVar.f44528j == 0) {
                eVar.h = 0;
            } else {
                eVar.h = eVar.f44530l[d0.e(eVar.f44529k, j10, true)];
            }
        }
        if (j10 == 0) {
            if (this.f44509g.length == 0) {
                this.f44507c = 0;
                return;
            } else {
                this.f44507c = 3;
                return;
            }
        }
        this.f44507c = 6;
    }

    @Override
    public final void e(m mVar) {
        this.f44507c = 0;
        this.d = mVar;
        this.h = -1L;
    }

    @Override
    public final int h(r3.l r23, org.telegram.ui.Components.jb r24) {
        throw new UnsupportedOperationException("Method not decompiled: t3.b.h(r3.l, org.telegram.ui.Components.jb):int");
    }

    @Override
    public final boolean i(l lVar) {
        w wVar = this.f44505a;
        lVar.b(0, 12, wVar.f6987a);
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
