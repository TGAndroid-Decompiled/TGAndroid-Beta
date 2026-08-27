package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;

public final class u implements Runnable {

    public final int f44004a;

    public final z0 f44005b;

    public u(z0 z0Var, int i10) {
        this.f44004a = i10;
        this.f44005b = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f44004a) {
            case 0:
                f0 f0Var = this.f44005b.f44061c;
                if (f0Var != null) {
                    f0Var.b();
                }
                LaunchActivity.L();
                break;
            case 1:
                z0 z0Var = this.f44005b;
                nh.t0 t0Var = z0Var.f44068g0;
                t0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", t0Var.d());
                    if (t0Var.d()) {
                        jSONObject.put("access_requested", t0Var.d);
                        if (t0Var.d) {
                            jSONObject.put("access_granted", t0Var.f18967e && t0Var.a());
                        }
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                z0Var.v("location_checked", jSONObject);
                break;
            case 2:
                z0 z0Var2 = this.f44005b;
                if (z0Var2.O) {
                    z0Var2.O = false;
                    f0 f0Var2 = z0Var2.f44061c;
                    if (f0Var2 != null) {
                        f0Var2.t(false);
                    }
                }
                z0Var2.c();
                z0Var2.J = false;
                z0Var2.L = 0L;
                z0Var2.P = false;
                w0 w0Var = z0Var2.f44057a;
                if (w0Var != null) {
                    w0Var.onResume();
                    z0Var2.f44057a.reload();
                }
                break;
            default:
                z0 z0Var3 = this.f44005b;
                nh.q qVar = z0Var3.f44067f0;
                qVar.f18891f = true;
                qVar.k();
                z0Var3.t();
                break;
        }
    }
}
