package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;
public final class s implements Runnable {
    public final int f39152a;
    public final c1 f39153b;

    public s(c1 c1Var, int i10) {
        this.f39152a = i10;
        this.f39153b = c1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f39152a) {
            case 0:
                h0 h0Var = this.f39153b.f38962c;
                if (h0Var != null) {
                    h0Var.b();
                }
                LaunchActivity.L();
                return;
            case 1:
                c1 c1Var = this.f39153b;
                da daVar = c1Var.I0;
                ei.w0 w0Var = c1Var.f38972k0;
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
                c1Var.y(daVar, "location_checked", jSONObject);
                return;
            default:
                c1 c1Var2 = this.f39153b;
                if (c1Var2.S) {
                    c1Var2.S = false;
                    h0 h0Var2 = c1Var2.f38962c;
                    if (h0Var2 != null) {
                        h0Var2.t(false);
                    }
                }
                c1Var2.c();
                c1Var2.N = false;
                c1Var2.P = 0L;
                c1Var2.T = false;
                z0 z0Var = c1Var2.f38958a;
                if (z0Var != null) {
                    z0Var.onResume();
                    c1Var2.f38958a.reload();
                    return;
                }
                return;
        }
    }
}
