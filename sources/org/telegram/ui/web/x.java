package org.telegram.ui.web;

import di.x7;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class x implements Runnable {
    public final int f45439a;
    public final String[] f45440b;
    public final int f45441c;
    public final x0 d;
    public final x7 e;

    public x(String[] strArr, int i10, x0 x0Var, x7 x7Var, int i11) {
        this.f45439a = i11;
        this.f45440b = strArr;
        this.f45441c = i10;
        this.d = x0Var;
        this.e = x7Var;
    }

    @Override
    public final void run() {
        switch (this.f45439a) {
            case 0:
                int i10 = this.f45441c;
                x0 x0Var = this.d;
                x7 x7Var = this.e;
                String[] strArr = this.f45440b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        a1.w(i10, x0Var, x7Var, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                String[] strArr2 = this.f45440b;
                int i11 = this.f45441c;
                x0 x0Var2 = this.d;
                x7 x7Var2 = this.e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    a1.w(i11, x0Var2, x7Var2, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
