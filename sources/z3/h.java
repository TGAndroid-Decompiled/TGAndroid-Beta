package z3;

import b2.v;
import b2.v0;
import b2.w;
import c3.b0;
import c3.l0;
import c3.q;
import c3.r;
import c3.s;
import e2.m0;
import e2.x;
import e9.n0;
import e9.x1;
import java.util.ArrayList;
import java.util.List;
import v7.u6;
public final class h implements q {
    public final m f51112a;
    public final w f51113b;
    public final ArrayList f51114c;
    public l0 f51115f;
    public int f51116g;
    public int h;
    public long[] f51117i;
    public long f51118j;
    public byte[] e = m0.f8260b;
    public final x d = new x();

    public h(m mVar, w wVar) {
        w wVar2;
        this.f51112a = mVar;
        if (wVar != null) {
            v a2 = wVar.a();
            a2.f4082r = v0.n("application/x-media3-cues");
            a2.f4074j = wVar.f4135s;
            a2.P = mVar.c();
            wVar2 = new w(a2);
        } else {
            wVar2 = null;
        }
        this.f51113b = wVar2;
        this.f51114c = new ArrayList();
        this.h = 0;
        this.f51117i = m0.f8261c;
        this.f51118j = -9223372036854775807L;
    }

    @Override
    public final boolean a(r rVar) {
        return true;
    }

    @Override
    public final void c(s sVar) {
        boolean z10;
        if (this.h == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        l0 j02 = sVar.j0(0, 3);
        this.f51115f = j02;
        w wVar = this.f51113b;
        if (wVar != null) {
            j02.b(wVar);
            sVar.C();
            sVar.g0(new b0(-9223372036854775807L, new long[]{0}, new long[]{0}));
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
        this.f51118j = j11;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override
    public final List e() {
        e9.l0 l0Var = n0.f8481b;
        return x1.e;
    }

    @Override
    public final int f(c3.r r21, c3.u r22) {
        throw new UnsupportedOperationException("Method not decompiled: z3.h.f(c3.r, c3.u):int");
    }

    public final void g(g gVar) {
        this.f51115f.getClass();
        byte[] bArr = gVar.f51111b;
        int length = bArr.length;
        x xVar = this.d;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
        this.f51115f.d(length, xVar);
        this.f51115f.c(gVar.f51110a, 1, length, 0, null);
    }

    @Override
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.f51112a.reset();
        this.h = 5;
    }

    @Override
    public final q b() {
        return this;
    }
}
