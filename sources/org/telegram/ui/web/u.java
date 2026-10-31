package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.f8;
public final class u implements Runnable {
    public final int f43198a;
    public final String[] f43199b;
    public final int f43200c;
    public final v0 d;
    public final x0 e;

    public u(String[] strArr, int i10, v0 v0Var, x0 x0Var, int i11) {
        this.f43198a = i11;
        this.f43199b = strArr;
        this.f43200c = i10;
        this.d = v0Var;
        this.e = x0Var;
    }

    @Override
    public final void run() {
        switch (this.f43198a) {
            case 0:
                int i10 = this.f43200c;
                v0 v0Var = this.d;
                x0 x0Var = this.e;
                String[] strArr = this.f43199b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        z0.w(i10, v0Var, x0Var, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e) {
                        f8.g(e, true);
                        return;
                    }
                }
                return;
            default:
                String[] strArr2 = this.f43199b;
                int i11 = this.f43200c;
                v0 v0Var2 = this.d;
                x0 x0Var2 = this.e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    z0.w(i11, v0Var2, x0Var2, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
        }
    }
}
