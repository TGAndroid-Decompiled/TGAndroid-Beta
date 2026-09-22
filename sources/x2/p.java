package x2;

import e9.x0;
import e9.z;
import j$.util.Objects;
public final class p extends o {
    public final int E;
    public final boolean F;
    public final int G;
    public final boolean H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final int L;
    public final boolean e;
    public final j f45513f;
    public final boolean h;
    public final boolean f45514n;
    public final boolean f45515r;
    public final int f45516s;
    public final int v;
    public final int f45517w;
    public final int f45518x;
    public final int f45519y;

    public p(int r7, b2.l1 r8, int r9, x2.j r10, int r11, java.lang.String r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: x2.p.<init>(int, b2.l1, int, x2.j, int, java.lang.String, int, boolean):void");
    }

    public static int c(p pVar, p pVar2) {
        z c10 = z.f8145a.c(pVar.f45514n, pVar2.f45514n);
        Integer valueOf = Integer.valueOf(pVar.f45518x);
        Integer valueOf2 = Integer.valueOf(pVar2.f45518x);
        x0 x0Var = x0.f8143c;
        z b10 = c10.b(valueOf, valueOf2, x0Var).a(pVar.f45519y, pVar2.f45519y).a(pVar.E, pVar2.E).c(pVar.F, pVar2.F).a(pVar.G, pVar2.G).c(pVar.f45515r, pVar2.f45515r).c(pVar.e, pVar2.e).c(pVar.h, pVar2.h).b(Integer.valueOf(pVar.f45517w), Integer.valueOf(pVar2.f45517w), x0Var);
        boolean z10 = pVar.J;
        z c11 = b10.c(z10, pVar2.J);
        boolean z11 = pVar.K;
        z c12 = c11.c(z11, pVar2.K);
        if (z10 && z11) {
            c12 = c12.a(pVar.L, pVar2.L);
        }
        return c12.e();
    }

    @Override
    public final int a() {
        return this.I;
    }

    @Override
    public final boolean b(o oVar) {
        p pVar = (p) oVar;
        if (this.H || Objects.equals(this.d.f3308r, pVar.d.f3308r)) {
            this.f45513f.getClass();
            if (this.J == pVar.J && this.K == pVar.K) {
                return true;
            }
            return false;
        }
        return false;
    }
}
