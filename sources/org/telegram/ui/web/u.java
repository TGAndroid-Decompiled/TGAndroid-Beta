package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;
public final class u implements Runnable {
    public final int f42696a;
    public final a1 f42697b;

    public u(a1 a1Var, int i10) {
        this.f42696a = i10;
        this.f42697b = a1Var;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f42696a) {
            case 0:
                f0 f0Var = this.f42697b.f42433c;
                if (f0Var != null) {
                    f0Var.b();
                }
                LaunchActivity.L();
                return;
            case 1:
                a1 a1Var = this.f42697b;
                sh.q0 q0Var = a1Var.f42441h0;
                q0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", q0Var.d());
                    if (q0Var.d()) {
                        jSONObject.put("access_requested", q0Var.d);
                        if (q0Var.d) {
                            if (q0Var.f47661e && q0Var.a()) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            jSONObject.put("access_granted", z4);
                        }
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                a1Var.v("location_checked", jSONObject);
                return;
            case 2:
                a1 a1Var2 = this.f42697b;
                if (a1Var2.P) {
                    a1Var2.P = false;
                    f0 f0Var2 = a1Var2.f42433c;
                    if (f0Var2 != null) {
                        f0Var2.t(false);
                    }
                }
                a1Var2.c();
                a1Var2.K = false;
                a1Var2.M = 0L;
                a1Var2.Q = false;
                x0 x0Var = a1Var2.f42429a;
                if (x0Var != null) {
                    x0Var.onResume();
                    a1Var2.f42429a.reload();
                    return;
                }
                return;
            default:
                a1 a1Var3 = this.f42697b;
                sh.p pVar = a1Var3.f42440g0;
                pVar.f47606f = true;
                pVar.k();
                a1Var3.t();
                return;
        }
    }
}
