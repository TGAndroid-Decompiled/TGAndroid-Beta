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
public final class d implements k {
    public final int f50720a;
    public final long f50721b;
    public final w f50722c;
    public final o0 d;
    public final p f50723e;
    public final ai f50724f;
    public final j f50725g;
    public m h;
    public v f50726i;
    public v f50727j;
    public int f50728k;
    public e4.c f50729l;
    public long f50730m;
    public long f50731n;
    public long f50732o;
    public int f50733p;
    public f f50734q;
    public boolean f50735r;
    public boolean f50736s;
    public long f50737t;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    public final a a(l lVar, boolean z4) {
        w wVar = this.f50722c;
        lVar.b(0, 4, wVar.f7308a);
        wVar.F(0);
        int g10 = wVar.g();
        o0 o0Var = this.d;
        o0Var.a(g10);
        return new r3.g(lVar.getLength(), o0Var.f11574e, o0Var.f11572b, z4, lVar.getPosition());
    }

    public final boolean b(r3.l r9) {
        throw new UnsupportedOperationException("Method not decompiled: y3.d.b(r3.l):boolean");
    }

    public final boolean c(r3.l r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: y3.d.c(r3.l, boolean):boolean");
    }

    @Override
    public final void d(long j10, long j11) {
        this.f50728k = 0;
        this.f50730m = -9223372036854775807L;
        this.f50731n = 0L;
        this.f50733p = 0;
        this.f50737t = j11;
        f fVar = this.f50734q;
        if ((fVar instanceof b) && !((b) fVar).d(j11)) {
            this.f50736s = true;
            this.f50727j = this.f50725g;
        }
    }

    @Override
    public final void e(m mVar) {
        this.h = mVar;
        v i22 = mVar.i2(0, 1);
        this.f50726i = i22;
        this.f50727j = i22;
        this.h.i1();
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
        this.f50720a = i10;
        this.f50721b = j10;
        this.f50722c = new w(10);
        this.d = new Object();
        this.f50723e = new p();
        this.f50730m = -9223372036854775807L;
        this.f50724f = new ai(9);
        j jVar = new j();
        this.f50725g = jVar;
        this.f50727j = jVar;
    }

    @Override
    public final void release() {
    }
}
