package w3;

import java.io.EOFException;
import java.io.InterruptedIOException;

public final class c implements m3.k {

    public final b f49000a = new b(null, 1);

    public final d5.z f49001b = new d5.z(16384);

    public boolean f49002c;

    @Override
    public final int b(m3.l lVar, m3.n nVar) throws EOFException, InterruptedIOException {
        d5.z zVar = this.f49001b;
        int i10 = ((m3.h) lVar).read(zVar.f4858a, 0, 16384);
        if (i10 == -1) {
            return -1;
        }
        zVar.C(0);
        zVar.B(i10);
        boolean z10 = this.f49002c;
        b bVar = this.f49000a;
        if (!z10) {
            bVar.f(4, 0L);
            this.f49002c = true;
        }
        bVar.b(zVar);
        return 0;
    }

    @Override
    public final void c(m3.m mVar) {
        this.f49000a.e(mVar, new e0(0, 1));
        mVar.A();
        mVar.n(new m3.o(-9223372036854775807L));
    }

    @Override
    public final boolean f(m3.l lVar) throws EOFException, InterruptedIOException {
        m3.h hVar;
        int i10;
        d5.z zVar = new d5.z(10);
        int i11 = 0;
        while (true) {
            hVar = (m3.h) lVar;
            hVar.g(zVar.f4858a, 0, 10, false);
            zVar.C(0);
            if (zVar.t() != 4801587) {
                break;
            }
            zVar.D(3);
            int iQ = zVar.q();
            i11 += iQ + 10;
            hVar.a(iQ, false);
        }
        hVar.f17614f = 0;
        hVar.a(i11, false);
        int i12 = i11;
        loop1: while (true) {
            int i13 = 0;
            while (true) {
                int i14 = 7;
                hVar.g(zVar.f4858a, 0, 7, false);
                zVar.C(0);
                int iW = zVar.w();
                if (iW == 44096 || iW == 44097) {
                    i13++;
                    if (i13 >= 4) {
                        return true;
                    }
                    byte[] bArr = zVar.f4858a;
                    if (bArr.length < 7) {
                        i10 = -1;
                    } else {
                        int i15 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                        if (i15 == 65535) {
                            i15 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                        } else {
                            i14 = 4;
                        }
                        if (iW == 44097) {
                            i14 += 2;
                        }
                        i10 = i15 + i14;
                    }
                    if (i10 == -1) {
                        break loop1;
                    }
                    hVar.a(i10 - 7, false);
                }
            }
            hVar.f17614f = 0;
            i12++;
            if (i12 - i11 >= 8192) {
                break;
            }
            hVar.a(i12, false);
        }
        return false;
    }

    @Override
    public final void g(long j10, long j11) {
        this.f49002c = false;
        this.f49000a.c();
    }

    @Override
    public final void release() {
    }
}
