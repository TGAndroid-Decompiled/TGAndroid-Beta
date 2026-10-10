package z3;

import b2.r;
import b2.r0;
import b2.s;
import c3.h0;
import e2.d0;
import e2.v;
import java.io.EOFException;
public final class n implements h0 {
    public final h0 f53555a;
    public final k f53556b;
    public m f53560g;
    public s h;
    public boolean f53561i;
    public int d = 0;
    public int f53558e = 0;
    public byte[] f53559f = d0.f8533b;
    public final v f53557c = new v();

    public n(h0 h0Var, k kVar) {
        this.f53555a = h0Var;
        this.f53556b = kVar;
    }

    @Override
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    @Override
    public final void b(s sVar) {
        boolean z10;
        m mVar;
        sVar.f3643r.getClass();
        String str = sVar.f3643r;
        if (r0.h(str) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        boolean equals = sVar.equals(this.h);
        k kVar = this.f53556b;
        if (!equals) {
            this.h = sVar;
            if (kVar.D1(sVar)) {
                mVar = kVar.s0(sVar);
            } else {
                mVar = null;
            }
            this.f53560g = mVar;
        }
        m mVar2 = this.f53560g;
        h0 h0Var = this.f53555a;
        if (mVar2 == null) {
            h0Var.b(sVar);
            return;
        }
        r a2 = sVar.a();
        a2.f3585q = r0.n("application/x-media3-cues");
        a2.f3578j = str;
        a2.v = Long.MAX_VALUE;
        a2.O = kVar.U0(sVar);
        hg.c.s(a2, h0Var);
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
        if (this.f53560g == null) {
            return this.f53555a.e(kVar, i10, z10);
        }
        g(i10);
        int read = kVar.read(this.f53559f, this.f53558e, i10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        this.f53558e += read;
        return read;
    }

    @Override
    public final void f(v vVar, int i10, int i11) {
        if (this.f53560g == null) {
            this.f53555a.f(vVar, i10, i11);
            return;
        }
        g(i10);
        vVar.h(this.f53558e, i10, this.f53559f);
        this.f53558e += i10;
    }

    public final void g(int i10) {
        byte[] bArr;
        int length = this.f53559f.length;
        int i11 = this.f53558e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.d;
        int max = Math.max(i12 * 2, i10 + i12);
        byte[] bArr2 = this.f53559f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.d, bArr, 0, i12);
        this.d = 0;
        this.f53558e = i12;
        this.f53559f = bArr;
    }
}
