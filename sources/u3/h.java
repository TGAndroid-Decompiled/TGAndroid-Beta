package u3;

import d5.g0;
import d5.z;
import m3.w;

public final class h {

    public final w f48287a;
    public s d;

    public f f48290e;

    public int f48291f;

    public int f48292g;
    public int h;

    public int f48293i;

    public boolean f48296l;

    public final r f48288b = new r();

    public final z f48289c = new z();

    public final z f48294j = new z(1);

    public final z f48295k = new z();

    public h(w wVar, s sVar, f fVar) {
        this.f48287a = wVar;
        this.d = sVar;
        this.f48290e = fVar;
        this.d = sVar;
        this.f48290e = fVar;
        wVar.c(sVar.f48380a.f48356f);
        d();
    }

    public final q a() {
        if (!this.f48296l) {
            return null;
        }
        r rVar = this.f48288b;
        f fVar = rVar.f48365a;
        int i10 = g0.f4795a;
        int i11 = fVar.f48281a;
        q qVar = rVar.f48375m;
        if (qVar == null) {
            qVar = this.d.f48380a.f48360k[i11];
        }
        if (qVar == null || !qVar.f48361a) {
            return null;
        }
        return qVar;
    }

    public final boolean b() {
        this.f48291f++;
        if (!this.f48296l) {
            return false;
        }
        int i10 = this.f48292g + 1;
        this.f48292g = i10;
        int[] iArr = this.f48288b.f48370g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.f48292g = 0;
        return false;
    }

    public final int c(int i10, int i11) {
        z zVar;
        q qVarA = a();
        if (qVarA == null) {
            return 0;
        }
        int length = qVarA.d;
        r rVar = this.f48288b;
        if (length != 0) {
            zVar = rVar.f48376n;
        } else {
            byte[] bArr = qVarA.f48364e;
            int i12 = g0.f4795a;
            int length2 = bArr.length;
            z zVar2 = this.f48295k;
            zVar2.A(length2, bArr);
            length = bArr.length;
            zVar = zVar2;
        }
        boolean z10 = rVar.f48373k && rVar.f48374l[this.f48291f];
        boolean z11 = z10 || i11 != 0;
        z zVar3 = this.f48294j;
        zVar3.f4858a[0] = (byte) ((z11 ? 128 : 0) | length);
        zVar3.C(0);
        w wVar = this.f48287a;
        wVar.d(1, zVar3);
        wVar.d(length, zVar);
        if (!z11) {
            return length + 1;
        }
        z zVar4 = this.f48289c;
        if (!z10) {
            zVar4.z(8);
            byte[] bArr2 = zVar4.f4858a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i11 & 255);
            bArr2[4] = (byte) ((i10 >> 24) & 255);
            bArr2[5] = (byte) ((i10 >> 16) & 255);
            bArr2[6] = (byte) ((i10 >> 8) & 255);
            bArr2[7] = (byte) (i10 & 255);
            wVar.d(8, zVar4);
            return length + 9;
        }
        z zVar5 = rVar.f48376n;
        int iW = zVar5.w();
        zVar5.D(-2);
        int i13 = (iW * 6) + 2;
        if (i11 != 0) {
            zVar4.z(i13);
            byte[] bArr3 = zVar4.f4858a;
            zVar5.c(0, i13, bArr3);
            int i14 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i11;
            bArr3[2] = (byte) ((i14 >> 8) & 255);
            bArr3[3] = (byte) (i14 & 255);
        } else {
            zVar4 = zVar5;
        }
        wVar.d(i13, zVar4);
        return length + 1 + i13;
    }

    public final void d() {
        r rVar = this.f48288b;
        rVar.d = 0;
        rVar.f48378p = 0L;
        rVar.f48379q = false;
        rVar.f48373k = false;
        rVar.f48377o = false;
        rVar.f48375m = null;
        this.f48291f = 0;
        this.h = 0;
        this.f48292g = 0;
        this.f48293i = 0;
        this.f48296l = false;
    }
}
