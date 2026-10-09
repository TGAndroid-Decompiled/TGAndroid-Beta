package w3;

import c3.h0;
import e2.d0;
import e2.v;
public final class i {
    public final h0 f49778a;
    public t d;
    public f f49781e;
    public int f49782f;
    public int f49783g;
    public int h;
    public int f49784i;
    public final b2.s f49785j;
    public boolean f49788m;
    public final s f49779b = new s();
    public final v f49780c = new v();
    public final v f49786k = new v(1);
    public final v f49787l = new v();

    public i(h0 h0Var, t tVar, f fVar, b2.s sVar) {
        this.f49778a = h0Var;
        this.d = tVar;
        this.f49781e = fVar;
        this.f49785j = sVar;
        this.d = tVar;
        this.f49781e = fVar;
        h0Var.b(sVar);
        e();
    }

    public final int a() {
        int i10;
        if (!this.f49788m) {
            i10 = this.d.f49883g[this.f49782f];
        } else if (this.f49779b.f49870j[this.f49782f]) {
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
        if (this.f49788m) {
            s sVar = this.f49779b;
            f fVar = sVar.f49863a;
            String str = d0.f8532a;
            int i10 = fVar.f49771a;
            r rVar = sVar.f49873m;
            if (rVar == null) {
                rVar = this.d.f49878a.f49858l[i10];
            }
            if (rVar != null && rVar.f49859a) {
                return rVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f49782f++;
        if (!this.f49788m) {
            return false;
        }
        int i10 = this.f49783g + 1;
        this.f49783g = i10;
        int[] iArr = this.f49779b.f49868g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.f49783g = 0;
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
        s sVar = this.f49779b;
        if (i13 != 0) {
            vVar = sVar.f49874n;
        } else {
            byte[] bArr = b10.f49862e;
            String str = d0.f8532a;
            int length = bArr.length;
            v vVar2 = this.f49787l;
            vVar2.H(length, bArr);
            i13 = bArr.length;
            vVar = vVar2;
        }
        int i14 = this.f49782f;
        if (sVar.f49871k && sVar.f49872l[i14]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        v vVar3 = this.f49786k;
        byte[] bArr2 = vVar3.f8584a;
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        vVar3.J(0);
        h0 h0Var = this.f49778a;
        h0Var.f(vVar3, 1, 1);
        h0Var.f(vVar, i13, 1);
        if (!z11) {
            return i13 + 1;
        }
        v vVar4 = this.f49780c;
        if (!z10) {
            vVar4.G(8);
            byte[] bArr3 = vVar4.f8584a;
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
        v vVar5 = sVar.f49874n;
        int D = vVar5.D();
        vVar5.K(-2);
        int i15 = (D * 6) + 2;
        if (i11 != 0) {
            vVar4.G(i15);
            byte[] bArr4 = vVar4.f8584a;
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
        s sVar = this.f49779b;
        sVar.d = 0;
        sVar.f49876p = 0L;
        sVar.f49877q = false;
        sVar.f49871k = false;
        sVar.f49875o = false;
        sVar.f49873m = null;
        this.f49782f = 0;
        this.h = 0;
        this.f49783g = 0;
        this.f49784i = 0;
        this.f49788m = false;
    }
}
