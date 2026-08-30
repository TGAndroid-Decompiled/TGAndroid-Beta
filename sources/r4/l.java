package r4;

import h5.d0;
import j3.n0;
import o4.l0;
public final class l implements l0 {
    public final n0 f43315a;
    public long[] f43317c;
    public boolean d;
    public s4.g e;
    public boolean f43318f;
    public int h;
    public final f7.b f43316b = new f7.b(3, (byte) 0);
    public long f43319n = -9223372036854775807L;

    public l(s4.g gVar, n0 n0Var, boolean z4) {
        this.f43315a = n0Var;
        this.e = gVar;
        this.f43317c = gVar.f44008b;
        b(gVar, z4);
    }

    public final void b(s4.g gVar, boolean z4) {
        long j10;
        int i10 = this.h;
        long j11 = -9223372036854775807L;
        if (i10 == 0) {
            j10 = -9223372036854775807L;
        } else {
            j10 = this.f43317c[i10 - 1];
        }
        this.d = z4;
        this.e = gVar;
        long[] jArr = gVar.f44008b;
        this.f43317c = jArr;
        long j12 = this.f43319n;
        if (j12 != -9223372036854775807L) {
            int b10 = d0.b(jArr, j12, true);
            this.h = b10;
            if (this.d && b10 == this.f43317c.length) {
                j11 = j12;
            }
            this.f43319n = j11;
        } else if (j10 != -9223372036854775807L) {
            this.h = d0.b(jArr, j10, false);
        }
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final int e(long j10) {
        int max = Math.max(this.h, d0.b(this.f43317c, j10, true));
        int i10 = max - this.h;
        this.h = max;
        return i10;
    }

    @Override
    public final int f(f7.b bVar, n3.i iVar, int i10) {
        boolean z4;
        int i11 = this.h;
        if (i11 == this.f43317c.length) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && !this.d) {
            iVar.f14222b = 4;
            return -4;
        } else if ((i10 & 2) == 0 && this.f43318f) {
            if (z4) {
                return -3;
            }
            if ((i10 & 1) == 0) {
                this.h = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] q10 = this.f43316b.q(this.e.f44007a[i11]);
                iVar.k(q10.length);
                iVar.d.put(q10);
            }
            iVar.f14242f = this.f43317c[i11];
            iVar.f14222b = 1;
            return -4;
        } else {
            bVar.f6013c = this.f43315a;
            this.f43318f = true;
            return -5;
        }
    }

    @Override
    public final void a() {
    }
}
