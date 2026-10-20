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
    public final i f49162f;
    public final boolean h;
    public final boolean f49163n;
    public final boolean f49164r;
    public final int f49165s;
    public final int v;
    public final int f49166w;
    public final int f49167x;
    public final int f49168y;

    public m(int r7, b2.p1 r8, int r9, x2.i r10, int r11, java.lang.String r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: x2.m.<init>(int, b2.p1, int, x2.i, int, java.lang.String, int, boolean):void");
    }

    public static int c(m mVar, m mVar2) {
        b0 c10 = b0.f8415a.c(mVar.f49163n, mVar2.f49163n);
        Integer valueOf = Integer.valueOf(mVar.f49167x);
        Integer valueOf2 = Integer.valueOf(mVar2.f49167x);
        s1 s1Var = s1.f8498c;
        return c10.b(valueOf, valueOf2, s1Var).a(mVar.f49168y, mVar2.f49168y).a(mVar.E, mVar2.E).b(Integer.valueOf(mVar.F), Integer.valueOf(mVar2.F), s1Var).c(mVar.G, mVar2.G).a(mVar.H, mVar2.H).c(mVar.f49164r, mVar2.f49164r).c(mVar.e, mVar2.e).c(mVar.h, mVar2.h).b(Integer.valueOf(mVar.f49166w), Integer.valueOf(mVar2.f49166w), s1Var).c(mVar.K, mVar2.K).c(mVar.M, mVar2.M).e();
    }

    @Override
    public final int a() {
        return this.J;
    }

    @Override
    public final boolean b(l lVar) {
        m mVar = (m) lVar;
        if (this.I || Objects.equals(this.P, mVar.P)) {
            this.f49162f.getClass();
            if (this.K == mVar.K && this.M == mVar.M) {
                return true;
            }
            return false;
        }
        return false;
    }
}
