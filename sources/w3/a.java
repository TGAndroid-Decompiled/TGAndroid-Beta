package w3;

import java.io.EOFException;
import java.io.InterruptedIOException;

public final class a implements m3.k {

    public final b f48980a = new b(null, 0);

    public final d5.z f48981b = new d5.z(2786);

    public boolean f48982c;

    @Override
    public final int b(m3.l lVar, m3.n nVar) throws EOFException, InterruptedIOException {
        d5.z zVar = this.f48981b;
        int i10 = ((m3.h) lVar).read(zVar.f4858a, 0, 2786);
        if (i10 == -1) {
            return -1;
        }
        zVar.C(0);
        zVar.B(i10);
        boolean z10 = this.f48982c;
        b bVar = this.f48980a;
        if (!z10) {
            bVar.f(4, 0L);
            this.f48982c = true;
        }
        bVar.b(zVar);
        return 0;
    }

    @Override
    public final void c(m3.m mVar) {
        this.f48980a.e(mVar, new e0(0, 1));
        mVar.A();
        mVar.n(new m3.o(-9223372036854775807L));
    }

    @Override
    public final boolean f(m3.l lVar) throws EOFException, InterruptedIOException {
        m3.h hVar;
        int iB;
        d5.z zVar = new d5.z(10);
        int i10 = 0;
        while (true) {
            hVar = (m3.h) lVar;
            hVar.g(zVar.f4858a, 0, 10, false);
            zVar.C(0);
            if (zVar.t() != 4801587) {
                break;
            }
            zVar.D(3);
            int iQ = zVar.q();
            i10 += iQ + 10;
            hVar.a(iQ, false);
        }
        hVar.f17614f = 0;
        hVar.a(i10, false);
        int i11 = i10;
        loop1: while (true) {
            int i12 = 0;
            while (true) {
                hVar.g(zVar.f4858a, 0, 6, false);
                zVar.C(0);
                if (zVar.w() != 2935) {
                    break;
                }
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = zVar.f4858a;
                if (bArr.length < 6) {
                    iB = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iB = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b10 = bArr[4];
                    iB = j3.b.b((b10 & 192) >> 6, b10 & 63);
                }
                if (iB == -1) {
                    break loop1;
                }
                hVar.a(iB - 6, false);
            }
            hVar.f17614f = 0;
            i11++;
            if (i11 - i10 >= 8192) {
                break;
            }
            hVar.a(i11, false);
        }
        return false;
    }

    @Override
    public final void g(long j10, long j11) {
        this.f48982c = false;
        this.f48980a.c();
    }

    @Override
    public final void release() {
    }
}
