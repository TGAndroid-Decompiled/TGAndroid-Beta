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
    public final j0 f50703a;
    public final k f50704b;
    public m f50707g;
    public w h;
    public boolean f50708i;
    public int d = 0;
    public int e = 0;
    public byte[] f50706f = m0.f8256b;
    public final x f50705c = new x();

    public n(j0 j0Var, k kVar) {
        this.f50703a = j0Var;
        this.f50704b = kVar;
    }

    @Override
    public final int a(o oVar, int i10, boolean z10) {
        return f(oVar, i10, z10);
    }

    @Override
    public final void b(w wVar) {
        boolean z10;
        m mVar;
        wVar.f4132s.getClass();
        String str = wVar.f4132s;
        if (v0.h(str) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        boolean equals = wVar.equals(this.h);
        k kVar = this.f50704b;
        if (!equals) {
            this.h = wVar;
            if (kVar.a0(wVar)) {
                mVar = kVar.y(wVar);
            } else {
                mVar = null;
            }
            this.f50707g = mVar;
        }
        m mVar2 = this.f50707g;
        j0 j0Var = this.f50703a;
        if (mVar2 == null) {
            j0Var.b(wVar);
            return;
        }
        v a2 = wVar.a();
        a2.f4079r = v0.n("application/x-media3-cues");
        a2.f4071j = str;
        a2.f4083w = Long.MAX_VALUE;
        a2.P = kVar.L(wVar);
        i2.d.u(a2, j0Var);
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
        if (this.f50707g == null) {
            return this.f50703a.f(oVar, i10, z10);
        }
        h(i10);
        int read = oVar.read(this.f50706f, this.e, i10);
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
        if (this.f50707g == null) {
            this.f50703a.g(xVar, i10, i11);
            return;
        }
        h(i10);
        xVar.k(this.e, i10, this.f50706f);
        this.e += i10;
    }

    public final void h(int i10) {
        byte[] bArr;
        int length = this.f50706f.length;
        int i11 = this.e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.d;
        int max = Math.max(i12 * 2, i10 + i12);
        byte[] bArr2 = this.f50706f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.d, bArr, 0, i12);
        this.d = 0;
        this.e = i12;
        this.f50706f = bArr;
    }

    @Override
    public final void e(long j10) {
    }
}
