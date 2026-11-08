package z3;

import f3.j0;
import h2.m0;
import h2.x;
public final class g {
    public final j0 f59593a;
    public u d;
    public d f59596e;
    public int f59597f;
    public int f59598g;
    public int h;
    public int f59599i;
    public final e2.u f59600j;
    public boolean f59603m;
    public final t f59594b = new t();
    public final x f59595c = new x();
    public final x f59601k = new x(1);
    public final x f59602l = new x();

    public g(j0 j0Var, u uVar, d dVar, e2.u uVar2) {
        this.f59593a = j0Var;
        this.d = uVar;
        this.f59596e = dVar;
        this.f59600j = uVar2;
        this.d = uVar;
        this.f59596e = dVar;
        j0Var.g(uVar2);
        e();
    }

    public final int a() {
        int i7;
        if (!this.f59603m) {
            i7 = this.d.f59704g[this.f59597f];
        } else if (this.f59594b.f59691j[this.f59597f]) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (b() != null) {
            return i7 | 1073741824;
        }
        return i7;
    }

    public final s b() {
        if (this.f59603m) {
            t tVar = this.f59594b;
            d dVar = tVar.f59684a;
            String str = m0.f14112a;
            int i7 = dVar.f59586a;
            s sVar = tVar.f59694m;
            if (sVar == null) {
                sVar = this.d.f59699a.f59679l[i7];
            }
            if (sVar != null && sVar.f59680a) {
                return sVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f59597f++;
        if (!this.f59603m) {
            return false;
        }
        int i7 = this.f59598g + 1;
        this.f59598g = i7;
        int[] iArr = this.f59594b.f59689g;
        int i10 = this.h;
        if (i7 != iArr[i10]) {
            return true;
        }
        this.h = i10 + 1;
        this.f59598g = 0;
        return false;
    }

    public final int d(int i7, int i10) {
        x xVar;
        boolean z9;
        boolean z10;
        int i11;
        s b10 = b();
        if (b10 == null) {
            return 0;
        }
        int i12 = b10.d;
        t tVar = this.f59594b;
        if (i12 != 0) {
            xVar = tVar.f59695n;
        } else {
            byte[] bArr = b10.f59683e;
            String str = m0.f14112a;
            int length = bArr.length;
            x xVar2 = this.f59602l;
            xVar2.L(length, bArr);
            i12 = bArr.length;
            xVar = xVar2;
        }
        int i13 = this.f59597f;
        if (tVar.f59692k && tVar.f59693l[i13]) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && i10 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        x xVar3 = this.f59601k;
        byte[] bArr2 = xVar3.f14162a;
        if (z10) {
            i11 = 128;
        } else {
            i11 = 0;
        }
        bArr2[0] = (byte) (i11 | i12);
        xVar3.N(0);
        j0 j0Var = this.f59593a;
        j0Var.a(xVar3, 1, 1);
        j0Var.a(xVar, i12, 1);
        if (!z10) {
            return i12 + 1;
        }
        x xVar4 = this.f59595c;
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
        x xVar5 = tVar.f59695n;
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
        t tVar = this.f59594b;
        tVar.d = 0;
        tVar.f59697p = 0L;
        tVar.f59698q = false;
        tVar.f59692k = false;
        tVar.f59696o = false;
        tVar.f59694m = null;
        this.f59597f = 0;
        this.h = 0;
        this.f59598g = 0;
        this.f59599i = 0;
        this.f59603m = false;
    }
}
