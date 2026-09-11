package x3;

import b2.s0;
import c3.p;
import e2.v;
import java.io.EOFException;
public final class f {
    public int f48792a;
    public long f48793b;
    public int f48794c;
    public int d;
    public int f48795e;
    public final int[] f48796f = new int[255];
    public final v f48797g = new v(255);

    public final boolean a(p pVar, boolean z10) {
        boolean z11;
        boolean z12;
        this.f48792a = 0;
        this.f48793b = 0L;
        this.f48794c = 0;
        this.d = 0;
        this.f48795e = 0;
        v vVar = this.f48797g;
        vVar.G(27);
        try {
            z11 = pVar.j(vVar.f8789a, 0, 27, z10);
        } catch (EOFException e7) {
            if (z10) {
                z11 = false;
            } else {
                throw e7;
            }
        }
        if (z11 && vVar.z() == 1332176723) {
            if (vVar.x() != 0) {
                if (!z10) {
                    throw s0.c("unsupported bit stream revision");
                }
            } else {
                this.f48792a = vVar.x();
                this.f48793b = vVar.m();
                vVar.o();
                vVar.o();
                vVar.o();
                int x10 = vVar.x();
                this.f48794c = x10;
                this.d = x10 + 27;
                vVar.G(x10);
                try {
                    z12 = pVar.j(vVar.f8789a, 0, this.f48794c, z10);
                } catch (EOFException e10) {
                    if (z10) {
                        z12 = false;
                    } else {
                        throw e10;
                    }
                }
                if (z12) {
                    for (int i10 = 0; i10 < this.f48794c; i10++) {
                        int x11 = vVar.x();
                        this.f48796f[i10] = x11;
                        this.f48795e += x11;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(p pVar, long j3) {
        boolean z10;
        int i10;
        boolean z11;
        if (pVar.getPosition() == pVar.k()) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        v vVar = this.f48797g;
        vVar.G(4);
        while (true) {
            i10 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
            if (i10 != 0 && pVar.getPosition() + 4 >= j3) {
                break;
            }
            try {
                z11 = pVar.j(vVar.f8789a, 0, 4, true);
            } catch (EOFException unused) {
                z11 = false;
            }
            if (!z11) {
                break;
            }
            vVar.J(0);
            if (vVar.z() == 1332176723) {
                pVar.q();
                return true;
            }
            pVar.r(1);
        }
        do {
            if (i10 != 0 && pVar.getPosition() >= j3) {
                break;
            }
        } while (pVar.skip(1) != -1);
        return false;
    }
}
