package org.telegram.ui.web;

import ei.p7;
import org.json.JSONObject;
import org.telegram.messenger.a8;
public final class v implements Runnable {
    public final int f51049a;
    public final String[] f51050b;
    public final int f51051c;
    public final t0 d;
    public final p7 f51052e;

    public v(String[] strArr, int i3, t0 t0Var, p7 p7Var, int i10) {
        this.f51049a = i10;
        this.f51050b = strArr;
        this.f51051c = i3;
        this.d = t0Var;
        this.f51052e = p7Var;
    }

    @Override
    public final void run() {
        switch (this.f51049a) {
            case 0:
                int i3 = this.f51051c;
                t0 t0Var = this.d;
                p7 p7Var = this.f51052e;
                String[] strArr = this.f51050b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        w0.w(i3, t0Var, p7Var, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
                return;
            default:
                String[] strArr2 = this.f51050b;
                int i10 = this.f51051c;
                t0 t0Var2 = this.d;
                p7 p7Var2 = this.f51052e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    w0.w(i10, t0Var2, p7Var2, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
