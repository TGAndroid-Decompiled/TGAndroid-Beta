package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class w implements Runnable {
    public final int f39216a;
    public final String[] f39217b;
    public final int f39218c;
    public final z0 d;
    public final da e;

    public w(String[] strArr, int i10, z0 z0Var, da daVar, int i11) {
        this.f39216a = i11;
        this.f39217b = strArr;
        this.f39218c = i10;
        this.d = z0Var;
        this.e = daVar;
    }

    @Override
    public final void run() {
        switch (this.f39216a) {
            case 0:
                int i10 = this.f39218c;
                z0 z0Var = this.d;
                da daVar = this.e;
                String[] strArr = this.f39217b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        c1.x(i10, z0Var, daVar, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                String[] strArr2 = this.f39217b;
                int i11 = this.f39218c;
                z0 z0Var2 = this.d;
                da daVar2 = this.e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    c1.x(i11, z0Var2, daVar2, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
