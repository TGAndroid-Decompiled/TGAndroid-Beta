package org.telegram.ui.web;

import fi.f7;
import org.json.JSONObject;
import org.telegram.messenger.a8;
public final class u implements Runnable {
    public final int f53281a;
    public final String[] f53282b;
    public final int f53283c;
    public final s0 d;
    public final f7 f53284e;

    public u(String[] strArr, int i7, s0 s0Var, f7 f7Var, int i10) {
        this.f53281a = i10;
        this.f53282b = strArr;
        this.f53283c = i7;
        this.d = s0Var;
        this.f53284e = f7Var;
    }

    @Override
    public final void run() {
        switch (this.f53281a) {
            case 0:
                int i7 = this.f53283c;
                s0 s0Var = this.d;
                f7 f7Var = this.f53284e;
                String[] strArr = this.f53282b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        v0.w(i7, s0Var, f7Var, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
                return;
            default:
                String[] strArr2 = this.f53282b;
                int i10 = this.f53283c;
                s0 s0Var2 = this.d;
                f7 f7Var2 = this.f53284e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    v0.w(i10, s0Var2, f7Var2, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
