package x3;

import b2.s0;
import c3.p;
import e2.v;
import java.io.EOFException;
public final class f {
    public int f48822a;
    public long f48823b;
    public int f48824c;
    public int d;
    public int f48825e;
    public final int[] f48826f = new int[255];
    public final v f48827g = new v(255);

    public final boolean a(p pVar, boolean z10) {
        boolean z11;
        boolean z12;
        this.f48822a = 0;
        this.f48823b = 0L;
        this.f48824c = 0;
        this.d = 0;
        this.f48825e = 0;
        v vVar = this.f48827g;
        vVar.G(27);
        try {
            z11 = pVar.j(vVar.f8817a, 0, 27, z10);
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
                this.f48822a = vVar.x();
                this.f48823b = vVar.m();
                vVar.o();
                vVar.o();
                vVar.o();
                int x10 = vVar.x();
                this.f48824c = x10;
                this.d = x10 + 27;
                vVar.G(x10);
                try {
                    z12 = pVar.j(vVar.f8817a, 0, this.f48824c, z10);
                } catch (EOFException e10) {
                    if (z10) {
                        z12 = false;
                    } else {
                        throw e10;
                    }
                }
                if (z12) {
                    for (int i10 = 0; i10 < this.f48824c; i10++) {
                        int x11 = vVar.x();
                        this.f48826f[i10] = x11;
                        this.f48825e += x11;
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
        v vVar = this.f48827g;
        vVar.G(4);
        while (true) {
            i10 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
            if (i10 != 0 && pVar.getPosition() + 4 >= j3) {
                break;
            }
            try {
                z11 = pVar.j(vVar.f8817a, 0, 4, true);
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
