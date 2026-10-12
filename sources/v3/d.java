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
    public final int f49311a;
    public final long f49312b;
    public final v f49313c;
    public final z d;
    public final w f49314e;
    public final i f49315f;
    public final n f49316g;
    public q h;
    public h0 f49317i;
    public h0 f49318j;
    public int f49319k;
    public p0 f49320l;
    public long f49321m;
    public long f49322n;
    public long f49323o;
    public long f49324p;
    public int f49325q;
    public f f49326r;
    public boolean f49327s;
    public boolean f49328t;
    public long f49329u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    public final void a() {
        f fVar = this.f49326r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f49324p;
            if (j3 != -1 && j3 != this.f49326r.d()) {
                a aVar = (a) this.f49326r;
                this.f49326r = new a(this.f49324p, aVar.f49304i, aVar.f49305j, aVar.f49306k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.d2(this.f49326r);
                this.f49317i.getClass();
                this.f49326r.l();
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
        this.f49317i = f22;
        this.f49318j = f22;
        this.h.k1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f49319k = 0;
        this.f49321m = -9223372036854775807L;
        this.f49322n = 0L;
        this.f49325q = 0;
        this.f49329u = j10;
        if (!(this.f49326r instanceof b)) {
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
        this.f49311a = i10;
        this.f49312b = j3;
        this.f49313c = new v(10);
        this.d = new Object();
        this.f49314e = new w();
        this.f49321m = -9223372036854775807L;
        this.f49315f = new i(8);
        n nVar = new n();
        this.f49316g = nVar;
        this.f49318j = nVar;
        this.f49324p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
