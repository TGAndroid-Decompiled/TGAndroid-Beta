package x2;

import e9.b0;
import e9.s1;
import j$.util.Objects;
public final class m extends l {
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
    public final i f47770f;
    public final boolean h;
    public final boolean f47771n;
    public final boolean f47772r;
    public final int f47773s;
    public final int v;
    public final int f47774w;
    public final int f47775x;
    public final int f47776y;

    public m(int r7, b2.q1 r8, int r9, x2.i r10, int r11, java.lang.String r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: x2.m.<init>(int, b2.q1, int, x2.i, int, java.lang.String, int, boolean):void");
    }

    public static int c(m mVar, m mVar2) {
        b0 c10 = b0.f8533a.c(mVar.f47771n, mVar2.f47771n);
        Integer valueOf = Integer.valueOf(mVar.f47775x);
        Integer valueOf2 = Integer.valueOf(mVar2.f47775x);
        s1 s1Var = s1.f8616c;
        return c10.b(valueOf, valueOf2, s1Var).a(mVar.f47776y, mVar2.f47776y).a(mVar.E, mVar2.E).b(Integer.valueOf(mVar.F), Integer.valueOf(mVar2.F), s1Var).c(mVar.G, mVar2.G).a(mVar.H, mVar2.H).c(mVar.f47772r, mVar2.f47772r).c(mVar.e, mVar2.e).c(mVar.h, mVar2.h).b(Integer.valueOf(mVar.f47774w), Integer.valueOf(mVar2.f47774w), s1Var).c(mVar.K, mVar2.K).c(mVar.M, mVar2.M).e();
    }

    @Override
    public final int a() {
        return this.J;
    }

    @Override
    public final boolean b(l lVar) {
        m mVar = (m) lVar;
        if (this.I || Objects.equals(this.P, mVar.P)) {
            this.f47770f.getClass();
            if (this.K == mVar.K && this.M == mVar.M) {
                return true;
            }
            return false;
        }
        return false;
    }
}
