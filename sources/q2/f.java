package q2;

import android.graphics.Bitmap;
import android.os.Trace;
import b2.s;
import hi.c0;
import java.util.ArrayDeque;
import k6.h;
public final class f extends i2.f {
    public final h I;
    public final h2.h J;
    public final ArrayDeque K;
    public boolean L;
    public boolean M;
    public e N;
    public long O;
    public long P;
    public int Q;
    public int R;
    public s S;
    public b T;
    public h2.h U;
    public d V;
    public Bitmap W;
    public boolean X;
    public c0 Y;
    public c0 Z;
    public int f40482a0;
    public boolean f40483b0;

    public f(h hVar) {
        super(4);
        this.I = hVar;
        this.V = d.f40478a;
        this.J = new h2.h(0, 0);
        this.N = e.f40479c;
        this.K = new ArrayDeque();
        this.P = -9223372036854775807L;
        this.O = -9223372036854775807L;
        this.Q = 0;
        this.R = 1;
    }

    @Override
    public final int A(s sVar) {
        this.I.getClass();
        return h.c(sVar);
    }

    public final boolean C(long r13) {
        throw new UnsupportedOperationException("Method not decompiled: q2.f.C(long):boolean");
    }

    public final boolean D(long r13) {
        throw new UnsupportedOperationException("Method not decompiled: q2.f.D(long):boolean");
    }

    public final void E() {
        if (!this.f40483b0) {
            return;
        }
        s sVar = this.S;
        sVar.getClass();
        h hVar = this.I;
        hVar.getClass();
        int c10 = h.c(sVar);
        if (c10 != hc.b.c(4, 0, 0, 0) && c10 != hc.b.c(3, 0, 0, 0)) {
            throw d(new Exception("Provided decoder factory can't create decoder for format."), this.S, false, 4005);
        }
        b bVar = this.T;
        if (bVar != null) {
            bVar.release();
        }
        this.T = new b(hVar.f12361a);
        this.f40483b0 = false;
    }

    public final void F() {
        this.U = null;
        this.Q = 0;
        this.P = -9223372036854775807L;
        b bVar = this.T;
        if (bVar != null) {
            bVar.release();
            this.T = null;
        }
    }

    @Override
    public final void c(int i10, Object obj) {
        d dVar;
        if (i10 != 15) {
            return;
        }
        if (obj instanceof d) {
            dVar = (d) obj;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            dVar = d.f40478a;
        }
        this.V = dVar;
    }

    @Override
    public final String j() {
        return "ImageRenderer";
    }

    @Override
    public final boolean l() {
        return this.M;
    }

    @Override
    public final boolean m() {
        int i10 = this.R;
        if (i10 != 3) {
            if (i10 != 0 || !this.X) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void o() {
        this.S = null;
        this.N = e.f40479c;
        this.K.clear();
        F();
        this.V.getClass();
    }

    @Override
    public final void p(boolean z10, boolean z11) {
        this.R = z11 ? 1 : 0;
    }

    @Override
    public final void q(long j3, boolean z10) {
        this.R = Math.min(this.R, 1);
        this.M = false;
        this.L = false;
        this.W = null;
        this.Y = null;
        this.Z = null;
        this.X = false;
        this.U = null;
        b bVar = this.T;
        if (bVar != null) {
            bVar.flush();
        }
        this.K.clear();
    }

    @Override
    public final void r() {
        F();
    }

    @Override
    public final void s() {
        F();
        this.R = Math.min(this.R, 1);
    }

    @Override
    public final void v(b2.s[] r5, long r6, long r8, u2.g0 r10) {
        throw new UnsupportedOperationException("Method not decompiled: q2.f.v(b2.s[], long, long, u2.g0):void");
    }

    @Override
    public final void x(long j3, long j10) {
        if (!this.M) {
            if (this.S == null) {
                of.b bVar = this.f10175c;
                bVar.F();
                h2.h hVar = this.J;
                hVar.clear();
                int w10 = w(bVar, hVar, 2);
                if (w10 == -5) {
                    s sVar = (s) bVar.f14295c;
                    e2.d.h(sVar);
                    this.S = sVar;
                    this.f40483b0 = true;
                } else if (w10 == -4) {
                    e2.d.g(hVar.isEndOfStream());
                    this.L = true;
                    this.M = true;
                    return;
                } else {
                    return;
                }
            }
            if (this.T == null) {
                E();
            }
            try {
                Trace.beginSection("drainAndFeedDecoder");
                while (C(j3)) {
                }
                while (D(j3)) {
                }
                Trace.endSection();
            } catch (c e) {
                throw d(e, null, false, 4003);
            }
        }
    }
}
