package org.telegram.ui.web;

import ci.z7;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class x implements Runnable {
    public final int f42845a;
    public final String[] f42846b;
    public final int f42847c;
    public final x0 d;
    public final z7 e;

    public x(String[] strArr, int i10, x0 x0Var, z7 z7Var, int i11) {
        this.f42845a = i11;
        this.f42846b = strArr;
        this.f42847c = i10;
        this.d = x0Var;
        this.e = z7Var;
    }

    @Override
    public final void run() {
        switch (this.f42845a) {
            case 0:
                int i10 = this.f42847c;
                x0 x0Var = this.d;
                z7 z7Var = this.e;
                String[] strArr = this.f42846b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        a1.w(i10, x0Var, z7Var, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                String[] strArr2 = this.f42846b;
                int i11 = this.f42847c;
                x0 x0Var2 = this.d;
                z7 z7Var2 = this.e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    a1.w(i11, x0Var2, z7Var2, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
