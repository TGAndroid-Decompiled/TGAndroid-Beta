package v3;

import a6.m;
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
    public final int f47332a;
    public final long f47333b;
    public final v f47334c;
    public final z d;
    public final w f47335e;
    public final m f47336f;
    public final n f47337g;
    public q h;
    public h0 f47338i;
    public h0 f47339j;
    public int f47340k;
    public p0 f47341l;
    public long f47342m;
    public long f47343n;
    public long f47344o;
    public long f47345p;
    public int f47346q;
    public f f47347r;
    public boolean f47348s;
    public boolean f47349t;
    public long f47350u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    public final void a() {
        f fVar = this.f47347r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f47345p;
            if (j3 != -1 && j3 != this.f47347r.d()) {
                a aVar = (a) this.f47347r;
                this.f47347r = new a(this.f47345p, aVar.f47325i, aVar.f47326j, aVar.f47327k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.P1(this.f47347r);
                this.f47338i.getClass();
                this.f47347r.l();
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
        h0 R1 = qVar.R1(0, 1);
        this.f47338i = R1;
        this.f47339j = R1;
        this.h.Z0();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f47340k = 0;
        this.f47342m = -9223372036854775807L;
        this.f47343n = 0L;
        this.f47346q = 0;
        this.f47350u = j10;
        if (!(this.f47347r instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8957b;
        return a1.f8920e;
    }

    @Override
    public final int m(c3.p r54, c3.s r55) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.m(c3.p, c3.s):int");
    }

    public d(int i10, long j3) {
        this.f47332a = i10;
        this.f47333b = j3;
        this.f47334c = new v(10);
        this.d = new Object();
        this.f47335e = new w();
        this.f47342m = -9223372036854775807L;
        this.f47336f = new m(7);
        n nVar = new n();
        this.f47337g = nVar;
        this.f47339j = nVar;
        this.f47345p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
