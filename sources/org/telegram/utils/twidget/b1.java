package org.telegram.utils.twidget;

import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.q71;
public final class b1 implements Runnable {
    public final int f52770a;
    public final i1 f52771b;

    public b1(i1 i1Var, int i7) {
        this.f52770a = i7;
        this.f52771b = i1Var;
    }

    @Override
    public final void run() {
        g1 g1Var;
        JSONObject jSONObject;
        v0 v0Var;
        q71 q71Var;
        i1 i1Var;
        k0 h;
        int i7;
        String str;
        dk0 dk0Var;
        b h12;
        switch (this.f52770a) {
            case 0:
                i1 i1Var2 = this.f52771b;
                synchronized (i1Var2.f52865s) {
                    g1Var = i1Var2.I;
                    i1Var2.I = null;
                    jSONObject = i1Var2.J;
                    i1Var2.J = null;
                    i1Var2.K = false;
                }
                if (i1Var2.f52868w) {
                    if (g1Var != null) {
                        g1Var.f52804a.b();
                        return;
                    }
                    return;
                }
                if (g1Var != null && (i7 = i1Var2.G) != 0 && Math.abs(g1Var.d - i7) > 1) {
                    g1Var.f52804a.b();
                    i1Var2.E = false;
                    g1Var = null;
                }
                if (g1Var != null) {
                    i1Var2.H = g1Var;
                    i1Var2.E = false;
                    v0 v0Var2 = i1Var2.L;
                    if (v0Var2 != null) {
                        v0Var2.h(i1Var2);
                    }
                }
                if (jSONObject != null && (v0Var = i1Var2.L) != null) {
                    if (v0Var.f52994e != null) {
                        String optString = jSONObject.optString("dead");
                        if (!TextUtils.isEmpty(optString) && (h = n0.h(v0Var)) != null) {
                            int i10 = h.C;
                            int i11 = v0Var.f53005q;
                            if (i10 != i11) {
                                h.C = i11;
                                h.B++;
                                h.D = true;
                                a8.b("widget " + v0Var.f52991a + " stopped (" + h.B + "): " + optString);
                                n0.a(h);
                                n0.b();
                            }
                        }
                    }
                    if (jSONObject.optBoolean("loaded") && v0Var.f52996g != null && (i1Var = v0Var.f52995f) != null) {
                        v0Var.h(i1Var);
                        return;
                    } else if (v0Var.f() && (q71Var = v0Var.h) != null) {
                        p71 p71Var = q71Var.f37211a;
                        p71Var.j();
                        p71Var.h();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                i1 i1Var3 = this.f52771b;
                if (!i1Var3.f52868w && i1Var3.v != 0) {
                    i1Var3.v = 0L;
                    boolean z9 = false;
                    i1Var3.f52861o.set(false);
                    i1Var3.N = "Widget engine stopped";
                    v0 v0Var3 = i1Var3.L;
                    if (v0Var3 != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (elapsedRealtime - v0Var3.C > 60000) {
                            v0Var3.C = elapsedRealtime;
                            v0Var3.B = 0;
                        }
                        if (v0Var3.f53003o) {
                            int i12 = v0Var3.B;
                            v0Var3.B = i12 + 1;
                            if (i12 < 2) {
                                z9 = true;
                            }
                        }
                        v0Var3.p();
                        if (v0Var3.f52994e != null) {
                            k0 h7 = n0.h(v0Var3);
                            StringBuilder sb2 = new StringBuilder("widget ");
                            sb2.append(v0Var3.f52991a);
                            sb2.append(": engine process died");
                            if (z9) {
                                str = ", restarting";
                            } else {
                                str = "";
                            }
                            org.telegram.ui.Cells.f1.u(str, sb2);
                            if (z9 && h7 != null && (dk0Var = h7.f52897w) != null && dk0Var.f33089e0 && dk0Var.X != null) {
                                dk0Var.s0();
                                dk0Var.r0();
                            }
                        } else if (z9) {
                            v0Var3.a();
                        }
                        if (!z9) {
                            v0Var3.g("Widget engine stopped");
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                this.f52771b.d();
                return;
            case 3:
                i1 i1Var4 = this.f52771b;
                i1Var4.f52864r.set(true);
                i1Var4.d();
                return;
            default:
                i1 i1Var5 = this.f52771b;
                long j3 = i1Var5.v;
                long nanoTime = System.nanoTime();
                long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.f22564r));
                if (!i1Var5.f52868w && j3 != 0 && i1Var5.F && i1Var5.f52862p.get() && nanoTime - i1Var5.S >= (max * 9) / 10 && i1Var5.f52861o.compareAndSet(false, true)) {
                    i1Var5.f52862p.set(false);
                    i1Var5.S = nanoTime;
                    r0 r0Var = i1Var5.f52851c;
                    float f10 = ((float) (nanoTime - i1Var5.f52859m)) / 1000000.0f;
                    o0 o0Var = (o0) r0Var.f52972e.get(Long.valueOf(j3));
                    if (o0Var == null) {
                        h12 = null;
                    } else {
                        h12 = o0Var.h1();
                    }
                    b bVar = h12;
                    if (bVar != null) {
                        try {
                            bVar.s(o0Var.d, f10, true, false, false);
                            return;
                        } catch (RemoteException unused) {
                            return;
                        }
                    }
                    return;
                }
                i1Var5.d();
                return;
        }
    }
}
