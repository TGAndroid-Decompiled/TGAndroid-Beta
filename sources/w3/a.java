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
    public m f49372b;
    public int f49373c;
    public int d;
    public int f49374e;
    public k4.b f49376g;
    public l h;
    public f2.c f49377i;
    public z3.l f49378j;
    public final w f49371a = new w(6);
    public long f49375f = -1;

    public final void a() {
        b(new e4.b[0]);
        m mVar = this.f49372b;
        mVar.getClass();
        mVar.i1();
        this.f49372b.m2(new n(-9223372036854775807L));
        this.f49373c = 6;
    }

    public final void b(e4.b... bVarArr) {
        m mVar = this.f49372b;
        mVar.getClass();
        v i22 = mVar.i2(1024, 4);
        m0 m0Var = new m0();
        m0Var.f9264n = "image/jpeg";
        m0Var.f9259i = new e4.c(bVarArr);
        i22.b(new n0(m0Var));
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f49373c = 0;
            this.f49378j = null;
        } else if (this.f49373c == 5) {
            z3.l lVar = this.f49378j;
            lVar.getClass();
            lVar.d(j10, j11);
        }
    }

    @Override
    public final void e(m mVar) {
        this.f49372b = mVar;
    }

    @Override
    public final int h(r3.l r26, org.telegram.ui.Components.jb r27) {
        throw new UnsupportedOperationException("Method not decompiled: w3.a.h(r3.l, org.telegram.ui.Components.jb):int");
    }

    @Override
    public final boolean i(l lVar) {
        h hVar = (h) lVar;
        w wVar = this.f49371a;
        wVar.C(2);
        hVar.f(wVar.f7308a, 0, 2, false);
        if (wVar.z() == 65496) {
            wVar.C(2);
            hVar.f(wVar.f7308a, 0, 2, false);
            int z4 = wVar.z();
            this.d = z4;
            if (z4 == 65504) {
                wVar.C(2);
                hVar.f(wVar.f7308a, 0, 2, false);
                hVar.a(wVar.z() - 2, false);
                wVar.C(2);
                hVar.f(wVar.f7308a, 0, 2, false);
                this.d = wVar.z();
            }
            if (this.d == 65505) {
                hVar.a(2, false);
                wVar.C(6);
                hVar.f(wVar.f7308a, 0, 6, false);
                if (wVar.v() == 1165519206 && wVar.z() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void release() {
        z3.l lVar = this.f49378j;
        if (lVar != null) {
            lVar.getClass();
        }
    }
}
