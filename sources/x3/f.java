package x3;

import f5.w;
import j3.t1;
import java.io.EOFException;
import o3.l;
public final class f {
    public int f50069a;
    public long f50070b;
    public int f50071c;
    public int d;
    public int f50072e;
    public final int[] f50073f = new int[255];
    public final w f50074g = new w(255);

    public final boolean a(l lVar, boolean z10) {
        boolean z11;
        boolean z12;
        this.f50069a = 0;
        this.f50070b = 0L;
        this.f50071c = 0;
        this.d = 0;
        this.f50072e = 0;
        w wVar = this.f50074g;
        wVar.z(27);
        try {
            z11 = lVar.f(wVar.f6640a, 0, 27, z10);
        } catch (EOFException e10) {
            if (z10) {
                z11 = false;
            } else {
                throw e10;
            }
        }
        if (z11 && wVar.s() == 1332176723) {
            if (wVar.r() != 0) {
                if (!z10) {
                    throw t1.c("unsupported bit stream revision");
                }
            } else {
                this.f50069a = wVar.r();
                this.f50070b = wVar.h();
                wVar.i();
                wVar.i();
                wVar.i();
                int r6 = wVar.r();
                this.f50071c = r6;
                this.d = r6 + 27;
                wVar.z(r6);
                try {
                    z12 = lVar.f(wVar.f6640a, 0, this.f50071c, z10);
                } catch (EOFException e11) {
                    if (z10) {
                        z12 = false;
                    } else {
                        throw e11;
                    }
                }
                if (z12) {
                    for (int i10 = 0; i10 < this.f50071c; i10++) {
                        int r9 = wVar.r();
                        this.f50073f[i10] = r9;
                        this.f50072e += r9;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(l lVar, long j10) {
        boolean z10;
        int i10;
        boolean z11;
        if (lVar.getPosition() == lVar.h()) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.f(z10);
        w wVar = this.f50074g;
        wVar.z(4);
        while (true) {
            i10 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
            if (i10 != 0 && lVar.getPosition() + 4 >= j10) {
                break;
            }
            try {
                z11 = lVar.f(wVar.f6640a, 0, 4, true);
            } catch (EOFException unused) {
                z11 = false;
            }
            if (!z11) {
                break;
            }
            wVar.C(0);
            if (wVar.s() == 1332176723) {
                lVar.s();
                return true;
            }
            lVar.t(1);
        }
        do {
            if (i10 != 0 && lVar.getPosition() >= j10) {
                break;
            }
        } while (lVar.skip(1) != -1);
        return false;
    }
}
