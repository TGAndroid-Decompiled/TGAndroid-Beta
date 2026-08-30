package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class x implements Runnable {
    public final int f39696a;
    public final String[] f39697b;
    public final int f39698c;
    public final w0 d;

    public x(String[] strArr, int i10, w0 w0Var, int i11) {
        this.f39696a = i11;
        this.f39697b = strArr;
        this.f39698c = i10;
        this.d = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f39696a) {
            case 0:
                int i10 = this.f39698c;
                w0 w0Var = this.d;
                String[] strArr = this.f39697b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        a1.u(i10, w0Var, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                String[] strArr2 = this.f39697b;
                int i11 = this.f39698c;
                w0 w0Var2 = this.d;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    a1.u(i11, w0Var2, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }
}
