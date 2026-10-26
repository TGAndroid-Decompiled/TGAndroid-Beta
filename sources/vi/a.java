package vi;

import android.os.Handler;
public final class a implements Runnable {
    public final int f50330a;
    public final j f50331b;

    public a(j jVar, int i10) {
        this.f50330a = i10;
        this.f50331b = jVar;
    }

    @Override
    public final void run() {
        m mVar;
        boolean z10;
        switch (this.f50330a) {
            case 0:
                this.f50331b.u();
                return;
            case 1:
                this.f50331b.d0();
                return;
            case 2:
                j jVar = this.f50331b;
                Handler handler = jVar.f50438n;
                if (handler != null) {
                    handler.post(new a(jVar, 3));
                    return;
                }
                return;
            case 3:
                j jVar2 = this.f50331b;
                if (jVar2.V && jVar2.A != null && (mVar = jVar2.f50464x) != null) {
                    synchronized (mVar) {
                        z10 = mVar.f50510z;
                    }
                    if (!z10) {
                        try {
                            m mVar2 = jVar2.f50464x;
                            jVar2.f50466y = mVar2;
                            Handler handler2 = jVar2.f50438n;
                            if (handler2 != null) {
                                handler2.removeCallbacks(jVar2.f50437m1);
                                handler2.postDelayed(jVar2.f50437m1, 3000L);
                            }
                            mVar2.p(new d(jVar2, mVar2, 0), new d(jVar2, mVar2, 1));
                            n nVar = jVar2.f50428j;
                            nVar.b("first camera frame received; audio startup requested: segmentElapsedMs=" + j.z(jVar2.E0));
                            return;
                        } catch (RuntimeException e) {
                            jVar2.k();
                            jVar2.N(e);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                j jVar3 = this.f50331b;
                m mVar3 = jVar3.f50466y;
                if (jVar3.V && !jVar3.f50408b0 && mVar3 != null && jVar3.f50464x == mVar3) {
                    jVar3.f50466y = null;
                    jVar3.N(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 5:
                this.f50331b.g();
                return;
            case 6:
                j jVar4 = this.f50331b;
                jVar4.V = false;
                jVar4.k();
                m mVar4 = jVar4.f50464x;
                if (mVar4 != null) {
                    long l4 = mVar4.l();
                    s sVar = jVar4.f50462w;
                    if (sVar != null && l4 != Long.MAX_VALUE) {
                        sVar.f50566q = Math.max(0L, l4) * 1000;
                        Handler handler3 = sVar.f50574u;
                        if (handler3 != null) {
                            handler3.removeCallbacks(sVar.f50580x0);
                        }
                    }
                }
                jVar4.p();
                m mVar5 = jVar4.f50464x;
                if (mVar5 != null) {
                    mVar5.q();
                    jVar4.f50464x = null;
                }
                jVar4.f50408b0 = false;
                s0 s0Var = (s0) jVar4.f50431k.f17210b;
                s0Var.f50588i.post(new h0(s0Var, 3));
                return;
            case 7:
                this.f50331b.I();
                return;
            default:
                this.f50331b.d0();
                return;
        }
    }
}
