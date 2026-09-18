package z3;

import b2.r;
import b2.r0;
import b2.s;
import c3.h0;
import c3.p;
import c3.q;
import c3.y;
import e2.d0;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import java.util.ArrayList;
import java.util.List;
public final class h implements c3.o {
    public final m f48117a;
    public final s f48118b;
    public final ArrayList f48119c;
    public h0 f48120f;
    public int f48121g;
    public int h;
    public long[] f48122i;
    public long f48123j;
    public byte[] e = d0.f7889b;
    public final v d = new v();

    public h(m mVar, s sVar) {
        s sVar2;
        this.f48117a = mVar;
        if (sVar != null) {
            r a2 = sVar.a();
            a2.f3253q = r0.n("application/x-media3-cues");
            a2.f3246j = sVar.f3309r;
            a2.O = mVar.A();
            sVar2 = new s(a2);
        } else {
            sVar2 = null;
        }
        this.f48118b = sVar2;
        this.f48119c = new ArrayList();
        this.h = 0;
        this.f48122i = d0.f7890c;
        this.f48123j = -9223372036854775807L;
    }

    @Override
    public final boolean a(p pVar) {
        return true;
    }

    public final void b(g gVar) {
        e2.d.h(this.f48120f);
        byte[] bArr = gVar.f48116b;
        int length = bArr.length;
        v vVar = this.d;
        vVar.getClass();
        vVar.H(bArr.length, bArr);
        this.f48120f.d(length, vVar);
        this.f48120f.c(gVar.f48115a, 1, length, 0, null);
    }

    @Override
    public final void g(q qVar) {
        boolean z10;
        if (this.h == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        h0 Z1 = qVar.Z1(0, 3);
        this.f48120f = Z1;
        s sVar = this.f48118b;
        if (sVar != null) {
            Z1.b(sVar);
            qVar.e1();
            qVar.X1(new y(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.h = 1;
    }

    @Override
    public final void h(long j3, long j10) {
        boolean z10;
        int i10 = this.h;
        if (i10 != 0 && i10 != 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        this.f48123j = j10;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8084b;
        return a1.e;
    }

    @Override
    public final int m(c3.p r21, c3.s r22) {
        throw new UnsupportedOperationException("Method not decompiled: z3.h.m(c3.p, c3.s):int");
    }

    @Override
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.f48117a.reset();
        this.h = 5;
    }

    @Override
    public final c3.o c() {
        return this;
    }
}
