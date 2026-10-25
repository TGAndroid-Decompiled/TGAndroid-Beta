package x2;

import android.text.TextUtils;
import b2.x;
import f9.n1;
import f9.q1;
import f9.w;
import j$.util.Objects;
public final class f extends m implements Comparable {
    public final boolean E;
    public final int F;
    public final int G;
    public final boolean H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final int e;
    public final boolean f51312f;
    public final String h;
    public final j f51313n;
    public final boolean f51314r;
    public final int f51315s;
    public final int v;
    public final int f51316w;
    public final int f51317x;
    public final boolean f51318y;

    public f(int r8, b2.q1 r9, int r10, x2.j r11, int r12, boolean r13, x2.d r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: x2.f.<init>(int, b2.q1, int, x2.j, int, boolean, x2.d, int):void");
    }

    @Override
    public final int a() {
        return this.e;
    }

    @Override
    public final boolean b(m mVar) {
        int i10;
        String str;
        f fVar = (f) mVar;
        x xVar = fVar.d;
        this.f51313n.getClass();
        x xVar2 = this.d;
        int i11 = xVar2.K;
        if (i11 != -1 && i11 == xVar.K) {
            if ((this.f51318y || ((str = xVar2.f3586s) != null && TextUtils.equals(str, xVar.f3586s))) && (i10 = xVar2.L) != -1 && i10 == xVar.L && this.M == fVar.M && this.N == fVar.N) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int compareTo(f fVar) {
        q1 a2;
        boolean z10 = this.f51314r;
        boolean z11 = this.f51312f;
        if (z11 && z10) {
            a2 = o.f51343l;
        } else {
            a2 = o.f51343l.a();
        }
        boolean z12 = fVar.f51314r;
        int i10 = fVar.K;
        w c10 = w.f10352a.c(z10, z12);
        Integer valueOf = Integer.valueOf(this.v);
        Integer valueOf2 = Integer.valueOf(fVar.v);
        n1 n1Var = n1.f10308c;
        w b10 = c10.b(valueOf, valueOf2, n1Var).a(this.f51315s, fVar.f51315s).a(this.f51316w, fVar.f51316w).b(Integer.valueOf(this.f51317x), Integer.valueOf(fVar.f51317x), n1Var).c(this.H, fVar.H).c(this.E, fVar.E).b(Integer.valueOf(this.F), Integer.valueOf(fVar.F), n1Var).a(this.G, fVar.G).c(z11, fVar.f51312f).b(Integer.valueOf(this.L), Integer.valueOf(fVar.L), n1Var);
        boolean z13 = this.f51313n.F;
        int i11 = this.K;
        if (z13) {
            b10 = b10.b(Integer.valueOf(i11), Integer.valueOf(i10), o.f51343l.a());
        }
        w b11 = b10.c(this.M, fVar.M).c(this.N, fVar.N).c(this.O, fVar.O).b(Integer.valueOf(this.I), Integer.valueOf(fVar.I), a2).b(Integer.valueOf(this.J), Integer.valueOf(fVar.J), a2);
        if (Objects.equals(this.h, fVar.h)) {
            b11 = b11.b(Integer.valueOf(i11), Integer.valueOf(i10), a2);
        }
        return b11.e();
    }
}
