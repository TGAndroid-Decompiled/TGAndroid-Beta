package q2;

import android.graphics.Bitmap;
import android.os.Trace;
import b2.s;
import java.util.ArrayDeque;
import n4.y;
public final class g extends i2.f {
    public final b I;
    public final h2.g J;
    public final ArrayDeque K;
    public boolean L;
    public boolean M;
    public f N;
    public long O;
    public long P;
    public int Q;
    public int R;
    public s S;
    public c T;
    public h2.g U;
    public e V;
    public Bitmap W;
    public boolean X;
    public j5.b Y;
    public j5.b Z;
    public int f44130a0;
    public boolean f44131b0;

    public g(b bVar) {
        super(4);
        this.I = bVar;
        this.V = e.f44126a;
        this.J = new h2.g(0, 0);
        this.N = f.f44127c;
        this.K = new ArrayDeque();
        this.P = -9223372036854775807L;
        this.O = -9223372036854775807L;
        this.Q = 0;
        this.R = 1;
    }

    public final boolean B(long r13) {
        throw new UnsupportedOperationException("Method not decompiled: q2.g.B(long):boolean");
    }

    public final boolean C(long r14) {
        throw new UnsupportedOperationException("Method not decompiled: q2.g.C(long):boolean");
    }

    public final void D() {
        if (!this.f44131b0) {
            return;
        }
        s sVar = this.S;
        sVar.getClass();
        b bVar = this.I;
        bVar.getClass();
        int a2 = b.a(sVar);
        if (a2 != i2.g.b(4, 0, 0, 0) && a2 != i2.g.b(3, 0, 0, 0)) {
            throw c(new Exception("Provided decoder factory can't create decoder for format."), this.S, false, 4005);
        }
        c cVar = this.T;
        if (cVar != null) {
            cVar.release();
        }
        this.T = new c(bVar.f44123a);
        this.f44131b0 = false;
    }

    public final void E() {
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
            return;
        }
        if (obj instanceof e) {
            eVar = (e) obj;
        } else {
            eVar = null;
        }
        if (eVar == null) {
            eVar = e.f44126a;
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
            if (i10 != 0 || !this.X) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void n() {
        this.S = null;
        this.N = f.f44127c;
        this.K.clear();
        E();
        this.V.getClass();
    }

    @Override
    public final void o(boolean z10, boolean z11) {
        this.R = z11 ? 1 : 0;
    }

    @Override
    public final void p(long j3, boolean z10) {
        this.R = Math.min(this.R, 1);
        this.M = false;
        this.L = false;
        this.W = null;
        this.Y = null;
        this.Z = null;
        this.X = false;
        this.U = null;
        c cVar = this.T;
        if (cVar != null) {
            cVar.flush();
        }
        this.K.clear();
    }

    @Override
    public final void q() {
        E();
    }

    @Override
    public final void r() {
        E();
        this.R = Math.min(this.R, 1);
    }

    @Override
    public final void u(b2.s[] r5, long r6, long r8, u2.f0 r10) {
        throw new UnsupportedOperationException("Method not decompiled: q2.g.u(b2.s[], long, long, u2.f0):void");
    }

    @Override
    public final void w(long j3, long j10) {
        if (!this.M) {
            if (this.S == null) {
                y yVar = this.f11496c;
                yVar.A();
                h2.g gVar = this.J;
                gVar.i();
                int v = v(yVar, gVar, 2);
                if (v == -5) {
                    s sVar = (s) yVar.f16497c;
                    e2.d.h(sVar);
                    this.S = sVar;
                    this.f44131b0 = true;
                } else if (v == -4) {
                    e2.d.g(gVar.c(4));
                    this.L = true;
                    this.M = true;
                    return;
                } else {
                    return;
                }
            }
            if (this.T == null) {
                D();
            }
            try {
                Trace.beginSection("drainAndFeedDecoder");
                while (B(j3)) {
                }
                while (C(j3)) {
                }
                Trace.endSection();
            } catch (d e7) {
                throw c(e7, null, false, 4003);
            }
        }
    }

    @Override
    public final int z(s sVar) {
        this.I.getClass();
        return b.a(sVar);
    }
}
