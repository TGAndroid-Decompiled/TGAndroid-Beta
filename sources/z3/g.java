package z3;

import e2.u;
import f3.i0;
import h2.l0;
import h2.x;
public final class g {
    public final i0 f60801a;
    public t d;
    public d f60804e;
    public int f60805f;
    public int f60806g;
    public int h;
    public int f60807i;
    public final u f60808j;
    public boolean f60811m;
    public final s f60802b = new s();
    public final x f60803c = new x();
    public final x f60809k = new x(1);
    public final x f60810l = new x();

    public g(i0 i0Var, t tVar, d dVar, u uVar) {
        this.f60801a = i0Var;
        this.d = tVar;
        this.f60804e = dVar;
        this.f60808j = uVar;
        this.d = tVar;
        this.f60804e = dVar;
        i0Var.g(uVar);
        e();
    }

    public final int a() {
        int i7;
        if (!this.f60811m) {
            i7 = this.d.f60911g[this.f60805f];
        } else if (this.f60802b.f60898j[this.f60805f]) {
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
        if (this.f60811m) {
            s sVar = this.f60802b;
            d dVar = sVar.f60891a;
            String str = l0.f13471a;
            int i7 = dVar.f60794a;
            r rVar = sVar.f60901m;
            if (rVar == null) {
                rVar = this.d.f60906a.f60886l[i7];
            }
            if (rVar != null && rVar.f60887a) {
                return rVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f60805f++;
        if (!this.f60811m) {
            return false;
        }
        int i7 = this.f60806g + 1;
        this.f60806g = i7;
        int[] iArr = this.f60802b.f60896g;
        int i10 = this.h;
        if (i7 != iArr[i10]) {
            return true;
        }
        this.h = i10 + 1;
        this.f60806g = 0;
        return false;
    }

    public final int d(int i7, int i10) {
        x xVar;
        boolean z10;
        boolean z11;
        int i11;
        r b10 = b();
        if (b10 == null) {
            return 0;
        }
        int i12 = b10.d;
        s sVar = this.f60802b;
        if (i12 != 0) {
            xVar = sVar.f60902n;
        } else {
            byte[] bArr = b10.f60890e;
            String str = l0.f13471a;
            int length = bArr.length;
            x xVar2 = this.f60810l;
            xVar2.L(length, bArr);
            i12 = bArr.length;
            xVar = xVar2;
        }
        int i13 = this.f60805f;
        if (sVar.f60899k && sVar.f60900l[i13]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i10 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        x xVar3 = this.f60809k;
        byte[] bArr2 = xVar3.f13521a;
        if (z11) {
            i11 = 128;
        } else {
            i11 = 0;
        }
        bArr2[0] = (byte) (i11 | i12);
        xVar3.N(0);
        i0 i0Var = this.f60801a;
        i0Var.a(xVar3, 1, 1);
        i0Var.a(xVar, i12, 1);
        if (!z11) {
            return i12 + 1;
        }
        x xVar4 = this.f60803c;
        if (!z10) {
            xVar4.K(8);
            byte[] bArr3 = xVar4.f13521a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = (byte) 0;
            bArr3[3] = (byte) (i10 & 255);
            bArr3[4] = (byte) ((i7 >> 24) & 255);
            bArr3[5] = (byte) ((i7 >> 16) & 255);
            bArr3[6] = (byte) ((i7 >> 8) & 255);
            bArr3[7] = (byte) (i7 & 255);
            i0Var.a(xVar4, 8, 1);
            return i12 + 9;
        }
        x xVar5 = sVar.f60902n;
        int H = xVar5.H();
        xVar5.O(-2);
        int i14 = (H * 6) + 2;
        if (i10 != 0) {
            xVar4.K(i14);
            byte[] bArr4 = xVar4.f13521a;
            xVar5.k(0, i14, bArr4);
            int i15 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i10;
            bArr4[2] = (byte) ((i15 >> 8) & 255);
            bArr4[3] = (byte) (i15 & 255);
        } else {
            xVar4 = xVar5;
        }
        i0Var.a(xVar4, i14, 1);
        return i12 + 1 + i14;
    }

    public final void e() {
        s sVar = this.f60802b;
        sVar.d = 0;
        sVar.f60904p = 0L;
        sVar.f60905q = false;
        sVar.f60899k = false;
        sVar.f60903o = false;
        sVar.f60901m = null;
        this.f60805f = 0;
        this.h = 0;
        this.f60806g = 0;
        this.f60807i = 0;
        this.f60811m = false;
    }
}
