package org.telegram.utils.twidget;

import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.p71;
public final class b1 implements Runnable {
    public final int f52756a;
    public final h1 f52757b;

    public b1(h1 h1Var, int i7) {
        this.f52756a = i7;
        this.f52757b = h1Var;
    }

    @Override
    public final void run() {
        f1 f1Var;
        JSONObject jSONObject;
        v0 v0Var;
        p71 p71Var;
        h1 h1Var;
        k0 h;
        int i7;
        String str;
        ck0 ck0Var;
        b h12;
        switch (this.f52756a) {
            case 0:
                h1 h1Var2 = this.f52757b;
                synchronized (h1Var2.f52841s) {
                    f1Var = h1Var2.I;
                    h1Var2.I = null;
                    jSONObject = h1Var2.J;
                    h1Var2.J = null;
                    h1Var2.K = false;
                }
                if (h1Var2.f52844w) {
                    if (f1Var != null) {
                        f1Var.f52786a.b();
                        return;
                    }
                    return;
                }
                if (f1Var != null && (i7 = h1Var2.G) != 0 && Math.abs(f1Var.d - i7) > 1) {
                    f1Var.f52786a.b();
                    h1Var2.E = false;
                    f1Var = null;
                }
                if (f1Var != null) {
                    h1Var2.H = f1Var;
                    h1Var2.E = false;
                    v0 v0Var2 = h1Var2.L;
                    if (v0Var2 != null) {
                        v0Var2.h(h1Var2);
                    }
                }
                if (jSONObject != null && (v0Var = h1Var2.L) != null) {
                    if (v0Var.f52979e != null) {
                        String optString = jSONObject.optString("dead");
                        if (!TextUtils.isEmpty(optString) && (h = n0.h(v0Var)) != null) {
                            int i10 = h.C;
                            int i11 = v0Var.f52990q;
                            if (i10 != i11) {
                                h.C = i11;
                                h.B++;
                                h.D = true;
                                a8.b("widget " + v0Var.f52976a + " stopped (" + h.B + "): " + optString);
                                n0.a(h);
                                n0.b();
                            }
                        }
                    }
                    if (jSONObject.optBoolean("loaded") && v0Var.f52981g != null && (h1Var = v0Var.f52980f) != null) {
                        v0Var.h(h1Var);
                        return;
                    } else if (v0Var.f() && (p71Var = v0Var.h) != null) {
                        o71 o71Var = p71Var.f36814a;
                        o71Var.j();
                        o71Var.h();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                h1 h1Var3 = this.f52757b;
                if (!h1Var3.f52844w && h1Var3.v != 0) {
                    h1Var3.v = 0L;
                    boolean z9 = false;
                    h1Var3.f52837o.set(false);
                    h1Var3.N = "Widget engine stopped";
                    v0 v0Var3 = h1Var3.L;
                    if (v0Var3 != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (elapsedRealtime - v0Var3.C > 60000) {
                            v0Var3.C = elapsedRealtime;
                            v0Var3.B = 0;
                        }
                        if (v0Var3.f52988o) {
                            int i12 = v0Var3.B;
                            v0Var3.B = i12 + 1;
                            if (i12 < 2) {
                                z9 = true;
                            }
                        }
                        v0Var3.p();
                        if (v0Var3.f52979e != null) {
                            k0 h7 = n0.h(v0Var3);
                            StringBuilder sb2 = new StringBuilder("widget ");
                            sb2.append(v0Var3.f52976a);
                            sb2.append(": engine process died");
                            if (z9) {
                                str = ", restarting";
                            } else {
                                str = "";
                            }
                            org.telegram.ui.Cells.f1.u(str, sb2);
                            if (z9 && h7 != null && (ck0Var = h7.f52886w) != null && ck0Var.f32614e0 && ck0Var.X != null) {
                                ck0Var.s0();
                                ck0Var.r0();
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
                this.f52757b.c();
                return;
            case 3:
                h1 h1Var4 = this.f52757b;
                h1Var4.f52840r.set(true);
                h1Var4.c();
                return;
            default:
                h1 h1Var5 = this.f52757b;
                long j3 = h1Var5.v;
                long nanoTime = System.nanoTime();
                long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.f22564r));
                if (!h1Var5.f52844w && j3 != 0 && h1Var5.F && h1Var5.f52838p.get() && nanoTime - h1Var5.S >= (max * 9) / 10 && h1Var5.f52837o.compareAndSet(false, true)) {
                    h1Var5.f52838p.set(false);
                    h1Var5.S = nanoTime;
                    r0 r0Var = h1Var5.f52827c;
                    float f10 = ((float) (nanoTime - h1Var5.f52835m)) / 1000000.0f;
                    o0 o0Var = (o0) r0Var.f52957e.get(Long.valueOf(j3));
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
                h1Var5.c();
                return;
        }
    }
}
