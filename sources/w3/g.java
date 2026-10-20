package w3;

import b2.w;
import c3.j0;
import e2.m0;
import e2.x;
public final class g {
    public final j0 f48483a;
    public t d;
    public d e;
    public int f48486f;
    public int f48487g;
    public int h;
    public int f48488i;
    public final w f48489j;
    public boolean f48492m;
    public final s f48484b = new s();
    public final x f48485c = new x();
    public final x f48490k = new x(1);
    public final x f48491l = new x();

    public g(j0 j0Var, t tVar, d dVar, w wVar) {
        this.f48483a = j0Var;
        this.d = tVar;
        this.e = dVar;
        this.f48489j = wVar;
        this.d = tVar;
        this.e = dVar;
        j0Var.b(wVar);
        e();
    }

    public final int a() {
        int i10;
        if (!this.f48492m) {
            i10 = this.d.f48584g[this.f48486f];
        } else if (this.f48484b.f48572j[this.f48486f]) {
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
        if (this.f48492m) {
            s sVar = this.f48484b;
            d dVar = sVar.f48566a;
            String str = m0.f8252a;
            int i10 = dVar.f48476a;
            r rVar = sVar.f48575m;
            if (rVar == null) {
                rVar = this.d.f48580a.f48562l[i10];
            }
            if (rVar != null && rVar.f48563a) {
                return rVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f48486f++;
        if (!this.f48492m) {
            return false;
        }
        int i10 = this.f48487g + 1;
        this.f48487g = i10;
        int[] iArr = this.f48484b.f48570g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.f48487g = 0;
        return false;
    }

    public final int d(int i10, int i11) {
        x xVar;
        boolean z10;
        boolean z11;
        int i12;
        r b10 = b();
        if (b10 == null) {
            return 0;
        }
        int i13 = b10.d;
        s sVar = this.f48484b;
        if (i13 != 0) {
            xVar = sVar.f48576n;
        } else {
            byte[] bArr = b10.e;
            String str = m0.f8252a;
            int length = bArr.length;
            x xVar2 = this.f48491l;
            xVar2.L(length, bArr);
            i13 = bArr.length;
            xVar = xVar2;
        }
        int i14 = this.f48486f;
        if (sVar.f48573k && sVar.f48574l[i14]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        x xVar3 = this.f48490k;
        byte[] bArr2 = xVar3.f8291a;
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        xVar3.N(0);
        j0 j0Var = this.f48483a;
        j0Var.g(xVar3, 1, 1);
        j0Var.g(xVar, i13, 1);
        if (!z11) {
            return i13 + 1;
        }
        x xVar4 = this.f48485c;
        if (!z10) {
            xVar4.K(8);
            byte[] bArr3 = xVar4.f8291a;
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
        x xVar5 = sVar.f48576n;
        int H = xVar5.H();
        xVar5.O(-2);
        int i15 = (H * 6) + 2;
        if (i11 != 0) {
            xVar4.K(i15);
            byte[] bArr4 = xVar4.f8291a;
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
        s sVar = this.f48484b;
        sVar.d = 0;
        sVar.f48578p = 0L;
        sVar.f48579q = false;
        sVar.f48573k = false;
        sVar.f48577o = false;
        sVar.f48575m = null;
        this.f48486f = 0;
        this.h = 0;
        this.f48487g = 0;
        this.f48488i = 0;
        this.f48492m = false;
    }
}
