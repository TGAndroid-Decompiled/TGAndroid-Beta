package qi;

import android.os.Handler;
public final class a implements Runnable {
    public final int f46664a;
    public final h f46665b;

    public a(h hVar, int i10) {
        this.f46664a = i10;
        this.f46665b = hVar;
    }

    @Override
    public final void run() {
        k kVar;
        boolean z10;
        Exception runtimeException;
        Exception runtimeException2;
        Exception runtimeException3;
        switch (this.f46664a) {
            case 0:
                this.f46665b.j();
                return;
            case 1:
                h hVar = this.f46665b;
                Handler handler = hVar.f46732n;
                if (handler != null) {
                    handler.post(new a(hVar, 2));
                    return;
                }
                return;
            case 2:
                h hVar2 = this.f46665b;
                if (hVar2.S && hVar2.f46755z != null && (kVar = hVar2.f46749w) != null) {
                    synchronized (kVar) {
                        z10 = kVar.f46792z;
                    }
                    if (!z10) {
                        try {
                            k kVar2 = hVar2.f46749w;
                            hVar2.f46751x = kVar2;
                            Handler handler2 = hVar2.f46732n;
                            if (handler2 != null) {
                                handler2.removeCallbacks(hVar2.N0);
                                handler2.postDelayed(hVar2.N0, 3000L);
                            }
                            kVar2.q(new c(hVar2, kVar2, 0), new c(hVar2, kVar2, 1));
                            hVar2.f46725j.b("first camera frame received; audio startup requested: segmentElapsedMs=" + h.m(hVar2.f46719f0));
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
                h hVar3 = this.f46665b;
                k kVar3 = hVar3.f46751x;
                if (hVar3.S && !hVar3.Y && kVar3 != null && hVar3.f46749w == kVar3) {
                    hVar3.f46751x = null;
                    hVar3.t(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 4:
                this.f46665b.a();
                return;
            case 5:
                h hVar4 = this.f46665b;
                hVar4.S = false;
                hVar4.d();
                try {
                    k kVar4 = hVar4.f46749w;
                    if (kVar4 != null) {
                        long m10 = kVar4.m();
                        p pVar = hVar4.v;
                        if (pVar != null && m10 != Long.MAX_VALUE) {
                            pVar.f46832k = Math.max(0L, m10) * 1000;
                            Handler handler3 = pVar.f46839o;
                            if (handler3 != null) {
                                handler3.removeCallbacks(pVar.f46842p0);
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
                    k kVar5 = hVar4.f46749w;
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
                        hVar4.f46749w = null;
                        hVar4.Y = false;
                    }
                }
                if (runtimeException != null) {
                    hVar4.t(runtimeException);
                }
                p0 p0Var = (p0) hVar4.f46727k.f14466b;
                p0Var.f46859j.post(new f0(p0Var, 2));
                return;
            case 6:
                this.f46665b.r();
                return;
            default:
                this.f46665b.G();
                return;
        }
    }
}
