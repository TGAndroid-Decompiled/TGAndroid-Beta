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
    public final int f49319a;
    public final long f49320b;
    public final v f49321c;
    public final z d;
    public final w f49322e;
    public final i f49323f;
    public final n f49324g;
    public q h;
    public h0 f49325i;
    public h0 f49326j;
    public int f49327k;
    public p0 f49328l;
    public long f49329m;
    public long f49330n;
    public long f49331o;
    public long f49332p;
    public int f49333q;
    public f f49334r;
    public boolean f49335s;
    public boolean f49336t;
    public long f49337u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    public final void a() {
        f fVar = this.f49334r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f49332p;
            if (j3 != -1 && j3 != this.f49334r.d()) {
                a aVar = (a) this.f49334r;
                this.f49334r = new a(this.f49332p, aVar.f49312i, aVar.f49313j, aVar.f49314k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.d2(this.f49334r);
                this.f49325i.getClass();
                this.f49334r.l();
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
        h0 f22 = qVar.f2(0, 1);
        this.f49325i = f22;
        this.f49326j = f22;
        this.h.k1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f49327k = 0;
        this.f49329m = -9223372036854775807L;
        this.f49330n = 0L;
        this.f49333q = 0;
        this.f49337u = j10;
        if (!(this.f49334r instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8749b;
        return a1.f8712e;
    }

    @Override
    public final int m(c3.p r54, c3.s r55) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.m(c3.p, c3.s):int");
    }

    public d(int i10, long j3) {
        this.f49319a = i10;
        this.f49320b = j3;
        this.f49321c = new v(10);
        this.d = new Object();
        this.f49322e = new w();
        this.f49329m = -9223372036854775807L;
        this.f49323f = new i(8);
        n nVar = new n();
        this.f49324g = nVar;
        this.f49326j = nVar;
        this.f49332p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
