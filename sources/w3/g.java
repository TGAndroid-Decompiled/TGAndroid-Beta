package w3;

import b2.s;
import c3.h0;
import e2.d0;
import e2.v;
public final class g {
    public final h0 f44444a;
    public r d;
    public d e;
    public int f44447f;
    public int f44448g;
    public int h;
    public int f44449i;
    public final s f44450j;
    public boolean f44453m;
    public final q f44445b = new q();
    public final v f44446c = new v();
    public final v f44451k = new v(1);
    public final v f44452l = new v();

    public g(h0 h0Var, r rVar, d dVar, s sVar) {
        this.f44444a = h0Var;
        this.d = rVar;
        this.e = dVar;
        this.f44450j = sVar;
        this.d = rVar;
        this.e = dVar;
        h0Var.b(sVar);
        e();
    }

    public final int a() {
        int i10;
        if (!this.f44453m) {
            i10 = this.d.f44540g[this.f44447f];
        } else if (this.f44445b.f44528j[this.f44447f]) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (b() != null) {
            return i10 | 1073741824;
        }
        return i10;
    }

    public final p b() {
        if (this.f44453m) {
            q qVar = this.f44445b;
            d dVar = qVar.f44522a;
            String str = d0.f7871a;
            int i10 = dVar.f44437a;
            p pVar = qVar.f44531m;
            if (pVar == null) {
                pVar = this.d.f44536a.f44518l[i10];
            }
            if (pVar != null && pVar.f44519a) {
                return pVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f44447f++;
        if (!this.f44453m) {
            return false;
        }
        int i10 = this.f44448g + 1;
        this.f44448g = i10;
        int[] iArr = this.f44445b.f44526g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.f44448g = 0;
        return false;
    }

    public final int d(int i10, int i11) {
        v vVar;
        boolean z10;
        boolean z11;
        int i12;
        p b10 = b();
        if (b10 == null) {
            return 0;
        }
        int i13 = b10.d;
        q qVar = this.f44445b;
        if (i13 != 0) {
            vVar = qVar.f44532n;
        } else {
            byte[] bArr = b10.e;
            String str = d0.f7871a;
            int length = bArr.length;
            v vVar2 = this.f44452l;
            vVar2.H(length, bArr);
            i13 = bArr.length;
            vVar = vVar2;
        }
        int i14 = this.f44447f;
        if (qVar.f44529k && qVar.f44530l[i14]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        v vVar3 = this.f44451k;
        byte[] bArr2 = vVar3.f7917a;
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        vVar3.J(0);
        h0 h0Var = this.f44444a;
        h0Var.f(vVar3, 1, 1);
        h0Var.f(vVar, i13, 1);
        if (!z11) {
            return i13 + 1;
        }
        v vVar4 = this.f44446c;
        if (!z10) {
            vVar4.G(8);
            byte[] bArr3 = vVar4.f7917a;
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
        v vVar5 = qVar.f44532n;
        int D = vVar5.D();
        vVar5.K(-2);
        int i15 = (D * 6) + 2;
        if (i11 != 0) {
            vVar4.G(i15);
            byte[] bArr4 = vVar4.f7917a;
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
        q qVar = this.f44445b;
        qVar.d = 0;
        qVar.f44534p = 0L;
        qVar.f44535q = false;
        qVar.f44529k = false;
        qVar.f44533o = false;
        qVar.f44531m = null;
        this.f44447f = 0;
        this.h = 0;
        this.f44448g = 0;
        this.f44449i = 0;
        this.f44453m = false;
    }
}
