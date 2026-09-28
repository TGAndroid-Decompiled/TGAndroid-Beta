package w3;

import c3.h0;
import e2.d0;
import e2.v;
public final class h {
    public final h0 f44776a;
    public s d;
    public e e;
    public int f44779f;
    public int f44780g;
    public int h;
    public int f44781i;
    public final b2.s f44782j;
    public boolean f44785m;
    public final r f44777b = new r();
    public final v f44778c = new v();
    public final v f44783k = new v(1);
    public final v f44784l = new v();

    public h(h0 h0Var, s sVar, e eVar, b2.s sVar2) {
        this.f44776a = h0Var;
        this.d = sVar;
        this.e = eVar;
        this.f44782j = sVar2;
        this.d = sVar;
        this.e = eVar;
        h0Var.b(sVar2);
        e();
    }

    public final int a() {
        int i10;
        if (!this.f44785m) {
            i10 = this.d.f44872g[this.f44779f];
        } else if (this.f44777b.f44860j[this.f44779f]) {
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
        if (this.f44785m) {
            r rVar = this.f44777b;
            e eVar = rVar.f44854a;
            String str = d0.f7870a;
            int i10 = eVar.f44769a;
            q qVar = rVar.f44863m;
            if (qVar == null) {
                qVar = this.d.f44868a.f44850l[i10];
            }
            if (qVar != null && qVar.f44851a) {
                return qVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f44779f++;
        if (!this.f44785m) {
            return false;
        }
        int i10 = this.f44780g + 1;
        this.f44780g = i10;
        int[] iArr = this.f44777b.f44858g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.f44780g = 0;
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
        r rVar = this.f44777b;
        if (i13 != 0) {
            vVar = rVar.f44864n;
        } else {
            byte[] bArr = b10.e;
            String str = d0.f7870a;
            int length = bArr.length;
            v vVar2 = this.f44784l;
            vVar2.H(length, bArr);
            i13 = bArr.length;
            vVar = vVar2;
        }
        int i14 = this.f44779f;
        if (rVar.f44861k && rVar.f44862l[i14]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        v vVar3 = this.f44783k;
        byte[] bArr2 = vVar3.f7916a;
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        vVar3.J(0);
        h0 h0Var = this.f44776a;
        h0Var.f(vVar3, 1, 1);
        h0Var.f(vVar, i13, 1);
        if (!z11) {
            return i13 + 1;
        }
        v vVar4 = this.f44778c;
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
        v vVar5 = rVar.f44864n;
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
        r rVar = this.f44777b;
        rVar.d = 0;
        rVar.f44866p = 0L;
        rVar.f44867q = false;
        rVar.f44861k = false;
        rVar.f44865o = false;
        rVar.f44863m = null;
        this.f44779f = 0;
        this.h = 0;
        this.f44780g = 0;
        this.f44781i = 0;
        this.f44785m = false;
    }
}
