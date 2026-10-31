package x3;

import c3.p;
import e2.x;
import java.io.EOFException;
import v7.t6;
public final class e {
    public final f f52974a = new f();
    public final x f52975b = new x(new byte[65025], 0);
    public int f52976c = -1;
    public int d;
    public boolean e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.d = 0;
        do {
            int i13 = this.d;
            int i14 = i10 + i13;
            f fVar = this.f52974a;
            if (i14 >= fVar.f52979c) {
                break;
            }
            int[] iArr = fVar.f52980f;
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
        t6.p(z10);
        boolean z12 = this.e;
        x xVar = this.f52975b;
        if (z12) {
            this.e = false;
            xVar.K(0);
        }
        while (!this.e) {
            int i11 = this.f52976c;
            f fVar = this.f52974a;
            if (i11 < 0) {
                if (fVar.b(pVar, -1L) && fVar.a(pVar, true)) {
                    int i12 = fVar.d;
                    if ((fVar.f52977a & 1) == 1 && xVar.f6209c == 0) {
                        i12 += a(0);
                        i10 = this.d;
                    } else {
                        i10 = 0;
                    }
                    try {
                        pVar.q(i12);
                        this.f52976c = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a2 = a(this.f52976c);
            int i13 = this.f52976c + this.d;
            if (a2 > 0) {
                xVar.c(xVar.f6209c + a2);
                try {
                    pVar.readFully(xVar.f6207a, xVar.f6209c, a2);
                    xVar.M(xVar.f6209c + a2);
                    if (fVar.f52980f[i13 - 1] != 255) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.e = z11;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i13 == fVar.f52979c) {
                i13 = -1;
            }
            this.f52976c = i13;
        }
        return true;
    }
}
