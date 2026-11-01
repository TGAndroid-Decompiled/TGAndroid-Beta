package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.f8;
import org.telegram.ui.LaunchActivity;
public final class q implements Runnable {
    public final int f42969a;
    public final z0 f42970b;

    public q(z0 z0Var, int i10) {
        this.f42969a = i10;
        this.f42970b = z0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f42969a) {
            case 0:
                d0 d0Var = this.f42970b.f43063c;
                if (d0Var != null) {
                    d0Var.b();
                }
                LaunchActivity.J();
                return;
            case 1:
                z0 z0Var = this.f42970b;
                if (z0Var.S) {
                    z0Var.S = false;
                    d0 d0Var2 = z0Var.f43063c;
                    if (d0Var2 != null) {
                        d0Var2.t(false);
                    }
                }
                z0Var.c();
                z0Var.N = false;
                z0Var.P = 0L;
                z0Var.T = false;
                v0 v0Var = z0Var.f43059a;
                if (v0Var != null) {
                    v0Var.onResume();
                    z0Var.f43059a.reload();
                    return;
                }
                return;
            default:
                z0 z0Var2 = this.f42970b;
                x0 x0Var = z0Var2.J0;
                xh.o0 o0Var = z0Var2.f43073k0;
                o0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", o0Var.d());
                    if (o0Var.d()) {
                        jSONObject.put("access_requested", o0Var.d);
                        if (o0Var.d) {
                            if (o0Var.e && o0Var.a()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            jSONObject.put("access_granted", z10);
                        }
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                }
                z0Var2.y(x0Var, "location_checked", jSONObject);
                return;
        }
    }
}
