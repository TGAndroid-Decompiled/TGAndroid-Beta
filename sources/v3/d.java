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
    public final int f44154a;
    public final long f44155b;
    public final v f44156c;
    public final z d;
    public final w e;
    public final i f44157f;
    public final n f44158g;
    public q h;
    public h0 f44159i;
    public h0 f44160j;
    public int f44161k;
    public p0 f44162l;
    public long f44163m;
    public long f44164n;
    public long f44165o;
    public long f44166p;
    public int f44167q;
    public f f44168r;
    public boolean f44169s;
    public boolean f44170t;
    public long f44171u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    @Override
    public final boolean a(p pVar) {
        return e(pVar, true);
    }

    public final void b() {
        f fVar = this.f44168r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f44166p;
            if (j3 != -1 && j3 != this.f44168r.d()) {
                a aVar = (a) this.f44168r;
                this.f44168r = new a(this.f44166p, aVar.f44147i, aVar.f44148j, aVar.f44149k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.X1(this.f44168r);
                this.f44159i.getClass();
                this.f44168r.l();
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
        this.f44159i = Z1;
        this.f44160j = Z1;
        this.h.e1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f44161k = 0;
        this.f44163m = -9223372036854775807L;
        this.f44164n = 0L;
        this.f44167q = 0;
        this.f44171u = j10;
        if (!(this.f44168r instanceof b)) {
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
        this.f44154a = i10;
        this.f44155b = j3;
        this.f44156c = new v(10);
        this.d = new Object();
        this.e = new w();
        this.f44163m = -9223372036854775807L;
        this.f44157f = new i(8);
        n nVar = new n();
        this.f44158g = nVar;
        this.f44160j = nVar;
        this.f44166p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
