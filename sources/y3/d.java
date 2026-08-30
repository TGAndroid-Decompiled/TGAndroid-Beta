package y3;

import h5.w;
import l3.o0;
import ph.j5;
import r3.j;
import r3.k;
import r3.l;
import r3.m;
import r3.p;
import r3.v;
public final class d implements k {
    public final int f47037a;
    public final long f47038b;
    public final w f47039c;
    public final o0 d;
    public final p e;
    public final j5 f47040f;
    public final j f47041g;
    public m h;
    public v f47042i;
    public v f47043j;
    public int f47044k;
    public e4.c f47045l;
    public long f47046m;
    public long f47047n;
    public long f47048o;
    public int f47049p;
    public f f47050q;
    public boolean f47051r;
    public boolean f47052s;
    public long f47053t;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    public final a a(l lVar, boolean z4) {
        w wVar = this.f47039c;
        lVar.c(0, 4, wVar.f7000a);
        wVar.F(0);
        int g10 = wVar.g();
        o0 o0Var = this.d;
        o0Var.a(g10);
        return new r3.g(lVar.getLength(), o0Var.e, o0Var.f11206b, z4, lVar.getPosition());
    }

    public final boolean b(r3.l r9) {
        throw new UnsupportedOperationException("Method not decompiled: y3.d.b(r3.l):boolean");
    }

    public final boolean c(r3.l r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: y3.d.c(r3.l, boolean):boolean");
    }

    @Override
    public final void d(long j10, long j11) {
        this.f47044k = 0;
        this.f47046m = -9223372036854775807L;
        this.f47047n = 0L;
        this.f47049p = 0;
        this.f47053t = j11;
        f fVar = this.f47050q;
        if ((fVar instanceof b) && !((b) fVar).d(j11)) {
            this.f47052s = true;
            this.f47043j = this.f47041g;
        }
    }

    @Override
    public final void e(m mVar) {
        this.h = mVar;
        v c22 = mVar.c2(0, 1);
        this.f47042i = c22;
        this.f47043j = c22;
        this.h.f1();
    }

    @Override
    public final int h(r3.l r43, org.telegram.ui.Components.jb r44) {
        throw new UnsupportedOperationException("Method not decompiled: y3.d.h(r3.l, org.telegram.ui.Components.jb):int");
    }

    @Override
    public final boolean i(l lVar) {
        return c(lVar, true);
    }

    public d(int i10, long j10) {
        this.f47037a = i10;
        this.f47038b = j10;
        this.f47039c = new w(10);
        this.d = new Object();
        this.e = new p();
        this.f47046m = -9223372036854775807L;
        this.f47040f = new j5(2);
        j jVar = new j();
        this.f47041g = jVar;
        this.f47043j = jVar;
    }

    @Override
    public final void release() {
    }
}
