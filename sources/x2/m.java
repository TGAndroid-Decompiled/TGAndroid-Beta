package x2;

import b2.l1;
import e9.i0;
import e9.x0;
import e9.y0;
import e9.z;
import hg.k0;
public final class m extends o implements Comparable {
    public final int e;
    public final boolean f45504f;
    public final boolean h;
    public final boolean f45505n;
    public final int f45506r;
    public final int f45507s;
    public final int v;
    public final int f45508w;
    public final boolean f45509x;

    public m(int i10, l1 l1Var, int i11, j jVar, int i12, String str, String str2) {
        super(i10, l1Var, i11);
        boolean z10;
        boolean z11;
        i0 i0Var;
        int i13;
        int i14;
        int i15;
        boolean z12;
        boolean z13;
        boolean z14;
        int i16 = 0;
        this.f45504f = k0.d(i12, false);
        int i17 = this.d.e;
        int i18 = jVar.f3237y;
        i0 i0Var2 = jVar.v;
        int i19 = i17 & (~i18);
        if ((i19 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if ((i19 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f45505n = z11;
        if (str2 != null) {
            i0Var = i0.z(str2);
        } else if (i0Var2.isEmpty()) {
            i0Var = i0.z("");
        } else {
            i0Var = i0Var2;
        }
        int i20 = 0;
        while (true) {
            i13 = Integer.MAX_VALUE;
            if (i20 < i0Var.size()) {
                i14 = q.d(this.d, (String) i0Var.get(i20), jVar.f3238z);
                if (i14 > 0) {
                    break;
                }
                i20++;
            } else {
                i20 = Integer.MAX_VALUE;
                i14 = 0;
                break;
            }
        }
        this.f45506r = i20;
        this.f45507s = i14;
        if (str2 != null) {
            i15 = 1088;
        } else {
            i15 = jVar.f3235w;
        }
        int i21 = this.d.f3297f;
        y0 y0Var = q.f45520l;
        i13 = (i21 == 0 || i21 != i15) ? Integer.bitCount(i15 & i21) : i13;
        this.v = i13;
        if ((1088 & this.d.f3297f) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f45509x = z12;
        if (q.g(str) == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int d = q.d(this.d, str, z13);
        this.f45508w = d;
        if (i14 <= 0 && ((!i0Var2.isEmpty() || i13 <= 0) && !this.h && (!this.f45505n || d <= 0))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (k0.d(i12, jVar.f45496t0) && z14) {
            i16 = 1;
        }
        this.e = i16;
    }

    @Override
    public final int a() {
        return this.e;
    }

    @Override
    public final boolean b(o oVar) {
        m mVar = (m) oVar;
        return false;
    }

    @Override
    public final int compareTo(m mVar) {
        z c10 = z.f8145a.c(this.f45504f, mVar.f45504f);
        Integer valueOf = Integer.valueOf(this.f45506r);
        Integer valueOf2 = Integer.valueOf(mVar.f45506r);
        x0 x0Var = x0.f8142b;
        x0 x0Var2 = x0.f8143c;
        z b10 = c10.b(valueOf, valueOf2, x0Var2);
        int i10 = mVar.f45507s;
        int i11 = this.f45507s;
        z a2 = b10.a(i11, i10);
        int i12 = mVar.v;
        int i13 = this.v;
        z c11 = a2.a(i13, i12).c(this.h, mVar.h);
        Boolean valueOf3 = Boolean.valueOf(this.f45505n);
        Boolean valueOf4 = Boolean.valueOf(mVar.f45505n);
        if (i11 != 0) {
            x0Var = x0Var2;
        }
        z a10 = c11.b(valueOf3, valueOf4, x0Var).a(this.f45508w, mVar.f45508w);
        if (i13 == 0) {
            a10 = a10.d(this.f45509x, mVar.f45509x);
        }
        return a10.e();
    }
}
