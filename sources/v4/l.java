package v4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import h5.d0;
import h5.o;
import j3.c0;
import j3.n0;
import j3.z;
import s8.i0;
import s8.v;
public final class l extends j3.e implements Handler.Callback {
    public final Handler B;
    public final c0 C;
    public final i D;
    public final f7.b E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public n0 J;
    public g K;
    public j L;
    public k M;
    public k N;
    public int O;
    public long P;
    public long Q;
    public long R;

    public l(c0 c0Var, Looper looper) {
        super(3);
        Handler handler;
        this.C = c0Var;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = d0.f6937a;
            handler = new Handler(looper, this);
        }
        this.B = handler;
        this.D = i.f45611a;
        this.E = new f7.b((char) 0, 17);
        this.P = -9223372036854775807L;
        this.Q = -9223372036854775807L;
        this.R = -9223372036854775807L;
    }

    public final long A(long j10) {
        boolean z4;
        boolean z10 = false;
        if (j10 != -9223372036854775807L) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        if (this.Q != -9223372036854775807L) {
            z10 = true;
        }
        h5.a.i(z10);
        return j10 - this.Q;
    }

    public final void B(c cVar) {
        v vVar = cVar.f45609a;
        c0 c0Var = this.C;
        c0Var.f8441a.f8556l.e(27, new z(vVar));
        c0Var.f8441a.f8556l.e(27, new gg.f(cVar, 11));
    }

    public final void C() {
        this.L = null;
        this.O = -1;
        k kVar = this.M;
        if (kVar != null) {
            kVar.j();
            this.M = null;
        }
        k kVar2 = this.N;
        if (kVar2 != null) {
            kVar2.j();
            this.N = null;
        }
    }

    @Override
    public final String g() {
        return "TextRenderer";
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            B((c) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override
    public final boolean i() {
        return this.G;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final void k() {
        this.J = null;
        this.P = -9223372036854775807L;
        c cVar = new c(A(this.R), i0.e);
        Handler handler = this.B;
        if (handler != null) {
            handler.obtainMessage(0, cVar).sendToTarget();
        } else {
            B(cVar);
        }
        this.Q = -9223372036854775807L;
        this.R = -9223372036854775807L;
        C();
        g gVar = this.K;
        gVar.getClass();
        gVar.release();
        this.K = null;
        this.I = 0;
    }

    @Override
    public final void m(long r5, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: v4.l.m(long, boolean):void");
    }

    @Override
    public final void r(j3.n0[] r3, long r4, long r6) {
        throw new UnsupportedOperationException("Method not decompiled: v4.l.r(j3.n0[], long, long):void");
    }

    @Override
    public final void t(long r30, long r32) {
        throw new UnsupportedOperationException("Method not decompiled: v4.l.t(long, long):void");
    }

    @Override
    public final int x(n0 n0Var) {
        int i10;
        this.D.getClass();
        String str = n0Var.C;
        if (!"text/vtt".equals(str) && !"text/x-ssa".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-subrip".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/cea-608".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/dvbsubs".equals(str) && !"application/pgs".equals(str) && !"text/x-exoplayer-cues".equals(str)) {
            if (o.i(n0Var.C)) {
                return e2.c.b(1, 0, 0);
            }
            return e2.c.b(0, 0, 0);
        }
        if (n0Var.X == 0) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        return e2.c.b(i10, 0, 0);
    }

    public final long z() {
        if (this.O == -1) {
            return Long.MAX_VALUE;
        }
        this.M.getClass();
        if (this.O >= this.M.p()) {
            return Long.MAX_VALUE;
        }
        return this.M.g(this.O);
    }
}
