package x3;

import c3.p;
import e2.v;
import java.io.EOFException;
public final class e {
    public final f f50792a = new f();
    public final v f50793b = new v(new byte[65025], 0);
    public int f50794c = -1;
    public int d;
    public boolean f50795e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.d = 0;
        do {
            int i13 = this.d;
            int i14 = i10 + i13;
            f fVar = this.f50792a;
            if (i14 >= fVar.f50798c) {
                break;
            }
            int[] iArr = fVar.f50800f;
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
        boolean z12 = this.f50795e;
        v vVar = this.f50793b;
        if (z12) {
            this.f50795e = false;
            vVar.G(0);
        }
        while (!this.f50795e) {
            int i11 = this.f50794c;
            f fVar = this.f50792a;
            if (i11 < 0) {
                if (fVar.b(pVar, -1L) && fVar.a(pVar, true)) {
                    int i12 = fVar.d;
                    if ((fVar.f50796a & 1) == 1 && vVar.f8583c == 0) {
                        i12 += a(0);
                        i10 = this.d;
                    } else {
                        i10 = 0;
                    }
                    try {
                        pVar.o(i12);
                        this.f50794c = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a2 = a(this.f50794c);
            int i13 = this.f50794c + this.d;
            if (a2 > 0) {
                vVar.c(vVar.f8583c + a2);
                try {
                    pVar.readFully(vVar.f8581a, vVar.f8583c, a2);
                    vVar.I(vVar.f8583c + a2);
                    if (fVar.f50800f[i13 - 1] != 255) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f50795e = z11;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i13 == fVar.f50798c) {
                i13 = -1;
            }
            this.f50794c = i13;
        }
        return true;
    }
}
