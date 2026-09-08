package org.telegram.ui.web;

import bi.k9;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class y implements Runnable {
    public final int f42345a;
    public final String[] f42346b;
    public final int f42347c;
    public final z0 d;
    public final k9 f42348e;

    public y(String[] strArr, int i10, z0 z0Var, k9 k9Var, int i11) {
        this.f42345a = i11;
        this.f42346b = strArr;
        this.f42347c = i10;
        this.d = z0Var;
        this.f42348e = k9Var;
    }

    @Override
    public final void run() {
        switch (this.f42345a) {
            case 0:
                int i10 = this.f42347c;
                z0 z0Var = this.d;
                k9 k9Var = this.f42348e;
                String[] strArr = this.f42346b;
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
                String[] strArr2 = this.f42346b;
                int i11 = this.f42347c;
                z0 z0Var2 = this.d;
                k9 k9Var2 = this.f42348e;
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
