package x3;

import a8.yb;
import c3.p;
import e2.x;
import java.io.EOFException;
public final class e {
    public final f f51375a = new f();
    public final x f51376b = new x(new byte[65025], 0);
    public int f51377c = -1;
    public int d;
    public boolean e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.d = 0;
        do {
            int i13 = this.d;
            int i14 = i10 + i13;
            f fVar = this.f51375a;
            if (i14 >= fVar.f51380c) {
                break;
            }
            int[] iArr = fVar.f51381f;
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
        yb.p(z10);
        boolean z12 = this.e;
        x xVar = this.f51376b;
        if (z12) {
            this.e = false;
            xVar.K(0);
        }
        while (!this.e) {
            int i11 = this.f51377c;
            f fVar = this.f51375a;
            if (i11 < 0) {
                if (fVar.b(pVar, -1L) && fVar.a(pVar, true)) {
                    int i12 = fVar.d;
                    if ((fVar.f51378a & 1) == 1 && xVar.f9734c == 0) {
                        i12 += a(0);
                        i10 = this.d;
                    } else {
                        i10 = 0;
                    }
                    try {
                        pVar.q(i12);
                        this.f51377c = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a2 = a(this.f51377c);
            int i13 = this.f51377c + this.d;
            if (a2 > 0) {
                xVar.c(xVar.f9734c + a2);
                try {
                    pVar.readFully(xVar.f9732a, xVar.f9734c, a2);
                    xVar.M(xVar.f9734c + a2);
                    if (fVar.f51381f[i13 - 1] != 255) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.e = z11;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i13 == fVar.f51380c) {
                i13 = -1;
            }
            this.f51377c = i13;
        }
        return true;
    }
}
