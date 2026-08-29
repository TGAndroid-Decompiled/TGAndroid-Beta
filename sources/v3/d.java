package v3;

import f5.w;
import l3.p0;
import o3.j;
import o3.k;
import o3.l;
import o3.m;
import o3.q;
public final class d implements k {
    public final int f49334a;
    public final long f49335b;
    public final w f49336c;
    public final p0 d;
    public final q f49337e;
    public final o1.a f49338f;
    public final j f49339g;
    public m h;
    public o3.w f49340i;
    public o3.w f49341j;
    public int f49342k;
    public b4.c f49343l;
    public long f49344m;
    public long f49345n;
    public long f49346o;
    public int f49347p;
    public f f49348q;
    public boolean f49349r;
    public boolean f49350s;
    public long f49351t;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    public final a a(l lVar, boolean z10) {
        w wVar = this.f49336c;
        lVar.a(0, 4, wVar.f6640a);
        wVar.C(0);
        int e10 = wVar.e();
        p0 p0Var = this.d;
        p0Var.a(e10);
        return new o3.g(lVar.getLength(), p0Var.f14156e, p0Var.f14154b, z10, lVar.getPosition());
    }

    public final boolean b(o3.l r9) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.b(o3.l):boolean");
    }

    public final boolean c(o3.l r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.c(o3.l, boolean):boolean");
    }

    @Override
    public final int d(o3.l r43, o3.n r44) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.d(o3.l, o3.n):int");
    }

    @Override
    public final boolean e(l lVar) {
        return c(lVar, true);
    }

    @Override
    public final void f(long j10, long j11) {
        this.f49342k = 0;
        this.f49344m = -9223372036854775807L;
        this.f49345n = 0L;
        this.f49347p = 0;
        this.f49351t = j11;
        f fVar = this.f49348q;
        if ((fVar instanceof b) && !((b) fVar).d(j11)) {
            this.f49350s = true;
            this.f49341j = this.f49339g;
        }
    }

    @Override
    public final void i(m mVar) {
        this.h = mVar;
        o3.w Z1 = mVar.Z1(0, 1);
        this.f49340i = Z1;
        this.f49341j = Z1;
        this.h.e1();
    }

    public d(int i10, long j10) {
        this.f49334a = i10;
        this.f49335b = j10;
        this.f49336c = new w(10);
        this.d = new Object();
        this.f49337e = new q();
        this.f49344m = -9223372036854775807L;
        this.f49338f = new o1.a(1);
        j jVar = new j();
        this.f49339g = jVar;
        this.f49341j = jVar;
    }

    @Override
    public final void release() {
    }
}
