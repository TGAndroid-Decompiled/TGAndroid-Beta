package t3;

import h5.d0;
import r3.r;
import r3.t;
import r3.v;
public final class e {
    public final v f47897a;
    public final int f47898b;
    public final int f47899c;
    public final long d;
    public final int f47900e;
    public int f47901f;
    public int f47902g;
    public int h;
    public int f47903i;
    public int f47904j;
    public long[] f47905k;
    public int[] f47906l;

    public e(int i10, int i11, long j10, int i12, v vVar) {
        int i13;
        int i14;
        boolean z4 = true;
        if (i11 != 1 && i11 != 2) {
            z4 = false;
        }
        h5.a.f(z4);
        this.d = j10;
        this.f47900e = i12;
        this.f47897a = vVar;
        if (i11 == 2) {
            i13 = 1667497984;
        } else {
            i13 = 1651965952;
        }
        int i15 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f47898b = i13 | i15;
        if (i11 == 2) {
            i14 = i15 | 1650720768;
        } else {
            i14 = -1;
        }
        this.f47899c = i14;
        this.f47905k = new long[512];
        this.f47906l = new int[512];
    }

    public final t a(int i10) {
        return new t(((this.d * 1) / this.f47900e) * this.f47906l[i10], this.f47905k[i10]);
    }

    public final r b(long j10) {
        int i10 = (int) (j10 / ((this.d * 1) / this.f47900e));
        int d = d0.d(this.f47906l, i10, true, true);
        if (this.f47906l[d] == i10) {
            t a2 = a(d);
            return new r(a2, a2);
        }
        t a10 = a(d);
        int i11 = d + 1;
        if (i11 < this.f47905k.length) {
            return new r(a10, a(i11));
        }
        return new r(a10, a10);
    }
}
