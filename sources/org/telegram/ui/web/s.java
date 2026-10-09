package org.telegram.ui.web;

import ai.ea;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;
public final class s implements Runnable {
    public final int f43450a;
    public final b1 f43451b;

    public s(b1 b1Var, int i10) {
        this.f43450a = i10;
        this.f43451b = b1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f43450a) {
            case 0:
                g0 g0Var = this.f43451b.f43239c;
                if (g0Var != null) {
                    g0Var.b();
                }
                LaunchActivity.L();
                return;
            case 1:
                b1 b1Var = this.f43451b;
                ea eaVar = b1Var.I0;
                ei.w0 w0Var = b1Var.f43250k0;
                w0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", w0Var.d());
                    if (w0Var.d()) {
                        jSONObject.put("access_requested", w0Var.d);
                        if (w0Var.d) {
                            if (w0Var.f9455e && w0Var.a()) {
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
                b1Var.x(eaVar, "location_checked", jSONObject);
                return;
            default:
                b1 b1Var2 = this.f43451b;
                if (b1Var2.S) {
                    b1Var2.S = false;
                    g0 g0Var2 = b1Var2.f43239c;
                    if (g0Var2 != null) {
                        g0Var2.t(false);
                    }
                }
                b1Var2.c();
                b1Var2.N = false;
                b1Var2.P = 0L;
                b1Var2.T = false;
                y0 y0Var = b1Var2.f43235a;
                if (y0Var != null) {
                    y0Var.onResume();
                    b1Var2.f43235a.reload();
                    return;
                }
                return;
        }
    }
}
