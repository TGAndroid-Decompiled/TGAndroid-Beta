package z3;

import h5.d0;
import h5.w;
import r3.v;
public final class h {
    public final v f47293a;
    public s d;
    public f e;
    public int f47296f;
    public int f47297g;
    public int h;
    public int f47298i;
    public boolean f47301l;
    public final r f47294b = new r();
    public final w f47295c = new w();
    public final w f47299j = new w(1);
    public final w f47300k = new w();

    public h(v vVar, s sVar, f fVar) {
        this.f47293a = vVar;
        this.d = sVar;
        this.e = fVar;
        this.d = sVar;
        this.e = fVar;
        vVar.b(sVar.f47377a.f47355f);
        d();
    }

    public final q a() {
        if (this.f47301l) {
            r rVar = this.f47294b;
            f fVar = rVar.f47363a;
            int i10 = d0.f6937a;
            int i11 = fVar.f47287a;
            q qVar = rVar.f47372m;
            if (qVar == null) {
                qVar = this.d.f47377a.f47359k[i11];
            }
            if (qVar != null && qVar.f47360a) {
                return qVar;
            }
            return null;
        }
        return null;
    }

    public final boolean b() {
        this.f47296f++;
        if (!this.f47301l) {
            return false;
        }
        int i10 = this.f47297g + 1;
        this.f47297g = i10;
        int[] iArr = this.f47294b.f47367g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.f47297g = 0;
        return false;
    }

    public final int c(int i10, int i11) {
        w wVar;
        boolean z4;
        boolean z10;
        int i12;
        q a2 = a();
        if (a2 == null) {
            return 0;
        }
        int i13 = a2.d;
        r rVar = this.f47294b;
        if (i13 != 0) {
            wVar = rVar.f47373n;
        } else {
            byte[] bArr = a2.e;
            int i14 = d0.f6937a;
            int length = bArr.length;
            w wVar2 = this.f47300k;
            wVar2.D(length, bArr);
            i13 = bArr.length;
            wVar = wVar2;
        }
        int i15 = this.f47296f;
        if (rVar.f47370k && rVar.f47371l[i15]) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 && i11 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        w wVar3 = this.f47299j;
        byte[] bArr2 = wVar3.f7000a;
        if (z10) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        wVar3.F(0);
        v vVar = this.f47293a;
        vVar.a(1, wVar3);
        vVar.a(i13, wVar);
        if (!z10) {
            return i13 + 1;
        }
        w wVar4 = this.f47295c;
        if (!z4) {
            wVar4.C(8);
            byte[] bArr3 = wVar4.f7000a;
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
        w wVar5 = rVar.f47373n;
        int z11 = wVar5.z();
        wVar5.G(-2);
        int i16 = (z11 * 6) + 2;
        if (i11 != 0) {
            wVar4.C(i16);
            byte[] bArr4 = wVar4.f7000a;
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
        r rVar = this.f47294b;
        rVar.d = 0;
        rVar.f47375p = 0L;
        rVar.f47376q = false;
        rVar.f47370k = false;
        rVar.f47374o = false;
        rVar.f47372m = null;
        this.f47296f = 0;
        this.h = 0;
        this.f47297g = 0;
        this.f47298i = 0;
        this.f47301l = false;
    }
}
