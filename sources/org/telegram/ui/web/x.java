package org.telegram.ui.web;

import ci.y7;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class x implements Runnable {
    public final int f43317a;
    public final String[] f43318b;
    public final int f43319c;
    public final y0 d;
    public final y7 e;

    public x(String[] strArr, int i10, y0 y0Var, y7 y7Var, int i11) {
        this.f43317a = i11;
        this.f43318b = strArr;
        this.f43319c = i10;
        this.d = y0Var;
        this.e = y7Var;
    }

    @Override
    public final void run() {
        switch (this.f43317a) {
            case 0:
                int i10 = this.f43319c;
                y0 y0Var = this.d;
                y7 y7Var = this.e;
                String[] strArr = this.f43318b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        b1.w(i10, y0Var, y7Var, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                String[] strArr2 = this.f43318b;
                int i11 = this.f43319c;
                y0 y0Var2 = this.d;
                y7 y7Var2 = this.e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    b1.w(i11, y0Var2, y7Var2, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
