package z2;

import d2.o1;
import d2.v;
import g9.i0;
import g9.n1;
import g9.q1;
import g9.w;
import k2.p1;
public final class j extends l implements Comparable {
    public final boolean E;
    public final int f59610e;
    public final boolean f59611f;
    public final boolean h;
    public final boolean f59612n;
    public final int f59613r;
    public final int f59614s;
    public final int f59615w;
    public final int f59616x;
    public final int f59617y;

    public j(int i3, o1 o1Var, int i10, i iVar, int i11, String str, String str2) {
        super(i3, o1Var, i10);
        boolean z10;
        boolean z11;
        i0 i0Var;
        int i12;
        int i13;
        int bitCount;
        boolean z12;
        boolean z13;
        boolean z14;
        int i14 = 0;
        this.f59611f = p1.b(i11, false);
        int i15 = this.d.f8476e;
        int i16 = iVar.C;
        i0 i0Var2 = iVar.f8410y;
        int i17 = i15 & (~i16);
        if ((i17 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if ((i17 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f59612n = z11;
        if (str2 != null) {
            i0Var = i0.u(str2);
        } else if (i0Var2.isEmpty()) {
            i0Var = i0.u("");
        } else {
            i0Var = i0Var2;
        }
        int i18 = 0;
        while (true) {
            if (i18 < i0Var.size()) {
                i12 = n.i(this.d, (String) i0Var.get(i18), iVar.D);
                if (i12 > 0) {
                    break;
                }
                i18++;
            } else {
                i12 = 0;
                i18 = Integer.MAX_VALUE;
                break;
            }
        }
        this.f59613r = i18;
        this.f59614s = i12;
        if (str2 != null) {
            i13 = 1088;
        } else {
            i13 = iVar.A;
        }
        int i19 = this.d.f8477f;
        q1 q1Var = n.f59629l;
        if (i19 != 0 && i19 == i13) {
            bitCount = Integer.MAX_VALUE;
        } else {
            bitCount = Integer.bitCount(i13 & i19);
        }
        this.f59615w = bitCount;
        v vVar = this.d;
        if ((1088 & vVar.f8477f) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.E = z12;
        int c2 = n.c(vVar, iVar.f8411z);
        this.f59616x = c2;
        if (n.l(str) == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int i20 = n.i(this.d, str, z13);
        this.f59617y = i20;
        if (i12 <= 0 && ((!i0Var2.isEmpty() || bitCount <= 0) && ((!i0Var2.isEmpty() || c2 == Integer.MAX_VALUE) && !this.h && ((!this.f59612n || i20 <= 0) && !iVar.f8409x)))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (p1.b(i11, iVar.B0) && z14) {
            i14 = 1;
        }
        this.f59610e = i14;
    }

    @Override
    public final int a() {
        return this.f59610e;
    }

    @Override
    public final boolean b(l lVar) {
        j jVar = (j) lVar;
        return false;
    }

    @Override
    public final int compareTo(j jVar) {
        w c2 = w.f12160a.c(this.f59611f, jVar.f59611f);
        Integer valueOf = Integer.valueOf(this.f59613r);
        Integer valueOf2 = Integer.valueOf(jVar.f59613r);
        n1 n1Var = n1.f12107b;
        n1 n1Var2 = n1.f12108c;
        w b10 = c2.b(valueOf, valueOf2, n1Var2);
        int i3 = jVar.f59614s;
        int i10 = this.f59614s;
        w a10 = b10.a(i10, i3);
        int i11 = jVar.f59615w;
        int i12 = this.f59615w;
        w c10 = a10.a(i12, i11).b(Integer.valueOf(this.f59616x), Integer.valueOf(jVar.f59616x), n1Var2).c(this.h, jVar.h);
        Boolean valueOf3 = Boolean.valueOf(this.f59612n);
        Boolean valueOf4 = Boolean.valueOf(jVar.f59612n);
        if (i10 != 0) {
            n1Var = n1Var2;
        }
        w a11 = c10.b(valueOf3, valueOf4, n1Var).a(this.f59617y, jVar.f59617y);
        if (i12 == 0) {
            a11 = a11.d(this.E, jVar.E);
        }
        return a11.e();
    }
}
