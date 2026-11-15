package org.telegram.utils.twidget;

import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.q71;
public final class e1 implements Runnable {
    public final int f54207a;
    public final l1 f54208b;

    public e1(l1 l1Var, int i7) {
        this.f54207a = i7;
        this.f54208b = l1Var;
    }

    @Override
    public final void run() {
        j1 j1Var;
        JSONObject jSONObject;
        y0 y0Var;
        q71 q71Var;
        l1 l1Var;
        k0 h;
        int i7;
        String str;
        hk0 hk0Var;
        b h12;
        switch (this.f54207a) {
            case 0:
                l1 l1Var2 = this.f54208b;
                synchronized (l1Var2.f54315s) {
                    j1Var = l1Var2.I;
                    l1Var2.I = null;
                    jSONObject = l1Var2.J;
                    l1Var2.J = null;
                    l1Var2.K = false;
                }
                if (l1Var2.f54318w) {
                    if (j1Var != null) {
                        j1Var.f54259a.b();
                        return;
                    }
                    return;
                }
                if (j1Var != null && (i7 = l1Var2.G) != 0 && Math.abs(j1Var.d - i7) > 1) {
                    j1Var.f54259a.b();
                    l1Var2.E = false;
                    j1Var = null;
                }
                if (j1Var != null) {
                    l1Var2.H = j1Var;
                    l1Var2.E = false;
                    y0 y0Var2 = l1Var2.L;
                    if (y0Var2 != null) {
                        y0Var2.h(l1Var2);
                    }
                }
                if (jSONObject != null && (y0Var = l1Var2.L) != null) {
                    if (y0Var.f54426e != null) {
                        String optString = jSONObject.optString("dead");
                        if (!TextUtils.isEmpty(optString) && (h = n0.h(y0Var)) != null) {
                            int i10 = h.C;
                            int i11 = y0Var.f54437q;
                            if (i10 != i11) {
                                h.C = i11;
                                h.B++;
                                h.D = true;
                                a8.b("widget " + y0Var.f54423a + " stopped (" + h.B + "): " + optString);
                                n0.a(h);
                                n0.b();
                            }
                        }
                    }
                    if (jSONObject.optBoolean("loaded") && y0Var.f54428g != null && (l1Var = y0Var.f54427f) != null) {
                        y0Var.h(l1Var);
                        return;
                    } else if (y0Var.f() && (q71Var = y0Var.h) != null) {
                        p71 p71Var = q71Var.f38537a;
                        p71Var.j();
                        p71Var.h();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                l1 l1Var3 = this.f54208b;
                if (!l1Var3.f54318w && l1Var3.v != 0) {
                    l1Var3.v = 0L;
                    boolean z10 = false;
                    l1Var3.f54311o.set(false);
                    l1Var3.N = "Widget engine stopped";
                    y0 y0Var3 = l1Var3.L;
                    if (y0Var3 != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (elapsedRealtime - y0Var3.C > 60000) {
                            y0Var3.C = elapsedRealtime;
                            y0Var3.B = 0;
                        }
                        if (y0Var3.f54435o) {
                            int i12 = y0Var3.B;
                            y0Var3.B = i12 + 1;
                            if (i12 < 2) {
                                z10 = true;
                            }
                        }
                        y0Var3.p();
                        if (y0Var3.f54426e != null) {
                            k0 h7 = n0.h(y0Var3);
                            StringBuilder sb2 = new StringBuilder("widget ");
                            sb2.append(y0Var3.f54423a);
                            sb2.append(": engine process died");
                            if (z10) {
                                str = ", restarting";
                            } else {
                                str = "";
                            }
                            org.telegram.ui.Cells.y0.t(str, sb2);
                            if (z10 && h7 != null && (hk0Var = h7.f54285w) != null && hk0Var.f35280f0 && hk0Var.Y != null) {
                                hk0Var.s0();
                                hk0Var.r0();
                            }
                        } else if (z10) {
                            y0Var3.a();
                        }
                        if (!z10) {
                            y0Var3.g("Widget engine stopped");
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                this.f54208b.d();
                return;
            case 3:
                l1 l1Var4 = this.f54208b;
                l1Var4.f54314r.set(true);
                l1Var4.d();
                return;
            default:
                l1 l1Var5 = this.f54208b;
                long j3 = l1Var5.v;
                long nanoTime = System.nanoTime();
                long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.f23610r));
                if (!l1Var5.f54318w && j3 != 0 && l1Var5.F && l1Var5.f54312p.get() && nanoTime - l1Var5.S >= (max * 9) / 10 && l1Var5.f54311o.compareAndSet(false, true)) {
                    l1Var5.f54312p.set(false);
                    l1Var5.S = nanoTime;
                    u0 u0Var = l1Var5.f54301c;
                    float f10 = ((float) (nanoTime - l1Var5.f54309m)) / 1000000.0f;
                    r0 r0Var = (r0) u0Var.f54414e.get(Long.valueOf(j3));
                    if (r0Var == null) {
                        h12 = null;
                    } else {
                        h12 = r0Var.h1();
                    }
                    b bVar = h12;
                    if (bVar != null) {
                        try {
                            bVar.s(r0Var.d, f10, true, false, false);
                            return;
                        } catch (RemoteException unused) {
                            return;
                        }
                    }
                    return;
                }
                l1Var5.d();
                return;
        }
    }
}
