package w3;

import b2.s;
import c3.h0;
import e2.d0;
import e2.v;
public final class g {
    public final h0 f47960a;
    public r d;
    public d f47963e;
    public int f47964f;
    public int f47965g;
    public int h;
    public int f47966i;
    public final s f47967j;
    public boolean f47970m;
    public final q f47961b = new q();
    public final v f47962c = new v();
    public final v f47968k = new v(1);
    public final v f47969l = new v();

    public g(h0 h0Var, r rVar, d dVar, s sVar) {
        this.f47960a = h0Var;
        this.d = rVar;
        this.f47963e = dVar;
        this.f47967j = sVar;
        this.d = rVar;
        this.f47963e = dVar;
        h0Var.b(sVar);
        e();
    }

    public final int a() {
        int i10;
        if (!this.f47970m) {
            i10 = this.d.f48065g[this.f47964f];
        } else if (this.f47961b.f48052j[this.f47964f]) {
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
        if (this.f47970m) {
            q qVar = this.f47961b;
            d dVar = qVar.f48045a;
            String str = d0.f8765a;
            int i10 = dVar.f47953a;
            p pVar = qVar.f48055m;
            if (pVar == null) {
                pVar = this.d.f48060a.f48040l[i10];
            }
            if (pVar != null && pVar.f48041a) {
                return pVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f47964f++;
        if (!this.f47970m) {
            return false;
        }
        int i10 = this.f47965g + 1;
        this.f47965g = i10;
        int[] iArr = this.f47961b.f48050g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.f47965g = 0;
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
        q qVar = this.f47961b;
        if (i13 != 0) {
            vVar = qVar.f48056n;
        } else {
            byte[] bArr = b10.f48044e;
            String str = d0.f8765a;
            int length = bArr.length;
            v vVar2 = this.f47969l;
            vVar2.H(length, bArr);
            i13 = bArr.length;
            vVar = vVar2;
        }
        int i14 = this.f47964f;
        if (qVar.f48053k && qVar.f48054l[i14]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        v vVar3 = this.f47968k;
        byte[] bArr2 = vVar3.f8817a;
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        vVar3.J(0);
        h0 h0Var = this.f47960a;
        h0Var.f(vVar3, 1, 1);
        h0Var.f(vVar, i13, 1);
        if (!z11) {
            return i13 + 1;
        }
        v vVar4 = this.f47962c;
        if (!z10) {
            vVar4.G(8);
            byte[] bArr3 = vVar4.f8817a;
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
        v vVar5 = qVar.f48056n;
        int D = vVar5.D();
        vVar5.K(-2);
        int i15 = (D * 6) + 2;
        if (i11 != 0) {
            vVar4.G(i15);
            byte[] bArr4 = vVar4.f8817a;
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
        q qVar = this.f47961b;
        qVar.d = 0;
        qVar.f48058p = 0L;
        qVar.f48059q = false;
        qVar.f48053k = false;
        qVar.f48057o = false;
        qVar.f48055m = null;
        this.f47964f = 0;
        this.h = 0;
        this.f47965g = 0;
        this.f47966i = 0;
        this.f47970m = false;
    }
}
