package z3;

import b2.v0;
import b2.w;
import b2.x;
import c3.k0;
import c3.o;
import c3.p;
import c3.q;
import c3.y;
import e2.l0;
import e9.n0;
import e9.x1;
import java.util.ArrayList;
import java.util.List;
import v7.t6;
public final class h implements o {
    public final m f54561a;
    public final x f54562b;
    public final ArrayList f54563c;
    public k0 f54564f;
    public int f54565g;
    public int h;
    public long[] f54566i;
    public long f54567j;
    public byte[] e = l0.f6166b;
    public final e2.x d = new e2.x();

    public h(m mVar, x xVar) {
        x xVar2;
        this.f54561a = mVar;
        if (xVar != null) {
            w a2 = xVar.a();
            a2.f2370r = v0.n("application/x-media3-cues");
            a2.f2362j = xVar.f2423s;
            a2.P = mVar.o();
            xVar2 = new x(a2);
        } else {
            xVar2 = null;
        }
        this.f54562b = xVar2;
        this.f54563c = new ArrayList();
        this.h = 0;
        this.f54566i = l0.f6167c;
        this.f54567j = -9223372036854775807L;
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
        t6.p(z10);
        k0 I1 = qVar.I1(0, 3);
        this.f54564f = I1;
        x xVar = this.f54562b;
        if (xVar != null) {
            I1.b(xVar);
            qVar.Q0();
            qVar.G1(new y(-9223372036854775807L, new long[]{0}, new long[]{0}));
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
        t6.p(z10);
        this.f54567j = j11;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override
    public final List e() {
        e9.l0 l0Var = n0.f6390b;
        return x1.e;
    }

    @Override
    public final int f(c3.p r21, c3.s r22) {
        throw new UnsupportedOperationException("Method not decompiled: z3.h.f(c3.p, c3.s):int");
    }

    public final void g(g gVar) {
        this.f54564f.getClass();
        byte[] bArr = gVar.f54560b;
        int length = bArr.length;
        e2.x xVar = this.d;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
        this.f54564f.d(length, xVar);
        this.f54564f.c(gVar.f54559a, 1, length, 0, null);
    }

    @Override
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.f54561a.reset();
        this.h = 5;
    }

    @Override
    public final o b() {
        return this;
    }
}
