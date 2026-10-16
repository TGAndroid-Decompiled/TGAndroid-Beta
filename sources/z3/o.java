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
    public final i0 f49273a;
    public final l f49274b;
    public n f49277g;
    public x h;
    public boolean f49278i;
    public int d = 0;
    public int e = 0;
    public byte[] f49276f = m0.f8376b;
    public final e2.x f49275c = new e2.x();

    public o(i0 i0Var, l lVar) {
        this.f49273a = i0Var;
        this.f49274b = lVar;
    }

    @Override
    public final int a(p pVar, int i10, boolean z10) {
        return f(pVar, i10, z10);
    }

    @Override
    public final void b(x xVar) {
        boolean z10;
        n nVar;
        xVar.f2523s.getClass();
        String str = xVar.f2523s;
        if (w0.h(str) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        boolean equals = xVar.equals(this.h);
        l lVar = this.f49274b;
        if (!equals) {
            this.h = xVar;
            if (lVar.a0(xVar)) {
                nVar = lVar.y(xVar);
            } else {
                nVar = null;
            }
            this.f49277g = nVar;
        }
        n nVar2 = this.f49277g;
        i0 i0Var = this.f49273a;
        if (nVar2 == null) {
            i0Var.b(xVar);
            return;
        }
        w a2 = xVar.a();
        a2.f2470r = w0.n("application/x-media3-cues");
        a2.f2462j = str;
        a2.f2474w = Long.MAX_VALUE;
        a2.P = lVar.H(xVar);
        i2.d.u(a2, i0Var);
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
        if (this.f49277g == null) {
            return this.f49273a.f(pVar, i10, z10);
        }
        h(i10);
        int read = pVar.read(this.f49276f, this.e, i10);
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
        if (this.f49277g == null) {
            this.f49273a.g(xVar, i10, i11);
            return;
        }
        h(i10);
        xVar.k(this.e, i10, this.f49276f);
        this.e += i10;
    }

    public final void h(int i10) {
        byte[] bArr;
        int length = this.f49276f.length;
        int i11 = this.e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.d;
        int max = Math.max(i12 * 2, i10 + i12);
        byte[] bArr2 = this.f49276f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.d, bArr, 0, i12);
        this.d = 0;
        this.e = i12;
        this.f49276f = bArr;
    }

    @Override
    public final void e(long j10) {
    }
}
