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
    public final i f49155f;
    public final boolean h;
    public final boolean f49156n;
    public final boolean f49157r;
    public final int f49158s;
    public final int v;
    public final int f49159w;
    public final int f49160x;
    public final int f49161y;

    public m(int r7, b2.p1 r8, int r9, x2.i r10, int r11, java.lang.String r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: x2.m.<init>(int, b2.p1, int, x2.i, int, java.lang.String, int, boolean):void");
    }

    public static int c(m mVar, m mVar2) {
        b0 c10 = b0.f8417a.c(mVar.f49156n, mVar2.f49156n);
        Integer valueOf = Integer.valueOf(mVar.f49160x);
        Integer valueOf2 = Integer.valueOf(mVar2.f49160x);
        s1 s1Var = s1.f8500c;
        return c10.b(valueOf, valueOf2, s1Var).a(mVar.f49161y, mVar2.f49161y).a(mVar.E, mVar2.E).b(Integer.valueOf(mVar.F), Integer.valueOf(mVar2.F), s1Var).c(mVar.G, mVar2.G).a(mVar.H, mVar2.H).c(mVar.f49157r, mVar2.f49157r).c(mVar.e, mVar2.e).c(mVar.h, mVar2.h).b(Integer.valueOf(mVar.f49159w), Integer.valueOf(mVar2.f49159w), s1Var).c(mVar.K, mVar2.K).c(mVar.M, mVar2.M).e();
    }

    @Override
    public final int a() {
        return this.J;
    }

    @Override
    public final boolean b(l lVar) {
        m mVar = (m) lVar;
        if (this.I || Objects.equals(this.P, mVar.P)) {
            this.f49155f.getClass();
            if (this.K == mVar.K && this.M == mVar.M) {
                return true;
            }
            return false;
        }
        return false;
    }
}
