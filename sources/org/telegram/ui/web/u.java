package org.telegram.ui.web;

import ci.y7;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;
public final class u implements Runnable {
    public final int f42742a;
    public final b1 f42743b;

    public u(b1 b1Var, int i10) {
        this.f42742a = i10;
        this.f42743b = b1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f42742a) {
            case 0:
                h0 h0Var = this.f42743b.f42523c;
                if (h0Var != null) {
                    h0Var.b();
                }
                LaunchActivity.L();
                return;
            case 1:
                b1 b1Var = this.f42743b;
                y7 y7Var = b1Var.I0;
                gi.u0 u0Var = b1Var.f42533k0;
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
                b1Var.x(y7Var, "location_checked", jSONObject);
                return;
            default:
                b1 b1Var2 = this.f42743b;
                if (b1Var2.S) {
                    b1Var2.S = false;
                    h0 h0Var2 = b1Var2.f42523c;
                    if (h0Var2 != null) {
                        h0Var2.t(false);
                    }
                }
                b1Var2.c();
                b1Var2.N = false;
                b1Var2.P = 0L;
                b1Var2.T = false;
                y0 y0Var = b1Var2.f42519a;
                if (y0Var != null) {
                    y0Var.onResume();
                    b1Var2.f42519a.reload();
                    return;
                }
                return;
        }
    }
}
