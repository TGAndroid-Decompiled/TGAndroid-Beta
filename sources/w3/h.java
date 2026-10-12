package w3;

import c3.h0;
import e2.d0;
import e2.v;
public final class h {
    public final h0 f50013a;
    public s d;
    public e f50016e;
    public int f50017f;
    public int f50018g;
    public int h;
    public int f50019i;
    public final b2.s f50020j;
    public boolean f50023m;
    public final r f50014b = new r();
    public final v f50015c = new v();
    public final v f50021k = new v(1);
    public final v f50022l = new v();

    public h(h0 h0Var, s sVar, e eVar, b2.s sVar2) {
        this.f50013a = h0Var;
        this.d = sVar;
        this.f50016e = eVar;
        this.f50020j = sVar2;
        this.d = sVar;
        this.f50016e = eVar;
        h0Var.b(sVar2);
        e();
    }

    public final int a() {
        int i10;
        if (!this.f50023m) {
            i10 = this.d.f50118g[this.f50017f];
        } else if (this.f50014b.f50105j[this.f50017f]) {
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
        if (this.f50023m) {
            r rVar = this.f50014b;
            e eVar = rVar.f50098a;
            String str = d0.f8529a;
            int i10 = eVar.f50006a;
            q qVar = rVar.f50108m;
            if (qVar == null) {
                qVar = this.d.f50113a.f50093l[i10];
            }
            if (qVar != null && qVar.f50094a) {
                return qVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f50017f++;
        if (!this.f50023m) {
            return false;
        }
        int i10 = this.f50018g + 1;
        this.f50018g = i10;
        int[] iArr = this.f50014b.f50103g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.f50018g = 0;
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
        r rVar = this.f50014b;
        if (i13 != 0) {
            vVar = rVar.f50109n;
        } else {
            byte[] bArr = b10.f50097e;
            String str = d0.f8529a;
            int length = bArr.length;
            v vVar2 = this.f50022l;
            vVar2.H(length, bArr);
            i13 = bArr.length;
            vVar = vVar2;
        }
        int i14 = this.f50017f;
        if (rVar.f50106k && rVar.f50107l[i14]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        v vVar3 = this.f50021k;
        byte[] bArr2 = vVar3.f8581a;
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        vVar3.J(0);
        h0 h0Var = this.f50013a;
        h0Var.f(vVar3, 1, 1);
        h0Var.f(vVar, i13, 1);
        if (!z11) {
            return i13 + 1;
        }
        v vVar4 = this.f50015c;
        if (!z10) {
            vVar4.G(8);
            byte[] bArr3 = vVar4.f8581a;
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
        v vVar5 = rVar.f50109n;
        int D = vVar5.D();
        vVar5.K(-2);
        int i15 = (D * 6) + 2;
        if (i11 != 0) {
            vVar4.G(i15);
            byte[] bArr4 = vVar4.f8581a;
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
        r rVar = this.f50014b;
        rVar.d = 0;
        rVar.f50111p = 0L;
        rVar.f50112q = false;
        rVar.f50106k = false;
        rVar.f50110o = false;
        rVar.f50108m = null;
        this.f50017f = 0;
        this.h = 0;
        this.f50018g = 0;
        this.f50019i = 0;
        this.f50023m = false;
    }
}
