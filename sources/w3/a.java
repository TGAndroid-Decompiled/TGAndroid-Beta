package w3;

import h5.w;
import j3.m0;
import j3.n0;
import r3.h;
import r3.k;
import r3.l;
import r3.m;
import r3.n;
import r3.v;
public final class a implements k {
    public m f46450b;
    public int f46451c;
    public int d;
    public int e;
    public k4.b f46453g;
    public l h;
    public f2.c f46454i;
    public z3.l f46455j;
    public final w f46449a = new w(6);
    public long f46452f = -1;

    public final void a() {
        b(new e4.b[0]);
        m mVar = this.f46450b;
        mVar.getClass();
        mVar.j1();
        this.f46450b.h2(new n(-9223372036854775807L));
        this.f46451c = 6;
    }

    public final void b(e4.b... bVarArr) {
        m mVar = this.f46450b;
        mVar.getClass();
        v d22 = mVar.d2(1024, 4);
        m0 m0Var = new m0();
        m0Var.f8665n = "image/jpeg";
        m0Var.f8660i = new e4.c(bVarArr);
        d22.b(new n0(m0Var));
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f46451c = 0;
            this.f46455j = null;
        } else if (this.f46451c == 5) {
            z3.l lVar = this.f46455j;
            lVar.getClass();
            lVar.d(j10, j11);
        }
    }

    @Override
    public final void e(m mVar) {
        this.f46450b = mVar;
    }

    @Override
    public final int h(r3.l r26, org.telegram.ui.Components.jb r27) {
        throw new UnsupportedOperationException("Method not decompiled: w3.a.h(r3.l, org.telegram.ui.Components.jb):int");
    }

    @Override
    public final boolean i(l lVar) {
        h hVar = (h) lVar;
        w wVar = this.f46449a;
        wVar.C(2);
        hVar.f(wVar.f6987a, 0, 2, false);
        if (wVar.z() == 65496) {
            wVar.C(2);
            hVar.f(wVar.f6987a, 0, 2, false);
            int z4 = wVar.z();
            this.d = z4;
            if (z4 == 65504) {
                wVar.C(2);
                hVar.f(wVar.f6987a, 0, 2, false);
                hVar.a(wVar.z() - 2, false);
                wVar.C(2);
                hVar.f(wVar.f6987a, 0, 2, false);
                this.d = wVar.z();
            }
            if (this.d == 65505) {
                hVar.a(2, false);
                wVar.C(6);
                hVar.f(wVar.f6987a, 0, 6, false);
                if (wVar.v() == 1165519206 && wVar.z() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void release() {
        z3.l lVar = this.f46455j;
        if (lVar != null) {
            lVar.getClass();
        }
    }
}
