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
    public final int f43900a;
    public final long f43901b;
    public final v f43902c;
    public final z d;
    public final w e;
    public final i f43903f;
    public final n f43904g;
    public q h;
    public h0 f43905i;
    public h0 f43906j;
    public int f43907k;
    public p0 f43908l;
    public long f43909m;
    public long f43910n;
    public long f43911o;
    public long f43912p;
    public int f43913q;
    public f f43914r;
    public boolean f43915s;
    public boolean f43916t;
    public long f43917u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    @Override
    public final boolean a(p pVar) {
        return e(pVar, true);
    }

    public final void b() {
        f fVar = this.f43914r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f43912p;
            if (j3 != -1 && j3 != this.f43914r.d()) {
                a aVar = (a) this.f43914r;
                this.f43914r = new a(this.f43912p, aVar.f43893i, aVar.f43894j, aVar.f43895k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.X1(this.f43914r);
                this.f43905i.getClass();
                this.f43914r.l();
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
        this.f43905i = Z1;
        this.f43906j = Z1;
        this.h.e1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f43907k = 0;
        this.f43909m = -9223372036854775807L;
        this.f43910n = 0L;
        this.f43913q = 0;
        this.f43917u = j10;
        if (!(this.f43914r instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8084b;
        return a1.e;
    }

    @Override
    public final int m(c3.p r54, c3.s r55) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.m(c3.p, c3.s):int");
    }

    public d(int i10, long j3) {
        this.f43900a = i10;
        this.f43901b = j3;
        this.f43902c = new v(10);
        this.d = new Object();
        this.e = new w();
        this.f43909m = -9223372036854775807L;
        this.f43903f = new i(8);
        n nVar = new n();
        this.f43904g = nVar;
        this.f43906j = nVar;
        this.f43912p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
