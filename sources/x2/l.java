package x2;

import b2.l1;
import e9.i0;
import e9.x0;
import e9.y0;
import e9.z;
public final class l extends n implements Comparable {
    public final int f48734e;
    public final boolean f48735f;
    public final boolean h;
    public final boolean f48736n;
    public final int f48737r;
    public final int f48738s;
    public final int v;
    public final int f48739w;
    public final boolean f48740x;

    public l(int i10, l1 l1Var, int i11, i iVar, int i12, String str, String str2) {
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
        this.f48735f = i2.g.d(i12, false);
        int i17 = this.d.f2358e;
        int i18 = iVar.f2296y;
        i0 i0Var2 = iVar.v;
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
        this.f48736n = z11;
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
                i14 = p.d(this.d, (String) i0Var.get(i20), iVar.f2297z);
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
        this.f48737r = i20;
        this.f48738s = i14;
        if (str2 != null) {
            i15 = 1088;
        } else {
            i15 = iVar.f2294w;
        }
        int i21 = this.d.f2359f;
        y0 y0Var = p.f48752l;
        i13 = (i21 == 0 || i21 != i15) ? Integer.bitCount(i15 & i21) : i13;
        this.v = i13;
        if ((1088 & this.d.f2359f) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f48740x = z12;
        if (p.g(str) == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int d = p.d(this.d, str, z13);
        this.f48739w = d;
        if (i14 <= 0 && ((!i0Var2.isEmpty() || i13 <= 0) && !this.h && (!this.f48736n || d <= 0))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (i2.g.d(i12, iVar.f48726t0) && z14) {
            i16 = 1;
        }
        this.f48734e = i16;
    }

    @Override
    public final int a() {
        return this.f48734e;
    }

    @Override
    public final boolean b(n nVar) {
        l lVar = (l) nVar;
        return false;
    }

    @Override
    public final int compareTo(l lVar) {
        z c10 = z.f9025a.c(this.f48735f, lVar.f48735f);
        Integer valueOf = Integer.valueOf(this.f48737r);
        Integer valueOf2 = Integer.valueOf(lVar.f48737r);
        x0 x0Var = x0.f9022b;
        x0 x0Var2 = x0.f9023c;
        z b10 = c10.b(valueOf, valueOf2, x0Var2);
        int i10 = lVar.f48738s;
        int i11 = this.f48738s;
        z a2 = b10.a(i11, i10);
        int i12 = lVar.v;
        int i13 = this.v;
        z c11 = a2.a(i13, i12).c(this.h, lVar.h);
        Boolean valueOf3 = Boolean.valueOf(this.f48736n);
        Boolean valueOf4 = Boolean.valueOf(lVar.f48736n);
        if (i11 != 0) {
            x0Var = x0Var2;
        }
        z a10 = c11.b(valueOf3, valueOf4, x0Var).a(this.f48739w, lVar.f48739w);
        if (i13 == 0) {
            a10 = a10.d(this.f48740x, lVar.f48740x);
        }
        return a10.e();
    }
}
