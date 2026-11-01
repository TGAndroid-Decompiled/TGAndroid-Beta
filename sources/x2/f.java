package x2;

import android.text.TextUtils;
import b2.x;
import e9.b0;
import e9.s1;
import e9.v1;
import j$.util.Objects;
public final class f extends m implements Comparable {
    public final boolean D;
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
    public final boolean f52928f;
    public final String h;
    public final j f52929n;
    public final boolean f52930r;
    public final int f52931s;
    public final int f52932w;
    public final int f52933x;
    public final int f52934y;

    public f(int r8, b2.p1 r9, int r10, x2.j r11, int r12, boolean r13, x2.d r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: x2.f.<init>(int, b2.p1, int, x2.j, int, boolean, x2.d, int):void");
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
        this.f52929n.getClass();
        x xVar2 = this.d;
        int i11 = xVar2.K;
        if (i11 != -1 && i11 == xVar.K) {
            if ((this.D || ((str = xVar2.f2423s) != null && TextUtils.equals(str, xVar.f2423s))) && (i10 = xVar2.L) != -1 && i10 == xVar.L && this.M == fVar.M && this.N == fVar.N) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int compareTo(f fVar) {
        v1 a2;
        boolean z10 = this.f52930r;
        boolean z11 = this.f52928f;
        if (z11 && z10) {
            a2 = o.f52959l;
        } else {
            a2 = o.f52959l.a();
        }
        boolean z12 = fVar.f52930r;
        int i10 = fVar.K;
        b0 c10 = b0.f6331a.c(z10, z12);
        Integer valueOf = Integer.valueOf(this.f52932w);
        Integer valueOf2 = Integer.valueOf(fVar.f52932w);
        s1 s1Var = s1.f6414c;
        b0 b10 = c10.b(valueOf, valueOf2, s1Var).a(this.f52931s, fVar.f52931s).a(this.f52933x, fVar.f52933x).b(Integer.valueOf(this.f52934y), Integer.valueOf(fVar.f52934y), s1Var).c(this.H, fVar.H).c(this.E, fVar.E).b(Integer.valueOf(this.F), Integer.valueOf(fVar.F), s1Var).a(this.G, fVar.G).c(z11, fVar.f52928f).b(Integer.valueOf(this.L), Integer.valueOf(fVar.L), s1Var);
        boolean z13 = this.f52929n.F;
        int i11 = this.K;
        if (z13) {
            b10 = b10.b(Integer.valueOf(i11), Integer.valueOf(i10), o.f52959l.a());
        }
        b0 b11 = b10.c(this.M, fVar.M).c(this.N, fVar.N).c(this.O, fVar.O).b(Integer.valueOf(this.I), Integer.valueOf(fVar.I), a2).b(Integer.valueOf(this.J), Integer.valueOf(fVar.J), a2);
        if (Objects.equals(this.h, fVar.h)) {
            b11 = b11.b(Integer.valueOf(i11), Integer.valueOf(i10), a2);
        }
        return b11.e();
    }
}
