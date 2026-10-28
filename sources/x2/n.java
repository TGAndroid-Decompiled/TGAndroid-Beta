package x2;

import f9.n1;
import f9.w;
import j$.util.Objects;
public final class n extends m {
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
    public final j f51397f;
    public final boolean h;
    public final boolean f51398n;
    public final boolean f51399r;
    public final int f51400s;
    public final int v;
    public final int f51401w;
    public final int f51402x;
    public final int f51403y;

    public n(int r7, b2.q1 r8, int r9, x2.j r10, int r11, java.lang.String r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: x2.n.<init>(int, b2.q1, int, x2.j, int, java.lang.String, int, boolean):void");
    }

    public static int c(n nVar, n nVar2) {
        w c10 = w.f10351a.c(nVar.f51398n, nVar2.f51398n);
        Integer valueOf = Integer.valueOf(nVar.f51402x);
        Integer valueOf2 = Integer.valueOf(nVar2.f51402x);
        n1 n1Var = n1.f10307c;
        return c10.b(valueOf, valueOf2, n1Var).a(nVar.f51403y, nVar2.f51403y).a(nVar.E, nVar2.E).b(Integer.valueOf(nVar.F), Integer.valueOf(nVar2.F), n1Var).c(nVar.G, nVar2.G).a(nVar.H, nVar2.H).c(nVar.f51399r, nVar2.f51399r).c(nVar.e, nVar2.e).c(nVar.h, nVar2.h).b(Integer.valueOf(nVar.f51401w), Integer.valueOf(nVar2.f51401w), n1Var).c(nVar.K, nVar2.K).c(nVar.M, nVar2.M).e();
    }

    @Override
    public final int a() {
        return this.J;
    }

    @Override
    public final boolean b(m mVar) {
        n nVar = (n) mVar;
        if (this.I || Objects.equals(this.P, nVar.P)) {
            this.f51397f.getClass();
            if (this.K == nVar.K && this.M == nVar.M) {
                return true;
            }
            return false;
        }
        return false;
    }
}
