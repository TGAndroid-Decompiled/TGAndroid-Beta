package s2;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.emoji2.text.n;
import b8.zb;
import d2.v;
import j2.h;
import java.util.ArrayDeque;
import k2.k0;
import k2.p1;
public final class f extends k2.b {
    public final n J;
    public final h K;
    public final ArrayDeque L;
    public boolean M;
    public boolean N;
    public e O;
    public long P;
    public long Q;
    public int R;
    public int S;
    public v T;
    public b U;
    public h V;
    public d W;
    public k0 X;
    public Bitmap Y;
    public boolean Z;
    public l5.c f54600a0;
    public l5.c f54601b0;
    public int f54602c0;
    public boolean f54603d0;

    public f(n nVar) {
        super(4);
        this.J = nVar;
        this.W = d.f54596a;
        this.K = new h(0, 0);
        this.O = e.f54597c;
        this.L = new ArrayDeque();
        this.Q = -9223372036854775807L;
        this.P = -9223372036854775807L;
        this.R = 0;
        this.S = 1;
    }

    @Override
    public final int C(v vVar) {
        this.J.getClass();
        return n.e(vVar);
    }

    public final boolean F(long r13) {
        throw new UnsupportedOperationException("Method not decompiled: s2.f.F(long):boolean");
    }

    public final boolean G(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: s2.f.G(long):boolean");
    }

    public final void H() {
        if (!this.f54603d0) {
            return;
        }
        v vVar = this.T;
        vVar.getClass();
        n nVar = this.J;
        nVar.getClass();
        int e10 = n.e(vVar);
        if (e10 != p1.a(4, 0, 0, 0) && e10 != p1.a(3, 0, 0, 0)) {
            throw e(new Exception("Provided decoder factory can't create decoder for format."), this.T, false, 4005);
        }
        b bVar = this.U;
        if (bVar != null) {
            bVar.release();
        }
        this.U = new b(nVar.f1741a);
        this.f54603d0 = false;
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
    public final void d(int i3, Object obj) {
        d dVar;
        if (i3 != 15) {
            if (i3 != 23) {
                return;
            }
            this.X = (k0) obj;
            return;
        }
        if (obj instanceof d) {
            dVar = (d) obj;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            dVar = d.f54596a;
        }
        this.W = dVar;
    }

    @Override
    public final String j() {
        return "ImageRenderer";
    }

    @Override
    public final boolean l() {
        return this.N;
    }

    @Override
    public final boolean m() {
        int i3 = this.S;
        if (i3 != 3) {
            if (i3 != 0 || !this.Z) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void n() {
        this.T = null;
        this.O = e.f54597c;
        this.L.clear();
        I();
        this.W.getClass();
    }

    @Override
    public final void o(boolean z10, boolean z11) {
        this.S = z11 ? 1 : 0;
    }

    @Override
    public final void p(long j10, boolean z10, boolean z11) {
        this.S = Math.min(this.S, 1);
        this.N = false;
        this.M = false;
        this.Y = null;
        this.f54600a0 = null;
        this.f54601b0 = null;
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
    public final void u(d2.v[] r5, long r6, long r8, w2.g0 r10) {
        throw new UnsupportedOperationException("Method not decompiled: s2.f.u(d2.v[], long, long, w2.g0):void");
    }

    @Override
    public final void x(long j10, long j11) {
        if (!this.N) {
            if (this.T == null) {
                tf.b bVar = this.f16445c;
                bVar.q();
                h hVar = this.K;
                hVar.clear();
                int w10 = w(bVar, hVar, 2);
                if (w10 == -5) {
                    v vVar = (v) bVar.f55095b;
                    vVar.getClass();
                    this.T = vVar;
                    this.f54603d0 = true;
                } else if (w10 == -4) {
                    zb.p(hVar.isEndOfStream());
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
                while (F(j10)) {
                }
                while (G(j10)) {
                }
                Trace.endSection();
            } catch (c e10) {
                throw e(e10, null, false, 4003);
            }
        }
    }
}
