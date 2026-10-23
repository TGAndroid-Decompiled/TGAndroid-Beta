package x3;

import b2.w0;
import c3.r;
import e2.x;
import java.io.EOFException;
import v7.u6;
public final class f {
    public int f49650a;
    public long f49651b;
    public int f49652c;
    public int d;
    public int e;
    public final int[] f49653f = new int[255];
    public final x f49654g = new x(255);

    public final boolean a(r rVar, boolean z10) {
        boolean z11;
        boolean z12;
        this.f49650a = 0;
        this.f49651b = 0L;
        this.f49652c = 0;
        this.d = 0;
        this.e = 0;
        x xVar = this.f49654g;
        xVar.K(27);
        try {
            z11 = rVar.j(xVar.f8298a, 0, 27, z10);
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
                this.f49650a = xVar.A();
                this.f49651b = xVar.p();
                xVar.r();
                xVar.r();
                xVar.r();
                int A = xVar.A();
                this.f49652c = A;
                this.d = A + 27;
                xVar.K(A);
                try {
                    z12 = rVar.j(xVar.f8298a, 0, this.f49652c, z10);
                } catch (EOFException e7) {
                    if (z10) {
                        z12 = false;
                    } else {
                        throw e7;
                    }
                }
                if (z12) {
                    for (int i10 = 0; i10 < this.f49652c; i10++) {
                        int A2 = xVar.A();
                        this.f49653f[i10] = A2;
                        this.e += A2;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(r rVar, long j10) {
        boolean z10;
        int i10;
        boolean z11;
        if (rVar.getPosition() == rVar.k()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        x xVar = this.f49654g;
        xVar.K(4);
        while (true) {
            i10 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
            if (i10 != 0 && rVar.getPosition() + 4 >= j10) {
                break;
            }
            try {
                z11 = rVar.j(xVar.f8298a, 0, 4, true);
            } catch (EOFException unused) {
                z11 = false;
            }
            if (!z11) {
                break;
            }
            xVar.N(0);
            if (xVar.C() == 1332176723) {
                rVar.q();
                return true;
            }
            rVar.r(1);
        }
        do {
            if (i10 != 0 && rVar.getPosition() >= j10) {
                break;
            }
        } while (rVar.skip(1) != -1);
        return false;
    }
}
