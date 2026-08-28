package r4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d5.f0;
import d5.q;
import gh.i3;
import h3.c0;
import h3.h0;
import h3.t0;
import h3.u0;
import o8.l0;
import o8.z;
public final class l extends h3.e implements Handler.Callback {
    public long A;
    public long B;
    public long C;
    public final Handler f47064a;
    public final h0 f47065b;
    public final i f47066c;
    public final u0 d;
    public boolean f47067e;
    public boolean f47068f;
    public boolean h;
    public int f47069n;
    public t0 f47070r;
    public g f47071s;
    public j v;
    public k f47072w;
    public k f47073x;
    public int f47074y;

    public l(h0 h0Var, Looper looper) {
        super(3);
        Handler handler;
        this.f47065b = h0Var;
        if (looper == null) {
            handler = null;
        } else {
            int i9 = f0.f4349a;
            handler = new Handler(looper, this);
        }
        this.f47064a = handler;
        this.f47066c = i.f47060a;
        this.d = new Object();
        this.A = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.C = -9223372036854775807L;
    }

    public final long a() {
        if (this.f47074y == -1) {
            return Long.MAX_VALUE;
        }
        this.f47072w.getClass();
        if (this.f47074y >= this.f47072w.r()) {
            return Long.MAX_VALUE;
        }
        return this.f47072w.h(this.f47074y);
    }

    public final long b(long j10) {
        boolean z10;
        boolean z11 = false;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.i(z10);
        if (this.B != -9223372036854775807L) {
            z11 = true;
        }
        d5.a.i(z11);
        return j10 - this.B;
    }

    public final void c(c cVar) {
        z zVar = cVar.f47057a;
        h0 h0Var = this.f47065b;
        h0Var.f9440a.f9550l.e(27, new c0(zVar));
        h0Var.f9440a.f9550l.e(27, new i3(cVar, 10));
    }

    public final void d() {
        this.v = null;
        this.f47074y = -1;
        k kVar = this.f47072w;
        if (kVar != null) {
            kVar.release();
            this.f47072w = null;
        }
        k kVar2 = this.f47073x;
        if (kVar2 != null) {
            kVar2.release();
            this.f47073x = null;
        }
    }

    @Override
    public final String getName() {
        return "TextRenderer";
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            c((c) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override
    public final boolean isEnded() {
        return this.f47068f;
    }

    @Override
    public final boolean isReady() {
        return true;
    }

    @Override
    public final void onDisabled() {
        this.f47070r = null;
        this.A = -9223372036854775807L;
        c cVar = new c(b(this.C), l0.f19056e);
        Handler handler = this.f47064a;
        if (handler != null) {
            handler.obtainMessage(0, cVar).sendToTarget();
        } else {
            c(cVar);
        }
        this.B = -9223372036854775807L;
        this.C = -9223372036854775807L;
        d();
        g gVar = this.f47071s;
        gVar.getClass();
        gVar.release();
        this.f47071s = null;
        this.f47069n = 0;
    }

    @Override
    public final void onPositionReset(long r5, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: r4.l.onPositionReset(long, boolean):void");
    }

    @Override
    public final void onStreamChanged(h3.t0[] r3, long r4, long r6) {
        throw new UnsupportedOperationException("Method not decompiled: r4.l.onStreamChanged(h3.t0[], long, long):void");
    }

    @Override
    public final void render(long r30, long r32) {
        throw new UnsupportedOperationException("Method not decompiled: r4.l.render(long, long):void");
    }

    @Override
    public final int supportsFormat(t0 t0Var) {
        int i9;
        this.f47066c.getClass();
        String str = t0Var.B;
        if (!"text/vtt".equals(str) && !"text/x-ssa".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-subrip".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/cea-608".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/dvbsubs".equals(str) && !"application/pgs".equals(str) && !"text/x-exoplayer-cues".equals(str)) {
            if (q.i(t0Var.B)) {
                return e2.c.b(1, 0, 0);
            }
            return e2.c.b(0, 0, 0);
        }
        if (t0Var.W == 0) {
            i9 = 4;
        } else {
            i9 = 2;
        }
        return e2.c.b(i9, 0, 0);
    }
}
