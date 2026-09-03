package y3;

import h5.w;
import l3.o0;
import r3.j;
import r3.k;
import r3.l;
import r3.m;
import r3.p;
import r3.v;
public final class e implements k {
    public final int f47131a;
    public final long f47132b;
    public final w f47133c;
    public final o0 d;
    public final p e;
    public final o2.i f47134f;
    public final j f47135g;
    public m h;
    public v f47136i;
    public v f47137j;
    public int f47138k;
    public e4.c f47139l;
    public long f47140m;
    public long f47141n;
    public long f47142o;
    public int f47143p;
    public g f47144q;
    public boolean f47145r;
    public boolean f47146s;
    public long f47147t;

    public e(int i10) {
        this(i10, -9223372036854775807L);
    }

    public final a a(l lVar, boolean z4) {
        w wVar = this.f47133c;
        lVar.b(0, 4, wVar.f6987a);
        wVar.F(0);
        int g10 = wVar.g();
        o0 o0Var = this.d;
        o0Var.a(g10);
        return new r3.g(lVar.getLength(), o0Var.e, o0Var.f11316b, z4, lVar.getPosition());
    }

    public final boolean b(r3.l r9) {
        throw new UnsupportedOperationException("Method not decompiled: y3.e.b(r3.l):boolean");
    }

    public final boolean c(r3.l r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: y3.e.c(r3.l, boolean):boolean");
    }

    @Override
    public final void d(long j10, long j11) {
        this.f47138k = 0;
        this.f47140m = -9223372036854775807L;
        this.f47141n = 0L;
        this.f47143p = 0;
        this.f47147t = j11;
        g gVar = this.f47144q;
        if ((gVar instanceof b) && !((b) gVar).d(j11)) {
            this.f47146s = true;
            this.f47137j = this.f47135g;
        }
    }

    @Override
    public final void e(m mVar) {
        this.h = mVar;
        v d22 = mVar.d2(0, 1);
        this.f47136i = d22;
        this.f47137j = d22;
        this.h.j1();
    }

    @Override
    public final int h(r3.l r43, org.telegram.ui.Components.jb r44) {
        throw new UnsupportedOperationException("Method not decompiled: y3.e.h(r3.l, org.telegram.ui.Components.jb):int");
    }

    @Override
    public final boolean i(l lVar) {
        return c(lVar, true);
    }

    public e(int i10, long j10) {
        this.f47131a = i10;
        this.f47132b = j10;
        this.f47133c = new w(10);
        this.d = new Object();
        this.e = new p();
        this.f47140m = -9223372036854775807L;
        this.f47134f = new o2.i(13);
        j jVar = new j();
        this.f47135g = jVar;
        this.f47137j = jVar;
    }

    @Override
    public final void release() {
    }
}
