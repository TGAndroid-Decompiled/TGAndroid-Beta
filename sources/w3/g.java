package w3;

import b2.x;
import c3.j0;
import e2.n0;
public final class g {
    public final j0 f50729a;
    public t d;
    public d e;
    public int f50732f;
    public int f50733g;
    public int h;
    public int f50734i;
    public final x f50735j;
    public boolean f50738m;
    public final s f50730b = new s();
    public final e2.x f50731c = new e2.x();
    public final e2.x f50736k = new e2.x(1);
    public final e2.x f50737l = new e2.x();

    public g(j0 j0Var, t tVar, d dVar, x xVar) {
        this.f50729a = j0Var;
        this.d = tVar;
        this.e = dVar;
        this.f50735j = xVar;
        this.d = tVar;
        this.e = dVar;
        j0Var.b(xVar);
        e();
    }

    public final int a() {
        int i10;
        if (!this.f50738m) {
            i10 = this.d.f50830g[this.f50732f];
        } else if (this.f50730b.f50818j[this.f50732f]) {
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
        if (this.f50738m) {
            s sVar = this.f50730b;
            d dVar = sVar.f50812a;
            String str = n0.f9691a;
            int i10 = dVar.f50722a;
            r rVar = sVar.f50821m;
            if (rVar == null) {
                rVar = this.d.f50826a.f50808l[i10];
            }
            if (rVar != null && rVar.f50809a) {
                return rVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f50732f++;
        if (!this.f50738m) {
            return false;
        }
        int i10 = this.f50733g + 1;
        this.f50733g = i10;
        int[] iArr = this.f50730b.f50816g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.f50733g = 0;
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
        s sVar = this.f50730b;
        if (i13 != 0) {
            xVar = sVar.f50822n;
        } else {
            byte[] bArr = b10.e;
            String str = n0.f9691a;
            int length = bArr.length;
            e2.x xVar2 = this.f50737l;
            xVar2.L(length, bArr);
            i13 = bArr.length;
            xVar = xVar2;
        }
        int i14 = this.f50732f;
        if (sVar.f50819k && sVar.f50820l[i14]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        e2.x xVar3 = this.f50736k;
        byte[] bArr2 = xVar3.f9731a;
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        xVar3.N(0);
        j0 j0Var = this.f50729a;
        j0Var.g(xVar3, 1, 1);
        j0Var.g(xVar, i13, 1);
        if (!z11) {
            return i13 + 1;
        }
        e2.x xVar4 = this.f50731c;
        if (!z10) {
            xVar4.K(8);
            byte[] bArr3 = xVar4.f9731a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = (byte) 0;
            bArr3[3] = (byte) (i11 & 255);
            bArr3[4] = (byte) ((i10 >> 24) & 255);
            bArr3[5] = (byte) ((i10 >> 16) & 255);
            bArr3[6] = (byte) ((i10 >> 8) & 255);
            bArr3[7] = (byte) (i10 & 255);
            j0Var.g(xVar4, 8, 1);
            return i13 + 9;
        }
        e2.x xVar5 = sVar.f50822n;
        int H = xVar5.H();
        xVar5.O(-2);
        int i15 = (H * 6) + 2;
        if (i11 != 0) {
            xVar4.K(i15);
            byte[] bArr4 = xVar4.f9731a;
            xVar5.k(0, i15, bArr4);
            int i16 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i11;
            bArr4[2] = (byte) ((i16 >> 8) & 255);
            bArr4[3] = (byte) (i16 & 255);
        } else {
            xVar4 = xVar5;
        }
        j0Var.g(xVar4, i15, 1);
        return i13 + 1 + i15;
    }

    public final void e() {
        s sVar = this.f50730b;
        sVar.d = 0;
        sVar.f50824p = 0L;
        sVar.f50825q = false;
        sVar.f50819k = false;
        sVar.f50823o = false;
        sVar.f50821m = null;
        this.f50732f = 0;
        this.h = 0;
        this.f50733g = 0;
        this.f50734i = 0;
        this.f50738m = false;
    }
}
