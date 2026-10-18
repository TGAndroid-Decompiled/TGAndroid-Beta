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
    public final m f50643a;
    public final w f50644b;
    public final ArrayList f50645c;
    public j0 f50646f;
    public int f50647g;
    public int h;
    public long[] f50648i;
    public long f50649j;
    public byte[] e = m0.f8254b;
    public final x d = new x();

    public h(m mVar, w wVar) {
        w wVar2;
        this.f50643a = mVar;
        if (wVar != null) {
            v a2 = wVar.a();
            a2.f4079r = v0.n("application/x-media3-cues");
            a2.f4071j = wVar.f4132s;
            a2.P = mVar.c();
            wVar2 = new w(a2);
        } else {
            wVar2 = null;
        }
        this.f50644b = wVar2;
        this.f50645c = new ArrayList();
        this.h = 0;
        this.f50648i = m0.f8255c;
        this.f50649j = -9223372036854775807L;
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
        this.f50646f = j02;
        w wVar = this.f50644b;
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
        this.f50649j = j11;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8475b;
        return x1.e;
    }

    @Override
    public final int f(c3.p r21, c3.s r22) {
        throw new UnsupportedOperationException("Method not decompiled: z3.h.f(c3.p, c3.s):int");
    }

    public final void g(g gVar) {
        this.f50646f.getClass();
        byte[] bArr = gVar.f50642b;
        int length = bArr.length;
        x xVar = this.d;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
        this.f50646f.d(length, xVar);
        this.f50646f.c(gVar.f50641a, 1, length, 0, null);
    }

    @Override
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.f50643a.reset();
        this.h = 5;
    }

    @Override
    public final o b() {
        return this;
    }
}
