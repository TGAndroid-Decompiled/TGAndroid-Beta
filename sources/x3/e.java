package x3;

import c3.p;
import e2.x;
import java.io.EOFException;
import v7.u6;
public final class e {
    public final f f49196a = new f();
    public final x f49197b = new x(new byte[65025], 0);
    public int f49198c = -1;
    public int d;
    public boolean e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.d = 0;
        do {
            int i13 = this.d;
            int i14 = i10 + i13;
            f fVar = this.f49196a;
            if (i14 >= fVar.f49201c) {
                break;
            }
            int[] iArr = fVar.f49202f;
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
        x xVar = this.f49197b;
        if (z12) {
            this.e = false;
            xVar.K(0);
        }
        while (!this.e) {
            int i11 = this.f49198c;
            f fVar = this.f49196a;
            if (i11 < 0) {
                if (fVar.b(pVar, -1L) && fVar.a(pVar, true)) {
                    int i12 = fVar.d;
                    if ((fVar.f49199a & 1) == 1 && xVar.f8293c == 0) {
                        i12 += a(0);
                        i10 = this.d;
                    } else {
                        i10 = 0;
                    }
                    try {
                        pVar.r(i12);
                        this.f49198c = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a2 = a(this.f49198c);
            int i13 = this.f49198c + this.d;
            if (a2 > 0) {
                xVar.c(xVar.f8293c + a2);
                try {
                    pVar.readFully(xVar.f8291a, xVar.f8293c, a2);
                    xVar.M(xVar.f8293c + a2);
                    if (fVar.f49202f[i13 - 1] != 255) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.e = z11;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i13 == fVar.f49201c) {
                i13 = -1;
            }
            this.f49198c = i13;
        }
        return true;
    }
}
