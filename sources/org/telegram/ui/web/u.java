package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;
public final class u implements Runnable {
    public final int f39668a;
    public final a1 f39669b;

    public u(a1 a1Var, int i10) {
        this.f39668a = i10;
        this.f39669b = a1Var;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f39668a) {
            case 0:
                e0 e0Var = this.f39669b.f39424c;
                if (e0Var != null) {
                    e0Var.b();
                }
                LaunchActivity.L();
                return;
            case 1:
                a1 a1Var = this.f39669b;
                rh.r0 r0Var = a1Var.f39431h0;
                r0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", r0Var.d());
                    if (r0Var.d()) {
                        jSONObject.put("access_requested", r0Var.d);
                        if (r0Var.d) {
                            if (r0Var.e && r0Var.a()) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            jSONObject.put("access_granted", z4);
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                a1Var.v("location_checked", jSONObject);
                return;
            case 2:
                a1 a1Var2 = this.f39669b;
                if (a1Var2.P) {
                    a1Var2.P = false;
                    e0 e0Var2 = a1Var2.f39424c;
                    if (e0Var2 != null) {
                        e0Var2.t(false);
                    }
                }
                a1Var2.c();
                a1Var2.K = false;
                a1Var2.M = 0L;
                a1Var2.Q = false;
                w0 w0Var = a1Var2.f39420a;
                if (w0Var != null) {
                    w0Var.onResume();
                    a1Var2.f39420a.reload();
                    return;
                }
                return;
            default:
                a1 a1Var3 = this.f39669b;
                rh.q qVar = a1Var3.f39430g0;
                qVar.f43668f = true;
                qVar.k();
                a1Var3.t();
                return;
        }
    }
}
