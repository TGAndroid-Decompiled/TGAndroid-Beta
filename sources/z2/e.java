package z2;

import android.text.TextUtils;
import d2.v;
import g9.n1;
import g9.q1;
import g9.w;
import j$.util.Objects;
public final class e extends l implements Comparable {
    public final boolean E;
    public final boolean F;
    public final int G;
    public final int H;
    public final boolean I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final int f59594e;
    public final boolean f59595f;
    public final String h;
    public final i f59596n;
    public final boolean f59597r;
    public final int f59598s;
    public final int f59599w;
    public final int f59600x;
    public final int f59601y;

    public e(int r8, d2.o1 r9, int r10, z2.i r11, int r12, boolean r13, z2.d r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: z2.e.<init>(int, d2.o1, int, z2.i, int, boolean, z2.d, int):void");
    }

    @Override
    public final int a() {
        return this.f59594e;
    }

    @Override
    public final boolean b(l lVar) {
        int i3;
        String str;
        e eVar = (e) lVar;
        v vVar = eVar.d;
        this.f59596n.getClass();
        v vVar2 = this.d;
        int i10 = vVar2.K;
        if (i10 != -1 && i10 == vVar.K) {
            if ((this.E || ((str = vVar2.f8489s) != null && TextUtils.equals(str, vVar.f8489s))) && (i3 = vVar2.L) != -1 && i3 == vVar.L && this.N == eVar.N && this.O == eVar.O) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int compareTo(e eVar) {
        q1 a10;
        boolean z10 = this.f59597r;
        boolean z11 = this.f59595f;
        if (z11 && z10) {
            a10 = n.f59629l;
        } else {
            a10 = n.f59629l.a();
        }
        boolean z12 = eVar.f59597r;
        int i3 = eVar.L;
        w c2 = w.f12160a.c(z10, z12);
        Integer valueOf = Integer.valueOf(this.f59599w);
        Integer valueOf2 = Integer.valueOf(eVar.f59599w);
        n1 n1Var = n1.f12108c;
        w b10 = c2.b(valueOf, valueOf2, n1Var).a(this.f59598s, eVar.f59598s).a(this.f59600x, eVar.f59600x).b(Integer.valueOf(this.f59601y), Integer.valueOf(eVar.f59601y), n1Var).c(this.I, eVar.I).c(this.F, eVar.F).b(Integer.valueOf(this.G), Integer.valueOf(eVar.G), n1Var).a(this.H, eVar.H).c(z11, eVar.f59595f).b(Integer.valueOf(this.M), Integer.valueOf(eVar.M), n1Var);
        boolean z13 = this.f59596n.F;
        int i10 = this.L;
        if (z13) {
            b10 = b10.b(Integer.valueOf(i10), Integer.valueOf(i3), n.f59629l.a());
        }
        w b11 = b10.c(this.N, eVar.N).c(this.O, eVar.O).c(this.P, eVar.P).b(Integer.valueOf(this.J), Integer.valueOf(eVar.J), a10).b(Integer.valueOf(this.K), Integer.valueOf(eVar.K), a10);
        if (Objects.equals(this.h, eVar.h)) {
            b11 = b11.b(Integer.valueOf(i10), Integer.valueOf(i3), a10);
        }
        return b11.e();
    }
}
