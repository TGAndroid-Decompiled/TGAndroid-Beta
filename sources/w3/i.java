package w3;

import c3.h0;
import e2.d0;
import e2.v;
public final class i {
    public final h0 f49822a;
    public t d;
    public f f49825e;
    public int f49826f;
    public int f49827g;
    public int h;
    public int f49828i;
    public final b2.s f49829j;
    public boolean f49832m;
    public final s f49823b = new s();
    public final v f49824c = new v();
    public final v f49830k = new v(1);
    public final v f49831l = new v();

    public i(h0 h0Var, t tVar, f fVar, b2.s sVar) {
        this.f49822a = h0Var;
        this.d = tVar;
        this.f49825e = fVar;
        this.f49829j = sVar;
        this.d = tVar;
        this.f49825e = fVar;
        h0Var.b(sVar);
        e();
    }

    public final int a() {
        int i10;
        if (!this.f49832m) {
            i10 = this.d.f49927g[this.f49826f];
        } else if (this.f49823b.f49914j[this.f49826f]) {
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
        if (this.f49832m) {
            s sVar = this.f49823b;
            f fVar = sVar.f49907a;
            String str = d0.f8532a;
            int i10 = fVar.f49815a;
            r rVar = sVar.f49917m;
            if (rVar == null) {
                rVar = this.d.f49922a.f49902l[i10];
            }
            if (rVar != null && rVar.f49903a) {
                return rVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f49826f++;
        if (!this.f49832m) {
            return false;
        }
        int i10 = this.f49827g + 1;
        this.f49827g = i10;
        int[] iArr = this.f49823b.f49912g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.f49827g = 0;
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
        s sVar = this.f49823b;
        if (i13 != 0) {
            vVar = sVar.f49918n;
        } else {
            byte[] bArr = b10.f49906e;
            String str = d0.f8532a;
            int length = bArr.length;
            v vVar2 = this.f49831l;
            vVar2.H(length, bArr);
            i13 = bArr.length;
            vVar = vVar2;
        }
        int i14 = this.f49826f;
        if (sVar.f49915k && sVar.f49916l[i14]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        v vVar3 = this.f49830k;
        byte[] bArr2 = vVar3.f8584a;
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        vVar3.J(0);
        h0 h0Var = this.f49822a;
        h0Var.f(vVar3, 1, 1);
        h0Var.f(vVar, i13, 1);
        if (!z11) {
            return i13 + 1;
        }
        v vVar4 = this.f49824c;
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
        v vVar5 = sVar.f49918n;
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
        s sVar = this.f49823b;
        sVar.d = 0;
        sVar.f49920p = 0L;
        sVar.f49921q = false;
        sVar.f49915k = false;
        sVar.f49919o = false;
        sVar.f49917m = null;
        this.f49826f = 0;
        this.h = 0;
        this.f49827g = 0;
        this.f49828i = 0;
        this.f49832m = false;
    }
}
