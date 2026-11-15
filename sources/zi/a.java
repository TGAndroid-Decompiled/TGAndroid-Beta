package zi;

import android.os.Handler;
import org.telegram.ui.nb1;
public final class a implements Runnable {
    public final int f61465a;
    public final l f61466b;

    public a(l lVar, int i7) {
        this.f61465a = i7;
        this.f61466b = lVar;
    }

    @Override
    public final void run() {
        u uVar;
        o oVar;
        boolean z10;
        switch (this.f61465a) {
            case 0:
                this.f61466b.t();
                return;
            case 1:
                l lVar = this.f61466b;
                int y10 = lVar.y();
                if (y10 != lVar.B0 && (uVar = lVar.v) != null) {
                    lVar.B0 = y10;
                    uVar.f61725s0 = y10;
                    Handler handler = uVar.f61728u;
                    if (uVar.f61723r0 && handler != null) {
                        handler.post(new nb1(uVar, y10, 14));
                    }
                    p pVar = lVar.f61579j;
                    pVar.b("display rotation applied: degrees=" + y10);
                    return;
                }
                return;
            case 2:
                this.f61466b.a0();
                return;
            case 3:
                l lVar2 = this.f61466b;
                Handler handler2 = lVar2.f61589n;
                if (handler2 != null) {
                    handler2.post(new a(lVar2, 4));
                    return;
                }
                return;
            case 4:
                l lVar3 = this.f61466b;
                if (lVar3.U && lVar3.f61617z != null && (oVar = lVar3.f61611w) != null) {
                    synchronized (oVar) {
                        z10 = oVar.E;
                    }
                    if (!z10) {
                        try {
                            o oVar2 = lVar3.f61611w;
                            lVar3.f61613x = oVar2;
                            Handler handler3 = lVar3.f61589n;
                            if (handler3 != null) {
                                handler3.removeCallbacks(lVar3.f61584k1);
                                handler3.postDelayed(lVar3.f61584k1, 3000L);
                            }
                            oVar2.t(new d(lVar3, oVar2, 0), new d(lVar3, oVar2, 1));
                            p pVar2 = lVar3.f61579j;
                            pVar2.b("first camera frame received; audio startup requested: segmentElapsedMs=" + l.z(lVar3.C0));
                            return;
                        } catch (RuntimeException e10) {
                            lVar3.j();
                            lVar3.M(e10);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                l lVar4 = this.f61466b;
                o oVar3 = lVar4.f61613x;
                if (lVar4.U && !lVar4.Y && oVar3 != null && lVar4.f61611w == oVar3) {
                    lVar4.f61613x = null;
                    lVar4.M(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 6:
                this.f61466b.f();
                return;
            case 7:
                l lVar5 = this.f61466b;
                lVar5.U = false;
                lVar5.j();
                o oVar4 = lVar5.f61611w;
                if (oVar4 != null) {
                    long p10 = oVar4.p();
                    u uVar2 = lVar5.v;
                    if (uVar2 != null && p10 != Long.MAX_VALUE) {
                        uVar2.f61720q = Math.max(0L, p10) * 1000;
                        Handler handler4 = uVar2.f61728u;
                        if (handler4 != null) {
                            handler4.removeCallbacks(uVar2.f61736y0);
                        }
                    }
                }
                lVar5.n();
                o oVar5 = lVar5.f61611w;
                if (oVar5 != null) {
                    oVar5.u();
                    lVar5.f61611w = null;
                }
                lVar5.Y = false;
                v0 v0Var = (v0) lVar5.f61582k.f57880a;
                v0Var.f61752i.post(new j0(v0Var, 3));
                return;
            case 8:
                this.f61466b.G();
                return;
            default:
                this.f61466b.a0();
                return;
        }
    }
}
