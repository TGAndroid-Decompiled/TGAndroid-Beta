package z3;

import b2.v;
import b2.v0;
import b2.w;
import c3.j0;
import c3.o;
import c3.p;
import c3.q;
import c3.z;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.ArrayList;
import java.util.List;
import v7.u6;
public final class h implements o {
    public final m f50654a;
    public final w f50655b;
    public final ArrayList f50656c;
    public j0 f50657f;
    public int f50658g;
    public int h;
    public long[] f50659i;
    public long f50660j;
    public byte[] e = m0.f8253b;
    public final x d = new x();

    public h(m mVar, w wVar) {
        w wVar2;
        this.f50654a = mVar;
        if (wVar != null) {
            v a2 = wVar.a();
            a2.f4075r = v0.n("application/x-media3-cues");
            a2.f4067j = wVar.f4128s;
            a2.P = mVar.c();
            wVar2 = new w(a2);
        } else {
            wVar2 = null;
        }
        this.f50655b = wVar2;
        this.f50656c = new ArrayList();
        this.h = 0;
        this.f50659i = m0.f8254c;
        this.f50660j = -9223372036854775807L;
    }

    @Override
    public final boolean a(p pVar) {
        return true;
    }

    @Override
    public final void c(q qVar) {
        boolean z10;
        if (this.h == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        j0 j02 = qVar.j0(0, 3);
        this.f50657f = j02;
        w wVar = this.f50655b;
        if (wVar != null) {
            j02.b(wVar);
            qVar.H();
            qVar.g0(new z(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.h = 1;
    }

    @Override
    public final void d(long j10, long j11) {
        boolean z10;
        int i10 = this.h;
        if (i10 != 0 && i10 != 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        this.f50660j = j11;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8474b;
        return x1.e;
    }

    @Override
    public final int f(c3.p r21, c3.s r22) {
        throw new UnsupportedOperationException("Method not decompiled: z3.h.f(c3.p, c3.s):int");
    }

    public final void g(g gVar) {
        this.f50657f.getClass();
        byte[] bArr = gVar.f50653b;
        int length = bArr.length;
        x xVar = this.d;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
        this.f50657f.d(length, xVar);
        this.f50657f.c(gVar.f50652a, 1, length, 0, null);
    }

    @Override
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.f50654a.reset();
        this.h = 5;
    }

    @Override
    public final o b() {
        return this;
    }
}
