package x3;

import c3.p;
import e2.v;
import java.io.EOFException;
public final class e {
    public final f f45258a = new f();
    public final v f45259b = new v(new byte[65025], 0);
    public int f45260c = -1;
    public int d;
    public boolean e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.d = 0;
        do {
            int i13 = this.d;
            int i14 = i10 + i13;
            f fVar = this.f45258a;
            if (i14 >= fVar.f45263c) {
                break;
            }
            int[] iArr = fVar.f45264f;
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
        boolean z12 = this.e;
        v vVar = this.f45259b;
        if (z12) {
            this.e = false;
            vVar.G(0);
        }
        while (!this.e) {
            int i11 = this.f45260c;
            f fVar = this.f45258a;
            if (i11 < 0) {
                if (fVar.b(pVar, -1L) && fVar.a(pVar, true)) {
                    int i12 = fVar.d;
                    if ((fVar.f45261a & 1) == 1 && vVar.f7936c == 0) {
                        i12 += a(0);
                        i10 = this.d;
                    } else {
                        i10 = 0;
                    }
                    try {
                        pVar.q(i12);
                        this.f45260c = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a2 = a(this.f45260c);
            int i13 = this.f45260c + this.d;
            if (a2 > 0) {
                vVar.c(vVar.f7936c + a2);
                try {
                    pVar.readFully(vVar.f7934a, vVar.f7936c, a2);
                    vVar.I(vVar.f7936c + a2);
                    if (fVar.f45264f[i13 - 1] != 255) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.e = z11;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i13 == fVar.f45263c) {
                i13 = -1;
            }
            this.f45260c = i13;
        }
        return true;
    }
}
