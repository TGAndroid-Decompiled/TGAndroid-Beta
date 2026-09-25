package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;
public final class s implements Runnable {
    public final int f39197a;
    public final b1 f39198b;

    public s(b1 b1Var, int i10) {
        this.f39197a = i10;
        this.f39198b = b1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f39197a) {
            case 0:
                g0 g0Var = this.f39198b.f39002c;
                if (g0Var != null) {
                    g0Var.b();
                }
                LaunchActivity.L();
                return;
            case 1:
                b1 b1Var = this.f39198b;
                da daVar = b1Var.I0;
                ei.w0 w0Var = b1Var.f39012k0;
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
                b1Var.y(daVar, "location_checked", jSONObject);
                return;
            default:
                b1 b1Var2 = this.f39198b;
                if (b1Var2.S) {
                    b1Var2.S = false;
                    g0 g0Var2 = b1Var2.f39002c;
                    if (g0Var2 != null) {
                        g0Var2.t(false);
                    }
                }
                b1Var2.c();
                b1Var2.N = false;
                b1Var2.P = 0L;
                b1Var2.T = false;
                y0 y0Var = b1Var2.f38998a;
                if (y0Var != null) {
                    y0Var.onResume();
                    b1Var2.f38998a.reload();
                    return;
                }
                return;
        }
    }
}
