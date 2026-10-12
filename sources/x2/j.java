package x2;

import b2.q1;
import b2.x;
import e9.b0;
import e9.n0;
import e9.s1;
import e9.v1;
public final class j extends l implements Comparable {
    public final int e;
    public final boolean f47760f;
    public final boolean h;
    public final boolean f47761n;
    public final int f47762r;
    public final int f47763s;
    public final int v;
    public final int f47764w;
    public final int f47765x;
    public final boolean f47766y;

    public j(int i10, q1 q1Var, int i11, i iVar, int i12, String str, String str2) {
        super(i10, q1Var, i11);
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
        this.f47760f = i2.d.e(i12, false);
        int i16 = this.d.e;
        int i17 = iVar.C;
        n0 n0Var2 = iVar.f2441y;
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
        this.f47761n = z11;
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
        this.f47762r = i19;
        this.f47763s = i13;
        if (str2 != null) {
            i14 = 1088;
        } else {
            i14 = iVar.A;
        }
        int i20 = this.d.f2507f;
        v1 v1Var = n.f47777l;
        if (i20 != 0 && i20 == i14) {
            bitCount = Integer.MAX_VALUE;
        } else {
            bitCount = Integer.bitCount(i14 & i20);
        }
        this.v = bitCount;
        x xVar = this.d;
        if ((1088 & xVar.f2507f) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f47766y = z12;
        int c10 = n.c(xVar, iVar.f2442z);
        this.f47764w = c10;
        if (n.l(str) == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int i21 = n.i(this.d, str, z13);
        this.f47765x = i21;
        if (i13 <= 0 && ((!n0Var2.isEmpty() || bitCount <= 0) && ((!n0Var2.isEmpty() || c10 == Integer.MAX_VALUE) && !this.h && ((!this.f47761n || i21 <= 0) && !iVar.f2440x)))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (i2.d.e(i12, iVar.B0) && z14) {
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
        b0 c10 = b0.f8533a.c(this.f47760f, jVar.f47760f);
        Integer valueOf = Integer.valueOf(this.f47762r);
        Integer valueOf2 = Integer.valueOf(jVar.f47762r);
        s1 s1Var = s1.f8615b;
        s1 s1Var2 = s1.f8616c;
        b0 b10 = c10.b(valueOf, valueOf2, s1Var2);
        int i10 = jVar.f47763s;
        int i11 = this.f47763s;
        b0 a2 = b10.a(i11, i10);
        int i12 = jVar.v;
        int i13 = this.v;
        b0 c11 = a2.a(i13, i12).b(Integer.valueOf(this.f47764w), Integer.valueOf(jVar.f47764w), s1Var2).c(this.h, jVar.h);
        Boolean valueOf3 = Boolean.valueOf(this.f47761n);
        Boolean valueOf4 = Boolean.valueOf(jVar.f47761n);
        if (i11 != 0) {
            s1Var = s1Var2;
        }
        b0 a10 = c11.b(valueOf3, valueOf4, s1Var).a(this.f47765x, jVar.f47765x);
        if (i13 == 0) {
            a10 = a10.d(this.f47766y, jVar.f47766y);
        }
        return a10.e();
    }
}
