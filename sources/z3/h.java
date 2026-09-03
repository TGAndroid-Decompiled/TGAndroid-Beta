package z3;

import h5.d0;
import h5.w;
import r3.v;
public final class h {
    public final v f47357a;
    public r d;
    public f e;
    public int f47360f;
    public int f47361g;
    public int h;
    public int f47362i;
    public boolean f47365l;
    public final q f47358b = new q();
    public final w f47359c = new w();
    public final w f47363j = new w(1);
    public final w f47364k = new w();

    public h(v vVar, r rVar, f fVar) {
        this.f47357a = vVar;
        this.d = rVar;
        this.e = fVar;
        this.d = rVar;
        this.e = fVar;
        vVar.b(rVar.f47441a.f47419f);
        d();
    }

    public final p a() {
        if (this.f47365l) {
            q qVar = this.f47358b;
            f fVar = qVar.f47427a;
            int i10 = d0.f6924a;
            int i11 = fVar.f47351a;
            p pVar = qVar.f47436m;
            if (pVar == null) {
                pVar = this.d.f47441a.f47423k[i11];
            }
            if (pVar != null && pVar.f47424a) {
                return pVar;
            }
            return null;
        }
        return null;
    }

    public final boolean b() {
        this.f47360f++;
        if (!this.f47365l) {
            return false;
        }
        int i10 = this.f47361g + 1;
        this.f47361g = i10;
        int[] iArr = this.f47358b.f47431g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.f47361g = 0;
        return false;
    }

    public final int c(int i10, int i11) {
        w wVar;
        boolean z4;
        boolean z10;
        int i12;
        p a2 = a();
        if (a2 == null) {
            return 0;
        }
        int i13 = a2.d;
        q qVar = this.f47358b;
        if (i13 != 0) {
            wVar = qVar.f47437n;
        } else {
            byte[] bArr = a2.e;
            int i14 = d0.f6924a;
            int length = bArr.length;
            w wVar2 = this.f47364k;
            wVar2.D(length, bArr);
            i13 = bArr.length;
            wVar = wVar2;
        }
        int i15 = this.f47360f;
        if (qVar.f47434k && qVar.f47435l[i15]) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 && i11 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        w wVar3 = this.f47363j;
        byte[] bArr2 = wVar3.f6987a;
        if (z10) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        wVar3.F(0);
        v vVar = this.f47357a;
        vVar.a(1, wVar3);
        vVar.a(i13, wVar);
        if (!z10) {
            return i13 + 1;
        }
        w wVar4 = this.f47359c;
        if (!z4) {
            wVar4.C(8);
            byte[] bArr3 = wVar4.f6987a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = (byte) 0;
            bArr3[3] = (byte) (i11 & 255);
            bArr3[4] = (byte) ((i10 >> 24) & 255);
            bArr3[5] = (byte) ((i10 >> 16) & 255);
            bArr3[6] = (byte) ((i10 >> 8) & 255);
            bArr3[7] = (byte) (i10 & 255);
            vVar.a(8, wVar4);
            return i13 + 9;
        }
        w wVar5 = qVar.f47437n;
        int z11 = wVar5.z();
        wVar5.G(-2);
        int i16 = (z11 * 6) + 2;
        if (i11 != 0) {
            wVar4.C(i16);
            byte[] bArr4 = wVar4.f6987a;
            wVar5.e(0, i16, bArr4);
            int i17 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i11;
            bArr4[2] = (byte) ((i17 >> 8) & 255);
            bArr4[3] = (byte) (i17 & 255);
        } else {
            wVar4 = wVar5;
        }
        vVar.a(i16, wVar4);
        return i13 + 1 + i16;
    }

    public final void d() {
        q qVar = this.f47358b;
        qVar.d = 0;
        qVar.f47439p = 0L;
        qVar.f47440q = false;
        qVar.f47434k = false;
        qVar.f47438o = false;
        qVar.f47436m = null;
        this.f47360f = 0;
        this.h = 0;
        this.f47361g = 0;
        this.f47362i = 0;
        this.f47365l = false;
    }
}
