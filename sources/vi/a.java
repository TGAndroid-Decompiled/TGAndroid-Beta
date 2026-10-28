package vi;

import android.os.Handler;
public final class a implements Runnable {
    public final int f50365a;
    public final j f50366b;

    public a(j jVar, int i10) {
        this.f50365a = i10;
        this.f50366b = jVar;
    }

    @Override
    public final void run() {
        m mVar;
        boolean z10;
        switch (this.f50365a) {
            case 0:
                this.f50366b.u();
                return;
            case 1:
                this.f50366b.d0();
                return;
            case 2:
                j jVar = this.f50366b;
                Handler handler = jVar.f50473n;
                if (handler != null) {
                    handler.post(new a(jVar, 3));
                    return;
                }
                return;
            case 3:
                j jVar2 = this.f50366b;
                if (jVar2.V && jVar2.A != null && (mVar = jVar2.f50500x) != null) {
                    synchronized (mVar) {
                        z10 = mVar.E;
                    }
                    if (!z10) {
                        try {
                            m mVar2 = jVar2.f50500x;
                            jVar2.f50502y = mVar2;
                            Handler handler2 = jVar2.f50473n;
                            if (handler2 != null) {
                                handler2.removeCallbacks(jVar2.f50475n1);
                                handler2.postDelayed(jVar2.f50475n1, 3000L);
                            }
                            mVar2.t(new d(jVar2, mVar2, 0), new d(jVar2, mVar2, 1));
                            n nVar = jVar2.f50463j;
                            nVar.b("first camera frame received; audio startup requested: segmentElapsedMs=" + j.z(jVar2.F0));
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
                j jVar3 = this.f50366b;
                m mVar3 = jVar3.f50502y;
                if (jVar3.V && !jVar3.f50443b0 && mVar3 != null && jVar3.f50500x == mVar3) {
                    jVar3.f50502y = null;
                    jVar3.N(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 5:
                this.f50366b.g();
                return;
            case 6:
                j jVar4 = this.f50366b;
                jVar4.V = false;
                jVar4.k();
                m mVar4 = jVar4.f50500x;
                if (mVar4 != null) {
                    long p10 = mVar4.p();
                    s sVar = jVar4.f50498w;
                    if (sVar != null && p10 != Long.MAX_VALUE) {
                        sVar.f50605q = Math.max(0L, p10) * 1000;
                        Handler handler3 = sVar.f50613u;
                        if (handler3 != null) {
                            handler3.removeCallbacks(sVar.f50619x0);
                        }
                    }
                }
                jVar4.p();
                m mVar5 = jVar4.f50500x;
                if (mVar5 != null) {
                    mVar5.u();
                    jVar4.f50500x = null;
                }
                jVar4.f50443b0 = false;
                u0 u0Var = (u0) jVar4.f50466k.f17209b;
                u0Var.f50639i.post(new i0(u0Var, 3));
                return;
            case 7:
                this.f50366b.I();
                return;
            default:
                this.f50366b.d0();
                return;
        }
    }
}
