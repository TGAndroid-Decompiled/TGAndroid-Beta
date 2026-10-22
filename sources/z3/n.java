package z3;

import b2.o;
import b2.v;
import b2.v0;
import b2.w;
import c3.j0;
import e2.m0;
import e2.x;
import java.io.EOFException;
import v7.u6;
public final class n implements j0 {
    public final j0 f50666a;
    public final k f50667b;
    public m f50670g;
    public w h;
    public boolean f50671i;
    public int d = 0;
    public int e = 0;
    public byte[] f50669f = m0.f8253b;
    public final x f50668c = new x();

    public n(j0 j0Var, k kVar) {
        this.f50666a = j0Var;
        this.f50667b = kVar;
    }

    @Override
    public final int a(o oVar, int i10, boolean z10) {
        return f(oVar, i10, z10);
    }

    @Override
    public final void b(w wVar) {
        boolean z10;
        m mVar;
        wVar.f4128s.getClass();
        String str = wVar.f4128s;
        if (v0.h(str) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        boolean equals = wVar.equals(this.h);
        k kVar = this.f50667b;
        if (!equals) {
            this.h = wVar;
            if (kVar.a0(wVar)) {
                mVar = kVar.y(wVar);
            } else {
                mVar = null;
            }
            this.f50670g = mVar;
        }
        m mVar2 = this.f50670g;
        j0 j0Var = this.f50666a;
        if (mVar2 == null) {
            j0Var.b(wVar);
            return;
        }
        v a2 = wVar.a();
        a2.f4075r = v0.n("application/x-media3-cues");
        a2.f4067j = str;
        a2.f4079w = Long.MAX_VALUE;
        a2.P = kVar.L(wVar);
        i2.e.u(a2, j0Var);
    }

    @Override
    public final void c(long r9, int r11, int r12, int r13, c3.i0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: z3.n.c(long, int, int, int, c3.i0):void");
    }

    @Override
    public final void d(int i10, x xVar) {
        a1.g.a(this, xVar, i10);
    }

    @Override
    public final int f(o oVar, int i10, boolean z10) {
        if (this.f50670g == null) {
            return this.f50666a.f(oVar, i10, z10);
        }
        h(i10);
        int read = oVar.read(this.f50669f, this.e, i10);
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
        if (this.f50670g == null) {
            this.f50666a.g(xVar, i10, i11);
            return;
        }
        h(i10);
        xVar.k(this.e, i10, this.f50669f);
        this.e += i10;
    }

    public final void h(int i10) {
        byte[] bArr;
        int length = this.f50669f.length;
        int i11 = this.e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.d;
        int max = Math.max(i12 * 2, i10 + i12);
        byte[] bArr2 = this.f50669f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.d, bArr, 0, i12);
        this.d = 0;
        this.e = i12;
        this.f50669f = bArr;
    }

    @Override
    public final void e(long j10) {
    }
}
