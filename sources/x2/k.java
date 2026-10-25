package x2;

import b2.q1;
import b2.x;
import c3.h0;
import f9.i0;
import f9.n1;
import f9.w;
public final class k extends m implements Comparable {
    public final int e;
    public final boolean f51326f;
    public final boolean h;
    public final boolean f51327n;
    public final int f51328r;
    public final int f51329s;
    public final int v;
    public final int f51330w;
    public final int f51331x;
    public final boolean f51332y;

    public k(int i10, q1 q1Var, int i11, j jVar, int i12, String str, String str2) {
        super(i10, q1Var, i11);
        boolean z10;
        boolean z11;
        i0 i0Var;
        int i13;
        int i14;
        int bitCount;
        boolean z12;
        boolean z13;
        boolean z14;
        int i15 = 0;
        this.f51326f = h0.e(i12, false);
        int i16 = this.d.e;
        int i17 = jVar.C;
        i0 i0Var2 = jVar.f3508y;
        int i18 = i16 & (~i17);
        if ((i18 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if ((i18 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f51327n = z11;
        if (str2 != null) {
            i0Var = i0.y(str2);
        } else if (i0Var2.isEmpty()) {
            i0Var = i0.y("");
        } else {
            i0Var = i0Var2;
        }
        int i19 = 0;
        while (true) {
            if (i19 < i0Var.size()) {
                i13 = o.i(this.d, (String) i0Var.get(i19), jVar.D);
                if (i13 > 0) {
                    break;
                }
                i19++;
            } else {
                i13 = 0;
                i19 = Integer.MAX_VALUE;
                break;
            }
        }
        this.f51328r = i19;
        this.f51329s = i13;
        if (str2 != null) {
            i14 = 1088;
        } else {
            i14 = jVar.A;
        }
        int i20 = this.d.f3574f;
        f9.q1 q1Var2 = o.f51343l;
        if (i20 != 0 && i20 == i14) {
            bitCount = Integer.MAX_VALUE;
        } else {
            bitCount = Integer.bitCount(i14 & i20);
        }
        this.v = bitCount;
        x xVar = this.d;
        if ((1088 & xVar.f3574f) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f51332y = z12;
        int c10 = o.c(xVar, jVar.f3509z);
        this.f51330w = c10;
        if (o.l(str) == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int i21 = o.i(this.d, str, z13);
        this.f51331x = i21;
        if (i13 <= 0 && ((!i0Var2.isEmpty() || bitCount <= 0) && ((!i0Var2.isEmpty() || c10 == Integer.MAX_VALUE) && !this.h && ((!this.f51327n || i21 <= 0) && !jVar.f3507x)))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (h0.e(i12, jVar.B0) && z14) {
            i15 = 1;
        }
        this.e = i15;
    }

    @Override
    public final int a() {
        return this.e;
    }

    @Override
    public final boolean b(m mVar) {
        k kVar = (k) mVar;
        return false;
    }

    @Override
    public final int compareTo(k kVar) {
        w c10 = w.f10352a.c(this.f51326f, kVar.f51326f);
        Integer valueOf = Integer.valueOf(this.f51328r);
        Integer valueOf2 = Integer.valueOf(kVar.f51328r);
        n1 n1Var = n1.f10307b;
        n1 n1Var2 = n1.f10308c;
        w b10 = c10.b(valueOf, valueOf2, n1Var2);
        int i10 = kVar.f51329s;
        int i11 = this.f51329s;
        w a2 = b10.a(i11, i10);
        int i12 = kVar.v;
        int i13 = this.v;
        w c11 = a2.a(i13, i12).b(Integer.valueOf(this.f51330w), Integer.valueOf(kVar.f51330w), n1Var2).c(this.h, kVar.h);
        Boolean valueOf3 = Boolean.valueOf(this.f51327n);
        Boolean valueOf4 = Boolean.valueOf(kVar.f51327n);
        if (i11 != 0) {
            n1Var = n1Var2;
        }
        w a10 = c11.b(valueOf3, valueOf4, n1Var).a(this.f51331x, kVar.f51331x);
        if (i13 == 0) {
            a10 = a10.d(this.f51332y, kVar.f51332y);
        }
        return a10.e();
    }
}
