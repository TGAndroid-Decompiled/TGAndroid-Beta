package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class w implements Runnable {
    public final int f38889a;
    public final String[] f38890b;
    public final int f38891c;
    public final y0 d;
    public final da e;

    public w(String[] strArr, int i10, y0 y0Var, da daVar, int i11) {
        this.f38889a = i11;
        this.f38890b = strArr;
        this.f38891c = i10;
        this.d = y0Var;
        this.e = daVar;
    }

    @Override
    public final void run() {
        switch (this.f38889a) {
            case 0:
                int i10 = this.f38891c;
                y0 y0Var = this.d;
                da daVar = this.e;
                String[] strArr = this.f38890b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        b1.x(i10, y0Var, daVar, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                String[] strArr2 = this.f38890b;
                int i11 = this.f38891c;
                y0 y0Var2 = this.d;
                da daVar2 = this.e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    b1.x(i11, y0Var2, daVar2, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
