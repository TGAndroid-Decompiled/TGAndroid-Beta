package wi;

import android.os.Handler;
public final class a implements Runnable {
    public final int f57796a;
    public final j f57797b;

    public a(j jVar, int i7) {
        this.f57796a = i7;
        this.f57797b = jVar;
    }

    @Override
    public final void run() {
        m mVar;
        boolean z9;
        switch (this.f57796a) {
            case 0:
                this.f57797b.u();
                return;
            case 1:
                this.f57797b.d0();
                return;
            case 2:
                j jVar = this.f57797b;
                Handler handler = jVar.f57911n;
                if (handler != null) {
                    handler.post(new a(jVar, 3));
                    return;
                }
                return;
            case 3:
                j jVar2 = this.f57797b;
                if (jVar2.V && jVar2.A != null && (mVar = jVar2.f57937x) != null) {
                    synchronized (mVar) {
                        z9 = mVar.E;
                    }
                    if (!z9) {
                        try {
                            m mVar2 = jVar2.f57937x;
                            jVar2.f57939y = mVar2;
                            Handler handler2 = jVar2.f57911n;
                            if (handler2 != null) {
                                handler2.removeCallbacks(jVar2.n1);
                                handler2.postDelayed(jVar2.n1, 3000L);
                            }
                            mVar2.t(new d(jVar2, mVar2, 0), new d(jVar2, mVar2, 1));
                            n nVar = jVar2.f57901j;
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
                j jVar3 = this.f57797b;
                m mVar3 = jVar3.f57939y;
                if (jVar3.V && !jVar3.f57880b0 && mVar3 != null && jVar3.f57937x == mVar3) {
                    jVar3.f57939y = null;
                    jVar3.N(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 5:
                this.f57797b.g();
                return;
            case 6:
                j jVar4 = this.f57797b;
                jVar4.V = false;
                jVar4.k();
                m mVar4 = jVar4.f57937x;
                if (mVar4 != null) {
                    long p10 = mVar4.p();
                    t tVar = jVar4.f57935w;
                    if (tVar != null && p10 != Long.MAX_VALUE) {
                        tVar.f58056q = Math.max(0L, p10) * 1000;
                        Handler handler3 = tVar.f58064u;
                        if (handler3 != null) {
                            handler3.removeCallbacks(tVar.f58070x0);
                        }
                    }
                }
                jVar4.p();
                m mVar5 = jVar4.f57937x;
                if (mVar5 != null) {
                    mVar5.u();
                    jVar4.f57937x = null;
                }
                jVar4.f57880b0 = false;
                t0 t0Var = (t0) jVar4.f57904k.f37504b;
                t0Var.f58080i.post(new i0(t0Var, 3));
                return;
            case 7:
                this.f57797b.I();
                return;
            default:
                this.f57797b.d0();
                return;
        }
    }
}
