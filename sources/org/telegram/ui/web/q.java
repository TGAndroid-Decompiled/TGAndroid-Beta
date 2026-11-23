package org.telegram.ui.web;

import fi.f7;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.ui.LaunchActivity;
public final class q implements Runnable {
    public final int f53246a;
    public final v0 f53247b;

    public q(v0 v0Var, int i7) {
        this.f53246a = i7;
        this.f53247b = v0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f53246a) {
            case 0:
                c0 c0Var = this.f53247b.f53309c;
                if (c0Var != null) {
                    c0Var.b();
                }
                LaunchActivity.J();
                return;
            case 1:
                v0 v0Var = this.f53247b;
                if (v0Var.T) {
                    v0Var.T = false;
                    c0 c0Var2 = v0Var.f53309c;
                    if (c0Var2 != null) {
                        c0Var2.t(false);
                    }
                }
                v0Var.c();
                v0Var.O = false;
                v0Var.Q = 0L;
                v0Var.U = false;
                s0 s0Var = v0Var.f53305a;
                if (s0Var != null) {
                    s0Var.onResume();
                    v0Var.f53305a.reload();
                    return;
                }
                return;
            default:
                v0 v0Var2 = this.f53247b;
                f7 f7Var = v0Var2.K0;
                ki.r0 r0Var = v0Var2.f53321l0;
                r0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", r0Var.d());
                    if (r0Var.d()) {
                        jSONObject.put("access_requested", r0Var.d);
                        if (r0Var.d) {
                            if (r0Var.f18858e && r0Var.a()) {
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
                v0Var2.x(f7Var, "location_checked", jSONObject);
                return;
        }
    }
}
