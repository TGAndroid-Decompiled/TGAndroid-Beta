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
    public final m f50721a;
    public final s f50722b;
    public final ArrayList f50723c;
    public h0 f50725f;
    public int f50726g;
    public int h;
    public long[] f50727i;
    public long f50728j;
    public byte[] f50724e = d0.f8766b;
    public final v d = new v();

    public h(m mVar, s sVar) {
        s sVar2;
        this.f50721a = mVar;
        if (sVar != null) {
            r a2 = sVar.a();
            a2.f2339q = r0.n("application/x-media3-cues");
            a2.f2332j = sVar.f2397r;
            a2.O = mVar.U();
            sVar2 = new s(a2);
        } else {
            sVar2 = null;
        }
        this.f50722b = sVar2;
        this.f50723c = new ArrayList();
        this.h = 0;
        this.f50727i = d0.f8767c;
        this.f50728j = -9223372036854775807L;
    }

    public final void a(g gVar) {
        e2.d.h(this.f50725f);
        byte[] bArr = gVar.f50720b;
        int length = bArr.length;
        v vVar = this.d;
        vVar.getClass();
        vVar.H(bArr.length, bArr);
        this.f50725f.d(length, vVar);
        this.f50725f.c(gVar.f50719a, 1, length, 0, null);
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
        h0 R1 = qVar.R1(0, 3);
        this.f50725f = R1;
        s sVar = this.f50722b;
        if (sVar != null) {
            R1.b(sVar);
            qVar.Z0();
            qVar.P1(new y(-9223372036854775807L, new long[]{0}, new long[]{0}));
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
        this.f50728j = j10;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8985b;
        return a1.f8948e;
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
        this.f50721a.reset();
        this.h = 5;
    }

    @Override
    public final c3.o c() {
        return this;
    }
}
