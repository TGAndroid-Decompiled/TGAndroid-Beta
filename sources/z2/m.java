package z2;

import g9.n1;
import g9.w;
import j$.util.Objects;
public final class m extends l {
    public final int E;
    public final int F;
    public final int G;
    public final boolean H;
    public final int I;
    public final boolean J;
    public final int K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final int O;
    public final boolean P;
    public final String Q;
    public final boolean f59621e;
    public final i f59622f;
    public final boolean h;
    public final boolean f59623n;
    public final boolean f59624r;
    public final int f59625s;
    public final int f59626w;
    public final int f59627x;
    public final int f59628y;

    public m(int r7, d2.o1 r8, int r9, z2.i r10, int r11, java.lang.String r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: z2.m.<init>(int, d2.o1, int, z2.i, int, java.lang.String, int, boolean):void");
    }

    public static int c(m mVar, m mVar2) {
        w c2 = w.f12160a.c(mVar.f59623n, mVar2.f59623n);
        Integer valueOf = Integer.valueOf(mVar.f59628y);
        Integer valueOf2 = Integer.valueOf(mVar2.f59628y);
        n1 n1Var = n1.f12108c;
        return c2.b(valueOf, valueOf2, n1Var).a(mVar.E, mVar2.E).a(mVar.F, mVar2.F).b(Integer.valueOf(mVar.G), Integer.valueOf(mVar2.G), n1Var).c(mVar.H, mVar2.H).a(mVar.I, mVar2.I).c(mVar.f59624r, mVar2.f59624r).c(mVar.f59621e, mVar2.f59621e).c(mVar.h, mVar2.h).b(Integer.valueOf(mVar.f59627x), Integer.valueOf(mVar2.f59627x), n1Var).c(mVar.L, mVar2.L).c(mVar.N, mVar2.N).e();
    }

    @Override
    public final int a() {
        return this.K;
    }

    @Override
    public final boolean b(l lVar) {
        m mVar = (m) lVar;
        if (this.J || Objects.equals(this.Q, mVar.Q)) {
            this.f59622f.getClass();
            if (this.L == mVar.L && this.N == mVar.N) {
                return true;
            }
            return false;
        }
        return false;
    }
}
