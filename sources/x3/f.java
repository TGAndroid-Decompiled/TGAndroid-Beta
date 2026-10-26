package x3;

import a8.yb;
import b2.x0;
import c3.p;
import e2.x;
import java.io.EOFException;
public final class f {
    public int f51381a;
    public long f51382b;
    public int f51383c;
    public int d;
    public int e;
    public final int[] f51384f = new int[255];
    public final x f51385g = new x(255);

    public final boolean a(p pVar, boolean z10) {
        boolean z11;
        boolean z12;
        this.f51381a = 0;
        this.f51382b = 0L;
        this.f51383c = 0;
        this.d = 0;
        this.e = 0;
        x xVar = this.f51385g;
        xVar.K(27);
        try {
            z11 = pVar.h(xVar.f9732a, 0, 27, z10);
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
                    throw x0.c("unsupported bit stream revision");
                }
            } else {
                this.f51381a = xVar.A();
                this.f51382b = xVar.p();
                xVar.r();
                xVar.r();
                xVar.r();
                int A = xVar.A();
                this.f51383c = A;
                this.d = A + 27;
                xVar.K(A);
                try {
                    z12 = pVar.h(xVar.f9732a, 0, this.f51383c, z10);
                } catch (EOFException e10) {
                    if (z10) {
                        z12 = false;
                    } else {
                        throw e10;
                    }
                }
                if (z12) {
                    for (int i10 = 0; i10 < this.f51383c; i10++) {
                        int A2 = xVar.A();
                        this.f51384f[i10] = A2;
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
        if (pVar.getPosition() == pVar.i()) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        x xVar = this.f51385g;
        xVar.K(4);
        while (true) {
            i10 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
            if (i10 != 0 && pVar.getPosition() + 4 >= j10) {
                break;
            }
            try {
                z11 = pVar.h(xVar.f9732a, 0, 4, true);
            } catch (EOFException unused) {
                z11 = false;
            }
            if (!z11) {
                break;
            }
            xVar.N(0);
            if (xVar.C() == 1332176723) {
                pVar.p();
                return true;
            }
            pVar.q(1);
        }
        do {
            if (i10 != 0 && pVar.getPosition() >= j10) {
                break;
            }
        } while (pVar.skip(1) != -1);
        return false;
    }
}
