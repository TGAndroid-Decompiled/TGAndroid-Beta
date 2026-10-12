package x3;

import c3.p;
import e2.x;
import java.io.EOFException;
import v7.u6;
public final class e {
    public final f f47809a = new f();
    public final x f47810b = new x(new byte[65025], 0);
    public int f47811c = -1;
    public int d;
    public boolean e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.d = 0;
        do {
            int i13 = this.d;
            int i14 = i10 + i13;
            f fVar = this.f47809a;
            if (i14 >= fVar.f47814c) {
                break;
            }
            int[] iArr = fVar.f47815f;
            this.d = i13 + 1;
            i11 = iArr[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final boolean b(p pVar) {
        boolean z10;
        boolean z11;
        int i10;
        if (pVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        boolean z12 = this.e;
        x xVar = this.f47810b;
        if (z12) {
            this.e = false;
            xVar.K(0);
        }
        while (!this.e) {
            int i11 = this.f47811c;
            f fVar = this.f47809a;
            if (i11 < 0) {
                if (fVar.b(pVar, -1L) && fVar.a(pVar, true)) {
                    int i12 = fVar.d;
                    if ((fVar.f47812a & 1) == 1 && xVar.f8413c == 0) {
                        i12 += a(0);
                        i10 = this.d;
                    } else {
                        i10 = 0;
                    }
                    try {
                        pVar.r(i12);
                        this.f47811c = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a2 = a(this.f47811c);
            int i13 = this.f47811c + this.d;
            if (a2 > 0) {
                xVar.c(xVar.f8413c + a2);
                try {
                    pVar.readFully(xVar.f8411a, xVar.f8413c, a2);
                    xVar.M(xVar.f8413c + a2);
                    if (fVar.f47815f[i13 - 1] != 255) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.e = z11;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i13 == fVar.f47814c) {
                i13 = -1;
            }
            this.f47811c = i13;
        }
        return true;
    }
}
