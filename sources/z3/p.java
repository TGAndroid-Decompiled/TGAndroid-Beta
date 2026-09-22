package z3;

import b2.r;
import b2.r0;
import b2.s;
import c3.g0;
import c3.h0;
import e2.d0;
import e2.v;
import java.io.EOFException;
public final class p implements h0 {
    public final h0 f48098a;
    public final l f48099b;
    public n f48102g;
    public s h;
    public boolean f48103i;
    public int d = 0;
    public int e = 0;
    public byte[] f48101f = d0.f7886b;
    public final v f48100c = new v();

    public p(h0 h0Var, l lVar) {
        this.f48098a = h0Var;
        this.f48099b = lVar;
    }

    @Override
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    @Override
    public final void b(s sVar) {
        boolean z10;
        n nVar;
        sVar.f3306r.getClass();
        String str = sVar.f3306r;
        if (r0.h(str) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        boolean equals = sVar.equals(this.h);
        l lVar = this.f48099b;
        if (!equals) {
            this.h = sVar;
            if (lVar.W(sVar)) {
                nVar = lVar.x(sVar);
            } else {
                nVar = null;
            }
            this.f48102g = nVar;
        }
        n nVar2 = this.f48102g;
        h0 h0Var = this.f48098a;
        if (nVar2 == null) {
            h0Var.b(sVar);
            return;
        }
        r a2 = sVar.a();
        a2.f3250q = r0.n("application/x-media3-cues");
        a2.f3243j = str;
        a2.v = Long.MAX_VALUE;
        a2.O = lVar.D(sVar);
        hg.c.u(a2, h0Var);
    }

    @Override
    public final void c(final long j3, final int i10, int i11, int i12, g0 g0Var) {
        boolean z10;
        if (this.f48102g == null) {
            this.f48098a.c(j3, i10, i11, i12, g0Var);
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
            this.f48102g.B(this.f48101f, i13, i11, m.f48092c, new e2.h() {
                @Override
                public final void accept(Object obj) {
                    boolean z11;
                    b bVar = (b) obj;
                    p pVar = p.this;
                    e2.d.h(pVar.h);
                    byte[] C2 = ob.a.C2(bVar.f48073a, bVar.f48075c);
                    v vVar = pVar.f48100c;
                    vVar.getClass();
                    vVar.H(C2.length, C2);
                    pVar.f48098a.d(C2.length, vVar);
                    long j10 = bVar.f48074b;
                    long j11 = j3;
                    if (j10 == -9223372036854775807L) {
                        if (pVar.h.f3310w == Long.MAX_VALUE) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        e2.d.g(z11);
                    } else {
                        long j12 = pVar.h.f3310w;
                        if (j12 == Long.MAX_VALUE) {
                            j11 += j10;
                        } else {
                            j11 = j10 + j12;
                        }
                    }
                    pVar.f48098a.c(j11, i10 | 1, C2.length, 0, null);
                }
            });
        } catch (RuntimeException e) {
            if (this.f48103i) {
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
        if (this.f48102g == null) {
            return this.f48098a.e(kVar, i10, z10);
        }
        g(i10);
        int read = kVar.read(this.f48101f, this.e, i10);
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
        if (this.f48102g == null) {
            this.f48098a.f(vVar, i10, i11);
            return;
        }
        g(i10);
        vVar.h(this.e, i10, this.f48101f);
        this.e += i10;
    }

    public final void g(int i10) {
        byte[] bArr;
        int length = this.f48101f.length;
        int i11 = this.e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.d;
        int max = Math.max(i12 * 2, i10 + i12);
        byte[] bArr2 = this.f48101f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.d, bArr, 0, i12);
        this.d = 0;
        this.e = i12;
        this.f48101f = bArr;
    }
}
