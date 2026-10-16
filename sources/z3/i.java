package z3;

import b2.w;
import b2.w0;
import b2.x;
import c3.i0;
import c3.p;
import c3.q;
import c3.y;
import e2.m0;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.ArrayList;
import java.util.List;
import v7.u6;
public final class i implements c3.o {
    public final n f49260a;
    public final x f49261b;
    public final ArrayList f49262c;
    public i0 f49263f;
    public int f49264g;
    public int h;
    public long[] f49265i;
    public long f49266j;
    public byte[] e = m0.f8376b;
    public final e2.x d = new e2.x();

    public i(n nVar, x xVar) {
        x xVar2;
        this.f49260a = nVar;
        if (xVar != null) {
            w a2 = xVar.a();
            a2.f2470r = w0.n("application/x-media3-cues");
            a2.f2462j = xVar.f2523s;
            a2.P = nVar.X();
            xVar2 = new x(a2);
        } else {
            xVar2 = null;
        }
        this.f49261b = xVar2;
        this.f49262c = new ArrayList();
        this.h = 0;
        this.f49265i = m0.f8377c;
        this.f49266j = -9223372036854775807L;
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
        i0 W = qVar.W(0, 3);
        this.f49263f = W;
        x xVar = this.f49261b;
        if (xVar != null) {
            W.b(xVar);
            qVar.D();
            qVar.K(new y(-9223372036854775807L, new long[]{0}, new long[]{0}));
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
        this.f49266j = j11;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8595b;
        return x1.e;
    }

    @Override
    public final int f(c3.p r21, c3.s r22) {
        throw new UnsupportedOperationException("Method not decompiled: z3.i.f(c3.p, c3.s):int");
    }

    public final void g(h hVar) {
        this.f49263f.getClass();
        byte[] bArr = hVar.f49259b;
        int length = bArr.length;
        e2.x xVar = this.d;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
        this.f49263f.d(length, xVar);
        this.f49263f.c(hVar.f49258a, 1, length, 0, null);
    }

    @Override
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.f49260a.reset();
        this.h = 5;
    }

    @Override
    public final c3.o b() {
        return this;
    }
}
