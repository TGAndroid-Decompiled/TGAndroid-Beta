package v3;

import a6.i;
import b2.p0;
import c3.h0;
import c3.k;
import c3.n;
import c3.o;
import c3.p;
import c3.q;
import c3.w;
import c3.z;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import java.util.List;
public final class d implements o {
    public final int f44262a;
    public final long f44263b;
    public final v f44264c;
    public final z d;
    public final w e;
    public final i f44265f;
    public final n f44266g;
    public q h;
    public h0 f44267i;
    public h0 f44268j;
    public int f44269k;
    public p0 f44270l;
    public long f44271m;
    public long f44272n;
    public long f44273o;
    public long f44274p;
    public int f44275q;
    public f f44276r;
    public boolean f44277s;
    public boolean f44278t;
    public long f44279u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    @Override
    public final boolean a(p pVar) {
        return e(pVar, true);
    }

    public final void b() {
        f fVar = this.f44276r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f44274p;
            if (j3 != -1 && j3 != this.f44276r.d()) {
                a aVar = (a) this.f44276r;
                this.f44276r = new a(this.f44274p, aVar.f44255i, aVar.f44256j, aVar.f44257k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.X1(this.f44276r);
                this.f44267i.getClass();
                this.f44276r.l();
            }
        }
    }

    public final boolean d(c3.p r9) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.d(c3.p):boolean");
    }

    public final boolean e(c3.p r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.e(c3.p, boolean):boolean");
    }

    @Override
    public final void g(q qVar) {
        this.h = qVar;
        h0 Z1 = qVar.Z1(0, 1);
        this.f44267i = Z1;
        this.f44268j = Z1;
        this.h.e1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f44269k = 0;
        this.f44271m = -9223372036854775807L;
        this.f44272n = 0L;
        this.f44275q = 0;
        this.f44279u = j10;
        if (!(this.f44276r instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8078b;
        return a1.e;
    }

    @Override
    public final int m(c3.p r54, c3.s r55) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.m(c3.p, c3.s):int");
    }

    public d(int i10, long j3) {
        this.f44262a = i10;
        this.f44263b = j3;
        this.f44264c = new v(10);
        this.d = new Object();
        this.e = new w();
        this.f44271m = -9223372036854775807L;
        this.f44265f = new i(8);
        n nVar = new n();
        this.f44266g = nVar;
        this.f44268j = nVar;
        this.f44274p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
