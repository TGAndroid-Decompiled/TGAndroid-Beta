package r3;

import d5.y;
import h3.s0;
import h3.t0;
import m3.h;
import m3.k;
import m3.l;
import m3.m;
import m3.o;
import m3.w;
public final class a implements k {
    public m f47015b;
    public int f47016c;
    public int d;
    public int f47017e;
    public f4.b f47019g;
    public l h;
    public f2.d f47020i;
    public u3.l f47021j;
    public final y f47014a = new y(6);
    public long f47018f = -1;

    public final void a() {
        d(new z3.b[0]);
        m mVar = this.f47015b;
        mVar.getClass();
        mVar.B();
        this.f47015b.y(new o(-9223372036854775807L));
        this.f47016c = 6;
    }

    @Override
    public final int b(m3.l r26, m3.n r27) {
        throw new UnsupportedOperationException("Method not decompiled: r3.a.b(m3.l, m3.n):int");
    }

    @Override
    public final void c(m mVar) {
        this.f47015b = mVar;
    }

    public final void d(z3.b... bVarArr) {
        m mVar = this.f47015b;
        mVar.getClass();
        w I = mVar.I(1024, 4);
        s0 s0Var = new s0();
        s0Var.f9704n = "image/jpeg";
        s0Var.f9699i = new z3.c(bVarArr);
        I.c(new t0(s0Var));
    }

    @Override
    public final boolean f(l lVar) {
        h hVar = (h) lVar;
        y yVar = this.f47014a;
        yVar.z(2);
        hVar.g(yVar.f4410a, 0, 2, false);
        if (yVar.w() == 65496) {
            yVar.z(2);
            hVar.g(yVar.f4410a, 0, 2, false);
            int w8 = yVar.w();
            this.d = w8;
            if (w8 == 65504) {
                yVar.z(2);
                hVar.g(yVar.f4410a, 0, 2, false);
                hVar.a(yVar.w() - 2, false);
                yVar.z(2);
                hVar.g(yVar.f4410a, 0, 2, false);
                this.d = yVar.w();
            }
            if (this.d == 65505) {
                hVar.a(2, false);
                yVar.z(6);
                hVar.g(yVar.f4410a, 0, 6, false);
                if (yVar.s() == 1165519206 && yVar.w() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void g(long j10, long j11) {
        if (j10 == 0) {
            this.f47016c = 0;
            this.f47021j = null;
        } else if (this.f47016c == 5) {
            u3.l lVar = this.f47021j;
            lVar.getClass();
            lVar.g(j10, j11);
        }
    }

    @Override
    public final void release() {
        u3.l lVar = this.f47021j;
        if (lVar != null) {
            lVar.getClass();
        }
    }
}
