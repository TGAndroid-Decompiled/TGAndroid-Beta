package z3;

import b2.r;
import b2.r0;
import b2.s;
import c3.h0;
import e2.d0;
import e2.v;
import java.io.EOFException;
public final class n implements h0 {
    public final h0 f53743a;
    public final k f53744b;
    public m f53748g;
    public s h;
    public boolean f53749i;
    public int d = 0;
    public int f53746e = 0;
    public byte[] f53747f = d0.f8530b;
    public final v f53745c = new v();

    public n(h0 h0Var, k kVar) {
        this.f53743a = h0Var;
        this.f53744b = kVar;
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
        k kVar = this.f53744b;
        if (!equals) {
            this.h = sVar;
            if (kVar.H(sVar)) {
                mVar = kVar.m(sVar);
            } else {
                mVar = null;
            }
            this.f53748g = mVar;
        }
        m mVar2 = this.f53748g;
        h0 h0Var = this.f53743a;
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
        if (this.f53748g == null) {
            return this.f53743a.e(kVar, i10, z10);
        }
        g(i10);
        int read = kVar.read(this.f53747f, this.f53746e, i10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        this.f53746e += read;
        return read;
    }

    @Override
    public final void f(v vVar, int i10, int i11) {
        if (this.f53748g == null) {
            this.f53743a.f(vVar, i10, i11);
            return;
        }
        g(i10);
        vVar.h(this.f53746e, i10, this.f53747f);
        this.f53746e += i10;
    }

    public final void g(int i10) {
        byte[] bArr;
        int length = this.f53747f.length;
        int i11 = this.f53746e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.d;
        int max = Math.max(i12 * 2, i10 + i12);
        byte[] bArr2 = this.f53747f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.d, bArr, 0, i12);
        this.d = 0;
        this.f53746e = i12;
        this.f53747f = bArr;
    }
}
