package t2;

import a8.ma;
import android.graphics.Bitmap;
import android.os.Trace;
import androidx.biometric.t;
import e2.u;
import java.util.ArrayDeque;
import jb.m;
import k2.h;
import l2.i0;
public final class f extends l2.b {
    public final t J;
    public final h K;
    public final ArrayDeque L;
    public boolean M;
    public boolean N;
    public e O;
    public long P;
    public long Q;
    public int R;
    public int S;
    public u T;
    public b U;
    public h V;
    public d W;
    public i0 X;
    public Bitmap Y;
    public boolean Z;
    public m5.b f57671a0;
    public m5.b f57672b0;
    public int f57673c0;
    public boolean f57674d0;

    public f(t tVar) {
        super(4);
        this.J = tVar;
        this.W = d.f57667a;
        this.K = new h(0, 0);
        this.O = e.f57668c;
        this.L = new ArrayDeque();
        this.Q = -9223372036854775807L;
        this.P = -9223372036854775807L;
        this.R = 0;
        this.S = 1;
    }

    @Override
    public final int C(u uVar) {
        this.J.getClass();
        return t.d(uVar);
    }

    public final boolean F(long r13) {
        throw new UnsupportedOperationException("Method not decompiled: t2.f.F(long):boolean");
    }

    public final boolean G(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: t2.f.G(long):boolean");
    }

    public final void H() {
        if (!this.f57674d0) {
            return;
        }
        u uVar = this.T;
        uVar.getClass();
        t tVar = this.J;
        tVar.getClass();
        int d = t.d(uVar);
        if (d != i5.c.a(4, 0, 0, 0) && d != i5.c.a(3, 0, 0, 0)) {
            throw d(new Exception("Provided decoder factory can't create decoder for format."), this.T, false, 4005);
        }
        b bVar = this.U;
        if (bVar != null) {
            bVar.release();
        }
        this.U = new b(tVar.f1934a);
        this.f57674d0 = false;
    }

    public final void I() {
        this.V = null;
        this.R = 0;
        this.Q = -9223372036854775807L;
        b bVar = this.U;
        if (bVar != null) {
            bVar.release();
            this.U = null;
        }
    }

    @Override
    public final void c(int i7, Object obj) {
        d dVar;
        if (i7 != 15) {
            if (i7 != 23) {
                return;
            }
            this.X = (i0) obj;
            return;
        }
        if (obj instanceof d) {
            dVar = (d) obj;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            dVar = d.f57667a;
        }
        this.W = dVar;
    }

    @Override
    public final String i() {
        return "ImageRenderer";
    }

    @Override
    public final boolean k() {
        return this.N;
    }

    @Override
    public final boolean m() {
        int i7 = this.S;
        if (i7 != 3) {
            if (i7 != 0 || !this.Z) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void n() {
        this.T = null;
        this.O = e.f57668c;
        this.L.clear();
        I();
        this.W.getClass();
    }

    @Override
    public final void o(boolean z10, boolean z11) {
        this.S = z11 ? 1 : 0;
    }

    @Override
    public final void p(long j3, boolean z10, boolean z11) {
        this.S = Math.min(this.S, 1);
        this.N = false;
        this.M = false;
        this.Y = null;
        this.f57671a0 = null;
        this.f57672b0 = null;
        this.Z = false;
        this.V = null;
        b bVar = this.U;
        if (bVar != null) {
            bVar.flush();
        }
        this.L.clear();
    }

    @Override
    public final void q() {
        I();
    }

    @Override
    public final void r() {
        I();
        this.S = Math.min(this.S, 1);
    }

    @Override
    public final void u(e2.u[] r5, long r6, long r8, x2.g0 r10) {
        throw new UnsupportedOperationException("Method not decompiled: t2.f.u(e2.u[], long, long, x2.g0):void");
    }

    @Override
    public final void x(long j3, long j10) {
        if (!this.N) {
            if (this.T == null) {
                m mVar = this.f19348c;
                mVar.T();
                h hVar = this.K;
                hVar.clear();
                int w10 = w(mVar, hVar, 2);
                if (w10 == -5) {
                    u uVar = (u) mVar.f17465c;
                    uVar.getClass();
                    this.T = uVar;
                    this.f57674d0 = true;
                } else if (w10 == -4) {
                    ma.p(hVar.isEndOfStream());
                    this.M = true;
                    this.N = true;
                    return;
                } else {
                    return;
                }
            }
            if (this.U == null) {
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
