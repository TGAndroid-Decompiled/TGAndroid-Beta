package w3;

import c3.h0;
import e2.d0;
import e2.v;
public final class h {
    public final h0 f44883a;
    public s d;
    public e e;
    public int f44886f;
    public int f44887g;
    public int h;
    public int f44888i;
    public final b2.s f44889j;
    public boolean f44892m;
    public final r f44884b = new r();
    public final v f44885c = new v();
    public final v f44890k = new v(1);
    public final v f44891l = new v();

    public h(h0 h0Var, s sVar, e eVar, b2.s sVar2) {
        this.f44883a = h0Var;
        this.d = sVar;
        this.e = eVar;
        this.f44889j = sVar2;
        this.d = sVar;
        this.e = eVar;
        h0Var.b(sVar2);
        e();
    }

    public final int a() {
        int i10;
        if (!this.f44892m) {
            i10 = this.d.f44979g[this.f44886f];
        } else if (this.f44884b.f44967j[this.f44886f]) {
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
        if (this.f44892m) {
            r rVar = this.f44884b;
            e eVar = rVar.f44961a;
            String str = d0.f7882a;
            int i10 = eVar.f44876a;
            q qVar = rVar.f44970m;
            if (qVar == null) {
                qVar = this.d.f44975a.f44957l[i10];
            }
            if (qVar != null && qVar.f44958a) {
                return qVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f44886f++;
        if (!this.f44892m) {
            return false;
        }
        int i10 = this.f44887g + 1;
        this.f44887g = i10;
        int[] iArr = this.f44884b.f44965g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.f44887g = 0;
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
        r rVar = this.f44884b;
        if (i13 != 0) {
            vVar = rVar.f44971n;
        } else {
            byte[] bArr = b10.e;
            String str = d0.f7882a;
            int length = bArr.length;
            v vVar2 = this.f44891l;
            vVar2.H(length, bArr);
            i13 = bArr.length;
            vVar = vVar2;
        }
        int i14 = this.f44886f;
        if (rVar.f44968k && rVar.f44969l[i14]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        v vVar3 = this.f44890k;
        byte[] bArr2 = vVar3.f7928a;
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        vVar3.J(0);
        h0 h0Var = this.f44883a;
        h0Var.f(vVar3, 1, 1);
        h0Var.f(vVar, i13, 1);
        if (!z11) {
            return i13 + 1;
        }
        v vVar4 = this.f44885c;
        if (!z10) {
            vVar4.G(8);
            byte[] bArr3 = vVar4.f7928a;
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
        v vVar5 = rVar.f44971n;
        int D = vVar5.D();
        vVar5.K(-2);
        int i15 = (D * 6) + 2;
        if (i11 != 0) {
            vVar4.G(i15);
            byte[] bArr4 = vVar4.f7928a;
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
        r rVar = this.f44884b;
        rVar.d = 0;
        rVar.f44973p = 0L;
        rVar.f44974q = false;
        rVar.f44968k = false;
        rVar.f44972o = false;
        rVar.f44970m = null;
        this.f44886f = 0;
        this.h = 0;
        this.f44887g = 0;
        this.f44888i = 0;
        this.f44892m = false;
    }
}
