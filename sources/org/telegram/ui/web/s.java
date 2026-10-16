package org.telegram.ui.web;

import bi.n9;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;
public final class s implements Runnable {
    public final int f41172a;
    public final c1 f41173b;

    public s(c1 c1Var, int i10) {
        this.f41172a = i10;
        this.f41173b = c1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f41172a) {
            case 0:
                h0 h0Var = this.f41173b.f40985c;
                if (h0Var != null) {
                    h0Var.b();
                }
                LaunchActivity.K();
                return;
            case 1:
                c1 c1Var = this.f41173b;
                n9 n9Var = c1Var.I0;
                fi.v0 v0Var = c1Var.f40995k0;
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
                c1Var.x(n9Var, "location_checked", jSONObject);
                return;
            default:
                c1 c1Var2 = this.f41173b;
                if (c1Var2.S) {
                    c1Var2.S = false;
                    h0 h0Var2 = c1Var2.f40985c;
                    if (h0Var2 != null) {
                        h0Var2.t(false);
                    }
                }
                c1Var2.c();
                c1Var2.N = false;
                c1Var2.P = 0L;
                c1Var2.T = false;
                z0 z0Var = c1Var2.f40981a;
                if (z0Var != null) {
                    z0Var.onResume();
                    c1Var2.f40981a.reload();
                    return;
                }
                return;
        }
    }
}
