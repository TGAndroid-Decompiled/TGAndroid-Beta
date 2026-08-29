package t4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import eg.n;
import f5.d0;
import f5.o;
import j3.c0;
import j3.h0;
import j3.t0;
import j3.u0;
import q8.l0;
import q8.z;
public final class l extends j3.e implements Handler.Callback {
    public long A;
    public long B;
    public long C;
    public final Handler f48147a;
    public final h0 f48148b;
    public final i f48149c;
    public final u0 d;
    public boolean f48150e;
    public boolean f48151f;
    public boolean h;
    public int f48152n;
    public t0 f48153r;
    public g f48154s;
    public j v;
    public k f48155w;
    public k f48156x;
    public int f48157y;

    public l(h0 h0Var, Looper looper) {
        super(3);
        Handler handler;
        this.f48148b = h0Var;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = d0.f6579a;
            handler = new Handler(looper, this);
        }
        this.f48147a = handler;
        this.f48149c = i.f48143a;
        this.d = new Object();
        this.A = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.C = -9223372036854775807L;
    }

    public final long a() {
        if (this.f48157y == -1) {
            return Long.MAX_VALUE;
        }
        this.f48155w.getClass();
        if (this.f48157y >= this.f48155w.v()) {
            return Long.MAX_VALUE;
        }
        return this.f48155w.m(this.f48157y);
    }

    public final long b(long j10) {
        boolean z10;
        boolean z11 = false;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.i(z10);
        if (this.B != -9223372036854775807L) {
            z11 = true;
        }
        f5.a.i(z11);
        return j10 - this.B;
    }

    public final void c(c cVar) {
        z zVar = cVar.f48140a;
        h0 h0Var = this.f48148b;
        h0Var.f10477a.f10587l.e(27, new c0(zVar));
        h0Var.f10477a.f10587l.e(27, new n(cVar, 12));
    }

    public final void d() {
        this.v = null;
        this.f48157y = -1;
        k kVar = this.f48155w;
        if (kVar != null) {
            kVar.release();
            this.f48155w = null;
        }
        k kVar2 = this.f48156x;
        if (kVar2 != null) {
            kVar2.release();
            this.f48156x = null;
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
        return this.f48151f;
    }

    @Override
    public final boolean isReady() {
        return true;
    }

    @Override
    public final void onDisabled() {
        this.f48153r = null;
        this.A = -9223372036854775807L;
        c cVar = new c(b(this.C), l0.f46462e);
        Handler handler = this.f48147a;
        if (handler != null) {
            handler.obtainMessage(0, cVar).sendToTarget();
        } else {
            c(cVar);
        }
        this.B = -9223372036854775807L;
        this.C = -9223372036854775807L;
        d();
        g gVar = this.f48154s;
        gVar.getClass();
        gVar.release();
        this.f48154s = null;
        this.f48152n = 0;
    }

    @Override
    public final void onPositionReset(long r5, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: t4.l.onPositionReset(long, boolean):void");
    }

    @Override
    public final void onStreamChanged(j3.t0[] r3, long r4, long r6) {
        throw new UnsupportedOperationException("Method not decompiled: t4.l.onStreamChanged(j3.t0[], long, long):void");
    }

    @Override
    public final void render(long r30, long r32) {
        throw new UnsupportedOperationException("Method not decompiled: t4.l.render(long, long):void");
    }

    @Override
    public final int supportsFormat(t0 t0Var) {
        int i10;
        this.f48149c.getClass();
        String str = t0Var.B;
        if (!"text/vtt".equals(str) && !"text/x-ssa".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-subrip".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/cea-608".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/dvbsubs".equals(str) && !"application/pgs".equals(str) && !"text/x-exoplayer-cues".equals(str)) {
            if (o.i(t0Var.B)) {
                return com.google.android.recaptcha.internal.a.b(1, 0, 0);
            }
            return com.google.android.recaptcha.internal.a.b(0, 0, 0);
        }
        if (t0Var.W == 0) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        return com.google.android.recaptcha.internal.a.b(i10, 0, 0);
    }
}
