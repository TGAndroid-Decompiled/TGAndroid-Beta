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
    public final boolean f44501f;
    public final String h;
    public final i f44502n;
    public final boolean f44503r;
    public final int f44504s;
    public final int v;
    public final int f44505w;
    public final boolean f44506x;
    public final boolean f44507y;

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
        this.f44502n.getClass();
        b2.s sVar2 = this.d;
        int i11 = sVar2.J;
        if (i11 != -1 && i11 == sVar.J) {
            if ((this.f44506x || ((str = sVar2.f2002r) != null && TextUtils.equals(str, sVar.f2002r))) && (i10 = sVar2.K) != -1 && i10 == sVar.K && this.L == eVar.L && this.M == eVar.M) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int compareTo(e eVar) {
        y0 a2;
        boolean z10 = this.f44503r;
        boolean z11 = this.f44501f;
        if (z11 && z10) {
            a2 = p.f44543l;
        } else {
            a2 = p.f44543l.a();
        }
        boolean z12 = eVar.f44503r;
        int i10 = eVar.J;
        z c10 = z.f7446a.c(z10, z12);
        Integer valueOf = Integer.valueOf(this.v);
        Integer valueOf2 = Integer.valueOf(eVar.v);
        x0 x0Var = x0.f7444c;
        z b10 = c10.b(valueOf, valueOf2, x0Var).a(this.f44504s, eVar.f44504s).a(this.f44505w, eVar.f44505w).c(this.G, eVar.G).c(this.f44507y, eVar.f44507y).b(Integer.valueOf(this.E), Integer.valueOf(eVar.E), x0Var).a(this.F, eVar.F).c(z11, eVar.f44501f).b(Integer.valueOf(this.K), Integer.valueOf(eVar.K), x0Var);
        boolean z13 = this.f44502n.B;
        int i11 = this.J;
        if (z13) {
            b10 = b10.b(Integer.valueOf(i11), Integer.valueOf(i10), p.f44543l.a());
        }
        z b11 = b10.c(this.L, eVar.L).c(this.M, eVar.M).c(this.N, eVar.N).b(Integer.valueOf(this.H), Integer.valueOf(eVar.H), a2).b(Integer.valueOf(this.I), Integer.valueOf(eVar.I), a2);
        if (Objects.equals(this.h, eVar.h)) {
            b11 = b11.b(Integer.valueOf(i11), Integer.valueOf(i10), a2);
        }
        return b11.e();
    }
}
