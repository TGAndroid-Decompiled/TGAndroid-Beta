package w3;

import b2.x;
import c3.j0;
import e2.n0;
public final class g {
    public final j0 f50668a;
    public t d;
    public d e;
    public int f50671f;
    public int f50672g;
    public int h;
    public int f50673i;
    public final x f50674j;
    public boolean f50677m;
    public final s f50669b = new s();
    public final e2.x f50670c = new e2.x();
    public final e2.x f50675k = new e2.x(1);
    public final e2.x f50676l = new e2.x();

    public g(j0 j0Var, t tVar, d dVar, x xVar) {
        this.f50668a = j0Var;
        this.d = tVar;
        this.e = dVar;
        this.f50674j = xVar;
        this.d = tVar;
        this.e = dVar;
        j0Var.b(xVar);
        e();
    }

    public final int a() {
        int i10;
        if (!this.f50677m) {
            i10 = this.d.f50769g[this.f50671f];
        } else if (this.f50669b.f50757j[this.f50671f]) {
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
        if (this.f50677m) {
            s sVar = this.f50669b;
            d dVar = sVar.f50751a;
            String str = n0.f9692a;
            int i10 = dVar.f50661a;
            r rVar = sVar.f50760m;
            if (rVar == null) {
                rVar = this.d.f50765a.f50747l[i10];
            }
            if (rVar != null && rVar.f50748a) {
                return rVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f50671f++;
        if (!this.f50677m) {
            return false;
        }
        int i10 = this.f50672g + 1;
        this.f50672g = i10;
        int[] iArr = this.f50669b.f50755g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.f50672g = 0;
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
        s sVar = this.f50669b;
        if (i13 != 0) {
            xVar = sVar.f50761n;
        } else {
            byte[] bArr = b10.e;
            String str = n0.f9692a;
            int length = bArr.length;
            e2.x xVar2 = this.f50676l;
            xVar2.L(length, bArr);
            i13 = bArr.length;
            xVar = xVar2;
        }
        int i14 = this.f50671f;
        if (sVar.f50758k && sVar.f50759l[i14]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        e2.x xVar3 = this.f50675k;
        byte[] bArr2 = xVar3.f9732a;
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        xVar3.N(0);
        j0 j0Var = this.f50668a;
        j0Var.g(xVar3, 1, 1);
        j0Var.g(xVar, i13, 1);
        if (!z11) {
            return i13 + 1;
        }
        e2.x xVar4 = this.f50670c;
        if (!z10) {
            xVar4.K(8);
            byte[] bArr3 = xVar4.f9732a;
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
        e2.x xVar5 = sVar.f50761n;
        int H = xVar5.H();
        xVar5.O(-2);
        int i15 = (H * 6) + 2;
        if (i11 != 0) {
            xVar4.K(i15);
            byte[] bArr4 = xVar4.f9732a;
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
        s sVar = this.f50669b;
        sVar.d = 0;
        sVar.f50763p = 0L;
        sVar.f50764q = false;
        sVar.f50758k = false;
        sVar.f50762o = false;
        sVar.f50760m = null;
        this.f50671f = 0;
        this.h = 0;
        this.f50672g = 0;
        this.f50673i = 0;
        this.f50677m = false;
    }
}
