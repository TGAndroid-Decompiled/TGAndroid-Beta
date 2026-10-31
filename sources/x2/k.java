package x2;

import b2.p1;
import b2.x;
import e9.b0;
import e9.n0;
import e9.s1;
import e9.v1;
public final class k extends m implements Comparable {
    public final boolean D;
    public final int e;
    public final boolean f52924f;
    public final boolean h;
    public final boolean f52925n;
    public final int f52926r;
    public final int f52927s;
    public final int f52928w;
    public final int f52929x;
    public final int f52930y;

    public k(int i10, p1 p1Var, int i11, j jVar, int i12, String str, String str2) {
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
        this.f52924f = i0.a.b(i12, false);
        int i16 = this.d.e;
        int i17 = jVar.C;
        n0 n0Var2 = jVar.f2345y;
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
        this.f52925n = z11;
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
                i13 = o.i(this.d, (String) n0Var.get(i19), jVar.D);
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
        this.f52926r = i19;
        this.f52927s = i13;
        if (str2 != null) {
            i14 = 1088;
        } else {
            i14 = jVar.A;
        }
        int i20 = this.d.f2411f;
        v1 v1Var = o.f52941l;
        if (i20 != 0 && i20 == i14) {
            bitCount = Integer.MAX_VALUE;
        } else {
            bitCount = Integer.bitCount(i14 & i20);
        }
        this.f52928w = bitCount;
        x xVar = this.d;
        if ((1088 & xVar.f2411f) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.D = z12;
        int c10 = o.c(xVar, jVar.f2346z);
        this.f52929x = c10;
        if (o.l(str) == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int i21 = o.i(this.d, str, z13);
        this.f52930y = i21;
        if (i13 <= 0 && ((!n0Var2.isEmpty() || bitCount <= 0) && ((!n0Var2.isEmpty() || c10 == Integer.MAX_VALUE) && !this.h && ((!this.f52925n || i21 <= 0) && !jVar.f2344x)))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (i0.a.b(i12, jVar.B0) && z14) {
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
        b0 c10 = b0.f6331a.c(this.f52924f, kVar.f52924f);
        Integer valueOf = Integer.valueOf(this.f52926r);
        Integer valueOf2 = Integer.valueOf(kVar.f52926r);
        s1 s1Var = s1.f6413b;
        s1 s1Var2 = s1.f6414c;
        b0 b10 = c10.b(valueOf, valueOf2, s1Var2);
        int i10 = kVar.f52927s;
        int i11 = this.f52927s;
        b0 a2 = b10.a(i11, i10);
        int i12 = kVar.f52928w;
        int i13 = this.f52928w;
        b0 c11 = a2.a(i13, i12).b(Integer.valueOf(this.f52929x), Integer.valueOf(kVar.f52929x), s1Var2).c(this.h, kVar.h);
        Boolean valueOf3 = Boolean.valueOf(this.f52925n);
        Boolean valueOf4 = Boolean.valueOf(kVar.f52925n);
        if (i11 != 0) {
            s1Var = s1Var2;
        }
        b0 a10 = c11.b(valueOf3, valueOf4, s1Var).a(this.f52930y, kVar.f52930y);
        if (i13 == 0) {
            a10 = a10.d(this.D, kVar.D);
        }
        return a10.e();
    }
}
