package org.telegram.ui.web;

import bi.k9;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class y implements Runnable {
    public final int f42319a;
    public final String[] f42320b;
    public final int f42321c;
    public final z0 d;
    public final k9 f42322e;

    public y(String[] strArr, int i10, z0 z0Var, k9 k9Var, int i11) {
        this.f42319a = i11;
        this.f42320b = strArr;
        this.f42321c = i10;
        this.d = z0Var;
        this.f42322e = k9Var;
    }

    @Override
    public final void run() {
        switch (this.f42319a) {
            case 0:
                int i10 = this.f42321c;
                z0 z0Var = this.d;
                k9 k9Var = this.f42322e;
                String[] strArr = this.f42320b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        d1.x(i10, z0Var, k9Var, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            default:
                String[] strArr2 = this.f42320b;
                int i11 = this.f42321c;
                z0 z0Var2 = this.d;
                k9 k9Var2 = this.f42322e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    d1.x(i11, z0Var2, k9Var2, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
