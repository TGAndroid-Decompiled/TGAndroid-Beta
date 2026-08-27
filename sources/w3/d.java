package w3;

import h3.t1;
import java.io.EOFException;
import java.io.InterruptedIOException;

public final class d implements m3.k {

    public final int f49019a;
    public final d5.z d;

    public final d5.y f49022e;

    public m3.m f49023f;

    public long f49024g;

    public boolean f49026j;

    public boolean f49027k;

    public boolean f49028l;

    public final e f49020b = new e(null, true);

    public final d5.z f49021c = new d5.z(2048);

    public int f49025i = -1;
    public long h = -1;

    public d(int i10) {
        this.f49019a = i10;
        d5.z zVar = new d5.z(10);
        this.d = zVar;
        byte[] bArr = zVar.f4858a;
        this.f49022e = new d5.y(bArr, bArr.length);
    }

    public final int a(m3.l lVar) {
        int i10 = 0;
        while (true) {
            d5.z zVar = this.d;
            lVar.b(0, 10, zVar.f4858a);
            zVar.C(0);
            if (zVar.t() != 4801587) {
                break;
            }
            zVar.D(3);
            int iQ = zVar.q();
            i10 += iQ + 10;
            lVar.j(iQ);
        }
        lVar.q();
        lVar.j(i10);
        if (this.h == -1) {
            this.h = i10;
        }
        return i10;
    }

    @Override
    public final int b(m3.l lVar, m3.n nVar) throws t1, EOFException, InterruptedIOException {
        d5.a.j(this.f49023f);
        long j10 = ((m3.h) lVar).f17612c;
        int i10 = this.f49019a;
        int i11 = 4;
        if ((i10 & 1) != 0 && j10 != -1) {
            d5.y yVar = this.f49022e;
            d5.z zVar = this.d;
            if (!this.f49026j) {
                this.f49025i = -1;
                m3.h hVar = (m3.h) lVar;
                hVar.f17614f = 0;
                long j11 = 0;
                if (hVar.d == 0) {
                    a(lVar);
                }
                int i12 = 0;
                while (true) {
                    try {
                        m3.h hVar2 = (m3.h) lVar;
                        if (!hVar2.g(zVar.f4858a, 0, 2, true)) {
                            break;
                        }
                        zVar.C(0);
                        if (!((zVar.w() & 65526) == 65520)) {
                            i12 = 0;
                            break;
                        }
                        if (!hVar2.g(zVar.f4858a, 0, i11, true)) {
                            break;
                        }
                        yVar.p(14);
                        int i13 = yVar.i(13);
                        if (i13 <= 6) {
                            this.f49026j = true;
                            throw t1.a("Malformed ADTS stream", null);
                        }
                        j11 += (long) i13;
                        i12++;
                        if (i12 == 1000 || !hVar2.a(i13 - 6, true)) {
                            break;
                            break;
                        }
                        i11 = 4;
                    } catch (EOFException unused) {
                    }
                }
                hVar.f17614f = 0;
                if (i12 > 0) {
                    this.f49025i = (int) (j11 / ((long) i12));
                } else {
                    this.f49025i = -1;
                }
                this.f49026j = true;
            }
        }
        d5.z zVar2 = this.f49021c;
        int i14 = ((m3.h) lVar).read(zVar2.f4858a, 0, 2048);
        boolean z10 = i14 == -1;
        boolean z11 = this.f49028l;
        e eVar = this.f49020b;
        if (!z11) {
            boolean z12 = (i10 & 1) != 0 && this.f49025i > 0;
            if (!z12 || eVar.f49045q != -9223372036854775807L || z10) {
                if (z12) {
                    long j12 = eVar.f49045q;
                    if (j12 != -9223372036854775807L) {
                        m3.m mVar = this.f49023f;
                        int i15 = this.f49025i;
                        mVar.n(new m3.g(j10, (int) ((((long) i15) * 8000000) / j12), i15, false, this.h));
                    } else {
                        this.f49023f.n(new m3.o(-9223372036854775807L));
                    }
                } else {
                    this.f49023f.n(new m3.o(-9223372036854775807L));
                }
                this.f49028l = true;
            }
        }
        if (z10) {
            return -1;
        }
        zVar2.C(0);
        zVar2.B(i14);
        if (!this.f49027k) {
            eVar.f(4, this.f49024g);
            this.f49027k = true;
        }
        eVar.b(zVar2);
        return 0;
    }

    @Override
    public final void c(m3.m mVar) {
        this.f49023f = mVar;
        this.f49020b.e(mVar, new e0(0, 1));
        mVar.A();
    }

    @Override
    public final boolean f(m3.l lVar) throws EOFException, InterruptedIOException {
        int iA = a(lVar);
        int i10 = iA;
        int i11 = 0;
        int i12 = 0;
        do {
            d5.z zVar = this.d;
            m3.h hVar = (m3.h) lVar;
            hVar.g(zVar.f4858a, 0, 2, false);
            zVar.C(0);
            if ((zVar.w() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                hVar.g(zVar.f4858a, 0, 4, false);
                d5.y yVar = this.f49022e;
                yVar.p(14);
                int i13 = yVar.i(13);
                if (i13 <= 6) {
                    i10++;
                    hVar.f17614f = 0;
                    hVar.a(i10, false);
                } else {
                    hVar.a(i13 - 6, false);
                    i12 += i13;
                }
            } else {
                i10++;
                hVar.f17614f = 0;
                hVar.a(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - iA < 8192);
        return false;
    }

    @Override
    public final void g(long j10, long j11) {
        this.f49027k = false;
        this.f49020b.c();
        this.f49024g = j11;
    }

    @Override
    public final void release() {
    }
}
