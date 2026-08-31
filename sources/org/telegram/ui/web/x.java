package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class x implements Runnable {
    public final int f42754a;
    public final String[] f42755b;
    public final int f42756c;
    public final x0 d;

    public x(String[] strArr, int i10, x0 x0Var, int i11) {
        this.f42754a = i11;
        this.f42755b = strArr;
        this.f42756c = i10;
        this.d = x0Var;
    }

    @Override
    public final void run() {
        switch (this.f42754a) {
            case 0:
                int i10 = this.f42756c;
                x0 x0Var = this.d;
                String[] strArr = this.f42755b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        a1.u(i10, x0Var, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                }
                return;
            default:
                String[] strArr2 = this.f42755b;
                int i11 = this.f42756c;
                x0 x0Var2 = this.d;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    a1.u(i11, x0Var2, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
