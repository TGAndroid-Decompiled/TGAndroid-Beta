package w3;

import c3.h0;
import e2.d0;
import e2.v;
public final class i {
    public final h0 f49899a;
    public t d;
    public f f49902e;
    public int f49903f;
    public int f49904g;
    public int h;
    public int f49905i;
    public final b2.s f49906j;
    public boolean f49909m;
    public final s f49900b = new s();
    public final v f49901c = new v();
    public final v f49907k = new v(1);
    public final v f49908l = new v();

    public i(h0 h0Var, t tVar, f fVar, b2.s sVar) {
        this.f49899a = h0Var;
        this.d = tVar;
        this.f49902e = fVar;
        this.f49906j = sVar;
        this.d = tVar;
        this.f49902e = fVar;
        h0Var.b(sVar);
        e();
    }

    public final int a() {
        int i10;
        if (!this.f49909m) {
            i10 = this.d.f50004g[this.f49903f];
        } else if (this.f49900b.f49991j[this.f49903f]) {
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
        if (this.f49909m) {
            s sVar = this.f49900b;
            f fVar = sVar.f49984a;
            String str = d0.f8531a;
            int i10 = fVar.f49892a;
            r rVar = sVar.f49994m;
            if (rVar == null) {
                rVar = this.d.f49999a.f49979l[i10];
            }
            if (rVar != null && rVar.f49980a) {
                return rVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f49903f++;
        if (!this.f49909m) {
            return false;
        }
        int i10 = this.f49904g + 1;
        this.f49904g = i10;
        int[] iArr = this.f49900b.f49989g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.f49904g = 0;
        return false;
    }

    public final int d(int i10, int i11) {
        v vVar;
        boolean z10;
        boolean z11;
        int i12;
        r b10 = b();
        if (b10 == null) {
            return 0;
        }
        int i13 = b10.d;
        s sVar = this.f49900b;
        if (i13 != 0) {
            vVar = sVar.f49995n;
        } else {
            byte[] bArr = b10.f49983e;
            String str = d0.f8531a;
            int length = bArr.length;
            v vVar2 = this.f49908l;
            vVar2.H(length, bArr);
            i13 = bArr.length;
            vVar = vVar2;
        }
        int i14 = this.f49903f;
        if (sVar.f49992k && sVar.f49993l[i14]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        v vVar3 = this.f49907k;
        byte[] bArr2 = vVar3.f8583a;
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        vVar3.J(0);
        h0 h0Var = this.f49899a;
        h0Var.f(vVar3, 1, 1);
        h0Var.f(vVar, i13, 1);
        if (!z11) {
            return i13 + 1;
        }
        v vVar4 = this.f49901c;
        if (!z10) {
            vVar4.G(8);
            byte[] bArr3 = vVar4.f8583a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = (byte) 0;
            bArr3[3] = (byte) (i11 & 255);
            bArr3[4] = (byte) ((i10 >> 24) & 255);
            bArr3[5] = (byte) ((i10 >> 16) & 255);
            bArr3[6] = (byte) ((i10 >> 8) & 255);
            bArr3[7] = (byte) (i10 & 255);
            h0Var.f(vVar4, 8, 1);
            return i13 + 9;
        }
        v vVar5 = sVar.f49995n;
        int D = vVar5.D();
        vVar5.K(-2);
        int i15 = (D * 6) + 2;
        if (i11 != 0) {
            vVar4.G(i15);
            byte[] bArr4 = vVar4.f8583a;
            vVar5.h(0, i15, bArr4);
            int i16 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i11;
            bArr4[2] = (byte) ((i16 >> 8) & 255);
            bArr4[3] = (byte) (i16 & 255);
        } else {
            vVar4 = vVar5;
        }
        h0Var.f(vVar4, i15, 1);
        return i13 + 1 + i15;
    }

    public final void e() {
        s sVar = this.f49900b;
        sVar.d = 0;
        sVar.f49997p = 0L;
        sVar.f49998q = false;
        sVar.f49992k = false;
        sVar.f49996o = false;
        sVar.f49994m = null;
        this.f49903f = 0;
        this.h = 0;
        this.f49904g = 0;
        this.f49905i = 0;
        this.f49909m = false;
    }
}
