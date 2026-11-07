package z3;

import e2.u;
import f3.j0;
import h2.m0;
import h2.x;
public final class g {
    public final j0 f59500a;
    public t d;
    public d f59503e;
    public int f59504f;
    public int f59505g;
    public int h;
    public int f59506i;
    public final u f59507j;
    public boolean f59510m;
    public final s f59501b = new s();
    public final x f59502c = new x();
    public final x f59508k = new x(1);
    public final x f59509l = new x();

    public g(j0 j0Var, t tVar, d dVar, u uVar) {
        this.f59500a = j0Var;
        this.d = tVar;
        this.f59503e = dVar;
        this.f59507j = uVar;
        this.d = tVar;
        this.f59503e = dVar;
        j0Var.g(uVar);
        e();
    }

    public final int a() {
        int i7;
        if (!this.f59510m) {
            i7 = this.d.f59610g[this.f59504f];
        } else if (this.f59501b.f59597j[this.f59504f]) {
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
        if (this.f59510m) {
            s sVar = this.f59501b;
            d dVar = sVar.f59590a;
            String str = m0.f14112a;
            int i7 = dVar.f59493a;
            r rVar = sVar.f59600m;
            if (rVar == null) {
                rVar = this.d.f59605a.f59585l[i7];
            }
            if (rVar != null && rVar.f59586a) {
                return rVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f59504f++;
        if (!this.f59510m) {
            return false;
        }
        int i7 = this.f59505g + 1;
        this.f59505g = i7;
        int[] iArr = this.f59501b.f59595g;
        int i10 = this.h;
        if (i7 != iArr[i10]) {
            return true;
        }
        this.h = i10 + 1;
        this.f59505g = 0;
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
        s sVar = this.f59501b;
        if (i12 != 0) {
            xVar = sVar.f59601n;
        } else {
            byte[] bArr = b10.f59589e;
            String str = m0.f14112a;
            int length = bArr.length;
            x xVar2 = this.f59509l;
            xVar2.L(length, bArr);
            i12 = bArr.length;
            xVar = xVar2;
        }
        int i13 = this.f59504f;
        if (sVar.f59598k && sVar.f59599l[i13]) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && i10 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        x xVar3 = this.f59508k;
        byte[] bArr2 = xVar3.f14162a;
        if (z10) {
            i11 = 128;
        } else {
            i11 = 0;
        }
        bArr2[0] = (byte) (i11 | i12);
        xVar3.N(0);
        j0 j0Var = this.f59500a;
        j0Var.a(xVar3, 1, 1);
        j0Var.a(xVar, i12, 1);
        if (!z10) {
            return i12 + 1;
        }
        x xVar4 = this.f59502c;
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
        x xVar5 = sVar.f59601n;
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
        s sVar = this.f59501b;
        sVar.d = 0;
        sVar.f59603p = 0L;
        sVar.f59604q = false;
        sVar.f59598k = false;
        sVar.f59602o = false;
        sVar.f59600m = null;
        this.f59504f = 0;
        this.h = 0;
        this.f59505g = 0;
        this.f59506i = 0;
        this.f59510m = false;
    }
}
