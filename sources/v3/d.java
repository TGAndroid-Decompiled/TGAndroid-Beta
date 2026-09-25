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
    public final int f44155a;
    public final long f44156b;
    public final v f44157c;
    public final z d;
    public final w e;
    public final i f44158f;
    public final n f44159g;
    public q h;
    public h0 f44160i;
    public h0 f44161j;
    public int f44162k;
    public p0 f44163l;
    public long f44164m;
    public long f44165n;
    public long f44166o;
    public long f44167p;
    public int f44168q;
    public f f44169r;
    public boolean f44170s;
    public boolean f44171t;
    public long f44172u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    @Override
    public final boolean a(p pVar) {
        return e(pVar, true);
    }

    public final void b() {
        f fVar = this.f44169r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f44167p;
            if (j3 != -1 && j3 != this.f44169r.d()) {
                a aVar = (a) this.f44169r;
                this.f44169r = new a(this.f44167p, aVar.f44148i, aVar.f44149j, aVar.f44150k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.X1(this.f44169r);
                this.f44160i.getClass();
                this.f44169r.l();
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
        this.f44160i = Z1;
        this.f44161j = Z1;
        this.h.e1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f44162k = 0;
        this.f44164m = -9223372036854775807L;
        this.f44165n = 0L;
        this.f44168q = 0;
        this.f44172u = j10;
        if (!(this.f44169r instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8066b;
        return a1.e;
    }

    @Override
    public final int m(c3.p r54, c3.s r55) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.m(c3.p, c3.s):int");
    }

    public d(int i10, long j3) {
        this.f44155a = i10;
        this.f44156b = j3;
        this.f44157c = new v(10);
        this.d = new Object();
        this.e = new w();
        this.f44164m = -9223372036854775807L;
        this.f44158f = new i(8);
        n nVar = new n();
        this.f44159g = nVar;
        this.f44161j = nVar;
        this.f44167p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
