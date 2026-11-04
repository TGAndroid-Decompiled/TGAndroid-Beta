package z3;

import b8.zb;
import e3.p;
import g2.y;
import java.io.EOFException;
public final class e {
    public final f f59666a = new f();
    public final y f59667b = new y(new byte[65025], 0);
    public int f59668c = -1;
    public int d;
    public boolean f59669e;

    public final int a(int i3) {
        int i10;
        int i11 = 0;
        this.d = 0;
        do {
            int i12 = this.d;
            int i13 = i3 + i12;
            f fVar = this.f59666a;
            if (i13 >= fVar.f59672c) {
                break;
            }
            int[] iArr = fVar.f59674f;
            this.d = i12 + 1;
            i10 = iArr[i13];
            i11 += i10;
        } while (i10 == 255);
        return i11;
    }

    public final boolean b(p pVar) {
        boolean z10;
        boolean z11;
        int i3;
        if (pVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        boolean z12 = this.f59669e;
        y yVar = this.f59667b;
        if (z12) {
            this.f59669e = false;
            yVar.K(0);
        }
        while (!this.f59669e) {
            int i10 = this.f59668c;
            f fVar = this.f59666a;
            if (i10 < 0) {
                if (fVar.b(pVar, -1L) && fVar.a(pVar, true)) {
                    int i11 = fVar.d;
                    if ((fVar.f59670a & 1) == 1 && yVar.f11925c == 0) {
                        i11 += a(0);
                        i3 = this.d;
                    } else {
                        i3 = 0;
                    }
                    try {
                        pVar.u(i11);
                        this.f59668c = i3;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a10 = a(this.f59668c);
            int i12 = this.f59668c + this.d;
            if (a10 > 0) {
                yVar.c(yVar.f11925c + a10);
                try {
                    pVar.readFully(yVar.f11923a, yVar.f11925c, a10);
                    yVar.M(yVar.f11925c + a10);
                    if (fVar.f59674f[i12 - 1] != 255) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f59669e = z11;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i12 == fVar.f59672c) {
                i12 = -1;
            }
            this.f59668c = i12;
        }
        return true;
    }
}
