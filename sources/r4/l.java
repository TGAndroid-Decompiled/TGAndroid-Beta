package r4;

import h5.d0;
import j3.n0;
import o4.l0;
public final class l implements l0 {
    public final n0 f46658a;
    public long[] f46660c;
    public boolean d;
    public s4.g f46661e;
    public boolean f46662f;
    public int h;
    public final f7.b f46659b = new f7.b(3, (byte) 0);
    public long f46663n = -9223372036854775807L;

    public l(s4.g gVar, n0 n0Var, boolean z4) {
        this.f46658a = n0Var;
        this.f46661e = gVar;
        this.f46660c = gVar.f46973b;
        b(gVar, z4);
    }

    public final void b(s4.g gVar, boolean z4) {
        long j10;
        int i10 = this.h;
        long j11 = -9223372036854775807L;
        if (i10 == 0) {
            j10 = -9223372036854775807L;
        } else {
            j10 = this.f46660c[i10 - 1];
        }
        this.d = z4;
        this.f46661e = gVar;
        long[] jArr = gVar.f46973b;
        this.f46660c = jArr;
        long j12 = this.f46663n;
        if (j12 != -9223372036854775807L) {
            int b10 = d0.b(jArr, j12, true);
            this.h = b10;
            if (this.d && b10 == this.f46660c.length) {
                j11 = j12;
            }
            this.f46663n = j11;
        } else if (j10 != -9223372036854775807L) {
            this.h = d0.b(jArr, j10, false);
        }
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final int l(long j10) {
        int max = Math.max(this.h, d0.b(this.f46660c, j10, true));
        int i10 = max - this.h;
        this.h = max;
        return i10;
    }

    @Override
    public final int p(f7.b bVar, n3.i iVar, int i10) {
        boolean z4;
        int i11 = this.h;
        if (i11 == this.f46660c.length) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && !this.d) {
            iVar.f15193b = 4;
            return -4;
        } else if ((i10 & 2) == 0 && this.f46662f) {
            if (z4) {
                return -3;
            }
            if ((i10 & 1) == 0) {
                this.h = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] q10 = this.f46659b.q(this.f46661e.f46972a[i11]);
                iVar.j(q10.length);
                iVar.d.put(q10);
            }
            iVar.f15216f = this.f46660c[i11];
            iVar.f15193b = 1;
            return -4;
        } else {
            bVar.f6121c = this.f46658a;
            this.f46662f = true;
            return -5;
        }
    }

    @Override
    public final void a() {
    }
}
