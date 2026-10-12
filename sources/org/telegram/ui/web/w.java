package org.telegram.ui.web;

import bi.n9;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class w implements Runnable {
    public final int f41544a;
    public final String[] f41545b;
    public final int f41546c;
    public final y0 d;
    public final n9 e;

    public w(String[] strArr, int i10, y0 y0Var, n9 n9Var, int i11) {
        this.f41544a = i11;
        this.f41545b = strArr;
        this.f41546c = i10;
        this.d = y0Var;
        this.e = n9Var;
    }

    @Override
    public final void run() {
        switch (this.f41544a) {
            case 0:
                int i10 = this.f41546c;
                y0 y0Var = this.d;
                n9 n9Var = this.e;
                String[] strArr = this.f41545b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        b1.w(i10, y0Var, n9Var, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                String[] strArr2 = this.f41545b;
                int i11 = this.f41546c;
                y0 y0Var2 = this.d;
                n9 n9Var2 = this.e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    b1.w(i11, y0Var2, n9Var2, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
