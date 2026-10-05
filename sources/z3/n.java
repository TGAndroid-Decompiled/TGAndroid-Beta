package z3;

import b2.r;
import b2.r0;
import b2.s;
import c3.h0;
import e2.d0;
import e2.v;
import java.io.EOFException;
public final class n implements h0 {
    public final h0 f52405a;
    public final k f52406b;
    public m f52410g;
    public s h;
    public boolean f52411i;
    public int d = 0;
    public int f52408e = 0;
    public byte[] f52409f = d0.f8539b;
    public final v f52407c = new v();

    public n(h0 h0Var, k kVar) {
        this.f52405a = h0Var;
        this.f52406b = kVar;
    }

    @Override
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    @Override
    public final void b(s sVar) {
        boolean z10;
        m mVar;
        sVar.f3564r.getClass();
        String str = sVar.f3564r;
        if (r0.h(str) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        boolean equals = sVar.equals(this.h);
        k kVar = this.f52406b;
        if (!equals) {
            this.h = sVar;
            if (kVar.V(sVar)) {
                mVar = kVar.v(sVar);
            } else {
                mVar = null;
            }
            this.f52410g = mVar;
        }
        m mVar2 = this.f52410g;
        h0 h0Var = this.f52405a;
        if (mVar2 == null) {
            h0Var.b(sVar);
            return;
        }
        r a2 = sVar.a();
        a2.f3506q = r0.n("application/x-media3-cues");
        a2.f3499j = str;
        a2.v = Long.MAX_VALUE;
        a2.O = kVar.D(sVar);
        hg.c.s(a2, h0Var);
    }

    @Override
    public final void c(long r9, int r11, int r12, int r13, c3.g0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: z3.n.c(long, int, int, int, c3.g0):void");
    }

    @Override
    public final void d(int i10, v vVar) {
        a4.a.a(this, vVar, i10);
    }

    @Override
    public final int e(b2.k kVar, int i10, boolean z10) {
        if (this.f52410g == null) {
            return this.f52405a.e(kVar, i10, z10);
        }
        g(i10);
        int read = kVar.read(this.f52409f, this.f52408e, i10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        this.f52408e += read;
        return read;
    }

    @Override
    public final void f(v vVar, int i10, int i11) {
        if (this.f52410g == null) {
            this.f52405a.f(vVar, i10, i11);
            return;
        }
        g(i10);
        vVar.h(this.f52408e, i10, this.f52409f);
        this.f52408e += i10;
    }

    public final void g(int i10) {
        byte[] bArr;
        int length = this.f52409f.length;
        int i11 = this.f52408e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.d;
        int max = Math.max(i12 * 2, i10 + i12);
        byte[] bArr2 = this.f52409f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.d, bArr, 0, i12);
        this.d = 0;
        this.f52408e = i12;
        this.f52409f = bArr;
    }
}
