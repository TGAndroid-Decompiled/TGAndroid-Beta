package z3;

import e2.u;
import f3.i0;
import h2.l0;
import h2.x;
public final class g {
    public final i0 f61407a;
    public t d;
    public d f61410e;
    public int f61411f;
    public int f61412g;
    public int h;
    public int f61413i;
    public final u f61414j;
    public boolean f61417m;
    public final s f61408b = new s();
    public final x f61409c = new x();
    public final x f61415k = new x(1);
    public final x f61416l = new x();

    public g(i0 i0Var, t tVar, d dVar, u uVar) {
        this.f61407a = i0Var;
        this.d = tVar;
        this.f61410e = dVar;
        this.f61414j = uVar;
        this.d = tVar;
        this.f61410e = dVar;
        i0Var.g(uVar);
        e();
    }

    public final int a() {
        int i7;
        if (!this.f61417m) {
            i7 = this.d.f61517g[this.f61411f];
        } else if (this.f61408b.f61504j[this.f61411f]) {
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
        if (this.f61417m) {
            s sVar = this.f61408b;
            d dVar = sVar.f61497a;
            String str = l0.f13812a;
            int i7 = dVar.f61400a;
            r rVar = sVar.f61507m;
            if (rVar == null) {
                rVar = this.d.f61512a.f61492l[i7];
            }
            if (rVar != null && rVar.f61493a) {
                return rVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f61411f++;
        if (!this.f61417m) {
            return false;
        }
        int i7 = this.f61412g + 1;
        this.f61412g = i7;
        int[] iArr = this.f61408b.f61502g;
        int i10 = this.h;
        if (i7 != iArr[i10]) {
            return true;
        }
        this.h = i10 + 1;
        this.f61412g = 0;
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
        s sVar = this.f61408b;
        if (i12 != 0) {
            xVar = sVar.f61508n;
        } else {
            byte[] bArr = b10.f61496e;
            String str = l0.f13812a;
            int length = bArr.length;
            x xVar2 = this.f61416l;
            xVar2.L(length, bArr);
            i12 = bArr.length;
            xVar = xVar2;
        }
        int i13 = this.f61411f;
        if (sVar.f61505k && sVar.f61506l[i13]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i10 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        x xVar3 = this.f61415k;
        byte[] bArr2 = xVar3.f13862a;
        if (z11) {
            i11 = 128;
        } else {
            i11 = 0;
        }
        bArr2[0] = (byte) (i11 | i12);
        xVar3.N(0);
        i0 i0Var = this.f61407a;
        i0Var.a(xVar3, 1, 1);
        i0Var.a(xVar, i12, 1);
        if (!z11) {
            return i12 + 1;
        }
        x xVar4 = this.f61409c;
        if (!z10) {
            xVar4.K(8);
            byte[] bArr3 = xVar4.f13862a;
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
        x xVar5 = sVar.f61508n;
        int H = xVar5.H();
        xVar5.O(-2);
        int i14 = (H * 6) + 2;
        if (i10 != 0) {
            xVar4.K(i14);
            byte[] bArr4 = xVar4.f13862a;
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
        s sVar = this.f61408b;
        sVar.d = 0;
        sVar.f61510p = 0L;
        sVar.f61511q = false;
        sVar.f61505k = false;
        sVar.f61509o = false;
        sVar.f61507m = null;
        this.f61411f = 0;
        this.h = 0;
        this.f61412g = 0;
        this.f61413i = 0;
        this.f61417m = false;
    }
}
