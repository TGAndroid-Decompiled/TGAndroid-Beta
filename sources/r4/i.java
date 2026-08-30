package r4;

import java.io.IOException;
public final class i {
    public final q4.d f43301a;
    public final s4.m f43302b;
    public final s4.b f43303c;
    public final h d;
    public final long e;
    public final long f43304f;

    public i(long j10, s4.m mVar, s4.b bVar, q4.d dVar, long j11, h hVar) {
        this.e = j10;
        this.f43302b = mVar;
        this.f43303c = bVar;
        this.f43304f = j11;
        this.f43301a = dVar;
        this.d = hVar;
    }

    public final i a(long j10, s4.m mVar) {
        long q10;
        long q11;
        h c3 = this.f43302b.c();
        h c10 = mVar.c();
        if (c3 == null) {
            return new i(j10, mVar, this.f43303c, this.f43301a, this.f43304f, c3);
        } else if (!c3.w()) {
            return new i(j10, mVar, this.f43303c, this.f43301a, this.f43304f, c10);
        } else {
            long U = c3.U(j10);
            if (U == 0) {
                return new i(j10, mVar, this.f43303c, this.f43301a, this.f43304f, c10);
            }
            long S = c3.S();
            long a2 = c3.a(S);
            long j11 = U + S;
            long j12 = j11 - 1;
            long e = c3.e(j12, j10) + c3.a(j12);
            long S2 = c10.S();
            long a10 = c10.a(S2);
            long j13 = this.f43304f;
            int i10 = (e > a10 ? 1 : (e == a10 ? 0 : -1));
            if (i10 == 0) {
                q10 = j11 - S2;
            } else if (i10 >= 0) {
                if (a10 < a2) {
                    q11 = j13 - (c10.q(a2, j10) - S);
                    return new i(j10, mVar, this.f43303c, this.f43301a, q11, c10);
                }
                q10 = c3.q(a10, j10) - S2;
            } else {
                throw new IOException();
            }
            q11 = q10 + j13;
            return new i(j10, mVar, this.f43303c, this.f43301a, q11, c10);
        }
    }

    public final long b(long j10) {
        h hVar = this.d;
        long j11 = this.e;
        return (hVar.W(j11, j10) + (hVar.j(j11, j10) + this.f43304f)) - 1;
    }

    public final long c(long j10) {
        return this.d.e(j10 - this.f43304f, this.e) + d(j10);
    }

    public final long d(long j10) {
        return this.d.a(j10 - this.f43304f);
    }
}
