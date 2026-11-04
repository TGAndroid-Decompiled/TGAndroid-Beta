package y3;

import d2.v;
import e3.i0;
import g2.n0;
import g2.y;
public final class h {
    public final i0 f58918a;
    public u d;
    public e f58921e;
    public int f58922f;
    public int f58923g;
    public int h;
    public int f58924i;
    public final v f58925j;
    public boolean f58928m;
    public final t f58919b = new t();
    public final y f58920c = new y();
    public final y f58926k = new y(1);
    public final y f58927l = new y();

    public h(i0 i0Var, u uVar, e eVar, v vVar) {
        this.f58918a = i0Var;
        this.d = uVar;
        this.f58921e = eVar;
        this.f58925j = vVar;
        this.d = uVar;
        this.f58921e = eVar;
        i0Var.g(vVar);
        e();
    }

    public final int a() {
        int i3;
        if (!this.f58928m) {
            i3 = this.d.f59028g[this.f58922f];
        } else if (this.f58919b.f59015j[this.f58922f]) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (b() != null) {
            return i3 | 1073741824;
        }
        return i3;
    }

    public final s b() {
        if (this.f58928m) {
            t tVar = this.f58919b;
            e eVar = tVar.f59008a;
            String str = n0.f11873a;
            int i3 = eVar.f58911a;
            s sVar = tVar.f59018m;
            if (sVar == null) {
                sVar = this.d.f59023a.f59003l[i3];
            }
            if (sVar != null && sVar.f59004a) {
                return sVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f58922f++;
        if (!this.f58928m) {
            return false;
        }
        int i3 = this.f58923g + 1;
        this.f58923g = i3;
        int[] iArr = this.f58919b.f59013g;
        int i10 = this.h;
        if (i3 != iArr[i10]) {
            return true;
        }
        this.h = i10 + 1;
        this.f58923g = 0;
        return false;
    }

    public final int d(int i3, int i10) {
        y yVar;
        boolean z10;
        boolean z11;
        int i11;
        s b10 = b();
        if (b10 == null) {
            return 0;
        }
        int i12 = b10.d;
        t tVar = this.f58919b;
        if (i12 != 0) {
            yVar = tVar.f59019n;
        } else {
            byte[] bArr = b10.f59007e;
            String str = n0.f11873a;
            int length = bArr.length;
            y yVar2 = this.f58927l;
            yVar2.L(length, bArr);
            i12 = bArr.length;
            yVar = yVar2;
        }
        int i13 = this.f58922f;
        if (tVar.f59016k && tVar.f59017l[i13]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i10 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        y yVar3 = this.f58926k;
        byte[] bArr2 = yVar3.f11923a;
        if (z11) {
            i11 = 128;
        } else {
            i11 = 0;
        }
        bArr2[0] = (byte) (i11 | i12);
        yVar3.N(0);
        i0 i0Var = this.f58918a;
        i0Var.f(yVar3, 1, 1);
        i0Var.f(yVar, i12, 1);
        if (!z11) {
            return i12 + 1;
        }
        y yVar4 = this.f58920c;
        if (!z10) {
            yVar4.K(8);
            byte[] bArr3 = yVar4.f11923a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = (byte) 0;
            bArr3[3] = (byte) (i10 & 255);
            bArr3[4] = (byte) ((i3 >> 24) & 255);
            bArr3[5] = (byte) ((i3 >> 16) & 255);
            bArr3[6] = (byte) ((i3 >> 8) & 255);
            bArr3[7] = (byte) (i3 & 255);
            i0Var.f(yVar4, 8, 1);
            return i12 + 9;
        }
        y yVar5 = tVar.f59019n;
        int H = yVar5.H();
        yVar5.O(-2);
        int i14 = (H * 6) + 2;
        if (i10 != 0) {
            yVar4.K(i14);
            byte[] bArr4 = yVar4.f11923a;
            yVar5.k(0, i14, bArr4);
            int i15 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i10;
            bArr4[2] = (byte) ((i15 >> 8) & 255);
            bArr4[3] = (byte) (i15 & 255);
        } else {
            yVar4 = yVar5;
        }
        i0Var.f(yVar4, i14, 1);
        return i12 + 1 + i14;
    }

    public final void e() {
        t tVar = this.f58919b;
        tVar.d = 0;
        tVar.f59021p = 0L;
        tVar.f59022q = false;
        tVar.f59016k = false;
        tVar.f59020o = false;
        tVar.f59018m = null;
        this.f58922f = 0;
        this.h = 0;
        this.f58923g = 0;
        this.f58924i = 0;
        this.f58928m = false;
    }
}
