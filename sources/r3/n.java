package r3;

import h5.d0;
import q5.c0;
public class n implements s {
    public final int f43252a;
    public final long f43253b;
    public final Object f43254c;

    public n(Object obj, long j10, int i10) {
        this.f43252a = i10;
        this.f43254c = obj;
        this.f43253b = j10;
    }

    @Override
    public final boolean c() {
        switch (this.f43252a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override
    public final r f(long j10) {
        long j11;
        switch (this.f43252a) {
            case 0:
                o oVar = (o) this.f43254c;
                h5.a.j(oVar.f43262k);
                c0 c0Var = oVar.f43262k;
                long[] jArr = (long[]) c0Var.f42808c;
                long[] jArr2 = (long[]) c0Var.f42807b;
                int e = d0.e(jArr, d0.i((oVar.e * j10) / 1000000, 0L, oVar.f43261j - 1), false);
                long j12 = 0;
                if (e == -1) {
                    j11 = 0;
                } else {
                    j11 = jArr[e];
                }
                if (e != -1) {
                    j12 = jArr2[e];
                }
                int i10 = oVar.e;
                long j13 = (j11 * 1000000) / i10;
                long j14 = this.f43253b;
                t tVar = new t(j13, j12 + j14);
                if (j13 != j10 && e != jArr.length - 1) {
                    int i11 = e + 1;
                    return new r(tVar, new t((jArr[i11] * 1000000) / i10, j14 + jArr2[i11]));
                }
                return new r(tVar, tVar);
            case 1:
                return (r) this.f43254c;
            default:
                t3.b bVar = (t3.b) this.f43254c;
                r b10 = bVar.f44509g[0].b(j10);
                int i12 = 1;
                while (true) {
                    t3.e[] eVarArr = bVar.f44509g;
                    if (i12 < eVarArr.length) {
                        r b11 = eVarArr[i12].b(j10);
                        if (b11.f43270a.f43274b < b10.f43270a.f43274b) {
                            b10 = b11;
                        }
                        i12++;
                    } else {
                        return b10;
                    }
                }
        }
    }

    @Override
    public final long g() {
        switch (this.f43252a) {
            case 0:
                return ((o) this.f43254c).b();
            case 1:
                return this.f43253b;
            default:
                return this.f43253b;
        }
    }

    public n(long j10) {
        this(j10, 0L);
        this.f43252a = 1;
    }

    public n(long j10, long j11) {
        this.f43252a = 1;
        this.f43253b = j10;
        t tVar = j11 == 0 ? t.f43272c : new t(0L, j11);
        this.f43254c = new r(tVar, tVar);
    }
}
