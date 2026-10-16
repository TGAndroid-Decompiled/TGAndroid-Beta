package w3;

import b2.x;
import c3.i0;
import e2.m0;
public final class g {
    public final i0 f47091a;
    public t d;
    public d e;
    public int f47094f;
    public int f47095g;
    public int h;
    public int f47096i;
    public final x f47097j;
    public boolean f47100m;
    public final s f47092b = new s();
    public final e2.x f47093c = new e2.x();
    public final e2.x f47098k = new e2.x(1);
    public final e2.x f47099l = new e2.x();

    public g(i0 i0Var, t tVar, d dVar, x xVar) {
        this.f47091a = i0Var;
        this.d = tVar;
        this.e = dVar;
        this.f47097j = xVar;
        this.d = tVar;
        this.e = dVar;
        i0Var.b(xVar);
        e();
    }

    public final int a() {
        int i10;
        if (!this.f47100m) {
            i10 = this.d.f47192g[this.f47094f];
        } else if (this.f47092b.f47180j[this.f47094f]) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (b() != null) {
            return i10 | 1073741824;
        }
        return i10;
    }

    public final r b() {
        if (this.f47100m) {
            s sVar = this.f47092b;
            d dVar = sVar.f47174a;
            String str = m0.f8375a;
            int i10 = dVar.f47084a;
            r rVar = sVar.f47183m;
            if (rVar == null) {
                rVar = this.d.f47188a.f47170l[i10];
            }
            if (rVar != null && rVar.f47171a) {
                return rVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f47094f++;
        if (!this.f47100m) {
            return false;
        }
        int i10 = this.f47095g + 1;
        this.f47095g = i10;
        int[] iArr = this.f47092b.f47178g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.f47095g = 0;
        return false;
    }

    public final int d(int i10, int i11) {
        e2.x xVar;
        boolean z10;
        boolean z11;
        int i12;
        r b10 = b();
        if (b10 == null) {
            return 0;
        }
        int i13 = b10.d;
        s sVar = this.f47092b;
        if (i13 != 0) {
            xVar = sVar.f47184n;
        } else {
            byte[] bArr = b10.e;
            String str = m0.f8375a;
            int length = bArr.length;
            e2.x xVar2 = this.f47099l;
            xVar2.L(length, bArr);
            i13 = bArr.length;
            xVar = xVar2;
        }
        int i14 = this.f47094f;
        if (sVar.f47181k && sVar.f47182l[i14]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        e2.x xVar3 = this.f47098k;
        byte[] bArr2 = xVar3.f8414a;
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        xVar3.N(0);
        i0 i0Var = this.f47091a;
        i0Var.g(xVar3, 1, 1);
        i0Var.g(xVar, i13, 1);
        if (!z11) {
            return i13 + 1;
        }
        e2.x xVar4 = this.f47093c;
        if (!z10) {
            xVar4.K(8);
            byte[] bArr3 = xVar4.f8414a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = (byte) 0;
            bArr3[3] = (byte) (i11 & 255);
            bArr3[4] = (byte) ((i10 >> 24) & 255);
            bArr3[5] = (byte) ((i10 >> 16) & 255);
            bArr3[6] = (byte) ((i10 >> 8) & 255);
            bArr3[7] = (byte) (i10 & 255);
            i0Var.g(xVar4, 8, 1);
            return i13 + 9;
        }
        e2.x xVar5 = sVar.f47184n;
        int H = xVar5.H();
        xVar5.O(-2);
        int i15 = (H * 6) + 2;
        if (i11 != 0) {
            xVar4.K(i15);
            byte[] bArr4 = xVar4.f8414a;
            xVar5.k(0, i15, bArr4);
            int i16 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i11;
            bArr4[2] = (byte) ((i16 >> 8) & 255);
            bArr4[3] = (byte) (i16 & 255);
        } else {
            xVar4 = xVar5;
        }
        i0Var.g(xVar4, i15, 1);
        return i13 + 1 + i15;
    }

    public final void e() {
        s sVar = this.f47092b;
        sVar.d = 0;
        sVar.f47186p = 0L;
        sVar.f47187q = false;
        sVar.f47181k = false;
        sVar.f47185o = false;
        sVar.f47183m = null;
        this.f47094f = 0;
        this.h = 0;
        this.f47095g = 0;
        this.f47096i = 0;
        this.f47100m = false;
    }
}
