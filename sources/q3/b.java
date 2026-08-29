package q3;

import f5.d0;
import f5.w;
import o3.k;
import o3.l;
import o3.m;
public final class b implements k {
    public int f46220c;
    public c f46221e;
    public long h;
    public e f46224i;
    public int f46228m;
    public boolean f46229n;
    public final w f46218a = new w(12);
    public final c8.a f46219b = new Object();
    public m d = new ya.a(15);
    public e[] f46223g = new e[0];
    public long f46226k = -1;
    public long f46227l = -1;
    public int f46225j = -1;
    public long f46222f = -9223372036854775807L;

    @Override
    public final int d(o3.l r23, o3.n r24) {
        throw new UnsupportedOperationException("Method not decompiled: q3.b.d(o3.l, o3.n):int");
    }

    @Override
    public final boolean e(l lVar) {
        w wVar = this.f46218a;
        lVar.a(0, 12, wVar.f6640a);
        wVar.C(0);
        if (wVar.g() == 1179011410) {
            wVar.D(4);
            if (wVar.g() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void f(long j10, long j11) {
        e[] eVarArr;
        this.h = -1L;
        this.f46224i = null;
        for (e eVar : this.f46223g) {
            if (eVar.f46244j == 0) {
                eVar.h = 0;
            } else {
                eVar.h = eVar.f46246l[d0.e(eVar.f46245k, j10, true)];
            }
        }
        if (j10 == 0) {
            if (this.f46223g.length == 0) {
                this.f46220c = 0;
                return;
            } else {
                this.f46220c = 3;
                return;
            }
        }
        this.f46220c = 6;
    }

    @Override
    public final void i(m mVar) {
        this.f46220c = 0;
        this.d = mVar;
        this.h = -1L;
    }

    @Override
    public final void release() {
    }
}
