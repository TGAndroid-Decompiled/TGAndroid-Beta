package z3;

import b2.r;
import b2.r0;
import b2.s;
import c3.h0;
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
    public final n f48082a;
    public final s f48083b;
    public final ArrayList f48084c;
    public h0 f48085f;
    public int f48086g;
    public int h;
    public long[] f48087i;
    public long f48088j;
    public byte[] e = d0.f7886b;
    public final v d = new v();

    public i(n nVar, s sVar) {
        s sVar2;
        this.f48082a = nVar;
        if (sVar != null) {
            r a2 = sVar.a();
            a2.f3250q = r0.n("application/x-media3-cues");
            a2.f3243j = sVar.f3306r;
            a2.O = nVar.A();
            sVar2 = new s(a2);
        } else {
            sVar2 = null;
        }
        this.f48083b = sVar2;
        this.f48084c = new ArrayList();
        this.h = 0;
        this.f48087i = d0.f7887c;
        this.f48088j = -9223372036854775807L;
    }

    @Override
    public final boolean a(c3.p pVar) {
        return true;
    }

    public final void b(h hVar) {
        e2.d.h(this.f48085f);
        byte[] bArr = hVar.f48081b;
        int length = bArr.length;
        v vVar = this.d;
        vVar.getClass();
        vVar.H(bArr.length, bArr);
        this.f48085f.d(length, vVar);
        this.f48085f.c(hVar.f48080a, 1, length, 0, null);
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
        this.f48085f = Z1;
        s sVar = this.f48083b;
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
        this.f48088j = j10;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8081b;
        return a1.e;
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
        this.f48082a.reset();
        this.h = 5;
    }

    @Override
    public final c3.o c() {
        return this;
    }
}
