package wi;

import android.os.Handler;
import org.telegram.ui.Wallet.f2;
public final class a implements Runnable {
    public final int f57925a;
    public final k f57926b;

    public a(k kVar, int i7) {
        this.f57925a = i7;
        this.f57926b = kVar;
    }

    @Override
    public final void run() {
        t tVar;
        n nVar;
        boolean z9;
        switch (this.f57925a) {
            case 0:
                this.f57926b.t();
                return;
            case 1:
                k kVar = this.f57926b;
                int y10 = kVar.y();
                if (y10 != kVar.B0 && (tVar = kVar.v) != null) {
                    kVar.B0 = y10;
                    tVar.f58188s0 = y10;
                    Handler handler = tVar.f58191u;
                    if (tVar.f58186r0 && handler != null) {
                        handler.post(new f2(tVar, y10, 11));
                    }
                    o oVar = kVar.f58036j;
                    oVar.b("display rotation applied: degrees=" + y10);
                    return;
                }
                return;
            case 2:
                this.f57926b.a0();
                return;
            case 3:
                k kVar2 = this.f57926b;
                Handler handler2 = kVar2.f58046n;
                if (handler2 != null) {
                    handler2.post(new a(kVar2, 4));
                    return;
                }
                return;
            case 4:
                k kVar3 = this.f57926b;
                if (kVar3.U && kVar3.f58074z != null && (nVar = kVar3.f58068w) != null) {
                    synchronized (nVar) {
                        z9 = nVar.E;
                    }
                    if (!z9) {
                        try {
                            n nVar2 = kVar3.f58068w;
                            kVar3.f58070x = nVar2;
                            Handler handler3 = kVar3.f58046n;
                            if (handler3 != null) {
                                handler3.removeCallbacks(kVar3.f58041k1);
                                handler3.postDelayed(kVar3.f58041k1, 3000L);
                            }
                            nVar2.t(new d(kVar3, nVar2, 0), new d(kVar3, nVar2, 1));
                            o oVar2 = kVar3.f58036j;
                            oVar2.b("first camera frame received; audio startup requested: segmentElapsedMs=" + k.z(kVar3.C0));
                            return;
                        } catch (RuntimeException e10) {
                            kVar3.j();
                            kVar3.M(e10);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                k kVar4 = this.f57926b;
                n nVar3 = kVar4.f58070x;
                if (kVar4.U && !kVar4.Y && nVar3 != null && kVar4.f58068w == nVar3) {
                    kVar4.f58070x = null;
                    kVar4.M(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 6:
                this.f57926b.f();
                return;
            case 7:
                k kVar5 = this.f57926b;
                kVar5.U = false;
                kVar5.j();
                n nVar4 = kVar5.f58068w;
                if (nVar4 != null) {
                    long p10 = nVar4.p();
                    t tVar2 = kVar5.v;
                    if (tVar2 != null && p10 != Long.MAX_VALUE) {
                        tVar2.f58183q = Math.max(0L, p10) * 1000;
                        Handler handler4 = tVar2.f58191u;
                        if (handler4 != null) {
                            handler4.removeCallbacks(tVar2.f58199y0);
                        }
                    }
                }
                kVar5.n();
                n nVar5 = kVar5.f58068w;
                if (nVar5 != null) {
                    nVar5.u();
                    kVar5.f58068w = null;
                }
                kVar5.Y = false;
                t0 t0Var = (t0) kVar5.f58039k.f37805b;
                t0Var.f58209i.post(new i0(t0Var, 3));
                return;
            case 8:
                this.f57926b.G();
                return;
            default:
                this.f57926b.a0();
                return;
        }
    }
}
