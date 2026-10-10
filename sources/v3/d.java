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
    public final int f49127a;
    public final long f49128b;
    public final v f49129c;
    public final z d;
    public final w f49130e;
    public final i f49131f;
    public final n f49132g;
    public q h;
    public h0 f49133i;
    public h0 f49134j;
    public int f49135k;
    public p0 f49136l;
    public long f49137m;
    public long f49138n;
    public long f49139o;
    public long f49140p;
    public int f49141q;
    public f f49142r;
    public boolean f49143s;
    public boolean f49144t;
    public long f49145u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    @Override
    public final boolean a(p pVar) {
        return e(pVar, true);
    }

    public final void b() {
        f fVar = this.f49142r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f49140p;
            if (j3 != -1 && j3 != this.f49142r.d()) {
                a aVar = (a) this.f49142r;
                this.f49142r = new a(this.f49140p, aVar.f49120i, aVar.f49121j, aVar.f49122k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.d2(this.f49142r);
                this.f49133i.getClass();
                this.f49142r.l();
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
        h0 f22 = qVar.f2(0, 1);
        this.f49133i = f22;
        this.f49134j = f22;
        this.h.k1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f49135k = 0;
        this.f49137m = -9223372036854775807L;
        this.f49138n = 0L;
        this.f49141q = 0;
        this.f49145u = j10;
        if (!(this.f49142r instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8752b;
        return a1.f8715e;
    }

    @Override
    public final int m(c3.p r54, c3.s r55) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.m(c3.p, c3.s):int");
    }

    public d(int i10, long j3) {
        this.f49127a = i10;
        this.f49128b = j3;
        this.f49129c = new v(10);
        this.d = new Object();
        this.f49130e = new w();
        this.f49137m = -9223372036854775807L;
        this.f49131f = new i(8);
        n nVar = new n();
        this.f49132g = nVar;
        this.f49134j = nVar;
        this.f49140p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
