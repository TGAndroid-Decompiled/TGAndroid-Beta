package org.telegram.ui.web;

import di.p7;
import org.json.JSONObject;
import org.telegram.messenger.a8;
public final class u implements Runnable {
    public final int f51290a;
    public final String[] f51291b;
    public final int f51292c;
    public final u0 d;
    public final p7 f51293e;

    public u(String[] strArr, int i7, u0 u0Var, p7 p7Var, int i10) {
        this.f51290a = i10;
        this.f51291b = strArr;
        this.f51292c = i7;
        this.d = u0Var;
        this.f51293e = p7Var;
    }

    @Override
    public final void run() {
        switch (this.f51290a) {
            case 0:
                int i7 = this.f51292c;
                u0 u0Var = this.d;
                p7 p7Var = this.f51293e;
                String[] strArr = this.f51291b;
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
                String[] strArr2 = this.f51291b;
                int i10 = this.f51292c;
                u0 u0Var2 = this.d;
                p7 p7Var2 = this.f51293e;
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
