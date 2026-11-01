package q2;

import android.graphics.Bitmap;
import android.os.Trace;
import b2.x;
import bi.d0;
import h2.h;
import i2.l0;
import java.util.ArrayDeque;
import v7.t6;
public final class g extends i2.b {
    public final b I;
    public final h J;
    public final ArrayDeque K;
    public boolean L;
    public boolean M;
    public f N;
    public long O;
    public long P;
    public int Q;
    public int R;
    public x S;
    public c T;
    public h U;
    public e V;
    public l0 W;
    public Bitmap X;
    public boolean Y;
    public d0 Z;
    public d0 f45431a0;
    public int f45432b0;
    public boolean f45433c0;

    public g(b bVar) {
        super(4);
        this.I = bVar;
        this.V = e.f45427a;
        this.J = new h(0, 0);
        this.N = f.f45428c;
        this.K = new ArrayDeque();
        this.P = -9223372036854775807L;
        this.O = -9223372036854775807L;
        this.Q = 0;
        this.R = 1;
    }

    @Override
    public final int C(x xVar) {
        this.I.getClass();
        return b.b(xVar);
    }

    public final boolean F(long r13) {
        throw new UnsupportedOperationException("Method not decompiled: q2.g.F(long):boolean");
    }

    public final boolean G(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: q2.g.G(long):boolean");
    }

    public final void H() {
        if (!this.f45433c0) {
            return;
        }
        x xVar = this.S;
        xVar.getClass();
        b bVar = this.I;
        bVar.getClass();
        int b10 = b.b(xVar);
        if (b10 != i0.a.a(4, 0, 0, 0) && b10 != i0.a.a(3, 0, 0, 0)) {
            throw e(new Exception("Provided decoder factory can't create decoder for format."), this.S, false, 4005);
        }
        c cVar = this.T;
        if (cVar != null) {
            cVar.release();
        }
        this.T = new c(bVar.f45424a);
        this.f45433c0 = false;
    }

    public final void I() {
        this.U = null;
        this.Q = 0;
        this.P = -9223372036854775807L;
        c cVar = this.T;
        if (cVar != null) {
            cVar.release();
            this.T = null;
        }
    }

    @Override
    public final void d(int i10, Object obj) {
        e eVar;
        if (i10 != 15) {
            if (i10 != 23) {
                return;
            }
            this.W = (l0) obj;
            return;
        }
        if (obj instanceof e) {
            eVar = (e) obj;
        } else {
            eVar = null;
        }
        if (eVar == null) {
            eVar = e.f45427a;
        }
        this.V = eVar;
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
        this.N = f.f45428c;
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
        this.f45431a0 = null;
        this.Y = false;
        this.U = null;
        c cVar = this.T;
        if (cVar != null) {
            cVar.flush();
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
        throw new UnsupportedOperationException("Method not decompiled: q2.g.u(b2.x[], long, long, u2.g0):void");
    }

    @Override
    public final void x(long j10, long j11) {
        if (!this.M) {
            if (this.S == null) {
                hf.b bVar = this.f7810c;
                bVar.L();
                h hVar = this.J;
                hVar.clear();
                int w9 = w(bVar, hVar, 2);
                if (w9 == -5) {
                    x xVar = (x) bVar.f7659c;
                    xVar.getClass();
                    this.S = xVar;
                    this.f45433c0 = true;
                } else if (w9 == -4) {
                    t6.p(hVar.isEndOfStream());
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
            } catch (d e) {
                throw e(e, null, false, 4003);
            }
        }
    }
}
