package t3;

import h5.d0;
import r3.r;
import r3.t;
import r3.v;
public final class e {
    public final v f44460a;
    public final int f44461b;
    public final int f44462c;
    public final long d;
    public final int e;
    public int f44463f;
    public int f44464g;
    public int h;
    public int f44465i;
    public int f44466j;
    public long[] f44467k;
    public int[] f44468l;

    public e(int i10, int i11, long j10, int i12, v vVar) {
        int i13;
        int i14;
        boolean z4 = true;
        if (i11 != 1 && i11 != 2) {
            z4 = false;
        }
        h5.a.f(z4);
        this.d = j10;
        this.e = i12;
        this.f44460a = vVar;
        if (i11 == 2) {
            i13 = 1667497984;
        } else {
            i13 = 1651965952;
        }
        int i15 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f44461b = i13 | i15;
        if (i11 == 2) {
            i14 = i15 | 1650720768;
        } else {
            i14 = -1;
        }
        this.f44462c = i14;
        this.f44467k = new long[512];
        this.f44468l = new int[512];
    }

    public final t a(int i10) {
        return new t(((this.d * 1) / this.e) * this.f44468l[i10], this.f44467k[i10]);
    }

    public final r b(long j10) {
        int i10 = (int) (j10 / ((this.d * 1) / this.e));
        int d = d0.d(this.f44468l, i10, true, true);
        if (this.f44468l[d] == i10) {
            t a2 = a(d);
            return new r(a2, a2);
        }
        t a10 = a(d);
        int i11 = d + 1;
        if (i11 < this.f44467k.length) {
            return new r(a10, a(i11));
        }
        return new r(a10, a10);
    }
}
