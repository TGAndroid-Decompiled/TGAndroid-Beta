package x3;

import f5.w;
import java.io.EOFException;
import o3.l;
public final class e {
    public final f f50065a = new f();
    public final w f50066b = new w(new byte[65025], 0);
    public int f50067c = -1;
    public int d;
    public boolean f50068e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.d = 0;
        do {
            int i13 = this.d;
            int i14 = i10 + i13;
            f fVar = this.f50065a;
            if (i14 >= fVar.f50071c) {
                break;
            }
            int[] iArr = fVar.f50073f;
            this.d = i13 + 1;
            i11 = iArr[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final boolean b(l lVar) {
        boolean z10;
        boolean z11;
        int i10;
        if (lVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.i(z10);
        boolean z12 = this.f50068e;
        w wVar = this.f50066b;
        if (z12) {
            this.f50068e = false;
            wVar.z(0);
        }
        while (!this.f50068e) {
            int i11 = this.f50067c;
            f fVar = this.f50065a;
            if (i11 < 0) {
                if (fVar.b(lVar, -1L) && fVar.a(lVar, true)) {
                    int i12 = fVar.d;
                    if ((fVar.f50069a & 1) == 1 && wVar.f6642c == 0) {
                        i12 += a(0);
                        i10 = this.d;
                    } else {
                        i10 = 0;
                    }
                    try {
                        lVar.t(i12);
                        this.f50067c = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a2 = a(this.f50067c);
            int i13 = this.f50067c + this.d;
            if (a2 > 0) {
                wVar.b(wVar.f6642c + a2);
                try {
                    lVar.readFully(wVar.f6640a, wVar.f6642c, a2);
                    wVar.B(wVar.f6642c + a2);
                    if (fVar.f50073f[i13 - 1] != 255) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f50068e = z11;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i13 == fVar.f50071c) {
                i13 = -1;
            }
            this.f50067c = i13;
        }
        return true;
    }
}
