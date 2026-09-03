package org.telegram.ui.web;

import nh.j7;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;
public final class t implements Runnable {
    public final int f39578a;
    public final c1 f39579b;

    public t(c1 c1Var, int i10) {
        this.f39578a = i10;
        this.f39579b = c1Var;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f39578a) {
            case 0:
                g0 g0Var = this.f39579b.f39385c;
                if (g0Var != null) {
                    g0Var.b();
                }
                LaunchActivity.L();
                return;
            case 1:
                c1 c1Var = this.f39579b;
                j7 j7Var = c1Var.F0;
                rh.q0 q0Var = c1Var.f39392h0;
                q0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", q0Var.d());
                    if (q0Var.d()) {
                        jSONObject.put("access_requested", q0Var.d);
                        if (q0Var.d) {
                            if (q0Var.e && q0Var.a()) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            jSONObject.put("access_granted", z4);
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                c1Var.z(j7Var, "location_checked", jSONObject);
                return;
            default:
                c1 c1Var2 = this.f39579b;
                if (c1Var2.P) {
                    c1Var2.P = false;
                    g0 g0Var2 = c1Var2.f39385c;
                    if (g0Var2 != null) {
                        g0Var2.t(false);
                    }
                }
                c1Var2.c();
                c1Var2.K = false;
                c1Var2.M = 0L;
                c1Var2.Q = false;
                y0 y0Var = c1Var2.f39381a;
                if (y0Var != null) {
                    y0Var.onResume();
                    c1Var2.f39381a.reload();
                    return;
                }
                return;
        }
    }
}
