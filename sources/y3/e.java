package y3;

import h5.w;
import l3.o0;
import org.telegram.ui.Components.ai;
import r3.j;
import r3.k;
import r3.l;
import r3.m;
import r3.p;
import r3.v;
public final class e implements k {
    public final int f50756a;
    public final long f50757b;
    public final w f50758c;
    public final o0 d;
    public final p f50759e;
    public final ai f50760f;
    public final j f50761g;
    public m h;
    public v f50762i;
    public v f50763j;
    public int f50764k;
    public e4.c f50765l;
    public long f50766m;
    public long f50767n;
    public long f50768o;
    public int f50769p;
    public g f50770q;
    public boolean f50771r;
    public boolean f50772s;
    public long f50773t;

    public e(int i10) {
        this(i10, -9223372036854775807L);
    }

    public final a a(l lVar, boolean z4) {
        w wVar = this.f50758c;
        lVar.b(0, 4, wVar.f7308a);
        wVar.F(0);
        int g10 = wVar.g();
        o0 o0Var = this.d;
        o0Var.a(g10);
        return new r3.g(lVar.getLength(), o0Var.f11574e, o0Var.f11572b, z4, lVar.getPosition());
    }

    public final boolean b(r3.l r9) {
        throw new UnsupportedOperationException("Method not decompiled: y3.e.b(r3.l):boolean");
    }

    public final boolean c(r3.l r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: y3.e.c(r3.l, boolean):boolean");
    }

    @Override
    public final void d(long j10, long j11) {
        this.f50764k = 0;
        this.f50766m = -9223372036854775807L;
        this.f50767n = 0L;
        this.f50769p = 0;
        this.f50773t = j11;
        g gVar = this.f50770q;
        if ((gVar instanceof b) && !((b) gVar).d(j11)) {
            this.f50772s = true;
            this.f50763j = this.f50761g;
        }
    }

    @Override
    public final void e(m mVar) {
        this.h = mVar;
        v i22 = mVar.i2(0, 1);
        this.f50762i = i22;
        this.f50763j = i22;
        this.h.i1();
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
        this.f50756a = i10;
        this.f50757b = j10;
        this.f50758c = new w(10);
        this.d = new Object();
        this.f50759e = new p();
        this.f50766m = -9223372036854775807L;
        this.f50760f = new ai(9);
        j jVar = new j();
        this.f50761g = jVar;
        this.f50763j = jVar;
    }

    @Override
    public final void release() {
    }
}
