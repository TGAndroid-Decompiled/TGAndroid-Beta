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
    public final int f44153a;
    public final long f44154b;
    public final v f44155c;
    public final z d;
    public final w e;
    public final i f44156f;
    public final n f44157g;
    public q h;
    public h0 f44158i;
    public h0 f44159j;
    public int f44160k;
    public p0 f44161l;
    public long f44162m;
    public long f44163n;
    public long f44164o;
    public long f44165p;
    public int f44166q;
    public f f44167r;
    public boolean f44168s;
    public boolean f44169t;
    public long f44170u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    @Override
    public final boolean a(p pVar) {
        return e(pVar, true);
    }

    public final void b() {
        f fVar = this.f44167r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f44165p;
            if (j3 != -1 && j3 != this.f44167r.d()) {
                a aVar = (a) this.f44167r;
                this.f44167r = new a(this.f44165p, aVar.f44146i, aVar.f44147j, aVar.f44148k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.X1(this.f44167r);
                this.f44158i.getClass();
                this.f44167r.l();
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
        this.f44158i = Z1;
        this.f44159j = Z1;
        this.h.e1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f44160k = 0;
        this.f44162m = -9223372036854775807L;
        this.f44163n = 0L;
        this.f44166q = 0;
        this.f44170u = j10;
        if (!(this.f44167r instanceof b)) {
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
        this.f44153a = i10;
        this.f44154b = j3;
        this.f44155c = new v(10);
        this.d = new Object();
        this.e = new w();
        this.f44162m = -9223372036854775807L;
        this.f44156f = new i(8);
        n nVar = new n();
        this.f44157g = nVar;
        this.f44159j = nVar;
        this.f44165p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
