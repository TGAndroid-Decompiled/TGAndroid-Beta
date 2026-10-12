package z3;

import b2.r;
import b2.r0;
import b2.s;
import c3.h0;
import e2.d0;
import e2.v;
import java.io.EOFException;
public final class n implements h0 {
    public final h0 f53735a;
    public final k f53736b;
    public m f53740g;
    public s h;
    public boolean f53741i;
    public int d = 0;
    public int f53738e = 0;
    public byte[] f53739f = d0.f8530b;
    public final v f53737c = new v();

    public n(h0 h0Var, k kVar) {
        this.f53735a = h0Var;
        this.f53736b = kVar;
    }

    @Override
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    @Override
    public final void b(s sVar) {
        boolean z10;
        m mVar;
        sVar.f3641r.getClass();
        String str = sVar.f3641r;
        if (r0.h(str) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        boolean equals = sVar.equals(this.h);
        k kVar = this.f53736b;
        if (!equals) {
            this.h = sVar;
            if (kVar.H(sVar)) {
                mVar = kVar.m(sVar);
            } else {
                mVar = null;
            }
            this.f53740g = mVar;
        }
        m mVar2 = this.f53740g;
        h0 h0Var = this.f53735a;
        if (mVar2 == null) {
            h0Var.b(sVar);
            return;
        }
        r a2 = sVar.a();
        a2.f3583q = r0.n("application/x-media3-cues");
        a2.f3576j = str;
        a2.v = Long.MAX_VALUE;
        a2.O = kVar.y(sVar);
        hg.c.u(a2, h0Var);
    }

    @Override
    public final void c(long r9, int r11, int r12, int r13, c3.g0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: z3.n.c(long, int, int, int, c3.g0):void");
    }

    @Override
    public final void d(int i10, v vVar) {
        a1.g.a(this, vVar, i10);
    }

    @Override
    public final int e(b2.k kVar, int i10, boolean z10) {
        if (this.f53740g == null) {
            return this.f53735a.e(kVar, i10, z10);
        }
        g(i10);
        int read = kVar.read(this.f53739f, this.f53738e, i10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        this.f53738e += read;
        return read;
    }

    @Override
    public final void f(v vVar, int i10, int i11) {
        if (this.f53740g == null) {
            this.f53735a.f(vVar, i10, i11);
            return;
        }
        g(i10);
        vVar.h(this.f53738e, i10, this.f53739f);
        this.f53738e += i10;
    }

    public final void g(int i10) {
        byte[] bArr;
        int length = this.f53739f.length;
        int i11 = this.f53738e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.d;
        int max = Math.max(i12 * 2, i10 + i12);
        byte[] bArr2 = this.f53739f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.d, bArr, 0, i12);
        this.d = 0;
        this.f53738e = i12;
        this.f53739f = bArr;
    }
}
