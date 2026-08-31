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
    public m f49335b;
    public int f49336c;
    public int d;
    public int f49337e;
    public k4.b f49339g;
    public l h;
    public f2.c f49340i;
    public z3.m f49341j;
    public final w f49334a = new w(6);
    public long f49338f = -1;

    public final void a() {
        b(new e4.b[0]);
        m mVar = this.f49335b;
        mVar.getClass();
        mVar.i1();
        this.f49335b.m2(new n(-9223372036854775807L));
        this.f49336c = 6;
    }

    public final void b(e4.b... bVarArr) {
        m mVar = this.f49335b;
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
            this.f49336c = 0;
            this.f49341j = null;
        } else if (this.f49336c == 5) {
            z3.m mVar = this.f49341j;
            mVar.getClass();
            mVar.d(j10, j11);
        }
    }

    @Override
    public final void e(m mVar) {
        this.f49335b = mVar;
    }

    @Override
    public final int h(r3.l r26, org.telegram.ui.Components.jb r27) {
        throw new UnsupportedOperationException("Method not decompiled: w3.a.h(r3.l, org.telegram.ui.Components.jb):int");
    }

    @Override
    public final boolean i(l lVar) {
        h hVar = (h) lVar;
        w wVar = this.f49334a;
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
        z3.m mVar = this.f49341j;
        if (mVar != null) {
            mVar.getClass();
        }
    }
}
