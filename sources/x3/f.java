package x3;

import b2.w0;
import c3.p;
import e2.x;
import java.io.EOFException;
import v7.u6;
public final class f {
    public int f49245a;
    public long f49246b;
    public int f49247c;
    public int d;
    public int e;
    public final int[] f49248f = new int[255];
    public final x f49249g = new x(255);

    public final boolean a(p pVar, boolean z10) {
        boolean z11;
        boolean z12;
        this.f49245a = 0;
        this.f49246b = 0L;
        this.f49247c = 0;
        this.d = 0;
        this.e = 0;
        x xVar = this.f49249g;
        xVar.K(27);
        try {
            z11 = pVar.j(xVar.f8294a, 0, 27, z10);
        } catch (EOFException e) {
            if (z10) {
                z11 = false;
            } else {
                throw e;
            }
        }
        if (z11 && xVar.C() == 1332176723) {
            if (xVar.A() != 0) {
                if (!z10) {
                    throw w0.c("unsupported bit stream revision");
                }
            } else {
                this.f49245a = xVar.A();
                this.f49246b = xVar.p();
                xVar.r();
                xVar.r();
                xVar.r();
                int A = xVar.A();
                this.f49247c = A;
                this.d = A + 27;
                xVar.K(A);
                try {
                    z12 = pVar.j(xVar.f8294a, 0, this.f49247c, z10);
                } catch (EOFException e7) {
                    if (z10) {
                        z12 = false;
                    } else {
                        throw e7;
                    }
                }
                if (z12) {
                    for (int i10 = 0; i10 < this.f49247c; i10++) {
                        int A2 = xVar.A();
                        this.f49248f[i10] = A2;
                        this.e += A2;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(p pVar, long j10) {
        boolean z10;
        int i10;
        boolean z11;
        if (pVar.getPosition() == pVar.k()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        x xVar = this.f49249g;
        xVar.K(4);
        while (true) {
            i10 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
            if (i10 != 0 && pVar.getPosition() + 4 >= j10) {
                break;
            }
            try {
                z11 = pVar.j(xVar.f8294a, 0, 4, true);
            } catch (EOFException unused) {
                z11 = false;
            }
            if (!z11) {
                break;
            }
            xVar.N(0);
            if (xVar.C() == 1332176723) {
                pVar.q();
                return true;
            }
            pVar.r(1);
        }
        do {
            if (i10 != 0 && pVar.getPosition() >= j10) {
                break;
            }
        } while (pVar.skip(1) != -1);
        return false;
    }
}
