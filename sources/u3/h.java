package u3;

import d5.f0;
import d5.y;
import m3.w;
public final class h {
    public final w f47990a;
    public r d;
    public f f47993e;
    public int f47994f;
    public int f47995g;
    public int h;
    public int f47996i;
    public boolean f47999l;
    public final q f47991b = new q();
    public final y f47992c = new y();
    public final y f47997j = new y(1);
    public final y f47998k = new y();

    public h(w wVar, r rVar, f fVar) {
        this.f47990a = wVar;
        this.d = rVar;
        this.f47993e = fVar;
        this.d = rVar;
        this.f47993e = fVar;
        wVar.c(rVar.f48082a.f48058f);
        d();
    }

    public final p a() {
        if (this.f47999l) {
            q qVar = this.f47991b;
            f fVar = qVar.f48067a;
            int i9 = f0.f4349a;
            int i10 = fVar.f47984a;
            p pVar = qVar.f48077m;
            if (pVar == null) {
                pVar = this.d.f48082a.f48062k[i10];
            }
            if (pVar != null && pVar.f48063a) {
                return pVar;
            }
            return null;
        }
        return null;
    }

    public final boolean b() {
        this.f47994f++;
        if (!this.f47999l) {
            return false;
        }
        int i9 = this.f47995g + 1;
        this.f47995g = i9;
        int[] iArr = this.f47991b.f48072g;
        int i10 = this.h;
        if (i9 != iArr[i10]) {
            return true;
        }
        this.h = i10 + 1;
        this.f47995g = 0;
        return false;
    }

    public final int c(int i9, int i10) {
        y yVar;
        boolean z10;
        boolean z11;
        int i11;
        p a2 = a();
        if (a2 == null) {
            return 0;
        }
        int i12 = a2.d;
        q qVar = this.f47991b;
        if (i12 != 0) {
            yVar = qVar.f48078n;
        } else {
            byte[] bArr = a2.f48066e;
            int i13 = f0.f4349a;
            int length = bArr.length;
            y yVar2 = this.f47998k;
            yVar2.A(length, bArr);
            i12 = bArr.length;
            yVar = yVar2;
        }
        int i14 = this.f47994f;
        if (qVar.f48075k && qVar.f48076l[i14]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i10 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        y yVar3 = this.f47997j;
        byte[] bArr2 = yVar3.f4410a;
        if (z11) {
            i11 = 128;
        } else {
            i11 = 0;
        }
        bArr2[0] = (byte) (i11 | i12);
        yVar3.C(0);
        w wVar = this.f47990a;
        wVar.d(1, yVar3);
        wVar.d(i12, yVar);
        if (!z11) {
            return i12 + 1;
        }
        y yVar4 = this.f47992c;
        if (!z10) {
            yVar4.z(8);
            byte[] bArr3 = yVar4.f4410a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = (byte) 0;
            bArr3[3] = (byte) (i10 & 255);
            bArr3[4] = (byte) ((i9 >> 24) & 255);
            bArr3[5] = (byte) ((i9 >> 16) & 255);
            bArr3[6] = (byte) ((i9 >> 8) & 255);
            bArr3[7] = (byte) (i9 & 255);
            wVar.d(8, yVar4);
            return i12 + 9;
        }
        y yVar5 = qVar.f48078n;
        int w8 = yVar5.w();
        yVar5.D(-2);
        int i15 = (w8 * 6) + 2;
        if (i10 != 0) {
            yVar4.z(i15);
            byte[] bArr4 = yVar4.f4410a;
            yVar5.c(0, i15, bArr4);
            int i16 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i10;
            bArr4[2] = (byte) ((i16 >> 8) & 255);
            bArr4[3] = (byte) (i16 & 255);
        } else {
            yVar4 = yVar5;
        }
        wVar.d(i15, yVar4);
        return i12 + 1 + i15;
    }

    public final void d() {
        q qVar = this.f47991b;
        qVar.d = 0;
        qVar.f48080p = 0L;
        qVar.f48081q = false;
        qVar.f48075k = false;
        qVar.f48079o = false;
        qVar.f48077m = null;
        this.f47994f = 0;
        this.h = 0;
        this.f47995g = 0;
        this.f47996i = 0;
        this.f47999l = false;
    }
}
