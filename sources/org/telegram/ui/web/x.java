package org.telegram.ui.web;

import nh.j7;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class x implements Runnable {
    public final int f39640a;
    public final String[] f39641b;
    public final int f39642c;
    public final y0 d;
    public final j7 e;

    public x(String[] strArr, int i10, y0 y0Var, j7 j7Var, int i11) {
        this.f39640a = i11;
        this.f39641b = strArr;
        this.f39642c = i10;
        this.d = y0Var;
        this.e = j7Var;
    }

    @Override
    public final void run() {
        switch (this.f39640a) {
            case 0:
                int i10 = this.f39642c;
                y0 y0Var = this.d;
                j7 j7Var = this.e;
                String[] strArr = this.f39641b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        c1.x(i10, y0Var, j7Var, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                String[] strArr2 = this.f39641b;
                int i11 = this.f39642c;
                y0 y0Var2 = this.d;
                j7 j7Var2 = this.e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    c1.x(i11, y0Var2, j7Var2, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }
}
