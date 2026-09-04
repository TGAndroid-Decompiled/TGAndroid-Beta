package org.telegram.ui.web;

import bi.k9;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;
public final class u implements Runnable {
    public final int f42249a;
    public final d1 f42250b;

    public u(d1 d1Var, int i10) {
        this.f42249a = i10;
        this.f42250b = d1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f42249a) {
            case 0:
                i0 i0Var = this.f42250b.f42039c;
                if (i0Var != null) {
                    i0Var.b();
                }
                LaunchActivity.L();
                return;
            case 1:
                d1 d1Var = this.f42250b;
                k9 k9Var = d1Var.I0;
                fi.w0 w0Var = d1Var.f42050k0;
                w0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", w0Var.d());
                    if (w0Var.d()) {
                        jSONObject.put("access_requested", w0Var.d);
                        if (w0Var.d) {
                            if (w0Var.f10055e && w0Var.a()) {
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
                d1Var.y(k9Var, "location_checked", jSONObject);
                return;
            default:
                d1 d1Var2 = this.f42250b;
                if (d1Var2.S) {
                    d1Var2.S = false;
                    i0 i0Var2 = d1Var2.f42039c;
                    if (i0Var2 != null) {
                        i0Var2.t(false);
                    }
                }
                d1Var2.c();
                d1Var2.N = false;
                d1Var2.P = 0L;
                d1Var2.T = false;
                z0 z0Var = d1Var2.f42035a;
                if (z0Var != null) {
                    z0Var.onResume();
                    d1Var2.f42035a.reload();
                    return;
                }
                return;
        }
    }
}
