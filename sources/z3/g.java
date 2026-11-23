package z3;

import e2.u;
import f3.j0;
import h2.l0;
import h2.x;
public final class g {
    public final j0 f61495a;
    public t d;
    public d f61498e;
    public int f61499f;
    public int f61500g;
    public int h;
    public int f61501i;
    public final u f61502j;
    public boolean f61505m;
    public final s f61496b = new s();
    public final x f61497c = new x();
    public final x f61503k = new x(1);
    public final x f61504l = new x();

    public g(j0 j0Var, t tVar, d dVar, u uVar) {
        this.f61495a = j0Var;
        this.d = tVar;
        this.f61498e = dVar;
        this.f61502j = uVar;
        this.d = tVar;
        this.f61498e = dVar;
        j0Var.g(uVar);
        e();
    }

    public final int a() {
        int i7;
        if (!this.f61505m) {
            i7 = this.d.f61605g[this.f61499f];
        } else if (this.f61496b.f61592j[this.f61499f]) {
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
        if (this.f61505m) {
            s sVar = this.f61496b;
            d dVar = sVar.f61585a;
            String str = l0.f13778a;
            int i7 = dVar.f61488a;
            r rVar = sVar.f61595m;
            if (rVar == null) {
                rVar = this.d.f61600a.f61580l[i7];
            }
            if (rVar != null && rVar.f61581a) {
                return rVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f61499f++;
        if (!this.f61505m) {
            return false;
        }
        int i7 = this.f61500g + 1;
        this.f61500g = i7;
        int[] iArr = this.f61496b.f61590g;
        int i10 = this.h;
        if (i7 != iArr[i10]) {
            return true;
        }
        this.h = i10 + 1;
        this.f61500g = 0;
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
        s sVar = this.f61496b;
        if (i12 != 0) {
            xVar = sVar.f61596n;
        } else {
            byte[] bArr = b10.f61584e;
            String str = l0.f13778a;
            int length = bArr.length;
            x xVar2 = this.f61504l;
            xVar2.L(length, bArr);
            i12 = bArr.length;
            xVar = xVar2;
        }
        int i13 = this.f61499f;
        if (sVar.f61593k && sVar.f61594l[i13]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i10 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        x xVar3 = this.f61503k;
        byte[] bArr2 = xVar3.f13828a;
        if (z11) {
            i11 = 128;
        } else {
            i11 = 0;
        }
        bArr2[0] = (byte) (i11 | i12);
        xVar3.N(0);
        j0 j0Var = this.f61495a;
        j0Var.a(xVar3, 1, 1);
        j0Var.a(xVar, i12, 1);
        if (!z11) {
            return i12 + 1;
        }
        x xVar4 = this.f61497c;
        if (!z10) {
            xVar4.K(8);
            byte[] bArr3 = xVar4.f13828a;
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
        x xVar5 = sVar.f61596n;
        int H = xVar5.H();
        xVar5.O(-2);
        int i14 = (H * 6) + 2;
        if (i10 != 0) {
            xVar4.K(i14);
            byte[] bArr4 = xVar4.f13828a;
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
        s sVar = this.f61496b;
        sVar.d = 0;
        sVar.f61598p = 0L;
        sVar.f61599q = false;
        sVar.f61593k = false;
        sVar.f61597o = false;
        sVar.f61595m = null;
        this.f61499f = 0;
        this.h = 0;
        this.f61500g = 0;
        this.f61501i = 0;
        this.f61505m = false;
    }
}
