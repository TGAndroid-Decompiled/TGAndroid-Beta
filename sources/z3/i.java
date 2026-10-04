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
public final class i implements c3.o {
    public final n f52365a;
    public final s f52366b;
    public final ArrayList f52367c;
    public h0 f52369f;
    public int f52370g;
    public int h;
    public long[] f52371i;
    public long f52372j;
    public byte[] f52368e = d0.f8538b;
    public final v d = new v();

    public i(n nVar, s sVar) {
        s sVar2;
        this.f52365a = nVar;
        if (sVar != null) {
            r a2 = sVar.a();
            a2.f3506q = r0.n("application/x-media3-cues");
            a2.f3499j = sVar.f3564r;
            a2.O = nVar.A();
            sVar2 = new s(a2);
        } else {
            sVar2 = null;
        }
        this.f52366b = sVar2;
        this.f52367c = new ArrayList();
        this.h = 0;
        this.f52371i = d0.f8539c;
        this.f52372j = -9223372036854775807L;
    }

    public final void a(h hVar) {
        e2.d.h(this.f52369f);
        byte[] bArr = hVar.f52364b;
        int length = bArr.length;
        v vVar = this.d;
        vVar.getClass();
        vVar.H(bArr.length, bArr);
        this.f52369f.d(length, vVar);
        this.f52369f.c(hVar.f52363a, 1, length, 0, null);
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
        h0 Z1 = qVar.Z1(0, 3);
        this.f52369f = Z1;
        s sVar = this.f52366b;
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
        this.f52372j = j10;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8757b;
        return a1.f8720e;
    }

    @Override
    public final int m(c3.p r21, c3.s r22) {
        throw new UnsupportedOperationException("Method not decompiled: z3.i.m(c3.p, c3.s):int");
    }

    @Override
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.f52365a.reset();
        this.h = 5;
    }

    @Override
    public final c3.o c() {
        return this;
    }
}
