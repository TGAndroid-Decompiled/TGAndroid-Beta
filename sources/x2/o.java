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
    public final boolean f49225e;
    public final i f49226f;
    public final boolean h;
    public final boolean f49227n;
    public final boolean f49228r;
    public final int f49229s;
    public final int v;
    public final int f49230w;
    public final int f49231x;
    public final int f49232y;

    public o(int r7, b2.l1 r8, int r9, x2.i r10, int r11, java.lang.String r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: x2.o.<init>(int, b2.l1, int, x2.i, int, java.lang.String, int, boolean):void");
    }

    public static int c(o oVar, o oVar2) {
        z c10 = z.f8825a.c(oVar.f49227n, oVar2.f49227n);
        Integer valueOf = Integer.valueOf(oVar.f49231x);
        Integer valueOf2 = Integer.valueOf(oVar2.f49231x);
        x0 x0Var = x0.f8823c;
        z b10 = c10.b(valueOf, valueOf2, x0Var).a(oVar.f49232y, oVar2.f49232y).a(oVar.E, oVar2.E).c(oVar.F, oVar2.F).a(oVar.G, oVar2.G).c(oVar.f49228r, oVar2.f49228r).c(oVar.f49225e, oVar2.f49225e).c(oVar.h, oVar2.h).b(Integer.valueOf(oVar.f49230w), Integer.valueOf(oVar2.f49230w), x0Var);
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
        if (this.H || Objects.equals(this.d.f3564r, oVar.d.f3564r)) {
            this.f49226f.getClass();
            if (this.J == oVar.J && this.K == oVar.K) {
                return true;
            }
            return false;
        }
        return false;
    }
}
