package z3;

import e2.u;
import f3.j0;
import h2.m0;
import h2.x;
public final class g {
    public final j0 f59495a;
    public t d;
    public d f59498e;
    public int f59499f;
    public int f59500g;
    public int h;
    public int f59501i;
    public final u f59502j;
    public boolean f59505m;
    public final s f59496b = new s();
    public final x f59497c = new x();
    public final x f59503k = new x(1);
    public final x f59504l = new x();

    public g(j0 j0Var, t tVar, d dVar, u uVar) {
        this.f59495a = j0Var;
        this.d = tVar;
        this.f59498e = dVar;
        this.f59502j = uVar;
        this.d = tVar;
        this.f59498e = dVar;
        j0Var.g(uVar);
        e();
    }

    public final int a() {
        int i7;
        if (!this.f59505m) {
            i7 = this.d.f59605g[this.f59499f];
        } else if (this.f59496b.f59592j[this.f59499f]) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (b() != null) {
            return i7 | 1073741824;
        }
        return i7;
    }

    public final r b() {
        if (this.f59505m) {
            s sVar = this.f59496b;
            d dVar = sVar.f59585a;
            String str = m0.f14112a;
            int i7 = dVar.f59488a;
            r rVar = sVar.f59595m;
            if (rVar == null) {
                rVar = this.d.f59600a.f59580l[i7];
            }
            if (rVar != null && rVar.f59581a) {
                return rVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f59499f++;
        if (!this.f59505m) {
            return false;
        }
        int i7 = this.f59500g + 1;
        this.f59500g = i7;
        int[] iArr = this.f59496b.f59590g;
        int i10 = this.h;
        if (i7 != iArr[i10]) {
            return true;
        }
        this.h = i10 + 1;
        this.f59500g = 0;
        return false;
    }

    public final int d(int i7, int i10) {
        x xVar;
        boolean z9;
        boolean z10;
        int i11;
        r b10 = b();
        if (b10 == null) {
            return 0;
        }
        int i12 = b10.d;
        s sVar = this.f59496b;
        if (i12 != 0) {
            xVar = sVar.f59596n;
        } else {
            byte[] bArr = b10.f59584e;
            String str = m0.f14112a;
            int length = bArr.length;
            x xVar2 = this.f59504l;
            xVar2.L(length, bArr);
            i12 = bArr.length;
            xVar = xVar2;
        }
        int i13 = this.f59499f;
        if (sVar.f59593k && sVar.f59594l[i13]) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && i10 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        x xVar3 = this.f59503k;
        byte[] bArr2 = xVar3.f14162a;
        if (z10) {
            i11 = 128;
        } else {
            i11 = 0;
        }
        bArr2[0] = (byte) (i11 | i12);
        xVar3.N(0);
        j0 j0Var = this.f59495a;
        j0Var.a(xVar3, 1, 1);
        j0Var.a(xVar, i12, 1);
        if (!z10) {
            return i12 + 1;
        }
        x xVar4 = this.f59497c;
        if (!z9) {
            xVar4.K(8);
            byte[] bArr3 = xVar4.f14162a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = (byte) 0;
            bArr3[3] = (byte) (i10 & 255);
            bArr3[4] = (byte) ((i7 >> 24) & 255);
            bArr3[5] = (byte) ((i7 >> 16) & 255);
            bArr3[6] = (byte) ((i7 >> 8) & 255);
            bArr3[7] = (byte) (i7 & 255);
            j0Var.a(xVar4, 8, 1);
            return i12 + 9;
        }
        x xVar5 = sVar.f59596n;
        int H = xVar5.H();
        xVar5.O(-2);
        int i14 = (H * 6) + 2;
        if (i10 != 0) {
            xVar4.K(i14);
            byte[] bArr4 = xVar4.f14162a;
            xVar5.k(0, i14, bArr4);
            int i15 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i10;
            bArr4[2] = (byte) ((i15 >> 8) & 255);
            bArr4[3] = (byte) (i15 & 255);
        } else {
            xVar4 = xVar5;
        }
        j0Var.a(xVar4, i14, 1);
        return i12 + 1 + i14;
    }

    public final void e() {
        s sVar = this.f59496b;
        sVar.d = 0;
        sVar.f59598p = 0L;
        sVar.f59599q = false;
        sVar.f59593k = false;
        sVar.f59597o = false;
        sVar.f59595m = null;
        this.f59499f = 0;
        this.h = 0;
        this.f59500g = 0;
        this.f59501i = 0;
        this.f59505m = false;
    }
}
