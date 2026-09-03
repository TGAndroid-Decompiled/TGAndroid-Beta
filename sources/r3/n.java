package r3;

import h5.d0;
import q5.c0;
public class n implements s {
    public final int f46594a;
    public final long f46595b;
    public final Object f46596c;

    public n(Object obj, long j10, int i10) {
        this.f46594a = i10;
        this.f46596c = obj;
        this.f46595b = j10;
    }

    @Override
    public final boolean c() {
        switch (this.f46594a) {
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
        switch (this.f46594a) {
            case 0:
                o oVar = (o) this.f46596c;
                h5.a.j(oVar.f46605k);
                c0 c0Var = oVar.f46605k;
                long[] jArr = (long[]) c0Var.f44559c;
                long[] jArr2 = (long[]) c0Var.f44558b;
                int e6 = d0.e(jArr, d0.i((oVar.f46600e * j10) / 1000000, 0L, oVar.f46604j - 1), false);
                long j12 = 0;
                if (e6 == -1) {
                    j11 = 0;
                } else {
                    j11 = jArr[e6];
                }
                if (e6 != -1) {
                    j12 = jArr2[e6];
                }
                int i10 = oVar.f46600e;
                long j13 = (j11 * 1000000) / i10;
                long j14 = this.f46595b;
                t tVar = new t(j13, j12 + j14);
                if (j13 != j10 && e6 != jArr.length - 1) {
                    int i11 = e6 + 1;
                    return new r(tVar, new t((jArr[i11] * 1000000) / i10, j14 + jArr2[i11]));
                }
                return new r(tVar, tVar);
            case 1:
                return (r) this.f46596c;
            default:
                t3.b bVar = (t3.b) this.f46596c;
                r b10 = bVar.f47883g[0].b(j10);
                int i12 = 1;
                while (true) {
                    t3.e[] eVarArr = bVar.f47883g;
                    if (i12 < eVarArr.length) {
                        r b11 = eVarArr[i12].b(j10);
                        if (b11.f46613a.f46617b < b10.f46613a.f46617b) {
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
        switch (this.f46594a) {
            case 0:
                return ((o) this.f46596c).b();
            case 1:
                return this.f46595b;
            default:
                return this.f46595b;
        }
    }

    public n(long j10) {
        this(j10, 0L);
        this.f46594a = 1;
    }

    public n(long j10, long j11) {
        this.f46594a = 1;
        this.f46595b = j10;
        t tVar = j11 == 0 ? t.f46615c : new t(0L, j11);
        this.f46596c = new r(tVar, tVar);
    }
}
