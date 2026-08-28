package v3;

import d5.y;
import h3.t1;
import java.io.EOFException;
import m3.l;
public final class f {
    public int f48331a;
    public long f48332b;
    public int f48333c;
    public int d;
    public int f48334e;
    public final int[] f48335f = new int[255];
    public final y f48336g = new y(255);

    public final boolean a(l lVar, boolean z10) {
        boolean z11;
        boolean z12;
        this.f48331a = 0;
        this.f48332b = 0L;
        this.f48333c = 0;
        this.d = 0;
        this.f48334e = 0;
        y yVar = this.f48336g;
        yVar.z(27);
        try {
            z11 = lVar.g(yVar.f4410a, 0, 27, z10);
        } catch (EOFException e10) {
            if (z10) {
                z11 = false;
            } else {
                throw e10;
            }
        }
        if (z11 && yVar.s() == 1332176723) {
            if (yVar.r() != 0) {
                if (!z10) {
                    throw t1.c("unsupported bit stream revision");
                }
            } else {
                this.f48331a = yVar.r();
                this.f48332b = yVar.h();
                yVar.i();
                yVar.i();
                yVar.i();
                int r10 = yVar.r();
                this.f48333c = r10;
                this.d = r10 + 27;
                yVar.z(r10);
                try {
                    z12 = lVar.g(yVar.f4410a, 0, this.f48333c, z10);
                } catch (EOFException e11) {
                    if (z10) {
                        z12 = false;
                    } else {
                        throw e11;
                    }
                }
                if (z12) {
                    for (int i9 = 0; i9 < this.f48333c; i9++) {
                        int r11 = yVar.r();
                        this.f48335f[i9] = r11;
                        this.f48334e += r11;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(l lVar, long j10) {
        boolean z10;
        int i9;
        boolean z11;
        if (lVar.getPosition() == lVar.k()) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.f(z10);
        y yVar = this.f48336g;
        yVar.z(4);
        while (true) {
            i9 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
            if (i9 != 0 && lVar.getPosition() + 4 >= j10) {
                break;
            }
            try {
                z11 = lVar.g(yVar.f4410a, 0, 4, true);
            } catch (EOFException unused) {
                z11 = false;
            }
            if (!z11) {
                break;
            }
            yVar.C(0);
            if (yVar.s() == 1332176723) {
                lVar.t();
                return true;
            }
            lVar.u(1);
        }
        do {
            if (i9 != 0 && lVar.getPosition() >= j10) {
                break;
            }
        } while (lVar.skip(1) != -1);
        return false;
    }
}
