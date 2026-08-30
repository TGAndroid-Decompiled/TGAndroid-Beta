package r3;

import h5.d0;
import q5.g0;
public class n implements s {
    public final int f43228a;
    public final long f43229b;
    public final Object f43230c;

    public n(Object obj, long j10, int i10) {
        this.f43228a = i10;
        this.f43230c = obj;
        this.f43229b = j10;
    }

    @Override
    public final boolean c() {
        switch (this.f43228a) {
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
        switch (this.f43228a) {
            case 0:
                o oVar = (o) this.f43230c;
                h5.a.j(oVar.f43238k);
                g0 g0Var = oVar.f43238k;
                long[] jArr = (long[]) g0Var.f42806b;
                long[] jArr2 = (long[]) g0Var.f42807c;
                int e = d0.e(jArr, d0.i((oVar.e * j10) / 1000000, 0L, oVar.f43237j - 1), false);
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
                long j14 = this.f43229b;
                t tVar = new t(j13, j12 + j14);
                if (j13 != j10 && e != jArr.length - 1) {
                    int i11 = e + 1;
                    return new r(tVar, new t((jArr[i11] * 1000000) / i10, j14 + jArr2[i11]));
                }
                return new r(tVar, tVar);
            case 1:
                return (r) this.f43230c;
            default:
                t3.b bVar = (t3.b) this.f43230c;
                r b10 = bVar.f44447g[0].b(j10);
                int i12 = 1;
                while (true) {
                    t3.e[] eVarArr = bVar.f44447g;
                    if (i12 < eVarArr.length) {
                        r b11 = eVarArr[i12].b(j10);
                        if (b11.f43246a.f43250b < b10.f43246a.f43250b) {
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
        switch (this.f43228a) {
            case 0:
                return ((o) this.f43230c).b();
            case 1:
                return this.f43229b;
            default:
                return this.f43229b;
        }
    }

    public n(long j10) {
        this(j10, 0L);
        this.f43228a = 1;
    }

    public n(long j10, long j11) {
        this.f43228a = 1;
        this.f43229b = j10;
        t tVar = j11 == 0 ? t.f43248c : new t(0L, j11);
        this.f43230c = new r(tVar, tVar);
    }
}
