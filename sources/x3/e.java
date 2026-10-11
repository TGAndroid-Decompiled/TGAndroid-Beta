package x3;

import c3.p;
import e2.v;
import java.io.EOFException;
public final class e {
    public final f f50685a = new f();
    public final v f50686b = new v(new byte[65025], 0);
    public int f50687c = -1;
    public int d;
    public boolean f50688e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.d = 0;
        do {
            int i13 = this.d;
            int i14 = i10 + i13;
            f fVar = this.f50685a;
            if (i14 >= fVar.f50691c) {
                break;
            }
            int[] iArr = fVar.f50693f;
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
        e2.d.g(z10);
        boolean z12 = this.f50688e;
        v vVar = this.f50686b;
        if (z12) {
            this.f50688e = false;
            vVar.G(0);
        }
        while (!this.f50688e) {
            int i11 = this.f50687c;
            f fVar = this.f50685a;
            if (i11 < 0) {
                if (fVar.b(pVar, -1L) && fVar.a(pVar, true)) {
                    int i12 = fVar.d;
                    if ((fVar.f50689a & 1) == 1 && vVar.f8585c == 0) {
                        i12 += a(0);
                        i10 = this.d;
                    } else {
                        i10 = 0;
                    }
                    try {
                        pVar.r(i12);
                        this.f50687c = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a2 = a(this.f50687c);
            int i13 = this.f50687c + this.d;
            if (a2 > 0) {
                vVar.c(vVar.f8585c + a2);
                try {
                    pVar.readFully(vVar.f8583a, vVar.f8585c, a2);
                    vVar.I(vVar.f8585c + a2);
                    if (fVar.f50693f[i13 - 1] != 255) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f50688e = z11;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i13 == fVar.f50691c) {
                i13 = -1;
            }
            this.f50687c = i13;
        }
        return true;
    }
}
