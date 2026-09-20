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
    public final int f44170a;
    public final long f44171b;
    public final v f44172c;
    public final z d;
    public final w e;
    public final i f44173f;
    public final n f44174g;
    public q h;
    public h0 f44175i;
    public h0 f44176j;
    public int f44177k;
    public p0 f44178l;
    public long f44179m;
    public long f44180n;
    public long f44181o;
    public long f44182p;
    public int f44183q;
    public f f44184r;
    public boolean f44185s;
    public boolean f44186t;
    public long f44187u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    @Override
    public final boolean a(p pVar) {
        return e(pVar, true);
    }

    public final void b() {
        f fVar = this.f44184r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f44182p;
            if (j3 != -1 && j3 != this.f44184r.d()) {
                a aVar = (a) this.f44184r;
                this.f44184r = new a(this.f44182p, aVar.f44163i, aVar.f44164j, aVar.f44165k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.X1(this.f44184r);
                this.f44175i.getClass();
                this.f44184r.l();
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
        this.f44175i = Z1;
        this.f44176j = Z1;
        this.h.f1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f44177k = 0;
        this.f44179m = -9223372036854775807L;
        this.f44180n = 0L;
        this.f44183q = 0;
        this.f44187u = j10;
        if (!(this.f44184r instanceof b)) {
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
        this.f44170a = i10;
        this.f44171b = j3;
        this.f44172c = new v(10);
        this.d = new Object();
        this.e = new w();
        this.f44179m = -9223372036854775807L;
        this.f44173f = new i(8);
        n nVar = new n();
        this.f44174g = nVar;
        this.f44176j = nVar;
        this.f44182p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
