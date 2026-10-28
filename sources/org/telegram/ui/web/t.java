package org.telegram.ui.web;

import di.x7;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;
public final class t implements Runnable {
    public final int f44888a;
    public final a1 f44889b;

    public t(a1 a1Var, int i10) {
        this.f44888a = i10;
        this.f44889b = a1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f44888a) {
            case 0:
                g0 g0Var = this.f44889b.f44669c;
                if (g0Var != null) {
                    g0Var.b();
                }
                LaunchActivity.L();
                return;
            case 1:
                a1 a1Var = this.f44889b;
                x7 x7Var = a1Var.J0;
                hi.b1 b1Var = a1Var.f44679k0;
                b1Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", b1Var.d());
                    if (b1Var.d()) {
                        jSONObject.put("access_requested", b1Var.d);
                        if (b1Var.d) {
                            if (b1Var.e && b1Var.a()) {
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
                a1Var.x(x7Var, "location_checked", jSONObject);
                return;
            default:
                a1 a1Var2 = this.f44889b;
                if (a1Var2.S) {
                    a1Var2.S = false;
                    g0 g0Var2 = a1Var2.f44669c;
                    if (g0Var2 != null) {
                        g0Var2.t(false);
                    }
                }
                a1Var2.c();
                a1Var2.N = false;
                a1Var2.P = 0L;
                a1Var2.T = false;
                x0 x0Var = a1Var2.f44665a;
                if (x0Var != null) {
                    x0Var.onResume();
                    a1Var2.f44665a.reload();
                    return;
                }
                return;
        }
    }
}
