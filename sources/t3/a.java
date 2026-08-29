package t3;

import f5.w;
import j3.s0;
import j3.t0;
import o3.h;
import o3.k;
import o3.l;
import o3.m;
import o3.o;
public final class a implements k {
    public m f48098b;
    public int f48099c;
    public int d;
    public int f48100e;
    public h4.b f48102g;
    public l h;
    public f2.c f48103i;
    public w3.l f48104j;
    public final w f48097a = new w(6);
    public long f48101f = -1;

    public final void a() {
        b(new b4.b[0]);
        m mVar = this.f48098b;
        mVar.getClass();
        mVar.e1();
        this.f48098b.D1(new o(-9223372036854775807L));
        this.f48099c = 6;
    }

    public final void b(b4.b... bVarArr) {
        m mVar = this.f48098b;
        mVar.getClass();
        o3.w Z1 = mVar.Z1(1024, 4);
        s0 s0Var = new s0();
        s0Var.f10741n = "image/jpeg";
        s0Var.f10736i = new b4.c(bVarArr);
        Z1.b(new t0(s0Var));
    }

    @Override
    public final int d(o3.l r26, o3.n r27) {
        throw new UnsupportedOperationException("Method not decompiled: t3.a.d(o3.l, o3.n):int");
    }

    @Override
    public final boolean e(l lVar) {
        h hVar = (h) lVar;
        w wVar = this.f48097a;
        wVar.z(2);
        hVar.f(wVar.f6640a, 0, 2, false);
        if (wVar.w() == 65496) {
            wVar.z(2);
            hVar.f(wVar.f6640a, 0, 2, false);
            int w10 = wVar.w();
            this.d = w10;
            if (w10 == 65504) {
                wVar.z(2);
                hVar.f(wVar.f6640a, 0, 2, false);
                hVar.b(wVar.w() - 2, false);
                wVar.z(2);
                hVar.f(wVar.f6640a, 0, 2, false);
                this.d = wVar.w();
            }
            if (this.d == 65505) {
                hVar.b(2, false);
                wVar.z(6);
                hVar.f(wVar.f6640a, 0, 6, false);
                if (wVar.s() == 1165519206 && wVar.w() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void f(long j10, long j11) {
        if (j10 == 0) {
            this.f48099c = 0;
            this.f48104j = null;
        } else if (this.f48099c == 5) {
            w3.l lVar = this.f48104j;
            lVar.getClass();
            lVar.f(j10, j11);
        }
    }

    @Override
    public final void i(m mVar) {
        this.f48098b = mVar;
    }

    @Override
    public final void release() {
        w3.l lVar = this.f48104j;
        if (lVar != null) {
            lVar.getClass();
        }
    }
}
