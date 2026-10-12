package qi;

import android.os.Handler;
public final class a implements Runnable {
    public final int f46672a;
    public final h f46673b;

    public a(h hVar, int i10) {
        this.f46672a = i10;
        this.f46673b = hVar;
    }

    @Override
    public final void run() {
        k kVar;
        boolean z10;
        Exception runtimeException;
        Exception runtimeException2;
        Exception runtimeException3;
        switch (this.f46672a) {
            case 0:
                this.f46673b.j();
                return;
            case 1:
                h hVar = this.f46673b;
                Handler handler = hVar.f46740n;
                if (handler != null) {
                    handler.post(new a(hVar, 2));
                    return;
                }
                return;
            case 2:
                h hVar2 = this.f46673b;
                if (hVar2.S && hVar2.f46763z != null && (kVar = hVar2.f46757w) != null) {
                    synchronized (kVar) {
                        z10 = kVar.f46800z;
                    }
                    if (!z10) {
                        try {
                            k kVar2 = hVar2.f46757w;
                            hVar2.f46759x = kVar2;
                            Handler handler2 = hVar2.f46740n;
                            if (handler2 != null) {
                                handler2.removeCallbacks(hVar2.N0);
                                handler2.postDelayed(hVar2.N0, 3000L);
                            }
                            kVar2.q(new c(hVar2, kVar2, 0), new c(hVar2, kVar2, 1));
                            hVar2.f46733j.b("first camera frame received; audio startup requested: segmentElapsedMs=" + h.m(hVar2.f46727f0));
                            return;
                        } catch (RuntimeException e7) {
                            hVar2.d();
                            hVar2.t(e7);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3:
                h hVar3 = this.f46673b;
                k kVar3 = hVar3.f46759x;
                if (hVar3.S && !hVar3.Y && kVar3 != null && hVar3.f46757w == kVar3) {
                    hVar3.f46759x = null;
                    hVar3.t(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 4:
                this.f46673b.a();
                return;
            case 5:
                h hVar4 = this.f46673b;
                hVar4.S = false;
                hVar4.d();
                try {
                    k kVar4 = hVar4.f46757w;
                    if (kVar4 != null) {
                        long m10 = kVar4.m();
                        p pVar = hVar4.v;
                        if (pVar != null && m10 != Long.MAX_VALUE) {
                            pVar.f46840k = Math.max(0L, m10) * 1000;
                            Handler handler3 = pVar.f46847o;
                            if (handler3 != null) {
                                handler3.removeCallbacks(pVar.f46850p0);
                            }
                        }
                    }
                    runtimeException = null;
                } catch (Throwable th2) {
                    if (th2 instanceof Exception) {
                        runtimeException = th2;
                    } else {
                        runtimeException = new RuntimeException(th2);
                    }
                }
                try {
                    hVar4.h();
                } catch (Throwable th3) {
                    if (th3 instanceof Exception) {
                        runtimeException2 = th3;
                    } else {
                        runtimeException2 = new RuntimeException(th3);
                    }
                    if (runtimeException == null) {
                        runtimeException = runtimeException2;
                    } else if (runtimeException != runtimeException2) {
                        runtimeException.addSuppressed(runtimeException2);
                    }
                }
                try {
                    k kVar5 = hVar4.f46757w;
                    if (kVar5 != null) {
                        kVar5.r();
                    }
                } catch (Throwable th4) {
                    try {
                        if (th4 instanceof Exception) {
                            runtimeException3 = th4;
                        } else {
                            runtimeException3 = new RuntimeException(th4);
                        }
                        if (runtimeException == null) {
                            runtimeException = runtimeException3;
                        } else if (runtimeException != runtimeException3) {
                            runtimeException.addSuppressed(runtimeException3);
                        }
                    } finally {
                        hVar4.f46757w = null;
                        hVar4.Y = false;
                    }
                }
                if (runtimeException != null) {
                    hVar4.t(runtimeException);
                }
                p0 p0Var = (p0) hVar4.f46735k.f14467b;
                p0Var.f46867j.post(new f0(p0Var, 2));
                return;
            case 6:
                this.f46673b.r();
                return;
            default:
                this.f46673b.G();
                return;
        }
    }
}
