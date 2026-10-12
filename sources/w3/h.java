package w3;

import b2.x;
import c3.i0;
import e2.m0;
public final class h {
    public final i0 f47092a;
    public u d;
    public e e;
    public int f47095f;
    public int f47096g;
    public int h;
    public int f47097i;
    public final x f47098j;
    public boolean f47101m;
    public final t f47093b = new t();
    public final e2.x f47094c = new e2.x();
    public final e2.x f47099k = new e2.x(1);
    public final e2.x f47100l = new e2.x();

    public h(i0 i0Var, u uVar, e eVar, x xVar) {
        this.f47092a = i0Var;
        this.d = uVar;
        this.e = eVar;
        this.f47098j = xVar;
        this.d = uVar;
        this.e = eVar;
        i0Var.b(xVar);
        e();
    }

    public final int a() {
        int i10;
        if (!this.f47101m) {
            i10 = this.d.f47193g[this.f47095f];
        } else if (this.f47093b.f47181j[this.f47095f]) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (b() != null) {
            return i10 | 1073741824;
        }
        return i10;
    }

    public final s b() {
        if (this.f47101m) {
            t tVar = this.f47093b;
            e eVar = tVar.f47175a;
            String str = m0.f8372a;
            int i10 = eVar.f47085a;
            s sVar = tVar.f47184m;
            if (sVar == null) {
                sVar = this.d.f47189a.f47171l[i10];
            }
            if (sVar != null && sVar.f47172a) {
                return sVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f47095f++;
        if (!this.f47101m) {
            return false;
        }
        int i10 = this.f47096g + 1;
        this.f47096g = i10;
        int[] iArr = this.f47093b.f47179g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.f47096g = 0;
        return false;
    }

    public final int d(int i10, int i11) {
        e2.x xVar;
        boolean z10;
        boolean z11;
        int i12;
        s b10 = b();
        if (b10 == null) {
            return 0;
        }
        int i13 = b10.d;
        t tVar = this.f47093b;
        if (i13 != 0) {
            xVar = tVar.f47185n;
        } else {
            byte[] bArr = b10.e;
            String str = m0.f8372a;
            int length = bArr.length;
            e2.x xVar2 = this.f47100l;
            xVar2.L(length, bArr);
            i13 = bArr.length;
            xVar = xVar2;
        }
        int i14 = this.f47095f;
        if (tVar.f47182k && tVar.f47183l[i14]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        e2.x xVar3 = this.f47099k;
        byte[] bArr2 = xVar3.f8411a;
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        xVar3.N(0);
        i0 i0Var = this.f47092a;
        i0Var.g(xVar3, 1, 1);
        i0Var.g(xVar, i13, 1);
        if (!z11) {
            return i13 + 1;
        }
        e2.x xVar4 = this.f47094c;
        if (!z10) {
            xVar4.K(8);
            byte[] bArr3 = xVar4.f8411a;
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
        e2.x xVar5 = tVar.f47185n;
        int H = xVar5.H();
        xVar5.O(-2);
        int i15 = (H * 6) + 2;
        if (i11 != 0) {
            xVar4.K(i15);
            byte[] bArr4 = xVar4.f8411a;
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
        t tVar = this.f47093b;
        tVar.d = 0;
        tVar.f47187p = 0L;
        tVar.f47188q = false;
        tVar.f47182k = false;
        tVar.f47186o = false;
        tVar.f47184m = null;
        this.f47095f = 0;
        this.h = 0;
        this.f47096g = 0;
        this.f47097i = 0;
        this.f47101m = false;
    }
}
