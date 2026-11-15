package org.telegram.ui.web;

import fi.i7;
import org.json.JSONObject;
import org.telegram.messenger.a8;
public final class u implements Runnable {
    public final int f52798a;
    public final String[] f52799b;
    public final int f52800c;
    public final s0 d;
    public final i7 f52801e;

    public u(String[] strArr, int i7, s0 s0Var, i7 i7Var, int i10) {
        this.f52798a = i10;
        this.f52799b = strArr;
        this.f52800c = i7;
        this.d = s0Var;
        this.f52801e = i7Var;
    }

    @Override
    public final void run() {
        switch (this.f52798a) {
            case 0:
                int i7 = this.f52800c;
                s0 s0Var = this.d;
                i7 i7Var = this.f52801e;
                String[] strArr = this.f52799b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        v0.w(i7, s0Var, i7Var, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
                return;
            default:
                String[] strArr2 = this.f52799b;
                int i10 = this.f52800c;
                s0 s0Var2 = this.d;
                i7 i7Var2 = this.f52801e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    v0.w(i10, s0Var2, i7Var2, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
