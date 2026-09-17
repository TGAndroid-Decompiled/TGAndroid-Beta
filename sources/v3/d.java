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
    public final int f43895a;
    public final long f43896b;
    public final v f43897c;
    public final z d;
    public final w e;
    public final i f43898f;
    public final n f43899g;
    public q h;
    public h0 f43900i;
    public h0 f43901j;
    public int f43902k;
    public p0 f43903l;
    public long f43904m;
    public long f43905n;
    public long f43906o;
    public long f43907p;
    public int f43908q;
    public f f43909r;
    public boolean f43910s;
    public boolean f43911t;
    public long f43912u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    @Override
    public final boolean a(p pVar) {
        return e(pVar, true);
    }

    public final void b() {
        f fVar = this.f43909r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f43907p;
            if (j3 != -1 && j3 != this.f43909r.d()) {
                a aVar = (a) this.f43909r;
                this.f43909r = new a(this.f43907p, aVar.f43888i, aVar.f43889j, aVar.f43890k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.X1(this.f43909r);
                this.f43900i.getClass();
                this.f43909r.l();
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
        this.f43900i = Z1;
        this.f43901j = Z1;
        this.h.e1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f43902k = 0;
        this.f43904m = -9223372036854775807L;
        this.f43905n = 0L;
        this.f43908q = 0;
        this.f43912u = j10;
        if (!(this.f43909r instanceof b)) {
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
        this.f43895a = i10;
        this.f43896b = j3;
        this.f43897c = new v(10);
        this.d = new Object();
        this.e = new w();
        this.f43904m = -9223372036854775807L;
        this.f43898f = new i(8);
        n nVar = new n();
        this.f43899g = nVar;
        this.f43901j = nVar;
        this.f43907p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
