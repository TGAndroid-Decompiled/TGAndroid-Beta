package x2;

import android.text.TextUtils;
import e9.x0;
import e9.y0;
import e9.z;
import j$.util.Objects;
public final class e extends n implements Comparable {
    public final int E;
    public final int F;
    public final boolean G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final int e;
    public final boolean f45439f;
    public final String h;
    public final i f45440n;
    public final boolean f45441r;
    public final int f45442s;
    public final int v;
    public final int f45443w;
    public final boolean f45444x;
    public final boolean f45445y;

    public e(int r8, b2.l1 r9, int r10, x2.i r11, int r12, boolean r13, x2.d r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: x2.e.<init>(int, b2.l1, int, x2.i, int, boolean, x2.d, int):void");
    }

    @Override
    public final int a() {
        return this.e;
    }

    @Override
    public final boolean b(n nVar) {
        int i10;
        String str;
        e eVar = (e) nVar;
        b2.s sVar = eVar.d;
        this.f45440n.getClass();
        b2.s sVar2 = this.d;
        int i11 = sVar2.J;
        if (i11 != -1 && i11 == sVar.J) {
            if ((this.f45444x || ((str = sVar2.f3301r) != null && TextUtils.equals(str, sVar.f3301r))) && (i10 = sVar2.K) != -1 && i10 == sVar.K && this.L == eVar.L && this.M == eVar.M) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int compareTo(e eVar) {
        y0 a2;
        boolean z10 = this.f45441r;
        boolean z11 = this.f45439f;
        if (z11 && z10) {
            a2 = p.f45481l;
        } else {
            a2 = p.f45481l.a();
        }
        boolean z12 = eVar.f45441r;
        int i10 = eVar.J;
        z c10 = z.f8128a.c(z10, z12);
        Integer valueOf = Integer.valueOf(this.v);
        Integer valueOf2 = Integer.valueOf(eVar.v);
        x0 x0Var = x0.f8126c;
        z b10 = c10.b(valueOf, valueOf2, x0Var).a(this.f45442s, eVar.f45442s).a(this.f45443w, eVar.f45443w).c(this.G, eVar.G).c(this.f45445y, eVar.f45445y).b(Integer.valueOf(this.E), Integer.valueOf(eVar.E), x0Var).a(this.F, eVar.F).c(z11, eVar.f45439f).b(Integer.valueOf(this.K), Integer.valueOf(eVar.K), x0Var);
        boolean z13 = this.f45440n.B;
        int i11 = this.J;
        if (z13) {
            b10 = b10.b(Integer.valueOf(i11), Integer.valueOf(i10), p.f45481l.a());
        }
        z b11 = b10.c(this.L, eVar.L).c(this.M, eVar.M).c(this.N, eVar.N).b(Integer.valueOf(this.H), Integer.valueOf(eVar.H), a2).b(Integer.valueOf(this.I), Integer.valueOf(eVar.I), a2);
        if (Objects.equals(this.h, eVar.h)) {
            b11 = b11.b(Integer.valueOf(i11), Integer.valueOf(i10), a2);
        }
        return b11.e();
    }
}
