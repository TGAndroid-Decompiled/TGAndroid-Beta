package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;
public final class t implements Runnable {
    public final int f39090a;
    public final d1 f39091b;

    public t(d1 d1Var, int i10) {
        this.f39090a = i10;
        this.f39091b = d1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f39090a) {
            case 0:
                h0 h0Var = this.f39091b.f38903c;
                if (h0Var != null) {
                    h0Var.b();
                }
                LaunchActivity.L();
                return;
            case 1:
                d1 d1Var = this.f39091b;
                da daVar = d1Var.I0;
                ei.w0 w0Var = d1Var.f38913k0;
                w0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", w0Var.d());
                    if (w0Var.d()) {
                        jSONObject.put("access_requested", w0Var.d);
                        if (w0Var.d) {
                            if (w0Var.e && w0Var.a()) {
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
                d1Var.y(daVar, "location_checked", jSONObject);
                return;
            default:
                d1 d1Var2 = this.f39091b;
                if (d1Var2.S) {
                    d1Var2.S = false;
                    h0 h0Var2 = d1Var2.f38903c;
                    if (h0Var2 != null) {
                        h0Var2.t(false);
                    }
                }
                d1Var2.c();
                d1Var2.N = false;
                d1Var2.P = 0L;
                d1Var2.T = false;
                z0 z0Var = d1Var2.f38899a;
                if (z0Var != null) {
                    z0Var.onResume();
                    d1Var2.f38899a.reload();
                    return;
                }
                return;
        }
    }
}
