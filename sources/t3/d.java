package t3;

import d5.y;
import j3.n0;
import m3.j;
import m3.k;
import m3.l;
import m3.m;
import m3.q;
import m3.w;
public final class d implements k {
    public final int f47607a;
    public final long f47608b;
    public final y f47609c;
    public final n0 d;
    public final q f47610e;
    public final xa.c f47611f;
    public final j f47612g;
    public m h;
    public w f47613i;
    public w f47614j;
    public int f47615k;
    public z3.c f47616l;
    public long f47617m;
    public long f47618n;
    public long f47619o;
    public int f47620p;
    public f f47621q;
    public boolean f47622r;
    public boolean f47623s;
    public long f47624t;

    public d(int i9) {
        this(i9, -9223372036854775807L);
    }

    public final a a(l lVar, boolean z10) {
        y yVar = this.f47609c;
        lVar.c(0, 4, yVar.f4410a);
        yVar.C(0);
        int e10 = yVar.e();
        n0 n0Var = this.d;
        n0Var.a(e10);
        return new m3.g(lVar.getLength(), n0Var.f13296e, n0Var.f13294b, z10, lVar.getPosition());
    }

    @Override
    public final int b(m3.l r43, m3.n r44) {
        throw new UnsupportedOperationException("Method not decompiled: t3.d.b(m3.l, m3.n):int");
    }

    @Override
    public final void c(m mVar) {
        this.h = mVar;
        w I = mVar.I(0, 1);
        this.f47613i = I;
        this.f47614j = I;
        this.h.B();
    }

    public final boolean d(m3.l r9) {
        throw new UnsupportedOperationException("Method not decompiled: t3.d.d(m3.l):boolean");
    }

    public final boolean e(m3.l r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: t3.d.e(m3.l, boolean):boolean");
    }

    @Override
    public final boolean f(l lVar) {
        return e(lVar, true);
    }

    @Override
    public final void g(long j10, long j11) {
        this.f47615k = 0;
        this.f47617m = -9223372036854775807L;
        this.f47618n = 0L;
        this.f47620p = 0;
        this.f47624t = j11;
        f fVar = this.f47621q;
        if ((fVar instanceof b) && !((b) fVar).b(j11)) {
            this.f47623s = true;
            this.f47614j = this.f47612g;
        }
    }

    public d(int i9, long j10) {
        this.f47607a = i9;
        this.f47608b = j10;
        this.f47609c = new y(10);
        this.d = new Object();
        this.f47610e = new q();
        this.f47617m = -9223372036854775807L;
        this.f47611f = new xa.c(26);
        j jVar = new j();
        this.f47612g = jVar;
        this.f47614j = jVar;
    }

    @Override
    public final void release() {
    }
}
