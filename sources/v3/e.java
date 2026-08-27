package v3;

import d5.z;
import java.io.EOFException;
import m3.l;

public final class e {

    public final f f48754a = new f();

    public final z f48755b = new z(new byte[65025], 0);

    public int f48756c = -1;
    public int d;

    public boolean f48757e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.d = 0;
        do {
            int i13 = this.d;
            int i14 = i10 + i13;
            f fVar = this.f48754a;
            if (i14 >= fVar.f48760c) {
                break;
            }
            int[] iArr = fVar.f48762f;
            this.d = i13 + 1;
            i11 = iArr[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final boolean b(l lVar) {
        int i10;
        d5.a.i(lVar != null);
        boolean z10 = this.f48757e;
        z zVar = this.f48755b;
        if (z10) {
            this.f48757e = false;
            zVar.z(0);
        }
        while (!this.f48757e) {
            int i11 = this.f48756c;
            f fVar = this.f48754a;
            if (i11 < 0) {
                if (fVar.b(lVar, -1L) && fVar.a(lVar, true)) {
                    int iA = fVar.d;
                    if ((fVar.f48758a & 1) == 1 && zVar.f4860c == 0) {
                        iA += a(0);
                        i10 = this.d;
                    } else {
                        i10 = 0;
                    }
                    try {
                        lVar.t(iA);
                        this.f48756c = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.f48756c);
            int i12 = this.f48756c + this.d;
            if (iA2 > 0) {
                zVar.b(zVar.f4860c + iA2);
                try {
                    lVar.readFully(zVar.f4858a, zVar.f4860c, iA2);
                    zVar.B(zVar.f4860c + iA2);
                    this.f48757e = fVar.f48762f[i12 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i12 == fVar.f48760c) {
                i12 = -1;
            }
            this.f48756c = i12;
        }
        return true;
    }
}
