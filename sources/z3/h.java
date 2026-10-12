package z3;

import b2.r;
import b2.r0;
import b2.s;
import c3.h0;
import c3.o;
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
public final class h implements o {
    public final m f53729a;
    public final s f53730b;
    public final ArrayList f53731c;
    public h0 f53733f;
    public int f53734g;
    public int h;
    public long[] f53735i;
    public long f53736j;
    public byte[] f53732e = d0.f8530b;
    public final v d = new v();

    public h(m mVar, s sVar) {
        s sVar2;
        this.f53729a = mVar;
        if (sVar != null) {
            r a2 = sVar.a();
            a2.f3583q = r0.n("application/x-media3-cues");
            a2.f3576j = sVar.f3641r;
            a2.O = mVar.a0();
            sVar2 = new s(a2);
        } else {
            sVar2 = null;
        }
        this.f53730b = sVar2;
        this.f53731c = new ArrayList();
        this.h = 0;
        this.f53735i = d0.f8531c;
        this.f53736j = -9223372036854775807L;
    }

    public final void a(g gVar) {
        e2.d.h(this.f53733f);
        byte[] bArr = gVar.f53728b;
        int length = bArr.length;
        v vVar = this.d;
        vVar.getClass();
        vVar.H(bArr.length, bArr);
        this.f53733f.d(length, vVar);
        this.f53733f.c(gVar.f53727a, 1, length, 0, null);
    }

    @Override
    public final boolean b(p pVar) {
        return true;
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
        h0 f22 = qVar.f2(0, 3);
        this.f53733f = f22;
        s sVar = this.f53730b;
        if (sVar != null) {
            f22.b(sVar);
            qVar.k1();
            qVar.d2(new y(-9223372036854775807L, new long[]{0}, new long[]{0}));
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
        this.f53736j = j10;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8749b;
        return a1.f8712e;
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
        this.f53729a.reset();
        this.h = 5;
    }

    @Override
    public final o c() {
        return this;
    }
}
