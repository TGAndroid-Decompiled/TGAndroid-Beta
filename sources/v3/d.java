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
    public final int f47810a;
    public final long f47811b;
    public final v f47812c;
    public final z d;
    public final w f47813e;
    public final i f47814f;
    public final n f47815g;
    public q h;
    public h0 f47816i;
    public h0 f47817j;
    public int f47818k;
    public p0 f47819l;
    public long f47820m;
    public long f47821n;
    public long f47822o;
    public long f47823p;
    public int f47824q;
    public f f47825r;
    public boolean f47826s;
    public boolean f47827t;
    public long f47828u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    public final void a() {
        f fVar = this.f47825r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f47823p;
            if (j3 != -1 && j3 != this.f47825r.d()) {
                a aVar = (a) this.f47825r;
                this.f47825r = new a(this.f47823p, aVar.f47803i, aVar.f47804j, aVar.f47805k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.X1(this.f47825r);
                this.f47816i.getClass();
                this.f47825r.l();
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
        this.f47816i = Z1;
        this.f47817j = Z1;
        this.h.e1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f47818k = 0;
        this.f47820m = -9223372036854775807L;
        this.f47821n = 0L;
        this.f47824q = 0;
        this.f47828u = j10;
        if (!(this.f47825r instanceof b)) {
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
        this.f47810a = i10;
        this.f47811b = j3;
        this.f47812c = new v(10);
        this.d = new Object();
        this.f47813e = new w();
        this.f47820m = -9223372036854775807L;
        this.f47814f = new i(8);
        n nVar = new n();
        this.f47815g = nVar;
        this.f47817j = nVar;
        this.f47823p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
