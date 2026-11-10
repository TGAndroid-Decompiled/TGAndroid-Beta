package org.telegram.ui.web;

import di.p7;
import org.json.JSONObject;
import org.telegram.messenger.a8;
public final class u implements Runnable {
    public final int f51244a;
    public final String[] f51245b;
    public final int f51246c;
    public final u0 d;
    public final p7 f51247e;

    public u(String[] strArr, int i7, u0 u0Var, p7 p7Var, int i10) {
        this.f51244a = i10;
        this.f51245b = strArr;
        this.f51246c = i7;
        this.d = u0Var;
        this.f51247e = p7Var;
    }

    @Override
    public final void run() {
        switch (this.f51244a) {
            case 0:
                int i7 = this.f51246c;
                u0 u0Var = this.d;
                p7 p7Var = this.f51247e;
                String[] strArr = this.f51245b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        x0.w(i7, u0Var, p7Var, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
                return;
            default:
                String[] strArr2 = this.f51245b;
                int i10 = this.f51246c;
                u0 u0Var2 = this.d;
                p7 p7Var2 = this.f51247e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    x0.w(i10, u0Var2, p7Var2, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
