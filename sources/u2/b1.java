package u2;

import v7.u6;
public final class b1 implements x3.g {
    public long f47708a;
    public long f47709b;
    public Object f47710c;
    public Object d;

    public b1(long j10, int i10) {
        u6.p(((y2.a) this.f47710c) == null);
        this.f47708a = j10;
        this.f47709b = j10 + i10;
    }

    @Override
    public void X(long j10) {
        long[] jArr = (long[]) ((n4.s) this.d).f17188b;
        this.f47709b = jArr[e2.m0.f(jArr, j10, true)];
    }

    @Override
    public long k(c3.r rVar) {
        long j10 = this.f47709b;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f47709b = -1L;
        return j11;
    }

    @Override
    public c3.e0 x() {
        boolean z10;
        if (this.f47708a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        return new c3.v((c3.w) this.f47710c, this.f47708a, 0);
    }

    public b1(String str, byte[] bArr, long j10, long j11) {
        this.f47710c = str;
        this.d = bArr;
        this.f47708a = j10;
        this.f47709b = j11;
    }
}
