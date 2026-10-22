package si;

import android.os.Handler;
public final class a implements Runnable {
    public final int f46555a;
    public final j f46556b;

    public a(j jVar, int i10) {
        this.f46555a = i10;
        this.f46556b = jVar;
    }

    @Override
    public final void run() {
        m mVar;
        boolean z10;
        switch (this.f46555a) {
            case 0:
                this.f46556b.u();
                return;
            case 1:
                this.f46556b.d0();
                return;
            case 2:
                j jVar = this.f46556b;
                Handler handler = jVar.f46662n;
                if (handler != null) {
                    handler.post(new a(jVar, 3));
                    return;
                }
                return;
            case 3:
                j jVar2 = this.f46556b;
                if (jVar2.V && jVar2.A != null && (mVar = jVar2.f46688x) != null) {
                    synchronized (mVar) {
                        z10 = mVar.f46734z;
                    }
                    if (!z10) {
                        try {
                            m mVar2 = jVar2.f46688x;
                            jVar2.f46690y = mVar2;
                            Handler handler2 = jVar2.f46662n;
                            if (handler2 != null) {
                                handler2.removeCallbacks(jVar2.f46661m1);
                                handler2.postDelayed(jVar2.f46661m1, 3000L);
                            }
                            mVar2.p(new d(jVar2, mVar2, 0), new d(jVar2, mVar2, 1));
                            n nVar = jVar2.f46652j;
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
                j jVar3 = this.f46556b;
                m mVar3 = jVar3.f46690y;
                if (jVar3.V && !jVar3.f46632b0 && mVar3 != null && jVar3.f46688x == mVar3) {
                    jVar3.f46690y = null;
                    jVar3.N(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 5:
                this.f46556b.g();
                return;
            case 6:
                j jVar4 = this.f46556b;
                jVar4.V = false;
                jVar4.k();
                m mVar4 = jVar4.f46688x;
                if (mVar4 != null) {
                    long l4 = mVar4.l();
                    t tVar = jVar4.f46686w;
                    if (tVar != null && l4 != Long.MAX_VALUE) {
                        tVar.f46815q = Math.max(0L, l4) * 1000;
                        Handler handler3 = tVar.f46823u;
                        if (handler3 != null) {
                            handler3.removeCallbacks(tVar.f46829x0);
                        }
                    }
                }
                jVar4.p();
                m mVar5 = jVar4.f46688x;
                if (mVar5 != null) {
                    mVar5.q();
                    jVar4.f46688x = null;
                }
                jVar4.f46632b0 = false;
                s0 s0Var = (s0) jVar4.f46655k.f14830b;
                s0Var.f46770i.post(new i0(s0Var, 3));
                return;
            case 7:
                this.f46556b.I();
                return;
            default:
                this.f46556b.d0();
                return;
        }
    }
}
