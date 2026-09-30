package w3;

import c3.h0;
import e2.d0;
import e2.v;
public final class h {
    public final h0 f44777a;
    public s d;
    public e e;
    public int f44780f;
    public int f44781g;
    public int h;
    public int f44782i;
    public final b2.s f44783j;
    public boolean f44786m;
    public final r f44778b = new r();
    public final v f44779c = new v();
    public final v f44784k = new v(1);
    public final v f44785l = new v();

    public h(h0 h0Var, s sVar, e eVar, b2.s sVar2) {
        this.f44777a = h0Var;
        this.d = sVar;
        this.e = eVar;
        this.f44783j = sVar2;
        this.d = sVar;
        this.e = eVar;
        h0Var.b(sVar2);
        e();
    }

    public final int a() {
        int i10;
        if (!this.f44786m) {
            i10 = this.d.f44873g[this.f44780f];
        } else if (this.f44778b.f44861j[this.f44780f]) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (b() != null) {
            return i10 | 1073741824;
        }
        return i10;
    }

    public final q b() {
        if (this.f44786m) {
            r rVar = this.f44778b;
            e eVar = rVar.f44855a;
            String str = d0.f7870a;
            int i10 = eVar.f44770a;
            q qVar = rVar.f44864m;
            if (qVar == null) {
                qVar = this.d.f44869a.f44851l[i10];
            }
            if (qVar != null && qVar.f44852a) {
                return qVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f44780f++;
        if (!this.f44786m) {
            return false;
        }
        int i10 = this.f44781g + 1;
        this.f44781g = i10;
        int[] iArr = this.f44778b.f44859g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.f44781g = 0;
        return false;
    }

    public final int d(int i10, int i11) {
        v vVar;
        boolean z10;
        boolean z11;
        int i12;
        q b10 = b();
        if (b10 == null) {
            return 0;
        }
        int i13 = b10.d;
        r rVar = this.f44778b;
        if (i13 != 0) {
            vVar = rVar.f44865n;
        } else {
            byte[] bArr = b10.e;
            String str = d0.f7870a;
            int length = bArr.length;
            v vVar2 = this.f44785l;
            vVar2.H(length, bArr);
            i13 = bArr.length;
            vVar = vVar2;
        }
        int i14 = this.f44780f;
        if (rVar.f44862k && rVar.f44863l[i14]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        v vVar3 = this.f44784k;
        byte[] bArr2 = vVar3.f7916a;
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        vVar3.J(0);
        h0 h0Var = this.f44777a;
        h0Var.f(vVar3, 1, 1);
        h0Var.f(vVar, i13, 1);
        if (!z11) {
            return i13 + 1;
        }
        v vVar4 = this.f44779c;
        if (!z10) {
            vVar4.G(8);
            byte[] bArr3 = vVar4.f7916a;
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
        v vVar5 = rVar.f44865n;
        int D = vVar5.D();
        vVar5.K(-2);
        int i15 = (D * 6) + 2;
        if (i11 != 0) {
            vVar4.G(i15);
            byte[] bArr4 = vVar4.f7916a;
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
        r rVar = this.f44778b;
        rVar.d = 0;
        rVar.f44867p = 0L;
        rVar.f44868q = false;
        rVar.f44862k = false;
        rVar.f44866o = false;
        rVar.f44864m = null;
        this.f44780f = 0;
        this.h = 0;
        this.f44781g = 0;
        this.f44782i = 0;
        this.f44786m = false;
    }
}
