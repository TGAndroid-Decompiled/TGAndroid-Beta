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
    public final int f49204a;
    public final long f49205b;
    public final v f49206c;
    public final z d;
    public final w f49207e;
    public final i f49208f;
    public final n f49209g;
    public q h;
    public h0 f49210i;
    public h0 f49211j;
    public int f49212k;
    public p0 f49213l;
    public long f49214m;
    public long f49215n;
    public long f49216o;
    public long f49217p;
    public int f49218q;
    public f f49219r;
    public boolean f49220s;
    public boolean f49221t;
    public long f49222u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    @Override
    public final boolean a(p pVar) {
        return e(pVar, true);
    }

    public final void b() {
        f fVar = this.f49219r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f49217p;
            if (j3 != -1 && j3 != this.f49219r.d()) {
                a aVar = (a) this.f49219r;
                this.f49219r = new a(this.f49217p, aVar.f49197i, aVar.f49198j, aVar.f49199k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.d2(this.f49219r);
                this.f49210i.getClass();
                this.f49219r.l();
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
        this.f49210i = f22;
        this.f49211j = f22;
        this.h.k1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f49212k = 0;
        this.f49214m = -9223372036854775807L;
        this.f49215n = 0L;
        this.f49218q = 0;
        this.f49222u = j10;
        if (!(this.f49219r instanceof b)) {
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
        this.f49204a = i10;
        this.f49205b = j3;
        this.f49206c = new v(10);
        this.d = new Object();
        this.f49207e = new w();
        this.f49214m = -9223372036854775807L;
        this.f49208f = new i(8);
        n nVar = new n();
        this.f49209g = nVar;
        this.f49211j = nVar;
        this.f49217p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
