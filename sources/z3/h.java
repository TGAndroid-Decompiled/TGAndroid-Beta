package z3;

import h5.d0;
import h5.w;
import r3.v;
public final class h {
    public final v f51020a;
    public r d;
    public f f51023e;
    public int f51024f;
    public int f51025g;
    public int h;
    public int f51026i;
    public boolean f51029l;
    public final q f51021b = new q();
    public final w f51022c = new w();
    public final w f51027j = new w(1);
    public final w f51028k = new w();

    public h(v vVar, r rVar, f fVar) {
        this.f51020a = vVar;
        this.d = rVar;
        this.f51023e = fVar;
        this.d = rVar;
        this.f51023e = fVar;
        vVar.b(rVar.f51112a.f51088f);
        d();
    }

    public final p a() {
        if (this.f51029l) {
            q qVar = this.f51021b;
            f fVar = qVar.f51097a;
            int i10 = d0.f7237a;
            int i11 = fVar.f51014a;
            p pVar = qVar.f51107m;
            if (pVar == null) {
                pVar = this.d.f51112a.f51092k[i11];
            }
            if (pVar != null && pVar.f51093a) {
                return pVar;
            }
            return null;
        }
        return null;
    }

    public final boolean b() {
        this.f51024f++;
        if (!this.f51029l) {
            return false;
        }
        int i10 = this.f51025g + 1;
        this.f51025g = i10;
        int[] iArr = this.f51021b.f51102g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.f51025g = 0;
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
        q qVar = this.f51021b;
        if (i13 != 0) {
            wVar = qVar.f51108n;
        } else {
            byte[] bArr = a2.f51096e;
            int i14 = d0.f7237a;
            int length = bArr.length;
            w wVar2 = this.f51028k;
            wVar2.D(length, bArr);
            i13 = bArr.length;
            wVar = wVar2;
        }
        int i15 = this.f51024f;
        if (qVar.f51105k && qVar.f51106l[i15]) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 && i11 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        w wVar3 = this.f51027j;
        byte[] bArr2 = wVar3.f7308a;
        if (z10) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        wVar3.F(0);
        v vVar = this.f51020a;
        vVar.a(1, wVar3);
        vVar.a(i13, wVar);
        if (!z10) {
            return i13 + 1;
        }
        w wVar4 = this.f51022c;
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
        w wVar5 = qVar.f51108n;
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
        q qVar = this.f51021b;
        qVar.d = 0;
        qVar.f51110p = 0L;
        qVar.f51111q = false;
        qVar.f51105k = false;
        qVar.f51109o = false;
        qVar.f51107m = null;
        this.f51024f = 0;
        this.h = 0;
        this.f51025g = 0;
        this.f51026i = 0;
        this.f51029l = false;
    }
}
