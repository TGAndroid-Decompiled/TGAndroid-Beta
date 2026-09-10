package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class x implements Runnable {
    public final int f38142a;
    public final String[] f38143b;
    public final int f38144c;
    public final y0 d;
    public final a1 e;

    public x(String[] strArr, int i10, y0 y0Var, a1 a1Var, int i11) {
        this.f38142a = i11;
        this.f38143b = strArr;
        this.f38144c = i10;
        this.d = y0Var;
        this.e = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f38142a) {
            case 0:
                int i10 = this.f38144c;
                y0 y0Var = this.d;
                a1 a1Var = this.e;
                String[] strArr = this.f38143b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        c1.x(i10, y0Var, a1Var, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                String[] strArr2 = this.f38143b;
                int i11 = this.f38144c;
                y0 y0Var2 = this.d;
                a1 a1Var2 = this.e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    c1.x(i11, y0Var2, a1Var2, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
