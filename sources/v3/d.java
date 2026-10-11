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
    public final int f49170a;
    public final long f49171b;
    public final v f49172c;
    public final z d;
    public final w f49173e;
    public final i f49174f;
    public final n f49175g;
    public q h;
    public h0 f49176i;
    public h0 f49177j;
    public int f49178k;
    public p0 f49179l;
    public long f49180m;
    public long f49181n;
    public long f49182o;
    public long f49183p;
    public int f49184q;
    public f f49185r;
    public boolean f49186s;
    public boolean f49187t;
    public long f49188u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    @Override
    public final boolean a(p pVar) {
        return e(pVar, true);
    }

    public final void b() {
        f fVar = this.f49185r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f49183p;
            if (j3 != -1 && j3 != this.f49185r.d()) {
                a aVar = (a) this.f49185r;
                this.f49185r = new a(this.f49183p, aVar.f49163i, aVar.f49164j, aVar.f49165k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.d2(this.f49185r);
                this.f49176i.getClass();
                this.f49185r.l();
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
        this.f49176i = f22;
        this.f49177j = f22;
        this.h.k1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f49178k = 0;
        this.f49180m = -9223372036854775807L;
        this.f49181n = 0L;
        this.f49184q = 0;
        this.f49188u = j10;
        if (!(this.f49185r instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8751b;
        return a1.f8714e;
    }

    @Override
    public final int m(c3.p r54, c3.s r55) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.m(c3.p, c3.s):int");
    }

    public d(int i10, long j3) {
        this.f49170a = i10;
        this.f49171b = j3;
        this.f49172c = new v(10);
        this.d = new Object();
        this.f49173e = new w();
        this.f49180m = -9223372036854775807L;
        this.f49174f = new i(8);
        n nVar = new n();
        this.f49175g = nVar;
        this.f49177j = nVar;
        this.f49183p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
