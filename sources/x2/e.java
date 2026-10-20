package x2;

import android.text.TextUtils;
import b2.w;
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
    public final boolean f49138f;
    public final String h;
    public final i f49139n;
    public final boolean f49140r;
    public final int f49141s;
    public final int v;
    public final int f49142w;
    public final int f49143x;
    public final boolean f49144y;

    public e(int r8, b2.p1 r9, int r10, x2.i r11, int r12, boolean r13, x2.d r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: x2.e.<init>(int, b2.p1, int, x2.i, int, boolean, x2.d, int):void");
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
        w wVar = eVar.d;
        this.f49139n.getClass();
        w wVar2 = this.d;
        int i11 = wVar2.K;
        if (i11 != -1 && i11 == wVar.K) {
            if ((this.f49144y || ((str = wVar2.f4128s) != null && TextUtils.equals(str, wVar.f4128s))) && (i10 = wVar2.L) != -1 && i10 == wVar.L && this.M == eVar.M && this.N == eVar.N) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int compareTo(e eVar) {
        v1 a2;
        boolean z10 = this.f49140r;
        boolean z11 = this.f49138f;
        if (z11 && z10) {
            a2 = n.f49169l;
        } else {
            a2 = n.f49169l.a();
        }
        boolean z12 = eVar.f49140r;
        int i10 = eVar.K;
        b0 c10 = b0.f8415a.c(z10, z12);
        Integer valueOf = Integer.valueOf(this.v);
        Integer valueOf2 = Integer.valueOf(eVar.v);
        s1 s1Var = s1.f8498c;
        b0 b10 = c10.b(valueOf, valueOf2, s1Var).a(this.f49141s, eVar.f49141s).a(this.f49142w, eVar.f49142w).b(Integer.valueOf(this.f49143x), Integer.valueOf(eVar.f49143x), s1Var).c(this.H, eVar.H).c(this.E, eVar.E).b(Integer.valueOf(this.F), Integer.valueOf(eVar.F), s1Var).a(this.G, eVar.G).c(z11, eVar.f49138f).b(Integer.valueOf(this.L), Integer.valueOf(eVar.L), s1Var);
        boolean z13 = this.f49139n.F;
        int i11 = this.K;
        if (z13) {
            b10 = b10.b(Integer.valueOf(i11), Integer.valueOf(i10), n.f49169l.a());
        }
        b0 b11 = b10.c(this.M, eVar.M).c(this.N, eVar.N).c(this.O, eVar.O).b(Integer.valueOf(this.I), Integer.valueOf(eVar.I), a2).b(Integer.valueOf(this.J), Integer.valueOf(eVar.J), a2);
        if (Objects.equals(this.h, eVar.h)) {
            b11 = b11.b(Integer.valueOf(i11), Integer.valueOf(i10), a2);
        }
        return b11.e();
    }
}
