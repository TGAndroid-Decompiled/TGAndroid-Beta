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
    public final int f47811a;
    public final long f47812b;
    public final v f47813c;
    public final z d;
    public final w f47814e;
    public final i f47815f;
    public final n f47816g;
    public q h;
    public h0 f47817i;
    public h0 f47818j;
    public int f47819k;
    public p0 f47820l;
    public long f47821m;
    public long f47822n;
    public long f47823o;
    public long f47824p;
    public int f47825q;
    public f f47826r;
    public boolean f47827s;
    public boolean f47828t;
    public long f47829u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    public final void a() {
        f fVar = this.f47826r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f47824p;
            if (j3 != -1 && j3 != this.f47826r.d()) {
                a aVar = (a) this.f47826r;
                this.f47826r = new a(this.f47824p, aVar.f47804i, aVar.f47805j, aVar.f47806k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.X1(this.f47826r);
                this.f47817i.getClass();
                this.f47826r.l();
            }
        }
    }

    @Override
    public final boolean b(p pVar) {
        return e(pVar, true);
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
        this.f47817i = Z1;
        this.f47818j = Z1;
        this.h.e1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f47819k = 0;
        this.f47821m = -9223372036854775807L;
        this.f47822n = 0L;
        this.f47825q = 0;
        this.f47829u = j10;
        if (!(this.f47826r instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8757b;
        return a1.f8720e;
    }

    @Override
    public final int m(c3.p r54, c3.s r55) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.m(c3.p, c3.s):int");
    }

    public d(int i10, long j3) {
        this.f47811a = i10;
        this.f47812b = j3;
        this.f47813c = new v(10);
        this.d = new Object();
        this.f47814e = new w();
        this.f47821m = -9223372036854775807L;
        this.f47815f = new i(8);
        n nVar = new n();
        this.f47816g = nVar;
        this.f47818j = nVar;
        this.f47824p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
