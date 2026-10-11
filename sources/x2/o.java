package x2;

import e9.x0;
import e9.z;
import j$.util.Objects;
public final class o extends n {
    public final int E;
    public final boolean F;
    public final int G;
    public final boolean H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final int L;
    public final boolean f50607e;
    public final i f50608f;
    public final boolean h;
    public final boolean f50609n;
    public final boolean f50610r;
    public final int f50611s;
    public final int v;
    public final int f50612w;
    public final int f50613x;
    public final int f50614y;

    public o(int r7, b2.l1 r8, int r9, x2.i r10, int r11, java.lang.String r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: x2.o.<init>(int, b2.l1, int, x2.i, int, java.lang.String, int, boolean):void");
    }

    public static int c(o oVar, o oVar2) {
        z c10 = z.f8819a.c(oVar.f50609n, oVar2.f50609n);
        Integer valueOf = Integer.valueOf(oVar.f50613x);
        Integer valueOf2 = Integer.valueOf(oVar2.f50613x);
        x0 x0Var = x0.f8817c;
        z b10 = c10.b(valueOf, valueOf2, x0Var).a(oVar.f50614y, oVar2.f50614y).a(oVar.E, oVar2.E).c(oVar.F, oVar2.F).a(oVar.G, oVar2.G).c(oVar.f50610r, oVar2.f50610r).c(oVar.f50607e, oVar2.f50607e).c(oVar.h, oVar2.h).b(Integer.valueOf(oVar.f50612w), Integer.valueOf(oVar2.f50612w), x0Var);
        boolean z10 = oVar.J;
        z c11 = b10.c(z10, oVar2.J);
        boolean z11 = oVar.K;
        z c12 = c11.c(z11, oVar2.K);
        if (z10 && z11) {
            c12 = c12.a(oVar.L, oVar2.L);
        }
        return c12.e();
    }

    @Override
    public final int a() {
        return this.I;
    }

    @Override
    public final boolean b(n nVar) {
        o oVar = (o) nVar;
        if (this.H || Objects.equals(this.d.f3643r, oVar.d.f3643r)) {
            this.f50608f.getClass();
            if (this.J == oVar.J && this.K == oVar.K) {
                return true;
            }
            return false;
        }
        return false;
    }
}
