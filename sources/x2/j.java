package x2;

import b2.p1;
import b2.w;
import e9.b0;
import e9.n0;
import e9.s1;
import e9.v1;
import i2.o1;
public final class j extends l implements Comparable {
    public final int e;
    public final boolean f49597f;
    public final boolean h;
    public final boolean f49598n;
    public final int f49599r;
    public final int f49600s;
    public final int v;
    public final int f49601w;
    public final int f49602x;
    public final boolean f49603y;

    public j(int i10, p1 p1Var, int i11, i iVar, int i12, String str, String str2) {
        super(i10, p1Var, i11);
        boolean z10;
        boolean z11;
        n0 n0Var;
        int i13;
        int i14;
        int bitCount;
        boolean z12;
        boolean z13;
        boolean z14;
        int i15 = 0;
        this.f49597f = o1.e(i12, false);
        int i16 = this.d.e;
        int i17 = iVar.C;
        n0 n0Var2 = iVar.f4057y;
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
        this.f49598n = z11;
        if (str2 != null) {
            n0Var = n0.y(str2);
        } else if (n0Var2.isEmpty()) {
            n0Var = n0.y("");
        } else {
            n0Var = n0Var2;
        }
        int i19 = 0;
        while (true) {
            if (i19 < n0Var.size()) {
                i13 = n.i(this.d, (String) n0Var.get(i19), iVar.D);
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
        this.f49599r = i19;
        this.f49600s = i13;
        if (str2 != null) {
            i14 = 1088;
        } else {
            i14 = iVar.A;
        }
        int i20 = this.d.f4123f;
        v1 v1Var = n.f49614l;
        if (i20 != 0 && i20 == i14) {
            bitCount = Integer.MAX_VALUE;
        } else {
            bitCount = Integer.bitCount(i14 & i20);
        }
        this.v = bitCount;
        w wVar = this.d;
        if ((1088 & wVar.f4123f) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f49603y = z12;
        int c10 = n.c(wVar, iVar.f4058z);
        this.f49601w = c10;
        if (n.l(str) == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int i21 = n.i(this.d, str, z13);
        this.f49602x = i21;
        if (i13 <= 0 && ((!n0Var2.isEmpty() || bitCount <= 0) && ((!n0Var2.isEmpty() || c10 == Integer.MAX_VALUE) && !this.h && ((!this.f49598n || i21 <= 0) && !iVar.f4056x)))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (o1.e(i12, iVar.B0) && z14) {
            i15 = 1;
        }
        this.e = i15;
    }

    @Override
    public final int a() {
        return this.e;
    }

    @Override
    public final boolean b(l lVar) {
        j jVar = (j) lVar;
        return false;
    }

    @Override
    public final int compareTo(j jVar) {
        b0 c10 = b0.f8422a.c(this.f49597f, jVar.f49597f);
        Integer valueOf = Integer.valueOf(this.f49599r);
        Integer valueOf2 = Integer.valueOf(jVar.f49599r);
        s1 s1Var = s1.f8504b;
        s1 s1Var2 = s1.f8505c;
        b0 b10 = c10.b(valueOf, valueOf2, s1Var2);
        int i10 = jVar.f49600s;
        int i11 = this.f49600s;
        b0 a2 = b10.a(i11, i10);
        int i12 = jVar.v;
        int i13 = this.v;
        b0 c11 = a2.a(i13, i12).b(Integer.valueOf(this.f49601w), Integer.valueOf(jVar.f49601w), s1Var2).c(this.h, jVar.h);
        Boolean valueOf3 = Boolean.valueOf(this.f49598n);
        Boolean valueOf4 = Boolean.valueOf(jVar.f49598n);
        if (i11 != 0) {
            s1Var = s1Var2;
        }
        b0 a10 = c11.b(valueOf3, valueOf4, s1Var).a(this.f49602x, jVar.f49602x);
        if (i13 == 0) {
            a10 = a10.d(this.f49603y, jVar.f49603y);
        }
        return a10.e();
    }
}
