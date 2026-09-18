package z3;

import b2.r;
import b2.r0;
import b2.s;
import c3.g0;
import c3.h0;
import e2.d0;
import e2.v;
import hg.k0;
import java.io.EOFException;
public final class o implements h0 {
    public final h0 f48359a;
    public final k f48360b;
    public m f48363g;
    public s h;
    public boolean f48364i;
    public int d = 0;
    public int e = 0;
    public byte[] f48362f = d0.f7888b;
    public final v f48361c = new v();

    public o(h0 h0Var, k kVar) {
        this.f48359a = h0Var;
        this.f48360b = kVar;
    }

    @Override
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    @Override
    public final void b(s sVar) {
        boolean z10;
        m mVar;
        sVar.f3309r.getClass();
        String str = sVar.f3309r;
        if (r0.h(str) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        boolean equals = sVar.equals(this.h);
        k kVar = this.f48360b;
        if (!equals) {
            this.h = sVar;
            if (kVar.W(sVar)) {
                mVar = kVar.x(sVar);
            } else {
                mVar = null;
            }
            this.f48363g = mVar;
        }
        m mVar2 = this.f48363g;
        h0 h0Var = this.f48359a;
        if (mVar2 == null) {
            h0Var.b(sVar);
            return;
        }
        r a2 = sVar.a();
        a2.f3253q = r0.n("application/x-media3-cues");
        a2.f3246j = str;
        a2.v = Long.MAX_VALUE;
        a2.O = kVar.D(sVar);
        k0.r(a2, h0Var);
    }

    @Override
    public final void c(final long j3, final int i10, int i11, int i12, g0 g0Var) {
        boolean z10;
        if (this.f48363g == null) {
            this.f48359a.c(j3, i10, i11, i12, g0Var);
            return;
        }
        if (g0Var == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.a("DRM on subtitles is not supported", z10);
        int i13 = (this.e - i12) - i11;
        try {
            this.f48363g.C(this.f48362f, i13, i11, l.f48353c, new e2.h() {
                @Override
                public final void accept(Object obj) {
                    boolean z11;
                    a aVar = (a) obj;
                    o oVar = o.this;
                    e2.d.h(oVar.h);
                    byte[] C2 = ob.a.C2(aVar.f48334a, aVar.f48336c);
                    v vVar = oVar.f48361c;
                    vVar.getClass();
                    vVar.H(C2.length, C2);
                    oVar.f48359a.d(C2.length, vVar);
                    long j10 = aVar.f48335b;
                    long j11 = j3;
                    if (j10 == -9223372036854775807L) {
                        if (oVar.h.f3313w == Long.MAX_VALUE) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        e2.d.g(z11);
                    } else {
                        long j12 = oVar.h.f3313w;
                        if (j12 == Long.MAX_VALUE) {
                            j11 += j10;
                        } else {
                            j11 = j10 + j12;
                        }
                    }
                    oVar.f48359a.c(j11, i10 | 1, C2.length, 0, null);
                }
            });
        } catch (RuntimeException e) {
            if (this.f48364i) {
                e2.a.o("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
            } else {
                throw e;
            }
        }
        int i14 = i13 + i11;
        this.d = i14;
        if (i14 == this.e) {
            this.d = 0;
            this.e = 0;
        }
    }

    @Override
    public final void d(int i10, v vVar) {
        a4.a.a(this, vVar, i10);
    }

    @Override
    public final int e(b2.k kVar, int i10, boolean z10) {
        if (this.f48363g == null) {
            return this.f48359a.e(kVar, i10, z10);
        }
        g(i10);
        int read = kVar.read(this.f48362f, this.e, i10);
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
    public final void f(v vVar, int i10, int i11) {
        if (this.f48363g == null) {
            this.f48359a.f(vVar, i10, i11);
            return;
        }
        g(i10);
        vVar.h(this.e, i10, this.f48362f);
        this.e += i10;
    }

    public final void g(int i10) {
        byte[] bArr;
        int length = this.f48362f.length;
        int i11 = this.e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.d;
        int max = Math.max(i12 * 2, i10 + i12);
        byte[] bArr2 = this.f48362f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.d, bArr, 0, i12);
        this.d = 0;
        this.e = i12;
        this.f48362f = bArr;
    }
}
