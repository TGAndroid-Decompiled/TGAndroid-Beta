package ri;

import android.os.Handler;
public final class a implements Runnable {
    public final int f44471a;
    public final j f44472b;

    public a(j jVar, int i10) {
        this.f44471a = i10;
        this.f44472b = jVar;
    }

    @Override
    public final void run() {
        m mVar;
        boolean z10;
        switch (this.f44471a) {
            case 0:
                this.f44472b.u();
                return;
            case 1:
                this.f44472b.d0();
                return;
            case 2:
                j jVar = this.f44472b;
                Handler handler = jVar.f44584n;
                if (handler != null) {
                    handler.post(new a(jVar, 3));
                    return;
                }
                return;
            case 3:
                j jVar2 = this.f44472b;
                if (jVar2.V && jVar2.A != null && (mVar = jVar2.f44610x) != null) {
                    synchronized (mVar) {
                        z10 = mVar.f44650z;
                    }
                    if (!z10) {
                        try {
                            m mVar2 = jVar2.f44610x;
                            jVar2.f44612y = mVar2;
                            Handler handler2 = jVar2.f44584n;
                            if (handler2 != null) {
                                handler2.removeCallbacks(jVar2.f44583m1);
                                handler2.postDelayed(jVar2.f44583m1, 3000L);
                            }
                            mVar2.p(new d(jVar2, mVar2, 0), new d(jVar2, mVar2, 1));
                            n nVar = jVar2.f44574j;
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
                j jVar3 = this.f44472b;
                m mVar3 = jVar3.f44612y;
                if (jVar3.V && !jVar3.f44554b0 && mVar3 != null && jVar3.f44610x == mVar3) {
                    jVar3.f44612y = null;
                    jVar3.N(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 5:
                this.f44472b.g();
                return;
            case 6:
                j jVar4 = this.f44472b;
                jVar4.V = false;
                jVar4.k();
                m mVar4 = jVar4.f44610x;
                if (mVar4 != null) {
                    long l4 = mVar4.l();
                    s sVar = jVar4.f44608w;
                    if (sVar != null && l4 != Long.MAX_VALUE) {
                        sVar.f44725q = Math.max(0L, l4) * 1000;
                        Handler handler3 = sVar.f44733u;
                        if (handler3 != null) {
                            handler3.removeCallbacks(sVar.f44739x0);
                        }
                    }
                }
                jVar4.p();
                m mVar5 = jVar4.f44610x;
                if (mVar5 != null) {
                    mVar5.q();
                    jVar4.f44610x = null;
                }
                jVar4.f44554b0 = false;
                r0 r0Var = (r0) jVar4.f44577k.f14848b;
                r0Var.f44680i.post(new g0(r0Var, 3));
                return;
            case 7:
                this.f44472b.I();
                return;
            default:
                this.f44472b.d0();
                return;
        }
    }
}
