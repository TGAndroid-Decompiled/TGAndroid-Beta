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
    public final n f48406a;
    public final s f48407b;
    public final ArrayList f48408c;
    public h0 f48409f;
    public int f48410g;
    public int h;
    public long[] f48411i;
    public long f48412j;
    public byte[] e = d0.f7873b;
    public final v d = new v();

    public h(n nVar, s sVar) {
        s sVar2;
        this.f48406a = nVar;
        if (sVar != null) {
            r a2 = sVar.a();
            a2.f3247q = r0.n("application/x-media3-cues");
            a2.f3240j = sVar.f3303r;
            a2.O = nVar.A();
            sVar2 = new s(a2);
        } else {
            sVar2 = null;
        }
        this.f48407b = sVar2;
        this.f48408c = new ArrayList();
        this.h = 0;
        this.f48411i = d0.f7874c;
        this.f48412j = -9223372036854775807L;
    }

    @Override
    public final boolean a(p pVar) {
        return true;
    }

    public final void b(g gVar) {
        e2.d.h(this.f48409f);
        byte[] bArr = gVar.f48405b;
        int length = bArr.length;
        v vVar = this.d;
        vVar.getClass();
        vVar.H(bArr.length, bArr);
        this.f48409f.d(length, vVar);
        this.f48409f.c(gVar.f48404a, 1, length, 0, null);
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
        this.f48409f = Z1;
        s sVar = this.f48407b;
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
        this.f48412j = j10;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8068b;
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
        this.f48406a.reset();
        this.h = 5;
    }

    @Override
    public final c3.o c() {
        return this;
    }
}
