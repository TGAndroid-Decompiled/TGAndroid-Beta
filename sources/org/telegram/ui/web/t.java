package org.telegram.ui.web;

import ci.z7;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;
public final class t implements Runnable {
    public final int f42781a;
    public final a1 f42782b;

    public t(a1 a1Var, int i10) {
        this.f42781a = i10;
        this.f42782b = a1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f42781a) {
            case 0:
                g0 g0Var = this.f42782b.f42565c;
                if (g0Var != null) {
                    g0Var.b();
                }
                LaunchActivity.L();
                return;
            case 1:
                a1 a1Var = this.f42782b;
                z7 z7Var = a1Var.I0;
                gi.u0 u0Var = a1Var.f42575k0;
                u0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", u0Var.d());
                    if (u0Var.d()) {
                        jSONObject.put("access_requested", u0Var.d);
                        if (u0Var.d) {
                            if (u0Var.e && u0Var.a()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            jSONObject.put("access_granted", z10);
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                a1Var.x(z7Var, "location_checked", jSONObject);
                return;
            default:
                a1 a1Var2 = this.f42782b;
                if (a1Var2.S) {
                    a1Var2.S = false;
                    g0 g0Var2 = a1Var2.f42565c;
                    if (g0Var2 != null) {
                        g0Var2.t(false);
                    }
                }
                a1Var2.c();
                a1Var2.N = false;
                a1Var2.P = 0L;
                a1Var2.T = false;
                x0 x0Var = a1Var2.f42561a;
                if (x0Var != null) {
                    x0Var.onResume();
                    a1Var2.f42561a.reload();
                    return;
                }
                return;
        }
    }
}
