package w3;

import f5.d0;
import o3.w;
public final class h {
    public final w f49649a;
    public r d;
    public f f49652e;
    public int f49653f;
    public int f49654g;
    public int h;
    public int f49655i;
    public boolean f49658l;
    public final q f49650b = new q();
    public final f5.w f49651c = new f5.w();
    public final f5.w f49656j = new f5.w(1);
    public final f5.w f49657k = new f5.w();

    public h(w wVar, r rVar, f fVar) {
        this.f49649a = wVar;
        this.d = rVar;
        this.f49652e = fVar;
        this.d = rVar;
        this.f49652e = fVar;
        wVar.b(rVar.f49741a.f49717f);
        d();
    }

    public final p a() {
        if (this.f49658l) {
            q qVar = this.f49650b;
            f fVar = qVar.f49726a;
            int i10 = d0.f6579a;
            int i11 = fVar.f49643a;
            p pVar = qVar.f49736m;
            if (pVar == null) {
                pVar = this.d.f49741a.f49721k[i11];
            }
            if (pVar != null && pVar.f49722a) {
                return pVar;
            }
            return null;
        }
        return null;
    }

    public final boolean b() {
        this.f49653f++;
        if (!this.f49658l) {
            return false;
        }
        int i10 = this.f49654g + 1;
        this.f49654g = i10;
        int[] iArr = this.f49650b.f49731g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.f49654g = 0;
        return false;
    }

    public final int c(int i10, int i11) {
        f5.w wVar;
        boolean z10;
        boolean z11;
        int i12;
        p a2 = a();
        if (a2 == null) {
            return 0;
        }
        int i13 = a2.d;
        q qVar = this.f49650b;
        if (i13 != 0) {
            wVar = qVar.f49737n;
        } else {
            byte[] bArr = a2.f49725e;
            int i14 = d0.f6579a;
            int length = bArr.length;
            f5.w wVar2 = this.f49657k;
            wVar2.A(length, bArr);
            i13 = bArr.length;
            wVar = wVar2;
        }
        int i15 = this.f49653f;
        if (qVar.f49734k && qVar.f49735l[i15]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        f5.w wVar3 = this.f49656j;
        byte[] bArr2 = wVar3.f6640a;
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        wVar3.C(0);
        w wVar4 = this.f49649a;
        wVar4.d(1, wVar3);
        wVar4.d(i13, wVar);
        if (!z11) {
            return i13 + 1;
        }
        f5.w wVar5 = this.f49651c;
        if (!z10) {
            wVar5.z(8);
            byte[] bArr3 = wVar5.f6640a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = (byte) 0;
            bArr3[3] = (byte) (i11 & 255);
            bArr3[4] = (byte) ((i10 >> 24) & 255);
            bArr3[5] = (byte) ((i10 >> 16) & 255);
            bArr3[6] = (byte) ((i10 >> 8) & 255);
            bArr3[7] = (byte) (i10 & 255);
            wVar4.d(8, wVar5);
            return i13 + 9;
        }
        f5.w wVar6 = qVar.f49737n;
        int w10 = wVar6.w();
        wVar6.D(-2);
        int i16 = (w10 * 6) + 2;
        if (i11 != 0) {
            wVar5.z(i16);
            byte[] bArr4 = wVar5.f6640a;
            wVar6.c(0, i16, bArr4);
            int i17 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i11;
            bArr4[2] = (byte) ((i17 >> 8) & 255);
            bArr4[3] = (byte) (i17 & 255);
        } else {
            wVar5 = wVar6;
        }
        wVar4.d(i16, wVar5);
        return i13 + 1 + i16;
    }

    public final void d() {
        q qVar = this.f49650b;
        qVar.d = 0;
        qVar.f49739p = 0L;
        qVar.f49740q = false;
        qVar.f49734k = false;
        qVar.f49738o = false;
        qVar.f49736m = null;
        this.f49653f = 0;
        this.h = 0;
        this.f49654g = 0;
        this.f49655i = 0;
        this.f49658l = false;
    }
}
