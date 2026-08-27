package w3;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import org.telegram.ui.i6;

public final class x implements m3.k {

    public boolean f49230e;

    public boolean f49231f;

    public boolean f49232g;
    public long h;

    public p3.a f49233i;

    public m3.m f49234j;

    public boolean f49235k;

    public final d5.f0 f49227a = new d5.f0(0);

    public final d5.z f49229c = new d5.z(4096);

    public final SparseArray f49228b = new SparseArray();
    public final v d = new v(0);

    @Override
    public final int b(m3.l lVar, m3.n nVar) throws EOFException, InterruptedIOException {
        ?? r10;
        h jVar;
        long j10;
        long j11;
        d5.a.j(this.f49234j);
        long j12 = ((m3.h) lVar).f17612c;
        v vVar = this.d;
        if (j12 != -1 && !vVar.d) {
            d5.f0 f0Var = vVar.f49215b;
            d5.z zVar = vVar.f49216c;
            if (!vVar.f49218f) {
                m3.h hVar = (m3.h) lVar;
                long j13 = hVar.f17612c;
                int iMin = (int) Math.min(20000L, j13);
                long j14 = j13 - ((long) iMin);
                if (hVar.d != j14) {
                    nVar.f17620a = j14;
                    return 1;
                }
                zVar.z(iMin);
                hVar.f17614f = 0;
                hVar.g(zVar.f4858a, 0, iMin, false);
                int i10 = zVar.f4859b;
                for (int i11 = zVar.f4860c - 4; i11 >= i10; i11--) {
                    if (v.b(i11, zVar.f4858a) == 442) {
                        zVar.C(i11 + 4);
                        long jC = v.c(zVar);
                        if (jC != -9223372036854775807L) {
                            j11 = jC;
                            vVar.h = j11;
                            vVar.f49218f = true;
                            return 0;
                        }
                    }
                }
                j11 = -9223372036854775807L;
                vVar.h = j11;
                vVar.f49218f = true;
                return 0;
            }
            if (vVar.h == -9223372036854775807L) {
                vVar.a(lVar);
                return 0;
            }
            if (vVar.f49217e) {
                long j15 = vVar.f49219g;
                if (j15 == -9223372036854775807L) {
                    vVar.a(lVar);
                    return 0;
                }
                long jB = f0Var.b(vVar.h) - f0Var.b(j15);
                vVar.f49220i = jB;
                if (jB < 0) {
                    d5.a.K("PsDurationReader", "Invalid duration: " + vVar.f49220i + ". Using TIME_UNSET instead.");
                    vVar.f49220i = -9223372036854775807L;
                }
                vVar.a(lVar);
                return 0;
            }
            m3.h hVar2 = (m3.h) lVar;
            int iMin2 = (int) Math.min(20000L, hVar2.f17612c);
            long j16 = 0;
            if (hVar2.d != j16) {
                nVar.f17620a = j16;
                return 1;
            }
            zVar.z(iMin2);
            hVar2.f17614f = 0;
            hVar2.g(zVar.f4858a, 0, iMin2, false);
            int i12 = zVar.f4860c;
            for (int i13 = zVar.f4859b; i13 < i12 - 3; i13++) {
                if (v.b(i13, zVar.f4858a) == 442) {
                    zVar.C(i13 + 4);
                    long jC2 = v.c(zVar);
                    if (jC2 != -9223372036854775807L) {
                        j10 = jC2;
                        vVar.f49219g = j10;
                        vVar.f49217e = true;
                        return 0;
                    }
                }
            }
            j10 = -9223372036854775807L;
            vVar.f49219g = j10;
            vVar.f49217e = true;
            return 0;
        }
        if (this.f49235k) {
            r10 = 0;
        } else {
            this.f49235k = true;
            long j17 = vVar.f49220i;
            if (j17 != -9223372036854775807L) {
                r10 = 0;
                p3.a aVar = new p3.a(new e7.v(14), new i6(vVar.f49215b), j17, j17 + 1, 0L, j12, 188L, 1000);
                this.f49233i = aVar;
                this.f49234j.n(aVar.f45345a);
            } else {
                r10 = 0;
                this.f49234j.n(new m3.o(j17));
            }
        }
        p3.a aVar2 = this.f49233i;
        if (aVar2 != null && aVar2.f45347c != null) {
            return aVar2.b(lVar, nVar);
        }
        m3.h hVar3 = (m3.h) lVar;
        hVar3.f17614f = r10;
        long jI = j12 != -1 ? j12 - hVar3.i() : -1L;
        if (jI != -1 && jI < 4) {
            return -1;
        }
        d5.z zVar2 = this.f49229c;
        if (!hVar3.g(zVar2.f4858a, r10, 4, true)) {
            return -1;
        }
        zVar2.C(r10);
        int iE = zVar2.e();
        if (iE == 441) {
            return -1;
        }
        if (iE == 442) {
            hVar3.g(zVar2.f4858a, r10, 10, r10);
            zVar2.C(9);
            hVar3.t((zVar2.r() & 7) + 14);
            return r10;
        }
        if (iE == 443) {
            hVar3.g(zVar2.f4858a, r10, 2, r10);
            zVar2.C(r10);
            hVar3.t(zVar2.w() + 6);
            return r10;
        }
        if (((iE & (-256)) >> 8) != 1) {
            hVar3.t(1);
            return r10;
        }
        int i14 = iE & 255;
        SparseArray sparseArray = this.f49228b;
        w wVar = (w) sparseArray.get(i14);
        if (!this.f49230e) {
            if (wVar == null) {
                h hVar4 = null;
                if (i14 == 189) {
                    jVar = new b(null, 0);
                    this.f49231f = true;
                    this.h = hVar3.d;
                } else if ((iE & 224) == 192) {
                    jVar = new t(null);
                    this.f49231f = true;
                    this.h = hVar3.d;
                } else if ((iE & 240) == 224) {
                    jVar = new j(null);
                    this.f49232g = true;
                    this.h = hVar3.d;
                } else if (hVar4 != null) {
                    hVar4.e(this.f49234j, new e0(i14, 256));
                    wVar = new w(hVar4, this.f49227a);
                    sparseArray.put(i14, wVar);
                }
                hVar4 = jVar;
                if (hVar4 != null) {
                    hVar4.e(this.f49234j, new e0(i14, 256));
                    wVar = new w(hVar4, this.f49227a);
                    sparseArray.put(i14, wVar);
                }
            }
            if (hVar3.d > ((this.f49231f && this.f49232g) ? this.h + 8192 : 1048576L)) {
                this.f49230e = true;
                this.f49234j.A();
            }
        }
        hVar3.g(zVar2.f4858a, r10, 2, r10);
        zVar2.C(r10);
        int iW = zVar2.w() + 6;
        if (wVar == null) {
            hVar3.t(iW);
            return r10;
        }
        zVar2.z(iW);
        hVar3.d(zVar2.f4858a, r10, iW, r10);
        zVar2.C(6);
        h hVar5 = wVar.f49221a;
        d5.y yVar = wVar.f49223c;
        zVar2.c(r10, 3, yVar.f4853b);
        yVar.p(r10);
        yVar.s(8);
        wVar.d = yVar.h();
        wVar.f49224e = yVar.h();
        yVar.s(6);
        zVar2.c(r10, yVar.i(8), yVar.f4853b);
        yVar.p(r10);
        d5.f0 f0Var2 = wVar.f49222b;
        wVar.f49226g = 0L;
        if (wVar.d) {
            yVar.s(4);
            long jI2 = ((long) yVar.i(3)) << 30;
            yVar.s(1);
            long jI3 = jI2 | ((long) (yVar.i(15) << 15));
            yVar.s(1);
            long jI4 = jI3 | ((long) yVar.i(15));
            yVar.s(1);
            if (!wVar.f49225f && wVar.f49224e) {
                yVar.s(4);
                long jI5 = ((long) yVar.i(3)) << 30;
                yVar.s(1);
                long jI6 = jI5 | ((long) (yVar.i(15) << 15));
                yVar.s(1);
                long jI7 = ((long) yVar.i(15)) | jI6;
                yVar.s(1);
                f0Var2.b(jI7);
                wVar.f49225f = true;
            }
            wVar.f49226g = f0Var2.b(jI4);
        }
        hVar5.f(4, wVar.f49226g);
        hVar5.b(zVar2);
        hVar5.d();
        zVar2.B(zVar2.f4858a.length);
        return r10;
    }

    @Override
    public final void c(m3.m mVar) {
        this.f49234j = mVar;
    }

    @Override
    public final boolean f(m3.l lVar) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        m3.h hVar = (m3.h) lVar;
        hVar.g(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            hVar.a(bArr[13] & 7, false);
            hVar.g(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void g(long j10, long j11) {
        d5.f0 f0Var = this.f49227a;
        boolean z10 = f0Var.d() == -9223372036854775807L;
        if (!z10) {
            long jC = f0Var.c();
            z10 = (jC == -9223372036854775807L || jC == 0 || jC == j11) ? false : true;
        }
        if (z10) {
            f0Var.e(j11);
        }
        p3.a aVar = this.f49233i;
        if (aVar != null) {
            aVar.d(j11);
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f49228b;
            if (i10 >= sparseArray.size()) {
                return;
            }
            w wVar = (w) sparseArray.valueAt(i10);
            wVar.f49225f = false;
            wVar.f49221a.c();
            i10++;
        }
    }

    @Override
    public final void release() {
    }
}
