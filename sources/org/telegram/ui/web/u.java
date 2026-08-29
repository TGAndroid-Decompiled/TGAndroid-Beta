package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;
public final class u implements Runnable {
    public final int f44208a;
    public final z0 f44209b;

    public u(z0 z0Var, int i10) {
        this.f44208a = i10;
        this.f44209b = z0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f44208a) {
            case 0:
                f0 f0Var = this.f44209b.f44264c;
                if (f0Var != null) {
                    f0Var.b();
                }
                LaunchActivity.L();
                return;
            case 1:
                z0 z0Var = this.f44209b;
                ph.q0 q0Var = z0Var.f44271g0;
                q0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", q0Var.d());
                    if (q0Var.d()) {
                        jSONObject.put("access_requested", q0Var.d);
                        if (q0Var.d) {
                            if (q0Var.f46000e && q0Var.a()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            jSONObject.put("access_granted", z10);
                        }
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                z0Var.v("location_checked", jSONObject);
                return;
            case 2:
                z0 z0Var2 = this.f44209b;
                if (z0Var2.O) {
                    z0Var2.O = false;
                    f0 f0Var2 = z0Var2.f44264c;
                    if (f0Var2 != null) {
                        f0Var2.t(false);
                    }
                }
                z0Var2.c();
                z0Var2.J = false;
                z0Var2.L = 0L;
                z0Var2.P = false;
                w0 w0Var = z0Var2.f44260a;
                if (w0Var != null) {
                    w0Var.onResume();
                    z0Var2.f44260a.reload();
                    return;
                }
                return;
            default:
                z0 z0Var3 = this.f44209b;
                ph.p pVar = z0Var3.f44270f0;
                pVar.f45945f = true;
                pVar.k();
                z0Var3.t();
                return;
        }
    }
}
