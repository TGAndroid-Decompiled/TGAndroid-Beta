package q2;

import android.graphics.Bitmap;
import android.os.Trace;
import b2.w;
import h2.h;
import i2.k0;
import java.util.ArrayDeque;
import l5.j;
import v7.u6;
public final class f extends i2.b {
    public final j I;
    public final h J;
    public final ArrayDeque K;
    public boolean L;
    public boolean M;
    public e N;
    public long O;
    public long P;
    public int Q;
    public int R;
    public w S;
    public b T;
    public h U;
    public d V;
    public k0 W;
    public Bitmap X;
    public boolean Y;
    public j5.c Z;
    public j5.c f44348a0;
    public int f44349b0;
    public boolean f44350c0;

    public f(j jVar) {
        super(4);
        this.I = jVar;
        this.V = d.f44344a;
        this.J = new h(0, 0);
        this.N = e.f44345c;
        this.K = new ArrayDeque();
        this.P = -9223372036854775807L;
        this.O = -9223372036854775807L;
        this.Q = 0;
        this.R = 1;
    }

    @Override
    public final int C(w wVar) {
        this.I.getClass();
        return j.d(wVar);
    }

    public final boolean F(long r13) {
        throw new UnsupportedOperationException("Method not decompiled: q2.f.F(long):boolean");
    }

    public final boolean G(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: q2.f.G(long):boolean");
    }

    public final void H() {
        if (!this.f44350c0) {
            return;
        }
        w wVar = this.S;
        wVar.getClass();
        j jVar = this.I;
        jVar.getClass();
        int d = j.d(wVar);
        if (d != i2.e.c(4, 0, 0, 0) && d != i2.e.c(3, 0, 0, 0)) {
            throw d(new Exception("Provided decoder factory can't create decoder for format."), this.S, false, 4005);
        }
        b bVar = this.T;
        if (bVar != null) {
            bVar.release();
        }
        this.T = new b(jVar.f15923a);
        this.f44350c0 = false;
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
            this.W = (k0) obj;
            return;
        }
        if (obj instanceof d) {
            dVar = (d) obj;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            dVar = d.f44344a;
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
        this.N = e.f44345c;
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
        this.f44348a0 = null;
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
    public final void u(b2.w[] r5, long r6, long r8, u2.g0 r10) {
        throw new UnsupportedOperationException("Method not decompiled: q2.f.u(b2.w[], long, long, u2.g0):void");
    }

    @Override
    public final void x(long j10, long j11) {
        if (!this.M) {
            if (this.S == null) {
                qf.b bVar = this.f12313c;
                bVar.A();
                h hVar = this.J;
                hVar.clear();
                int w9 = w(bVar, hVar, 2);
                if (w9 == -5) {
                    w wVar = (w) bVar.f44440c;
                    wVar.getClass();
                    this.S = wVar;
                    this.f44350c0 = true;
                } else if (w9 == -4) {
                    u6.p(hVar.isEndOfStream());
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
