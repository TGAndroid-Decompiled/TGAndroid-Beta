package si;

import android.os.Handler;
public final class a implements Runnable {
    public final int f46552a;
    public final j f46553b;

    public a(j jVar, int i10) {
        this.f46552a = i10;
        this.f46553b = jVar;
    }

    @Override
    public final void run() {
        m mVar;
        boolean z10;
        switch (this.f46552a) {
            case 0:
                this.f46553b.u();
                return;
            case 1:
                this.f46553b.d0();
                return;
            case 2:
                j jVar = this.f46553b;
                Handler handler = jVar.f46659n;
                if (handler != null) {
                    handler.post(new a(jVar, 3));
                    return;
                }
                return;
            case 3:
                j jVar2 = this.f46553b;
                if (jVar2.V && jVar2.A != null && (mVar = jVar2.f46685x) != null) {
                    synchronized (mVar) {
                        z10 = mVar.f46731z;
                    }
                    if (!z10) {
                        try {
                            m mVar2 = jVar2.f46685x;
                            jVar2.f46687y = mVar2;
                            Handler handler2 = jVar2.f46659n;
                            if (handler2 != null) {
                                handler2.removeCallbacks(jVar2.f46658m1);
                                handler2.postDelayed(jVar2.f46658m1, 3000L);
                            }
                            mVar2.p(new d(jVar2, mVar2, 0), new d(jVar2, mVar2, 1));
                            n nVar = jVar2.f46649j;
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
                j jVar3 = this.f46553b;
                m mVar3 = jVar3.f46687y;
                if (jVar3.V && !jVar3.f46629b0 && mVar3 != null && jVar3.f46685x == mVar3) {
                    jVar3.f46687y = null;
                    jVar3.N(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 5:
                this.f46553b.g();
                return;
            case 6:
                j jVar4 = this.f46553b;
                jVar4.V = false;
                jVar4.k();
                m mVar4 = jVar4.f46685x;
                if (mVar4 != null) {
                    long l4 = mVar4.l();
                    t tVar = jVar4.f46683w;
                    if (tVar != null && l4 != Long.MAX_VALUE) {
                        tVar.f46812q = Math.max(0L, l4) * 1000;
                        Handler handler3 = tVar.f46820u;
                        if (handler3 != null) {
                            handler3.removeCallbacks(tVar.f46826x0);
                        }
                    }
                }
                jVar4.p();
                m mVar5 = jVar4.f46685x;
                if (mVar5 != null) {
                    mVar5.q();
                    jVar4.f46685x = null;
                }
                jVar4.f46629b0 = false;
                s0 s0Var = (s0) jVar4.f46652k.f14830b;
                s0Var.f46767i.post(new i0(s0Var, 3));
                return;
            case 7:
                this.f46553b.I();
                return;
            default:
                this.f46553b.d0();
                return;
        }
    }
}
