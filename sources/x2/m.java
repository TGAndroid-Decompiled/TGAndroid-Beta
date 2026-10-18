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
    public final i f49156f;
    public final boolean h;
    public final boolean f49157n;
    public final boolean f49158r;
    public final int f49159s;
    public final int v;
    public final int f49160w;
    public final int f49161x;
    public final int f49162y;

    public m(int r7, b2.p1 r8, int r9, x2.i r10, int r11, java.lang.String r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: x2.m.<init>(int, b2.p1, int, x2.i, int, java.lang.String, int, boolean):void");
    }

    public static int c(m mVar, m mVar2) {
        b0 c10 = b0.f8416a.c(mVar.f49157n, mVar2.f49157n);
        Integer valueOf = Integer.valueOf(mVar.f49161x);
        Integer valueOf2 = Integer.valueOf(mVar2.f49161x);
        s1 s1Var = s1.f8499c;
        return c10.b(valueOf, valueOf2, s1Var).a(mVar.f49162y, mVar2.f49162y).a(mVar.E, mVar2.E).b(Integer.valueOf(mVar.F), Integer.valueOf(mVar2.F), s1Var).c(mVar.G, mVar2.G).a(mVar.H, mVar2.H).c(mVar.f49158r, mVar2.f49158r).c(mVar.e, mVar2.e).c(mVar.h, mVar2.h).b(Integer.valueOf(mVar.f49160w), Integer.valueOf(mVar2.f49160w), s1Var).c(mVar.K, mVar2.K).c(mVar.M, mVar2.M).e();
    }

    @Override
    public final int a() {
        return this.J;
    }

    @Override
    public final boolean b(l lVar) {
        m mVar = (m) lVar;
        if (this.I || Objects.equals(this.P, mVar.P)) {
            this.f49156f.getClass();
            if (this.K == mVar.K && this.M == mVar.M) {
                return true;
            }
            return false;
        }
        return false;
    }
}
