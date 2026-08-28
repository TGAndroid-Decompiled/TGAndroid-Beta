package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;
public final class t implements Runnable {
    public final int f44017a;
    public final y0 f44018b;

    public t(y0 y0Var, int i9) {
        this.f44017a = i9;
        this.f44018b = y0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f44017a) {
            case 0:
                e0 e0Var = this.f44018b.f44074c;
                if (e0Var != null) {
                    e0Var.b();
                }
                LaunchActivity.L();
                return;
            case 1:
                y0 y0Var = this.f44018b;
                mh.u0 u0Var = y0Var.f44081g0;
                u0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", u0Var.d());
                    if (u0Var.d()) {
                        jSONObject.put("access_requested", u0Var.d);
                        if (u0Var.d) {
                            if (u0Var.f18152e && u0Var.a()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            jSONObject.put("access_granted", z10);
                        }
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                y0Var.v("location_checked", jSONObject);
                return;
            case 2:
                y0 y0Var2 = this.f44018b;
                if (y0Var2.O) {
                    y0Var2.O = false;
                    e0 e0Var2 = y0Var2.f44074c;
                    if (e0Var2 != null) {
                        e0Var2.t(false);
                    }
                }
                y0Var2.c();
                y0Var2.J = false;
                y0Var2.L = 0L;
                y0Var2.P = false;
                v0 v0Var = y0Var2.f44070a;
                if (v0Var != null) {
                    v0Var.onResume();
                    y0Var2.f44070a.reload();
                    return;
                }
                return;
            default:
                y0 y0Var3 = this.f44018b;
                mh.r rVar = y0Var3.f44080f0;
                rVar.f18065f = true;
                rVar.k();
                y0Var3.t();
                return;
        }
    }
}
