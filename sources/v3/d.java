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
    public final int f44126a;
    public final long f44127b;
    public final v f44128c;
    public final z d;
    public final w e;
    public final i f44129f;
    public final n f44130g;
    public q h;
    public h0 f44131i;
    public h0 f44132j;
    public int f44133k;
    public p0 f44134l;
    public long f44135m;
    public long f44136n;
    public long f44137o;
    public long f44138p;
    public int f44139q;
    public f f44140r;
    public boolean f44141s;
    public boolean f44142t;
    public long f44143u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    @Override
    public final boolean a(p pVar) {
        return e(pVar, true);
    }

    public final void b() {
        f fVar = this.f44140r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f44138p;
            if (j3 != -1 && j3 != this.f44140r.d()) {
                a aVar = (a) this.f44140r;
                this.f44140r = new a(this.f44138p, aVar.f44119i, aVar.f44120j, aVar.f44121k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.X1(this.f44140r);
                this.f44131i.getClass();
                this.f44140r.l();
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
        this.f44131i = Z1;
        this.f44132j = Z1;
        this.h.e1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f44133k = 0;
        this.f44135m = -9223372036854775807L;
        this.f44136n = 0L;
        this.f44139q = 0;
        this.f44143u = j10;
        if (!(this.f44140r instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8083b;
        return a1.e;
    }

    @Override
    public final int m(c3.p r54, c3.s r55) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.m(c3.p, c3.s):int");
    }

    public d(int i10, long j3) {
        this.f44126a = i10;
        this.f44127b = j3;
        this.f44128c = new v(10);
        this.d = new Object();
        this.e = new w();
        this.f44135m = -9223372036854775807L;
        this.f44129f = new i(8);
        n nVar = new n();
        this.f44130g = nVar;
        this.f44132j = nVar;
        this.f44138p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
