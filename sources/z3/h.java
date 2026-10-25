package z3;

import a8.yb;
import b2.w;
import b2.w0;
import b2.x;
import c3.j0;
import c3.o;
import c3.p;
import c3.q;
import c3.y;
import e2.n0;
import f9.g0;
import f9.i0;
import f9.s1;
import java.util.ArrayList;
import java.util.List;
public final class h implements o {
    public final m f52648a;
    public final x f52649b;
    public final ArrayList f52650c;
    public j0 f52651f;
    public int f52652g;
    public int h;
    public long[] f52653i;
    public long f52654j;
    public byte[] e = n0.f9693b;
    public final e2.x d = new e2.x();

    public h(m mVar, x xVar) {
        x xVar2;
        this.f52648a = mVar;
        if (xVar != null) {
            w a2 = xVar.a();
            a2.f3533r = w0.n("application/x-media3-cues");
            a2.f3525j = xVar.f3586s;
            a2.P = mVar.y();
            xVar2 = new x(a2);
        } else {
            xVar2 = null;
        }
        this.f52649b = xVar2;
        this.f52650c = new ArrayList();
        this.h = 0;
        this.f52653i = n0.f9694c;
        this.f52654j = -9223372036854775807L;
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
        yb.p(z10);
        j0 F1 = qVar.F1(0, 3);
        this.f52651f = F1;
        x xVar = this.f52649b;
        if (xVar != null) {
            F1.b(xVar);
            qVar.Q0();
            qVar.D1(new y(-9223372036854775807L, new long[]{0}, new long[]{0}));
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
        yb.p(z10);
        this.f52654j = j11;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f10287b;
        return s1.e;
    }

    @Override
    public final int f(c3.p r21, c3.s r22) {
        throw new UnsupportedOperationException("Method not decompiled: z3.h.f(c3.p, c3.s):int");
    }

    public final void g(g gVar) {
        this.f52651f.getClass();
        byte[] bArr = gVar.f52647b;
        int length = bArr.length;
        e2.x xVar = this.d;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
        this.f52651f.d(length, xVar);
        this.f52651f.c(gVar.f52646a, 1, length, 0, null);
    }

    @Override
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.f52648a.reset();
        this.h = 5;
    }

    @Override
    public final o b() {
        return this;
    }
}
