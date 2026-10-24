package z3;

import b2.o;
import b2.v;
import b2.v0;
import b2.w;
import c3.l0;
import e2.m0;
import e2.x;
import i2.o1;
import java.io.EOFException;
import v7.u6;
public final class n implements l0 {
    public final l0 f51125a;
    public final k f51126b;
    public m f51129g;
    public w h;
    public boolean f51130i;
    public int d = 0;
    public int e = 0;
    public byte[] f51128f = m0.f8260b;
    public final x f51127c = new x();

    public n(l0 l0Var, k kVar) {
        this.f51125a = l0Var;
        this.f51126b = kVar;
    }

    @Override
    public final int a(o oVar, int i10, boolean z10) {
        return f(oVar, i10, z10);
    }

    @Override
    public final void b(w wVar) {
        boolean z10;
        m mVar;
        wVar.f4135s.getClass();
        String str = wVar.f4135s;
        if (v0.h(str) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        boolean equals = wVar.equals(this.h);
        k kVar = this.f51126b;
        if (!equals) {
            this.h = wVar;
            if (kVar.a0(wVar)) {
                mVar = kVar.y(wVar);
            } else {
                mVar = null;
            }
            this.f51129g = mVar;
        }
        m mVar2 = this.f51129g;
        l0 l0Var = this.f51125a;
        if (mVar2 == null) {
            l0Var.b(wVar);
            return;
        }
        v a2 = wVar.a();
        a2.f4082r = v0.n("application/x-media3-cues");
        a2.f4074j = str;
        a2.f4086w = Long.MAX_VALUE;
        a2.P = kVar.L(wVar);
        o1.v(a2, l0Var);
    }

    @Override
    public final void c(long r9, int r11, int r12, int r13, c3.k0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: z3.n.c(long, int, int, int, c3.k0):void");
    }

    @Override
    public final void d(int i10, x xVar) {
        a1.g.a(this, xVar, i10);
    }

    @Override
    public final int f(o oVar, int i10, boolean z10) {
        if (this.f51129g == null) {
            return this.f51125a.f(oVar, i10, z10);
        }
        h(i10);
        int read = oVar.read(this.f51128f, this.e, i10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        this.e += read;
        return read;
    }

    @Override
    public final void g(x xVar, int i10, int i11) {
        if (this.f51129g == null) {
            this.f51125a.g(xVar, i10, i11);
            return;
        }
        h(i10);
        xVar.k(this.e, i10, this.f51128f);
        this.e += i10;
    }

    public final void h(int i10) {
        byte[] bArr;
        int length = this.f51128f.length;
        int i11 = this.e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.d;
        int max = Math.max(i12 * 2, i10 + i12);
        byte[] bArr2 = this.f51128f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.d, bArr, 0, i12);
        this.d = 0;
        this.e = i12;
        this.f51128f = bArr;
    }

    @Override
    public final void e(long j10) {
    }
}
