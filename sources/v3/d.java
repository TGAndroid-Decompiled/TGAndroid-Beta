package v3;

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
    public final int f42892a;
    public final long f42893b;
    public final v f42894c;
    public final z d;
    public final w e;
    public final pb.c f42895f;
    public final n f42896g;
    public q h;
    public h0 f42897i;
    public h0 f42898j;
    public int f42899k;
    public p0 f42900l;
    public long f42901m;
    public long f42902n;
    public long f42903o;
    public long f42904p;
    public int f42905q;
    public f f42906r;
    public boolean f42907s;
    public boolean f42908t;
    public long f42909u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    public final void a() {
        f fVar = this.f42906r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f42904p;
            if (j3 != -1 && j3 != this.f42906r.d()) {
                a aVar = (a) this.f42906r;
                this.f42906r = new a(this.f42904p, aVar.f42885i, aVar.f42886j, aVar.f42887k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.G(this.f42906r);
                this.f42897i.getClass();
                this.f42906r.l();
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
        h0 I = qVar.I(0, 1);
        this.f42897i = I;
        this.f42898j = I;
        this.h.B();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f42899k = 0;
        this.f42901m = -9223372036854775807L;
        this.f42902n = 0L;
        this.f42905q = 0;
        this.f42909u = j10;
        if (!(this.f42906r instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f7384b;
        return a1.e;
    }

    @Override
    public final int m(c3.p r54, c3.s r55) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.m(c3.p, c3.s):int");
    }

    public d(int i10, long j3) {
        this.f42892a = i10;
        this.f42893b = j3;
        this.f42894c = new v(10);
        this.d = new Object();
        this.e = new w();
        this.f42901m = -9223372036854775807L;
        this.f42895f = new pb.c();
        n nVar = new n();
        this.f42896g = nVar;
        this.f42898j = nVar;
        this.f42904p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
