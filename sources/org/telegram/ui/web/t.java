package org.telegram.ui.web;

import ci.y7;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;
public final class t implements Runnable {
    public final int f43253a;
    public final b1 f43254b;

    public t(b1 b1Var, int i10) {
        this.f43253a = i10;
        this.f43254b = b1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f43253a) {
            case 0:
                h0 h0Var = this.f43254b.f43047c;
                if (h0Var != null) {
                    h0Var.b();
                }
                LaunchActivity.L();
                return;
            case 1:
                b1 b1Var = this.f43254b;
                y7 y7Var = b1Var.J0;
                gi.u0 u0Var = b1Var.f43057k0;
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
                b1 b1Var2 = this.f43254b;
                if (b1Var2.S) {
                    b1Var2.S = false;
                    h0 h0Var2 = b1Var2.f43047c;
                    if (h0Var2 != null) {
                        h0Var2.t(false);
                    }
                }
                b1Var2.c();
                b1Var2.N = false;
                b1Var2.P = 0L;
                b1Var2.T = false;
                y0 y0Var = b1Var2.f43043a;
                if (y0Var != null) {
                    y0Var.onResume();
                    b1Var2.f43043a.reload();
                    return;
                }
                return;
        }
    }
}
