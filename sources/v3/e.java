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
public final class e implements o {
    public final int f43822a;
    public final long f43823b;
    public final v f43824c;
    public final z d;
    public final w e;
    public final a6.i f43825f;
    public final n f43826g;
    public q h;
    public h0 f43827i;
    public h0 f43828j;
    public int f43829k;
    public p0 f43830l;
    public long f43831m;
    public long f43832n;
    public long f43833o;
    public long f43834p;
    public int f43835q;
    public g f43836r;
    public boolean f43837s;
    public boolean f43838t;
    public long f43839u;

    public e(int i10) {
        this(i10, -9223372036854775807L);
    }

    @Override
    public final boolean a(p pVar) {
        return e(pVar, true);
    }

    public final void b() {
        g gVar = this.f43836r;
        if ((gVar instanceof a) && ((k) gVar).f()) {
            long j3 = this.f43834p;
            if (j3 != -1 && j3 != this.f43836r.d()) {
                a aVar = (a) this.f43836r;
                this.f43836r = new a(this.f43834p, aVar.f43814i, aVar.f43815j, aVar.f43816k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.X1(this.f43836r);
                this.f43827i.getClass();
                this.f43836r.l();
            }
        }
    }

    public final boolean d(c3.p r9) {
        throw new UnsupportedOperationException("Method not decompiled: v3.e.d(c3.p):boolean");
    }

    public final boolean e(c3.p r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: v3.e.e(c3.p, boolean):boolean");
    }

    @Override
    public final void g(q qVar) {
        this.h = qVar;
        h0 Z1 = qVar.Z1(0, 1);
        this.f43827i = Z1;
        this.f43828j = Z1;
        this.h.e1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f43829k = 0;
        this.f43831m = -9223372036854775807L;
        this.f43832n = 0L;
        this.f43835q = 0;
        this.f43839u = j10;
        if (!(this.f43836r instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8067b;
        return a1.e;
    }

    @Override
    public final int m(c3.p r54, c3.s r55) {
        throw new UnsupportedOperationException("Method not decompiled: v3.e.m(c3.p, c3.s):int");
    }

    public e(int i10, long j3) {
        this.f43822a = i10;
        this.f43823b = j3;
        this.f43824c = new v(10);
        this.d = new Object();
        this.e = new w();
        this.f43831m = -9223372036854775807L;
        this.f43825f = new a6.i(8);
        n nVar = new n();
        this.f43826g = nVar;
        this.f43828j = nVar;
        this.f43834p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
