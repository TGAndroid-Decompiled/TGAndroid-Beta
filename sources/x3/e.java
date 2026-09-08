package x3;

import c3.p;
import e2.v;
import java.io.EOFException;
public final class e {
    public final f f48817a = new f();
    public final v f48818b = new v(new byte[65025], 0);
    public int f48819c = -1;
    public int d;
    public boolean f48820e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.d = 0;
        do {
            int i13 = this.d;
            int i14 = i10 + i13;
            f fVar = this.f48817a;
            if (i14 >= fVar.f48823c) {
                break;
            }
            int[] iArr = fVar.f48825f;
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
        boolean z12 = this.f48820e;
        v vVar = this.f48818b;
        if (z12) {
            this.f48820e = false;
            vVar.G(0);
        }
        while (!this.f48820e) {
            int i11 = this.f48819c;
            f fVar = this.f48817a;
            if (i11 < 0) {
                if (fVar.b(pVar, -1L) && fVar.a(pVar, true)) {
                    int i12 = fVar.d;
                    if ((fVar.f48821a & 1) == 1 && vVar.f8819c == 0) {
                        i12 += a(0);
                        i10 = this.d;
                    } else {
                        i10 = 0;
                    }
                    try {
                        pVar.r(i12);
                        this.f48819c = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a2 = a(this.f48819c);
            int i13 = this.f48819c + this.d;
            if (a2 > 0) {
                vVar.c(vVar.f8819c + a2);
                try {
                    pVar.readFully(vVar.f8817a, vVar.f8819c, a2);
                    vVar.I(vVar.f8819c + a2);
                    if (fVar.f48825f[i13 - 1] != 255) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f48820e = z11;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i13 == fVar.f48823c) {
                i13 = -1;
            }
            this.f48819c = i13;
        }
        return true;
    }
}
