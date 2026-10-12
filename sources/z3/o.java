package z3;

import b2.p;
import b2.w;
import b2.w0;
import b2.x;
import c3.i0;
import e2.m0;
import java.io.EOFException;
import v7.u6;
public final class o implements i0 {
    public final i0 f49274a;
    public final l f49275b;
    public n f49278g;
    public x h;
    public boolean f49279i;
    public int d = 0;
    public int e = 0;
    public byte[] f49277f = m0.f8373b;
    public final e2.x f49276c = new e2.x();

    public o(i0 i0Var, l lVar) {
        this.f49274a = i0Var;
        this.f49275b = lVar;
    }

    @Override
    public final int a(p pVar, int i10, boolean z10) {
        return f(pVar, i10, z10);
    }

    @Override
    public final void b(x xVar) {
        boolean z10;
        n nVar;
        xVar.f2519s.getClass();
        String str = xVar.f2519s;
        if (w0.h(str) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        boolean equals = xVar.equals(this.h);
        l lVar = this.f49275b;
        if (!equals) {
            this.h = xVar;
            if (lVar.b0(xVar)) {
                nVar = lVar.p(xVar);
            } else {
                nVar = null;
            }
            this.f49278g = nVar;
        }
        n nVar2 = this.f49278g;
        i0 i0Var = this.f49274a;
        if (nVar2 == null) {
            i0Var.b(xVar);
            return;
        }
        w a2 = xVar.a();
        a2.f2466r = w0.n("application/x-media3-cues");
        a2.f2458j = str;
        a2.f2470w = Long.MAX_VALUE;
        a2.P = lVar.J(xVar);
        i2.d.s(a2, i0Var);
    }

    @Override
    public final void c(long r9, int r11, int r12, int r13, c3.h0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: z3.o.c(long, int, int, int, c3.h0):void");
    }

    @Override
    public final void d(int i10, e2.x xVar) {
        a1.g.a(this, xVar, i10);
    }

    @Override
    public final int f(p pVar, int i10, boolean z10) {
        if (this.f49278g == null) {
            return this.f49274a.f(pVar, i10, z10);
        }
        h(i10);
        int read = pVar.read(this.f49277f, this.e, i10);
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
        if (this.f49278g == null) {
            this.f49274a.g(xVar, i10, i11);
            return;
        }
        h(i10);
        xVar.k(this.e, i10, this.f49277f);
        this.e += i10;
    }

    public final void h(int i10) {
        byte[] bArr;
        int length = this.f49277f.length;
        int i11 = this.e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.d;
        int max = Math.max(i12 * 2, i10 + i12);
        byte[] bArr2 = this.f49277f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.d, bArr, 0, i12);
        this.d = 0;
        this.e = i12;
        this.f49277f = bArr;
    }

    @Override
    public final void e(long j10) {
    }
}
