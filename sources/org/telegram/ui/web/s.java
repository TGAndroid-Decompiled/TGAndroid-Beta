package org.telegram.ui.web;

import bi.n9;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;
public final class s implements Runnable {
    public final int f41479a;
    public final b1 f41480b;

    public s(b1 b1Var, int i10) {
        this.f41479a = i10;
        this.f41480b = b1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f41479a) {
            case 0:
                h0 h0Var = this.f41480b.f41286c;
                if (h0Var != null) {
                    h0Var.b();
                }
                LaunchActivity.K();
                return;
            case 1:
                b1 b1Var = this.f41480b;
                n9 n9Var = b1Var.I0;
                fi.v0 v0Var = b1Var.f41296k0;
                v0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", v0Var.d());
                    if (v0Var.d()) {
                        jSONObject.put("access_requested", v0Var.d);
                        if (v0Var.d) {
                            if (v0Var.e && v0Var.a()) {
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
                b1Var.x(n9Var, "location_checked", jSONObject);
                return;
            default:
                b1 b1Var2 = this.f41480b;
                if (b1Var2.S) {
                    b1Var2.S = false;
                    h0 h0Var2 = b1Var2.f41286c;
                    if (h0Var2 != null) {
                        h0Var2.t(false);
                    }
                }
                b1Var2.c();
                b1Var2.N = false;
                b1Var2.P = 0L;
                b1Var2.T = false;
                y0 y0Var = b1Var2.f41282a;
                if (y0Var != null) {
                    y0Var.onResume();
                    b1Var2.f41282a.reload();
                    return;
                }
                return;
        }
    }
}
