package v3;

import d5.z;
import h3.t1;
import java.io.EOFException;
import m3.l;

public final class f {

    public int f48758a;

    public long f48759b;

    public int f48760c;
    public int d;

    public int f48761e;

    public final int[] f48762f = new int[255];

    public final z f48763g = new z(255);

    public final boolean a(l lVar, boolean z10) throws t1, EOFException {
        boolean zG;
        boolean zG2;
        this.f48758a = 0;
        this.f48759b = 0L;
        this.f48760c = 0;
        this.d = 0;
        this.f48761e = 0;
        z zVar = this.f48763g;
        zVar.z(27);
        try {
            zG = lVar.g(zVar.f4858a, 0, 27, z10);
        } catch (EOFException e9) {
            if (!z10) {
                throw e9;
            }
            zG = false;
        }
        if (zG && zVar.s() == 1332176723) {
            if (zVar.r() == 0) {
                this.f48758a = zVar.r();
                this.f48759b = zVar.h();
                zVar.i();
                zVar.i();
                zVar.i();
                int iR = zVar.r();
                this.f48760c = iR;
                this.d = iR + 27;
                zVar.z(iR);
                try {
                    zG2 = lVar.g(zVar.f4858a, 0, this.f48760c, z10);
                } catch (EOFException e10) {
                    if (!z10) {
                        throw e10;
                    }
                    zG2 = false;
                }
                if (zG2) {
                    for (int i10 = 0; i10 < this.f48760c; i10++) {
                        int iR2 = zVar.r();
                        this.f48762f[i10] = iR2;
                        this.f48761e += iR2;
                    }
                    return true;
                }
            } else if (!z10) {
                throw t1.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(l lVar, long j10) {
        boolean zG;
        d5.a.f(lVar.getPosition() == lVar.i());
        z zVar = this.f48763g;
        zVar.z(4);
        while (true) {
            if (j10 != -1 && lVar.getPosition() + 4 >= j10) {
                break;
            }
            try {
                zG = lVar.g(zVar.f4858a, 0, 4, true);
            } catch (EOFException unused) {
                zG = false;
            }
            if (!zG) {
                break;
            }
            zVar.C(0);
            if (zVar.s() == 1332176723) {
                lVar.q();
                return true;
            }
            lVar.t(1);
        }
        do {
            if (j10 != -1 && lVar.getPosition() >= j10) {
                break;
            }
        } while (lVar.skip(1) != -1);
        return false;
    }
}
