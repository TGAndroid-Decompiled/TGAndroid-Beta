package v3;

import d5.g0;
import java.io.EOFException;
import java.io.IOException;
import m3.l;
import m3.t;

public final class b implements g {

    public final f f48740a;

    public final long f48741b;

    public final long f48742c;
    public final i d;

    public int f48743e;

    public long f48744f;
    public long h;

    public long f48745n;

    public long f48746r;

    public long f48747s;
    public long v;

    public long f48748w;

    public b(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        d5.a.f(j10 >= 0 && j11 > j10);
        this.d = iVar;
        this.f48741b = j10;
        this.f48742c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f48744f = j13;
            this.f48743e = 4;
        } else {
            this.f48743e = 0;
        }
        this.f48740a = new f();
    }

    @Override
    public final void A(long j10) {
        this.f48745n = g0.i(j10, 0L, this.f48744f - 1);
        this.f48743e = 2;
        this.f48746r = this.f48741b;
        this.f48747s = this.f48742c;
        this.v = 0L;
        this.f48748w = this.f48744f;
    }

    @Override
    public final long b(l lVar) throws IOException {
        long j10;
        long j11;
        long jI;
        int i10 = this.f48743e;
        long j12 = this.f48742c;
        f fVar = this.f48740a;
        if (i10 == 0) {
            j10 = 0;
            long position = lVar.getPosition();
            this.h = position;
            this.f48743e = 1;
            long j13 = j12 - 65307;
            if (j13 > position) {
                return j13;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                if (this.f48746r == this.f48747s) {
                    jI = -1;
                } else {
                    long position2 = lVar.getPosition();
                    if (fVar.b(lVar, this.f48747s)) {
                        fVar.a(lVar, false);
                        lVar.q();
                        long j14 = this.f48745n;
                        long j15 = fVar.f48759b;
                        long j16 = j14 - j15;
                        j11 = 2;
                        int i11 = fVar.d + fVar.f48761e;
                        if (0 > j16 || j16 >= 72000) {
                            if (j16 < 0) {
                                this.f48747s = position2;
                                this.f48748w = j15;
                            } else {
                                this.f48746r = lVar.getPosition() + ((long) i11);
                                this.v = fVar.f48759b;
                            }
                            long j17 = this.f48747s;
                            long j18 = this.f48746r;
                            if (j17 - j18 < 100000) {
                                this.f48747s = j18;
                                jI = j18;
                            } else {
                                long position3 = lVar.getPosition() - (((long) i11) * (j16 <= 0 ? 2L : 1L));
                                long j19 = this.f48747s;
                                long j20 = this.f48746r;
                                jI = g0.i((((j19 - j20) * j16) / (this.f48748w - this.v)) + position3, j20, j19 - 1);
                            }
                        } else {
                            jI = -1;
                        }
                    } else {
                        jI = this.f48746r;
                        if (jI == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                    if (jI != -1) {
                        return jI;
                    }
                    this.f48743e = 3;
                }
                j11 = 2;
                if (jI != -1) {
                    return jI;
                }
                this.f48743e = 3;
            } else {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j11 = 2;
            }
            while (true) {
                fVar.b(lVar, -1L);
                fVar.a(lVar, false);
                if (fVar.f48759b > this.f48745n) {
                    lVar.q();
                    this.f48743e = 4;
                    return -(this.v + j11);
                }
                lVar.t(fVar.d + fVar.f48761e);
                this.f48746r = lVar.getPosition();
                this.v = fVar.f48759b;
            }
        } else {
            j10 = 0;
        }
        fVar.f48758a = 0;
        fVar.f48759b = j10;
        fVar.f48760c = 0;
        fVar.d = 0;
        fVar.f48761e = 0;
        if (!fVar.b(lVar, -1L)) {
            throw new EOFException();
        }
        fVar.a(lVar, false);
        lVar.t(fVar.d + fVar.f48761e);
        long j21 = fVar.f48759b;
        while ((fVar.f48758a & 4) != 4 && fVar.b(lVar, -1L) && lVar.getPosition() < j12 && fVar.a(lVar, true)) {
            try {
                lVar.t(fVar.d + fVar.f48761e);
                j21 = fVar.f48759b;
            } catch (EOFException unused) {
            }
        }
        this.f48744f = j21;
        this.f48743e = 4;
        return this.h;
    }

    @Override
    public final t l() {
        if (this.f48744f != 0) {
            return new a(this);
        }
        return null;
    }
}
