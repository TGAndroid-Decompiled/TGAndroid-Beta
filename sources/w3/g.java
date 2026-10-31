package w3;

import b2.x;
import c3.k0;
import e2.l0;
public final class g {
    public final k0 f52350a;
    public t d;
    public d e;
    public int f52353f;
    public int f52354g;
    public int h;
    public int f52355i;
    public final x f52356j;
    public boolean f52359m;
    public final s f52351b = new s();
    public final e2.x f52352c = new e2.x();
    public final e2.x f52357k = new e2.x(1);
    public final e2.x f52358l = new e2.x();

    public g(k0 k0Var, t tVar, d dVar, x xVar) {
        this.f52350a = k0Var;
        this.d = tVar;
        this.e = dVar;
        this.f52356j = xVar;
        this.d = tVar;
        this.e = dVar;
        k0Var.b(xVar);
        e();
    }

    public final int a() {
        int i10;
        if (!this.f52359m) {
            i10 = this.d.f52451g[this.f52353f];
        } else if (this.f52351b.f52439j[this.f52353f]) {
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
        if (this.f52359m) {
            s sVar = this.f52351b;
            d dVar = sVar.f52433a;
            String str = l0.f6165a;
            int i10 = dVar.f52343a;
            r rVar = sVar.f52442m;
            if (rVar == null) {
                rVar = this.d.f52447a.f52429l[i10];
            }
            if (rVar != null && rVar.f52430a) {
                return rVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f52353f++;
        if (!this.f52359m) {
            return false;
        }
        int i10 = this.f52354g + 1;
        this.f52354g = i10;
        int[] iArr = this.f52351b.f52437g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.f52354g = 0;
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
        s sVar = this.f52351b;
        if (i13 != 0) {
            xVar = sVar.f52443n;
        } else {
            byte[] bArr = b10.e;
            String str = l0.f6165a;
            int length = bArr.length;
            e2.x xVar2 = this.f52358l;
            xVar2.L(length, bArr);
            i13 = bArr.length;
            xVar = xVar2;
        }
        int i14 = this.f52353f;
        if (sVar.f52440k && sVar.f52441l[i14]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        e2.x xVar3 = this.f52357k;
        byte[] bArr2 = xVar3.f6207a;
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        xVar3.N(0);
        k0 k0Var = this.f52350a;
        k0Var.g(xVar3, 1, 1);
        k0Var.g(xVar, i13, 1);
        if (!z11) {
            return i13 + 1;
        }
        e2.x xVar4 = this.f52352c;
        if (!z10) {
            xVar4.K(8);
            byte[] bArr3 = xVar4.f6207a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = (byte) 0;
            bArr3[3] = (byte) (i11 & 255);
            bArr3[4] = (byte) ((i10 >> 24) & 255);
            bArr3[5] = (byte) ((i10 >> 16) & 255);
            bArr3[6] = (byte) ((i10 >> 8) & 255);
            bArr3[7] = (byte) (i10 & 255);
            k0Var.g(xVar4, 8, 1);
            return i13 + 9;
        }
        e2.x xVar5 = sVar.f52443n;
        int H = xVar5.H();
        xVar5.O(-2);
        int i15 = (H * 6) + 2;
        if (i11 != 0) {
            xVar4.K(i15);
            byte[] bArr4 = xVar4.f6207a;
            xVar5.k(0, i15, bArr4);
            int i16 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i11;
            bArr4[2] = (byte) ((i16 >> 8) & 255);
            bArr4[3] = (byte) (i16 & 255);
        } else {
            xVar4 = xVar5;
        }
        k0Var.g(xVar4, i15, 1);
        return i13 + 1 + i15;
    }

    public final void e() {
        s sVar = this.f52351b;
        sVar.d = 0;
        sVar.f52445p = 0L;
        sVar.f52446q = false;
        sVar.f52440k = false;
        sVar.f52444o = false;
        sVar.f52442m = null;
        this.f52353f = 0;
        this.h = 0;
        this.f52354g = 0;
        this.f52355i = 0;
        this.f52359m = false;
    }
}
