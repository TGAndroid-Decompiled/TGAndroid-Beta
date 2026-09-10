package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;
public final class t implements Runnable {
    public final int f38079a;
    public final c1 f38080b;

    public t(c1 c1Var, int i10) {
        this.f38079a = i10;
        this.f38080b = c1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f38079a) {
            case 0:
                h0 h0Var = this.f38080b.f37880c;
                if (h0Var != null) {
                    h0Var.b();
                }
                LaunchActivity.L();
                return;
            case 1:
                c1 c1Var = this.f38080b;
                a1 a1Var = c1Var.I0;
                di.z0 z0Var = c1Var.f37890k0;
                z0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", z0Var.d());
                    if (z0Var.d()) {
                        jSONObject.put("access_requested", z0Var.d);
                        if (z0Var.d) {
                            if (z0Var.e && z0Var.a()) {
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
                c1Var.z(a1Var, "location_checked", jSONObject);
                return;
            default:
                c1 c1Var2 = this.f38080b;
                if (c1Var2.S) {
                    c1Var2.S = false;
                    h0 h0Var2 = c1Var2.f37880c;
                    if (h0Var2 != null) {
                        h0Var2.t(false);
                    }
                }
                c1Var2.c();
                c1Var2.N = false;
                c1Var2.P = 0L;
                c1Var2.T = false;
                y0 y0Var = c1Var2.f37876a;
                if (y0Var != null) {
                    y0Var.onResume();
                    c1Var2.f37876a.reload();
                    return;
                }
                return;
        }
    }
}
