package x3;

import b2.w0;
import c3.p;
import e2.x;
import java.io.EOFException;
import v7.t6;
public final class f {
    public int f52977a;
    public long f52978b;
    public int f52979c;
    public int d;
    public int e;
    public final int[] f52980f = new int[255];
    public final x f52981g = new x(255);

    public final boolean a(p pVar, boolean z10) {
        boolean z11;
        boolean z12;
        this.f52977a = 0;
        this.f52978b = 0L;
        this.f52979c = 0;
        this.d = 0;
        this.e = 0;
        x xVar = this.f52981g;
        xVar.K(27);
        try {
            z11 = pVar.j(xVar.f6207a, 0, 27, z10);
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
                this.f52977a = xVar.A();
                this.f52978b = xVar.p();
                xVar.r();
                xVar.r();
                xVar.r();
                int A = xVar.A();
                this.f52979c = A;
                this.d = A + 27;
                xVar.K(A);
                try {
                    z12 = pVar.j(xVar.f6207a, 0, this.f52979c, z10);
                } catch (EOFException e7) {
                    if (z10) {
                        z12 = false;
                    } else {
                        throw e7;
                    }
                }
                if (z12) {
                    for (int i10 = 0; i10 < this.f52979c; i10++) {
                        int A2 = xVar.A();
                        this.f52980f[i10] = A2;
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
        t6.f(z10);
        x xVar = this.f52981g;
        xVar.K(4);
        while (true) {
            i10 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
            if (i10 != 0 && pVar.getPosition() + 4 >= j10) {
                break;
            }
            try {
                z11 = pVar.j(xVar.f6207a, 0, 4, true);
            } catch (EOFException unused) {
                z11 = false;
            }
            if (!z11) {
                break;
            }
            xVar.N(0);
            if (xVar.C() == 1332176723) {
                pVar.m();
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
