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
    public final m f50692a;
    public final s f50693b;
    public final ArrayList f50694c;
    public h0 f50696f;
    public int f50697g;
    public int h;
    public long[] f50698i;
    public long f50699j;
    public byte[] f50695e = d0.f8738b;
    public final v d = new v();

    public h(m mVar, s sVar) {
        s sVar2;
        this.f50692a = mVar;
        if (sVar != null) {
            r a2 = sVar.a();
            a2.f2312q = r0.n("application/x-media3-cues");
            a2.f2305j = sVar.f2370r;
            a2.O = mVar.U();
            sVar2 = new s(a2);
        } else {
            sVar2 = null;
        }
        this.f50693b = sVar2;
        this.f50694c = new ArrayList();
        this.h = 0;
        this.f50698i = d0.f8739c;
        this.f50699j = -9223372036854775807L;
    }

    public final void a(g gVar) {
        e2.d.h(this.f50696f);
        byte[] bArr = gVar.f50691b;
        int length = bArr.length;
        v vVar = this.d;
        vVar.getClass();
        vVar.H(bArr.length, bArr);
        this.f50696f.d(length, vVar);
        this.f50696f.c(gVar.f50690a, 1, length, 0, null);
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
        this.f50696f = R1;
        s sVar = this.f50693b;
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
        this.f50699j = j10;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8957b;
        return a1.f8920e;
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
        this.f50692a.reset();
        this.h = 5;
    }

    @Override
    public final c3.o c() {
        return this;
    }
}
