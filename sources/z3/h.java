package z3;

import h5.d0;
import h5.w;
import r3.v;
public final class h {
    public final v f50984a;
    public s d;
    public f f50987e;
    public int f50988f;
    public int f50989g;
    public int h;
    public int f50990i;
    public boolean f50993l;
    public final r f50985b = new r();
    public final w f50986c = new w();
    public final w f50991j = new w(1);
    public final w f50992k = new w();

    public h(v vVar, s sVar, f fVar) {
        this.f50984a = vVar;
        this.d = sVar;
        this.f50987e = fVar;
        this.d = sVar;
        this.f50987e = fVar;
        vVar.b(sVar.f51077a.f51053f);
        d();
    }

    public final q a() {
        if (this.f50993l) {
            r rVar = this.f50985b;
            f fVar = rVar.f51062a;
            int i10 = d0.f7237a;
            int i11 = fVar.f50978a;
            q qVar = rVar.f51072m;
            if (qVar == null) {
                qVar = this.d.f51077a.f51057k[i11];
            }
            if (qVar != null && qVar.f51058a) {
                return qVar;
            }
            return null;
        }
        return null;
    }

    public final boolean b() {
        this.f50988f++;
        if (!this.f50993l) {
            return false;
        }
        int i10 = this.f50989g + 1;
        this.f50989g = i10;
        int[] iArr = this.f50985b.f51067g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.f50989g = 0;
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
        r rVar = this.f50985b;
        if (i13 != 0) {
            wVar = rVar.f51073n;
        } else {
            byte[] bArr = a2.f51061e;
            int i14 = d0.f7237a;
            int length = bArr.length;
            w wVar2 = this.f50992k;
            wVar2.D(length, bArr);
            i13 = bArr.length;
            wVar = wVar2;
        }
        int i15 = this.f50988f;
        if (rVar.f51070k && rVar.f51071l[i15]) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 && i11 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        w wVar3 = this.f50991j;
        byte[] bArr2 = wVar3.f7308a;
        if (z10) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        wVar3.F(0);
        v vVar = this.f50984a;
        vVar.a(1, wVar3);
        vVar.a(i13, wVar);
        if (!z10) {
            return i13 + 1;
        }
        w wVar4 = this.f50986c;
        if (!z4) {
            wVar4.C(8);
            byte[] bArr3 = wVar4.f7308a;
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
        w wVar5 = rVar.f51073n;
        int z11 = wVar5.z();
        wVar5.G(-2);
        int i16 = (z11 * 6) + 2;
        if (i11 != 0) {
            wVar4.C(i16);
            byte[] bArr4 = wVar4.f7308a;
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
        r rVar = this.f50985b;
        rVar.d = 0;
        rVar.f51075p = 0L;
        rVar.f51076q = false;
        rVar.f51070k = false;
        rVar.f51074o = false;
        rVar.f51072m = null;
        this.f50988f = 0;
        this.h = 0;
        this.f50989g = 0;
        this.f50990i = 0;
        this.f50993l = false;
    }
}
