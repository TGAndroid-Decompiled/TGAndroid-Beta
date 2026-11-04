package wi;

import android.os.Handler;
public final class a implements Runnable {
    public final int f57779a;
    public final j f57780b;

    public a(j jVar, int i3) {
        this.f57779a = i3;
        this.f57780b = jVar;
    }

    @Override
    public final void run() {
        m mVar;
        boolean z10;
        switch (this.f57779a) {
            case 0:
                this.f57780b.u();
                return;
            case 1:
                this.f57780b.d0();
                return;
            case 2:
                j jVar = this.f57780b;
                Handler handler = jVar.f57893n;
                if (handler != null) {
                    handler.post(new a(jVar, 3));
                    return;
                }
                return;
            case 3:
                j jVar2 = this.f57780b;
                if (jVar2.V && jVar2.A != null && (mVar = jVar2.f57920x) != null) {
                    synchronized (mVar) {
                        z10 = mVar.E;
                    }
                    if (!z10) {
                        try {
                            m mVar2 = jVar2.f57920x;
                            jVar2.f57922y = mVar2;
                            Handler handler2 = jVar2.f57893n;
                            if (handler2 != null) {
                                handler2.removeCallbacks(jVar2.f57895n1);
                                handler2.postDelayed(jVar2.f57895n1, 3000L);
                            }
                            mVar2.t(new d(jVar2, mVar2, 0), new d(jVar2, mVar2, 1));
                            n nVar = jVar2.f57884j;
                            nVar.b("first camera frame received; audio startup requested: segmentElapsedMs=" + j.z(jVar2.F0));
                            return;
                        } catch (RuntimeException e10) {
                            jVar2.k();
                            jVar2.N(e10);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                j jVar3 = this.f57780b;
                m mVar3 = jVar3.f57922y;
                if (jVar3.V && !jVar3.f57863b0 && mVar3 != null && jVar3.f57920x == mVar3) {
                    jVar3.f57922y = null;
                    jVar3.N(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 5:
                this.f57780b.g();
                return;
            case 6:
                j jVar4 = this.f57780b;
                jVar4.V = false;
                jVar4.k();
                m mVar4 = jVar4.f57920x;
                if (mVar4 != null) {
                    long p10 = mVar4.p();
                    s sVar = jVar4.f57918w;
                    if (sVar != null && p10 != Long.MAX_VALUE) {
                        sVar.f58030q = Math.max(0L, p10) * 1000;
                        Handler handler3 = sVar.f58038u;
                        if (handler3 != null) {
                            handler3.removeCallbacks(sVar.f58044x0);
                        }
                    }
                }
                jVar4.p();
                m mVar5 = jVar4.f57920x;
                if (mVar5 != null) {
                    mVar5.u();
                    jVar4.f57920x = null;
                }
                jVar4.f57863b0 = false;
                t0 t0Var = (t0) jVar4.f57887k.f36540b;
                t0Var.f58060i.post(new h0(t0Var, 3));
                return;
            case 7:
                this.f57780b.I();
                return;
            default:
                this.f57780b.d0();
                return;
        }
    }
}
