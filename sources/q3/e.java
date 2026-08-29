package q3;

import f5.d0;
import o3.s;
import o3.u;
import o3.w;
public final class e {
    public final w f46237a;
    public final int f46238b;
    public final int f46239c;
    public final long d;
    public final int f46240e;
    public int f46241f;
    public int f46242g;
    public int h;
    public int f46243i;
    public int f46244j;
    public long[] f46245k;
    public int[] f46246l;

    public e(int i10, int i11, long j10, int i12, w wVar) {
        int i13;
        int i14;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        f5.a.f(z10);
        this.d = j10;
        this.f46240e = i12;
        this.f46237a = wVar;
        if (i11 == 2) {
            i13 = 1667497984;
        } else {
            i13 = 1651965952;
        }
        int i15 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f46238b = i13 | i15;
        if (i11 == 2) {
            i14 = i15 | 1650720768;
        } else {
            i14 = -1;
        }
        this.f46239c = i14;
        this.f46245k = new long[512];
        this.f46246l = new int[512];
    }

    public final u a(int i10) {
        return new u(((this.d * 1) / this.f46240e) * this.f46246l[i10], this.f46245k[i10]);
    }

    public final s b(long j10) {
        int i10 = (int) (j10 / ((this.d * 1) / this.f46240e));
        int d = d0.d(this.f46246l, i10, true, true);
        if (this.f46246l[d] == i10) {
            u a2 = a(d);
            return new s(a2, a2);
        }
        u a10 = a(d);
        int i11 = d + 1;
        if (i11 < this.f46245k.length) {
            return new s(a10, a(i11));
        }
        return new s(a10, a10);
    }
}
