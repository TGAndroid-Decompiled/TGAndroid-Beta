package org.telegram.ui.web;

import fi.f7;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.ui.LaunchActivity;
public final class q implements Runnable {
    public final int f53235a;
    public final v0 f53236b;

    public q(v0 v0Var, int i7) {
        this.f53235a = i7;
        this.f53236b = v0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f53235a) {
            case 0:
                c0 c0Var = this.f53236b.f53298c;
                if (c0Var != null) {
                    c0Var.b();
                }
                LaunchActivity.J();
                return;
            case 1:
                v0 v0Var = this.f53236b;
                if (v0Var.T) {
                    v0Var.T = false;
                    c0 c0Var2 = v0Var.f53298c;
                    if (c0Var2 != null) {
                        c0Var2.t(false);
                    }
                }
                v0Var.c();
                v0Var.O = false;
                v0Var.Q = 0L;
                v0Var.U = false;
                s0 s0Var = v0Var.f53294a;
                if (s0Var != null) {
                    s0Var.onResume();
                    v0Var.f53294a.reload();
                    return;
                }
                return;
            default:
                v0 v0Var2 = this.f53236b;
                f7 f7Var = v0Var2.K0;
                ki.s0 s0Var2 = v0Var2.f53310l0;
                s0Var2.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", s0Var2.d());
                    if (s0Var2.d()) {
                        jSONObject.put("access_requested", s0Var2.d);
                        if (s0Var2.d) {
                            if (s0Var2.f18879e && s0Var2.a()) {
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
