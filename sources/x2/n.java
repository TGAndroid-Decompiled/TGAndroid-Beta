package x2;

import e9.b0;
import e9.s1;
import j$.util.Objects;
public final class n extends m {
    public final int D;
    public final int E;
    public final int F;
    public final boolean G;
    public final int H;
    public final boolean I;
    public final int J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final int N;
    public final boolean O;
    public final String P;
    public final boolean e;
    public final j f52952f;
    public final boolean h;
    public final boolean f52953n;
    public final boolean f52954r;
    public final int f52955s;
    public final int f52956w;
    public final int f52957x;
    public final int f52958y;

    public n(int r7, b2.p1 r8, int r9, x2.j r10, int r11, java.lang.String r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: x2.n.<init>(int, b2.p1, int, x2.j, int, java.lang.String, int, boolean):void");
    }

    public static int c(n nVar, n nVar2) {
        b0 c10 = b0.f6331a.c(nVar.f52953n, nVar2.f52953n);
        Integer valueOf = Integer.valueOf(nVar.f52958y);
        Integer valueOf2 = Integer.valueOf(nVar2.f52958y);
        s1 s1Var = s1.f6414c;
        return c10.b(valueOf, valueOf2, s1Var).a(nVar.D, nVar2.D).a(nVar.E, nVar2.E).b(Integer.valueOf(nVar.F), Integer.valueOf(nVar2.F), s1Var).c(nVar.G, nVar2.G).a(nVar.H, nVar2.H).c(nVar.f52954r, nVar2.f52954r).c(nVar.e, nVar2.e).c(nVar.h, nVar2.h).b(Integer.valueOf(nVar.f52957x), Integer.valueOf(nVar2.f52957x), s1Var).c(nVar.K, nVar2.K).c(nVar.M, nVar2.M).e();
    }

    @Override
    public final int a() {
        return this.J;
    }

    @Override
    public final boolean b(m mVar) {
        n nVar = (n) mVar;
        if (this.I || Objects.equals(this.P, nVar.P)) {
            this.f52952f.getClass();
            if (this.K == nVar.K && this.M == nVar.M) {
                return true;
            }
            return false;
        }
        return false;
    }
}
