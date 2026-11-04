package org.telegram.ui.web;

import ei.p7;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.ui.LaunchActivity;
public final class r implements Runnable {
    public final int f50997a;
    public final w0 f50998b;

    public r(w0 w0Var, int i3) {
        this.f50997a = i3;
        this.f50998b = w0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f50997a) {
            case 0:
                d0 d0Var = this.f50998b.f51064c;
                if (d0Var != null) {
                    d0Var.b();
                }
                LaunchActivity.J();
                return;
            case 1:
                w0 w0Var = this.f50998b;
                if (w0Var.T) {
                    w0Var.T = false;
                    d0 d0Var2 = w0Var.f51064c;
                    if (d0Var2 != null) {
                        d0Var2.t(false);
                    }
                }
                w0Var.c();
                w0Var.O = false;
                w0Var.Q = 0L;
                w0Var.U = false;
                t0 t0Var = w0Var.f51060a;
                if (t0Var != null) {
                    t0Var.onResume();
                    w0Var.f51060a.reload();
                    return;
                }
                return;
            default:
                w0 w0Var2 = this.f50998b;
                p7 p7Var = w0Var2.K0;
                ii.s0 s0Var = w0Var2.f51076l0;
                s0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", s0Var.d());
                    if (s0Var.d()) {
                        jSONObject.put("access_requested", s0Var.d);
                        if (s0Var.d) {
                            if (s0Var.f15214e && s0Var.a()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            jSONObject.put("access_granted", z10);
                        }
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                w0Var2.x(p7Var, "location_checked", jSONObject);
                return;
        }
    }
}
