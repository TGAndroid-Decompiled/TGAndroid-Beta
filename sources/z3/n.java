package z3;

import b2.p;
import b2.v0;
import b2.w;
import b2.x;
import c3.i0;
import c3.k0;
import e2.l0;
import java.io.EOFException;
import v7.t6;
public final class n implements k0 {
    public final k0 f54592a;
    public final k f54593b;
    public m f54596g;
    public x h;
    public boolean f54597i;
    public int d = 0;
    public int e = 0;
    public byte[] f54595f = l0.f6166b;
    public final e2.x f54594c = new e2.x();

    public n(k0 k0Var, k kVar) {
        this.f54592a = k0Var;
        this.f54593b = kVar;
    }

    @Override
    public final int a(p pVar, int i10, boolean z10) {
        return f(pVar, i10, z10);
    }

    @Override
    public final void b(x xVar) {
        boolean z10;
        m mVar;
        xVar.f2423s.getClass();
        String str = xVar.f2423s;
        if (v0.h(str) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        boolean equals = xVar.equals(this.h);
        k kVar = this.f54593b;
        if (!equals) {
            this.h = xVar;
            if (kVar.F(xVar)) {
                mVar = kVar.m(xVar);
            } else {
                mVar = null;
            }
            this.f54596g = mVar;
        }
        m mVar2 = this.f54596g;
        k0 k0Var = this.f54592a;
        if (mVar2 == null) {
            k0Var.b(xVar);
            return;
        }
        w a2 = xVar.a();
        a2.f2370r = v0.n("application/x-media3-cues");
        a2.f2362j = str;
        a2.f2374w = Long.MAX_VALUE;
        a2.P = kVar.y(xVar);
        i0.a.r(a2, k0Var);
    }

    @Override
    public final void c(long r9, int r11, int r12, int r13, c3.j0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: z3.n.c(long, int, int, int, c3.j0):void");
    }

    @Override
    public final void d(int i10, e2.x xVar) {
        i0.a(this, xVar, i10);
    }

    @Override
    public final int f(p pVar, int i10, boolean z10) {
        if (this.f54596g == null) {
            return this.f54592a.f(pVar, i10, z10);
        }
        h(i10);
        int read = pVar.read(this.f54595f, this.e, i10);
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
    public final void g(e2.x xVar, int i10, int i11) {
        if (this.f54596g == null) {
            this.f54592a.g(xVar, i10, i11);
            return;
        }
        h(i10);
        xVar.k(this.e, i10, this.f54595f);
        this.e += i10;
    }

    public final void h(int i10) {
        byte[] bArr;
        int length = this.f54595f.length;
        int i11 = this.e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.d;
        int max = Math.max(i12 * 2, i10 + i12);
        byte[] bArr2 = this.f54595f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.d, bArr, 0, i12);
        this.d = 0;
        this.e = i12;
        this.f54595f = bArr;
    }

    @Override
    public final void e(long j10) {
    }
}
