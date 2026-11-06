package t2;

import a8.ia;
import android.graphics.Bitmap;
import android.os.Trace;
import androidx.biometric.t;
import e2.u;
import java.util.ArrayDeque;
import jg.g;
import k2.h;
import l2.k0;
import li.z;
public final class f extends l2.b {
    public final t I;
    public final h J;
    public final ArrayDeque K;
    public boolean L;
    public boolean M;
    public e N;
    public long O;
    public long P;
    public int Q;
    public int R;
    public u S;
    public b T;
    public h U;
    public d V;
    public k0 W;
    public Bitmap X;
    public boolean Y;
    public z Z;
    public z f55288a0;
    public int f55289b0;
    public boolean f55290c0;

    public f(t tVar) {
        super(4);
        this.I = tVar;
        this.V = d.f55284a;
        this.J = new h(0, 0);
        this.N = e.f55285c;
        this.K = new ArrayDeque();
        this.P = -9223372036854775807L;
        this.O = -9223372036854775807L;
        this.Q = 0;
        this.R = 1;
    }

    @Override
    public final int C(u uVar) {
        this.I.getClass();
        return t.d(uVar);
    }

    public final boolean F(long r13) {
        throw new UnsupportedOperationException("Method not decompiled: t2.f.F(long):boolean");
    }

    public final boolean G(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: t2.f.G(long):boolean");
    }

    public final void H() {
        if (!this.f55290c0) {
            return;
        }
        u uVar = this.S;
        uVar.getClass();
        t tVar = this.I;
        tVar.getClass();
        int d = t.d(uVar);
        if (d != g.b(4, 0, 0, 0) && d != g.b(3, 0, 0, 0)) {
            throw d(new Exception("Provided decoder factory can't create decoder for format."), this.S, false, 4005);
        }
        b bVar = this.T;
        if (bVar != null) {
            bVar.release();
        }
        this.T = new b(tVar.f2020a);
        this.f55290c0 = false;
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
    public final void c(int i7, Object obj) {
        d dVar;
        if (i7 != 15) {
            if (i7 != 23) {
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
            dVar = d.f55284a;
        }
        this.V = dVar;
    }

    @Override
    public final String i() {
        return "ImageRenderer";
    }

    @Override
    public final boolean l() {
        return this.M;
    }

    @Override
    public final boolean m() {
        int i7 = this.R;
        if (i7 != 3) {
            if (i7 != 0 || !this.Y) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void n() {
        this.S = null;
        this.N = e.f55285c;
        this.K.clear();
        I();
        this.V.getClass();
    }

    @Override
    public final void o(boolean z9, boolean z10) {
        this.R = z10 ? 1 : 0;
    }

    @Override
    public final void p(long j3, boolean z9, boolean z10) {
        this.R = Math.min(this.R, 1);
        this.M = false;
        this.L = false;
        this.X = null;
        this.Z = null;
        this.f55288a0 = null;
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
    public final void u(e2.u[] r5, long r6, long r8, x2.g0 r10) {
        throw new UnsupportedOperationException("Method not decompiled: t2.f.u(e2.u[], long, long, x2.g0):void");
    }

    @Override
    public final void x(long j3, long j10) {
        if (!this.M) {
            if (this.S == null) {
                wf.b bVar = this.f17758c;
                bVar.A();
                h hVar = this.J;
                hVar.clear();
                int w10 = w(bVar, hVar, 2);
                if (w10 == -5) {
                    u uVar = (u) bVar.f57564c;
                    uVar.getClass();
                    this.S = uVar;
                    this.f55290c0 = true;
                } else if (w10 == -4) {
                    ia.p(hVar.isEndOfStream());
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
                while (F(j3)) {
                }
                while (G(j3)) {
                }
                Trace.endSection();
            } catch (c e10) {
                throw d(e10, null, false, 4003);
            }
        }
    }
}
