package w3;

import b2.w;
import c3.j0;
import e2.m0;
import e2.x;
public final class g {
    public final j0 f48487a;
    public t d;
    public d e;
    public int f48490f;
    public int f48491g;
    public int h;
    public int f48492i;
    public final w f48493j;
    public boolean f48496m;
    public final s f48488b = new s();
    public final x f48489c = new x();
    public final x f48494k = new x(1);
    public final x f48495l = new x();

    public g(j0 j0Var, t tVar, d dVar, w wVar) {
        this.f48487a = j0Var;
        this.d = tVar;
        this.e = dVar;
        this.f48493j = wVar;
        this.d = tVar;
        this.e = dVar;
        j0Var.b(wVar);
        e();
    }

    public final int a() {
        int i10;
        if (!this.f48496m) {
            i10 = this.d.f48588g[this.f48490f];
        } else if (this.f48488b.f48576j[this.f48490f]) {
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
        if (this.f48496m) {
            s sVar = this.f48488b;
            d dVar = sVar.f48570a;
            String str = m0.f8252a;
            int i10 = dVar.f48480a;
            r rVar = sVar.f48579m;
            if (rVar == null) {
                rVar = this.d.f48584a.f48566l[i10];
            }
            if (rVar != null && rVar.f48567a) {
                return rVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f48490f++;
        if (!this.f48496m) {
            return false;
        }
        int i10 = this.f48491g + 1;
        this.f48491g = i10;
        int[] iArr = this.f48488b.f48574g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.f48491g = 0;
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
        s sVar = this.f48488b;
        if (i13 != 0) {
            xVar = sVar.f48580n;
        } else {
            byte[] bArr = b10.e;
            String str = m0.f8252a;
            int length = bArr.length;
            x xVar2 = this.f48495l;
            xVar2.L(length, bArr);
            i13 = bArr.length;
            xVar = xVar2;
        }
        int i14 = this.f48490f;
        if (sVar.f48577k && sVar.f48578l[i14]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        x xVar3 = this.f48494k;
        byte[] bArr2 = xVar3.f8291a;
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        xVar3.N(0);
        j0 j0Var = this.f48487a;
        j0Var.g(xVar3, 1, 1);
        j0Var.g(xVar, i13, 1);
        if (!z11) {
            return i13 + 1;
        }
        x xVar4 = this.f48489c;
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
        x xVar5 = sVar.f48580n;
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
        s sVar = this.f48488b;
        sVar.d = 0;
        sVar.f48582p = 0L;
        sVar.f48583q = false;
        sVar.f48577k = false;
        sVar.f48581o = false;
        sVar.f48579m = null;
        this.f48490f = 0;
        this.h = 0;
        this.f48491g = 0;
        this.f48492i = 0;
        this.f48496m = false;
    }
}
