package r4;

import java.io.IOException;
public final class i {
    public final q4.d f46673a;
    public final s4.m f46674b;
    public final s4.b f46675c;
    public final h d;
    public final long f46676e;
    public final long f46677f;

    public i(long j10, s4.m mVar, s4.b bVar, q4.d dVar, long j11, h hVar) {
        this.f46676e = j10;
        this.f46674b = mVar;
        this.f46675c = bVar;
        this.f46677f = j11;
        this.f46673a = dVar;
        this.d = hVar;
    }

    public final i a(long j10, s4.m mVar) {
        long t6;
        long t9;
        h c3 = this.f46674b.c();
        h c10 = mVar.c();
        if (c3 == null) {
            return new i(j10, mVar, this.f46675c, this.f46673a, this.f46677f, c3);
        } else if (!c3.A()) {
            return new i(j10, mVar, this.f46675c, this.f46673a, this.f46677f, c10);
        } else {
            long F = c3.F(j10);
            if (F == 0) {
                return new i(j10, mVar, this.f46675c, this.f46673a, this.f46677f, c10);
            }
            long C = c3.C();
            long a2 = c3.a(C);
            long j11 = F + C;
            long j12 = j11 - 1;
            long h = c3.h(j12, j10) + c3.a(j12);
            long C2 = c10.C();
            long a10 = c10.a(C2);
            long j13 = this.f46677f;
            int i10 = (h > a10 ? 1 : (h == a10 ? 0 : -1));
            if (i10 == 0) {
                t6 = j11 - C2;
            } else if (i10 >= 0) {
                if (a10 < a2) {
                    t9 = j13 - (c10.t(a2, j10) - C);
                    return new i(j10, mVar, this.f46675c, this.f46673a, t9, c10);
                }
                t6 = c3.t(a10, j10) - C2;
            } else {
                throw new IOException();
            }
            t9 = t6 + j13;
            return new i(j10, mVar, this.f46675c, this.f46673a, t9, c10);
        }
    }

    public final long b(long j10) {
        h hVar = this.d;
        long j11 = this.f46676e;
        return (hVar.I(j11, j10) + (hVar.m(j11, j10) + this.f46677f)) - 1;
    }

    public final long c(long j10) {
        return this.d.h(j10 - this.f46677f, this.f46676e) + d(j10);
    }

    public final long d(long j10) {
        return this.d.a(j10 - this.f46677f);
    }
}
