package w3;

import b2.s;
import c3.h0;
import e2.d0;
import e2.v;
public final class g {
    public final h0 f48493a;
    public r d;
    public d f48496e;
    public int f48497f;
    public int f48498g;
    public int h;
    public int f48499i;
    public final s f48500j;
    public boolean f48503m;
    public final q f48494b = new q();
    public final v f48495c = new v();
    public final v f48501k = new v(1);
    public final v f48502l = new v();

    public g(h0 h0Var, r rVar, d dVar, s sVar) {
        this.f48493a = h0Var;
        this.d = rVar;
        this.f48496e = dVar;
        this.f48500j = sVar;
        this.d = rVar;
        this.f48496e = dVar;
        h0Var.b(sVar);
        e();
    }

    public final int a() {
        int i10;
        if (!this.f48503m) {
            i10 = this.d.f48598g[this.f48497f];
        } else if (this.f48494b.f48585j[this.f48497f]) {
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
        if (this.f48503m) {
            q qVar = this.f48494b;
            d dVar = qVar.f48578a;
            String str = d0.f8538a;
            int i10 = dVar.f48486a;
            p pVar = qVar.f48588m;
            if (pVar == null) {
                pVar = this.d.f48593a.f48573l[i10];
            }
            if (pVar != null && pVar.f48574a) {
                return pVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f48497f++;
        if (!this.f48503m) {
            return false;
        }
        int i10 = this.f48498g + 1;
        this.f48498g = i10;
        int[] iArr = this.f48494b.f48583g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.f48498g = 0;
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
        q qVar = this.f48494b;
        if (i13 != 0) {
            vVar = qVar.f48589n;
        } else {
            byte[] bArr = b10.f48577e;
            String str = d0.f8538a;
            int length = bArr.length;
            v vVar2 = this.f48502l;
            vVar2.H(length, bArr);
            i13 = bArr.length;
            vVar = vVar2;
        }
        int i14 = this.f48497f;
        if (qVar.f48586k && qVar.f48587l[i14]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        v vVar3 = this.f48501k;
        byte[] bArr2 = vVar3.f8590a;
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        vVar3.J(0);
        h0 h0Var = this.f48493a;
        h0Var.f(vVar3, 1, 1);
        h0Var.f(vVar, i13, 1);
        if (!z11) {
            return i13 + 1;
        }
        v vVar4 = this.f48495c;
        if (!z10) {
            vVar4.G(8);
            byte[] bArr3 = vVar4.f8590a;
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
        v vVar5 = qVar.f48589n;
        int D = vVar5.D();
        vVar5.K(-2);
        int i15 = (D * 6) + 2;
        if (i11 != 0) {
            vVar4.G(i15);
            byte[] bArr4 = vVar4.f8590a;
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
        q qVar = this.f48494b;
        qVar.d = 0;
        qVar.f48591p = 0L;
        qVar.f48592q = false;
        qVar.f48586k = false;
        qVar.f48590o = false;
        qVar.f48588m = null;
        this.f48497f = 0;
        this.h = 0;
        this.f48498g = 0;
        this.f48499i = 0;
        this.f48503m = false;
    }
}
