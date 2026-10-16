package x2;

import android.text.TextUtils;
import b2.x;
import e9.b0;
import e9.s1;
import e9.v1;
import j$.util.Objects;
public final class e extends l implements Comparable {
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
    public final boolean f47745f;
    public final String h;
    public final i f47746n;
    public final boolean f47747r;
    public final int f47748s;
    public final int v;
    public final int f47749w;
    public final int f47750x;
    public final boolean f47751y;

    public e(int r8, b2.q1 r9, int r10, x2.i r11, int r12, boolean r13, x2.d r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: x2.e.<init>(int, b2.q1, int, x2.i, int, boolean, x2.d, int):void");
    }

    @Override
    public final int a() {
        return this.e;
    }

    @Override
    public final boolean b(l lVar) {
        int i10;
        String str;
        e eVar = (e) lVar;
        x xVar = eVar.d;
        this.f47746n.getClass();
        x xVar2 = this.d;
        int i11 = xVar2.K;
        if (i11 != -1 && i11 == xVar.K) {
            if ((this.f47751y || ((str = xVar2.f2523s) != null && TextUtils.equals(str, xVar.f2523s))) && (i10 = xVar2.L) != -1 && i10 == xVar.L && this.M == eVar.M && this.N == eVar.N) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int compareTo(e eVar) {
        v1 a2;
        boolean z10 = this.f47747r;
        boolean z11 = this.f47745f;
        if (z11 && z10) {
            a2 = n.f47776l;
        } else {
            a2 = n.f47776l.a();
        }
        boolean z12 = eVar.f47747r;
        int i10 = eVar.K;
        b0 c10 = b0.f8536a.c(z10, z12);
        Integer valueOf = Integer.valueOf(this.v);
        Integer valueOf2 = Integer.valueOf(eVar.v);
        s1 s1Var = s1.f8619c;
        b0 b10 = c10.b(valueOf, valueOf2, s1Var).a(this.f47748s, eVar.f47748s).a(this.f47749w, eVar.f47749w).b(Integer.valueOf(this.f47750x), Integer.valueOf(eVar.f47750x), s1Var).c(this.H, eVar.H).c(this.E, eVar.E).b(Integer.valueOf(this.F), Integer.valueOf(eVar.F), s1Var).a(this.G, eVar.G).c(z11, eVar.f47745f).b(Integer.valueOf(this.L), Integer.valueOf(eVar.L), s1Var);
        boolean z13 = this.f47746n.F;
        int i11 = this.K;
        if (z13) {
            b10 = b10.b(Integer.valueOf(i11), Integer.valueOf(i10), n.f47776l.a());
        }
        b0 b11 = b10.c(this.M, eVar.M).c(this.N, eVar.N).c(this.O, eVar.O).b(Integer.valueOf(this.I), Integer.valueOf(eVar.I), a2).b(Integer.valueOf(this.J), Integer.valueOf(eVar.J), a2);
        if (Objects.equals(this.h, eVar.h)) {
            b11 = b11.b(Integer.valueOf(i11), Integer.valueOf(i10), a2);
        }
        return b11.e();
    }
}
