package org.telegram.ui.web;

import di.p7;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.ui.LaunchActivity;
public final class p implements Runnable {
    public final int f51201a;
    public final x0 f51202b;

    public p(x0 x0Var, int i7) {
        this.f51201a = i7;
        this.f51202b = x0Var;
    }

    @Override
    public final void run() {
        boolean z9;
        switch (this.f51201a) {
            case 0:
                d0 d0Var = this.f51202b.f51299c;
                if (d0Var != null) {
                    d0Var.b();
                }
                LaunchActivity.J();
                return;
            case 1:
                x0 x0Var = this.f51202b;
                if (x0Var.S) {
                    x0Var.S = false;
                    d0 d0Var2 = x0Var.f51299c;
                    if (d0Var2 != null) {
                        d0Var2.t(false);
                    }
                }
                x0Var.c();
                x0Var.N = false;
                x0Var.P = 0L;
                x0Var.T = false;
                u0 u0Var = x0Var.f51295a;
                if (u0Var != null) {
                    u0Var.onResume();
                    x0Var.f51295a.reload();
                    return;
                }
                return;
            default:
                x0 x0Var2 = this.f51202b;
                p7 p7Var = x0Var2.J0;
                hi.r0 r0Var = x0Var2.f51310k0;
                r0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", r0Var.d());
                    if (r0Var.d()) {
                        jSONObject.put("access_requested", r0Var.d);
                        if (r0Var.d) {
                            if (r0Var.f14925e && r0Var.a()) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            jSONObject.put("access_granted", z9);
                        }
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                x0Var2.x(p7Var, "location_checked", jSONObject);
                return;
        }
    }
}
