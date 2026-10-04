package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;
public final class s implements Runnable {
    public final int f42332a;
    public final c1 f42333b;

    public s(c1 c1Var, int i10) {
        this.f42332a = i10;
        this.f42333b = c1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f42332a) {
            case 0:
                h0 h0Var = this.f42333b.f42123c;
                if (h0Var != null) {
                    h0Var.b();
                }
                LaunchActivity.L();
                return;
            case 1:
                c1 c1Var = this.f42333b;
                da daVar = c1Var.I0;
                ei.x0 x0Var = c1Var.f42134k0;
                x0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", x0Var.d());
                    if (x0Var.d()) {
                        jSONObject.put("access_requested", x0Var.d);
                        if (x0Var.d) {
                            if (x0Var.f9451e && x0Var.a()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            jSONObject.put("access_granted", z10);
                        }
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                c1Var.y(daVar, "location_checked", jSONObject);
                return;
            default:
                c1 c1Var2 = this.f42333b;
                if (c1Var2.S) {
                    c1Var2.S = false;
                    h0 h0Var2 = c1Var2.f42123c;
                    if (h0Var2 != null) {
                        h0Var2.t(false);
                    }
                }
                c1Var2.c();
                c1Var2.N = false;
                c1Var2.P = 0L;
                c1Var2.T = false;
                z0 z0Var = c1Var2.f42119a;
                if (z0Var != null) {
                    z0Var.onResume();
                    c1Var2.f42119a.reload();
                    return;
                }
                return;
        }
    }
}
