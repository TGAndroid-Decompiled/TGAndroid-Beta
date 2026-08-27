package x3;

import android.util.Pair;
import c2.a1;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.p;
import d5.g0;
import d5.z;
import h3.t1;
import h7.b8;
import java.io.EOFException;
import java.io.InterruptedIOException;
import m3.h;
import m3.k;
import m3.l;
import m3.m;
import m3.n;
import m3.w;

public final class c implements k {

    public m f49350a;

    public w f49351b;

    public int f49352c;
    public long d;

    public b f49353e;

    public int f49354f;

    public long f49355g;

    @Override
    public final int b(l lVar, n nVar) throws t1, EOFException, InterruptedIOException {
        byte[] bArr;
        int iU;
        d5.a.j(this.f49351b);
        int i10 = g0.f4795a;
        int i11 = this.f49352c;
        if (i11 == 0) {
            d5.a.i(((h) lVar).d == 0);
            int i12 = this.f49354f;
            if (i12 != -1) {
                ((h) lVar).t(i12);
                this.f49352c = 4;
                return 0;
            }
            if (!b8.a(lVar)) {
                throw t1.a("Unsupported or unrecognized wav file type.", null);
            }
            h hVar = (h) lVar;
            hVar.t((int) (hVar.i() - hVar.d));
            this.f49352c = 1;
            return 0;
        }
        long jH = -1;
        if (i11 == 1) {
            z zVar = new z(8);
            k0 k0VarB = k0.b(lVar, zVar);
            if (k0VarB.f2999a != 1685272116) {
                ((h) lVar).f17614f = 0;
            } else {
                h hVar2 = (h) lVar;
                hVar2.a(8, false);
                zVar.C(0);
                hVar2.g(zVar.f4858a, 0, 8, false);
                jH = zVar.h();
                hVar2.t(((int) k0VarB.f3000b) + 8);
            }
            this.d = jH;
            this.f49352c = 2;
            return 0;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException();
                }
                d5.a.i(this.f49355g != -1);
                long j10 = this.f49355g - ((h) lVar).d;
                b bVar = this.f49353e;
                bVar.getClass();
                return bVar.a(lVar, j10) ? -1 : 0;
            }
            ((h) lVar).f17614f = 0;
            k0 k0VarB2 = b8.b(1684108385, lVar, new z(8));
            h hVar3 = (h) lVar;
            hVar3.t(8);
            Pair pairCreate = Pair.create(Long.valueOf(hVar3.d), Long.valueOf(k0VarB2.f3000b));
            this.f49354f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j11 = this.d;
            if (j11 != -1 && jLongValue == 4294967295L) {
                jLongValue = j11;
            }
            long j12 = ((long) this.f49354f) + jLongValue;
            this.f49355g = j12;
            long j13 = hVar3.f17612c;
            if (j13 != -1 && j12 > j13) {
                d5.a.K("WavExtractor", "Data exceeds input length: " + this.f49355g + ", " + j13);
                this.f49355g = j13;
            }
            b bVar2 = this.f49353e;
            bVar2.getClass();
            bVar2.c(this.f49354f, this.f49355g);
            this.f49352c = 4;
            return 0;
        }
        z zVar2 = new z(16);
        long j14 = b8.b(1718449184, lVar, zVar2).f3000b;
        d5.a.i(j14 >= 16);
        h hVar4 = (h) lVar;
        hVar4.g(zVar2.f4858a, 0, 16, false);
        zVar2.C(0);
        int iK = zVar2.k();
        int iK2 = zVar2.k();
        int iJ = zVar2.j();
        zVar2.j();
        int iK3 = zVar2.k();
        int iK4 = zVar2.k();
        int i13 = ((int) j14) - 16;
        if (i13 > 0) {
            bArr = new byte[i13];
            hVar4.g(bArr, 0, i13, false);
        } else {
            bArr = g0.f4799f;
        }
        hVar4.t((int) (hVar4.i() - hVar4.d));
        a1 a1Var = new a1();
        a1Var.f2229a = iK2;
        a1Var.f2230b = iJ;
        a1Var.f2231c = iK3;
        a1Var.d = iK4;
        a1Var.f2232e = bArr;
        if (iK == 17) {
            this.f49353e = new a(this.f49350a, this.f49351b, a1Var);
        } else if (iK == 6) {
            this.f49353e = new p(this.f49350a, this.f49351b, a1Var, "audio/g711-alaw", -1);
        } else if (iK == 7) {
            this.f49353e = new p(this.f49350a, this.f49351b, a1Var, "audio/g711-mlaw", -1);
        } else {
            if (iK == 1) {
                iU = g0.u(iK4);
            } else {
                if (iK != 3) {
                    if (iK == 65534) {
                        iU = g0.u(iK4);
                    }
                } else if (iK4 == 32) {
                    iU = 4;
                }
                iU = 0;
            }
            if (iU == 0) {
                throw t1.c("Unsupported WAV format type: " + iK);
            }
            this.f49353e = new p(this.f49350a, this.f49351b, a1Var, "audio/raw", iU);
        }
        this.f49352c = 3;
        return 0;
    }

    @Override
    public final void c(m mVar) {
        this.f49350a = mVar;
        this.f49351b = mVar.C(0, 1);
        mVar.A();
    }

    @Override
    public final boolean f(l lVar) {
        return b8.a(lVar);
    }

    @Override
    public final void g(long j10, long j11) {
        this.f49352c = j10 == 0 ? 0 : 4;
        b bVar = this.f49353e;
        if (bVar != null) {
            bVar.b(j11);
        }
    }

    @Override
    public final void release() {
    }
}
