package z3;

import b2.r;
import b2.r0;
import b2.s;
import c3.g0;
import c3.h0;
import e2.d0;
import e2.v;
import java.io.EOFException;
public final class o implements h0 {
    public final h0 f50706a;
    public final k f50707b;
    public m f50711g;
    public s h;
    public boolean f50712i;
    public int d = 0;
    public int f50709e = 0;
    public byte[] f50710f = d0.f8738b;
    public final v f50708c = new v();

    public o(h0 h0Var, k kVar) {
        this.f50706a = h0Var;
        this.f50707b = kVar;
    }

    @Override
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    @Override
    public final void b(s sVar) {
        boolean z10;
        m mVar;
        sVar.f2370r.getClass();
        String str = sVar.f2370r;
        if (r0.h(str) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        boolean equals = sVar.equals(this.h);
        k kVar = this.f50707b;
        if (!equals) {
            this.h = sVar;
            if (kVar.i0(sVar)) {
                mVar = kVar.v(sVar);
            } else {
                mVar = null;
            }
            this.f50711g = mVar;
        }
        m mVar2 = this.f50711g;
        h0 h0Var = this.f50706a;
        if (mVar2 == null) {
            h0Var.b(sVar);
            return;
        }
        r a2 = sVar.a();
        a2.f2312q = r0.n("application/x-media3-cues");
        a2.f2305j = str;
        a2.v = Long.MAX_VALUE;
        a2.O = kVar.J(sVar);
        i2.g.u(a2, h0Var);
    }

    @Override
    public final void c(final long j3, final int i10, int i11, int i12, g0 g0Var) {
        boolean z10;
        if (this.f50711g == null) {
            this.f50706a.c(j3, i10, i11, i12, g0Var);
            return;
        }
        if (g0Var == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.a("DRM on subtitles is not supported", z10);
        int i13 = (this.f50709e - i12) - i11;
        try {
            this.f50711g.e0(this.f50710f, i13, i11, l.f50700c, new e2.h() {
                @Override
                public final void accept(Object obj) {
                    boolean z11;
                    a aVar = (a) obj;
                    o oVar = o.this;
                    e2.d.h(oVar.h);
                    byte[] t22 = qb.b.t2(aVar.f50682a, aVar.f50684c);
                    v vVar = oVar.f50708c;
                    vVar.getClass();
                    vVar.H(t22.length, t22);
                    oVar.f50706a.d(t22.length, vVar);
                    long j10 = aVar.f50683b;
                    long j11 = j3;
                    if (j10 == -9223372036854775807L) {
                        if (oVar.h.f2374w == Long.MAX_VALUE) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        e2.d.g(z11);
                    } else {
                        long j12 = oVar.h.f2374w;
                        if (j12 == Long.MAX_VALUE) {
                            j11 += j10;
                        } else {
                            j11 = j10 + j12;
                        }
                    }
                    oVar.f50706a.c(j11, i10 | 1, t22.length, 0, null);
                }
            });
        } catch (RuntimeException e7) {
            if (this.f50712i) {
                e2.a.o("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e7);
            } else {
                throw e7;
            }
        }
        int i14 = i13 + i11;
        this.d = i14;
        if (i14 == this.f50709e) {
            this.d = 0;
            this.f50709e = 0;
        }
    }

    @Override
    public final void d(int i10, v vVar) {
        a4.a.a(this, vVar, i10);
    }

    @Override
    public final int e(b2.k kVar, int i10, boolean z10) {
        if (this.f50711g == null) {
            return this.f50706a.e(kVar, i10, z10);
        }
        g(i10);
        int read = kVar.read(this.f50710f, this.f50709e, i10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        this.f50709e += read;
        return read;
    }

    @Override
    public final void f(v vVar, int i10, int i11) {
        if (this.f50711g == null) {
            this.f50706a.f(vVar, i10, i11);
            return;
        }
        g(i10);
        vVar.h(this.f50709e, i10, this.f50710f);
        this.f50709e += i10;
    }

    public final void g(int i10) {
        byte[] bArr;
        int length = this.f50710f.length;
        int i11 = this.f50709e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.d;
        int max = Math.max(i12 * 2, i10 + i12);
        byte[] bArr2 = this.f50710f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.d, bArr, 0, i12);
        this.d = 0;
        this.f50709e = i12;
        this.f50710f = bArr;
    }
}
