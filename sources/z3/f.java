package z3;

import b8.zb;
import d2.v0;
import e3.p;
import g2.y;
import java.io.EOFException;
public final class f {
    public int f59670a;
    public long f59671b;
    public int f59672c;
    public int d;
    public int f59673e;
    public final int[] f59674f = new int[255];
    public final y f59675g = new y(255);

    public final boolean a(p pVar, boolean z10) {
        boolean z11;
        boolean z12;
        this.f59670a = 0;
        this.f59671b = 0L;
        this.f59672c = 0;
        this.d = 0;
        this.f59673e = 0;
        y yVar = this.f59675g;
        yVar.K(27);
        try {
            z11 = pVar.h(yVar.f11923a, 0, 27, z10);
        } catch (EOFException e10) {
            if (z10) {
                z11 = false;
            } else {
                throw e10;
            }
        }
        if (z11 && yVar.C() == 1332176723) {
            if (yVar.A() != 0) {
                if (!z10) {
                    throw v0.c("unsupported bit stream revision");
                }
            } else {
                this.f59670a = yVar.A();
                this.f59671b = yVar.p();
                yVar.r();
                yVar.r();
                yVar.r();
                int A = yVar.A();
                this.f59672c = A;
                this.d = A + 27;
                yVar.K(A);
                try {
                    z12 = pVar.h(yVar.f11923a, 0, this.f59672c, z10);
                } catch (EOFException e11) {
                    if (z10) {
                        z12 = false;
                    } else {
                        throw e11;
                    }
                }
                if (z12) {
                    for (int i3 = 0; i3 < this.f59672c; i3++) {
                        int A2 = yVar.A();
                        this.f59674f[i3] = A2;
                        this.f59673e += A2;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(p pVar, long j10) {
        boolean z10;
        int i3;
        boolean z11;
        if (pVar.getPosition() == pVar.k()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        y yVar = this.f59675g;
        yVar.K(4);
        while (true) {
            i3 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
            if (i3 != 0 && pVar.getPosition() + 4 >= j10) {
                break;
            }
            try {
                z11 = pVar.h(yVar.f11923a, 0, 4, true);
            } catch (EOFException unused) {
                z11 = false;
            }
            if (!z11) {
                break;
            }
            yVar.N(0);
            if (yVar.C() == 1332176723) {
                pVar.o();
                return true;
            }
            pVar.u(1);
        }
        do {
            if (i3 != 0 && pVar.getPosition() >= j10) {
                break;
            }
        } while (pVar.skip(1) != -1);
        return false;
    }
}
