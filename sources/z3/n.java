package z3;

import a8.yb;
import b2.p;
import b2.w;
import b2.w0;
import b2.x;
import c3.h0;
import c3.j0;
import e2.n0;
import java.io.EOFException;
public final class n implements j0 {
    public final j0 f52722a;
    public final k f52723b;
    public m f52726g;
    public x h;
    public boolean f52727i;
    public int d = 0;
    public int e = 0;
    public byte[] f52725f = n0.f9692b;
    public final e2.x f52724c = new e2.x();

    public n(j0 j0Var, k kVar) {
        this.f52722a = j0Var;
        this.f52723b = kVar;
    }

    @Override
    public final int a(p pVar, int i10, boolean z10) {
        return f(pVar, i10, z10);
    }

    @Override
    public final void b(x xVar) {
        boolean z10;
        m mVar;
        xVar.f3586s.getClass();
        String str = xVar.f3586s;
        if (w0.h(str) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        boolean equals = xVar.equals(this.h);
        k kVar = this.f52723b;
        if (!equals) {
            this.h = xVar;
            if (kVar.i1(xVar)) {
                mVar = kVar.f0(xVar);
            } else {
                mVar = null;
            }
            this.f52726g = mVar;
        }
        m mVar2 = this.f52726g;
        j0 j0Var = this.f52722a;
        if (mVar2 == null) {
            j0Var.b(xVar);
            return;
        }
        w a2 = xVar.a();
        a2.f3533r = w0.n("application/x-media3-cues");
        a2.f3525j = str;
        a2.f3537w = Long.MAX_VALUE;
        a2.P = kVar.B0(xVar);
        ic.a.u(a2, j0Var);
    }

    @Override
    public final void c(long r9, int r11, int r12, int r13, c3.i0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: z3.n.c(long, int, int, int, c3.i0):void");
    }

    @Override
    public final void d(int i10, e2.x xVar) {
        h0.a(this, xVar, i10);
    }

    @Override
    public final int f(p pVar, int i10, boolean z10) {
        if (this.f52726g == null) {
            return this.f52722a.f(pVar, i10, z10);
        }
        h(i10);
        int read = pVar.read(this.f52725f, this.e, i10);
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
        if (this.f52726g == null) {
            this.f52722a.g(xVar, i10, i11);
            return;
        }
        h(i10);
        xVar.k(this.e, i10, this.f52725f);
        this.e += i10;
    }

    public final void h(int i10) {
        byte[] bArr;
        int length = this.f52725f.length;
        int i11 = this.e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.d;
        int max = Math.max(i12 * 2, i10 + i12);
        byte[] bArr2 = this.f52725f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.d, bArr, 0, i12);
        this.d = 0;
        this.e = i12;
        this.f52725f = bArr;
    }

    @Override
    public final void e(long j10) {
    }
}
