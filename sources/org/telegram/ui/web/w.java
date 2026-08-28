package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class w implements Runnable {
    public final int f44052a;
    public final String[] f44053b;
    public final int f44054c;
    public final v0 d;

    public w(String[] strArr, int i9, v0 v0Var, int i10) {
        this.f44052a = i10;
        this.f44053b = strArr;
        this.f44054c = i9;
        this.d = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f44052a) {
            case 0:
                int i9 = this.f44054c;
                v0 v0Var = this.d;
                String[] strArr = this.f44053b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        y0.u(i9, v0Var, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
            default:
                String[] strArr2 = this.f44053b;
                int i10 = this.f44054c;
                v0 v0Var2 = this.d;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    y0.u(i10, v0Var2, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }
}
