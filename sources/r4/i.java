package r4;

import java.io.IOException;
public final class i {
    public final q4.d f43325a;
    public final s4.m f43326b;
    public final s4.b f43327c;
    public final h d;
    public final long e;
    public final long f43328f;

    public i(long j10, s4.m mVar, s4.b bVar, q4.d dVar, long j11, h hVar) {
        this.e = j10;
        this.f43326b = mVar;
        this.f43327c = bVar;
        this.f43328f = j11;
        this.f43325a = dVar;
        this.d = hVar;
    }

    public final i a(long j10, s4.m mVar) {
        long u02;
        long u03;
        h c3 = this.f43326b.c();
        h c10 = mVar.c();
        if (c3 == null) {
            return new i(j10, mVar, this.f43327c, this.f43325a, this.f43328f, c3);
        } else if (!c3.q1()) {
            return new i(j10, mVar, this.f43327c, this.f43325a, this.f43328f, c10);
        } else {
            long N1 = c3.N1(j10);
            if (N1 == 0) {
                return new i(j10, mVar, this.f43327c, this.f43325a, this.f43328f, c10);
            }
            long x12 = c3.x1();
            long a2 = c3.a(x12);
            long j11 = N1 + x12;
            long j12 = j11 - 1;
            long p10 = c3.p(j12, j10) + c3.a(j12);
            long x13 = c10.x1();
            long a10 = c10.a(x13);
            long j13 = this.f43328f;
            int i10 = (p10 > a10 ? 1 : (p10 == a10 ? 0 : -1));
            if (i10 == 0) {
                u02 = j11 - x13;
            } else if (i10 >= 0) {
                if (a10 < a2) {
                    u03 = j13 - (c10.u0(a2, j10) - x12);
                    return new i(j10, mVar, this.f43327c, this.f43325a, u03, c10);
                }
                u02 = c3.u0(a10, j10) - x13;
            } else {
                throw new IOException();
            }
            u03 = u02 + j13;
            return new i(j10, mVar, this.f43327c, this.f43325a, u03, c10);
        }
    }

    public final long b(long j10) {
        h hVar = this.d;
        long j11 = this.e;
        return (hVar.P1(j11, j10) + (hVar.G(j11, j10) + this.f43328f)) - 1;
    }

    public final long c(long j10) {
        return this.d.p(j10 - this.f43328f, this.e) + d(j10);
    }

    public final long d(long j10) {
        return this.d.a(j10 - this.f43328f);
    }
}
