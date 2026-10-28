package q2;

import a8.yb;
import android.graphics.Bitmap;
import android.os.Trace;
import b2.x;
import c3.h0;
import i2.l0;
import java.util.ArrayDeque;
import l6.h;
import n4.s;
public final class f extends i2.b {
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
    public x S;
    public b T;
    public h2.h U;
    public d V;
    public l0 W;
    public Bitmap X;
    public boolean Y;
    public k5.b Z;
    public k5.b f46959a0;
    public int f46960b0;
    public boolean f46961c0;

    public f(h hVar) {
        super(4);
        this.I = hVar;
        this.V = d.f46955a;
        this.J = new h2.h(0, 0);
        this.N = e.f46956c;
        this.K = new ArrayDeque();
        this.P = -9223372036854775807L;
        this.O = -9223372036854775807L;
        this.Q = 0;
        this.R = 1;
    }

    @Override
    public final int C(x xVar) {
        this.I.getClass();
        return h.e(xVar);
    }

    public final boolean F(long r13) {
        throw new UnsupportedOperationException("Method not decompiled: q2.f.F(long):boolean");
    }

    public final boolean G(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: q2.f.G(long):boolean");
    }

    public final void H() {
        if (!this.f46961c0) {
            return;
        }
        x xVar = this.S;
        xVar.getClass();
        h hVar = this.I;
        hVar.getClass();
        int e = h.e(xVar);
        if (e != h0.c(4, 0, 0, 0) && e != h0.c(3, 0, 0, 0)) {
            throw d(new Exception("Provided decoder factory can't create decoder for format."), this.S, false, 4005);
        }
        b bVar = this.T;
        if (bVar != null) {
            bVar.release();
        }
        this.T = new b(hVar.f16937a);
        this.f46961c0 = false;
    }

    public final void I() {
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
            if (i10 != 23) {
                return;
            }
            this.W = (l0) obj;
            return;
        }
        if (obj instanceof d) {
            dVar = (d) obj;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            dVar = d.f46955a;
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
            if (i10 != 0 || !this.Y) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void n() {
        this.S = null;
        this.N = e.f46956c;
        this.K.clear();
        I();
        this.V.getClass();
    }

    @Override
    public final void o(boolean z10, boolean z11) {
        this.R = z11 ? 1 : 0;
    }

    @Override
    public final void p(long j10, boolean z10, boolean z11) {
        this.R = Math.min(this.R, 1);
        this.M = false;
        this.L = false;
        this.X = null;
        this.Z = null;
        this.f46959a0 = null;
        this.Y = false;
        this.U = null;
        b bVar = this.T;
        if (bVar != null) {
            bVar.flush();
        }
        this.K.clear();
    }

    @Override
    public final void q() {
        I();
    }

    @Override
    public final void r() {
        I();
        this.R = Math.min(this.R, 1);
    }

    @Override
    public final void u(b2.x[] r5, long r6, long r8, u2.g0 r10) {
        throw new UnsupportedOperationException("Method not decompiled: q2.f.u(b2.x[], long, long, u2.g0):void");
    }

    @Override
    public final void x(long j10, long j11) {
        if (!this.M) {
            if (this.S == null) {
                s sVar = this.f13491c;
                sVar.d();
                h2.h hVar = this.J;
                hVar.clear();
                int w10 = w(sVar, hVar, 2);
                if (w10 == -5) {
                    x xVar = (x) sVar.f18696c;
                    xVar.getClass();
                    this.S = xVar;
                    this.f46961c0 = true;
                } else if (w10 == -4) {
                    yb.p(hVar.isEndOfStream());
                    this.L = true;
                    this.M = true;
                    return;
                } else {
                    return;
                }
            }
            if (this.T == null) {
                H();
            }
            try {
                Trace.beginSection("drainAndFeedDecoder");
                while (F(j10)) {
                }
                while (G(j10)) {
                }
                Trace.endSection();
            } catch (c e) {
                throw d(e, null, false, 4003);
            }
        }
    }
}
