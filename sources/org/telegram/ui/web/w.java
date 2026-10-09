package org.telegram.ui.web;

import ai.ea;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class w implements Runnable {
    public final int f43521a;
    public final String[] f43522b;
    public final int f43523c;
    public final y0 d;
    public final ea f43524e;

    public w(String[] strArr, int i10, y0 y0Var, ea eaVar, int i11) {
        this.f43521a = i11;
        this.f43522b = strArr;
        this.f43523c = i10;
        this.d = y0Var;
        this.f43524e = eaVar;
    }

    @Override
    public final void run() {
        switch (this.f43521a) {
            case 0:
                int i10 = this.f43523c;
                y0 y0Var = this.d;
                ea eaVar = this.f43524e;
                String[] strArr = this.f43522b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        b1.w(i10, y0Var, eaVar, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            default:
                String[] strArr2 = this.f43522b;
                int i11 = this.f43523c;
                y0 y0Var2 = this.d;
                ea eaVar2 = this.f43524e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    b1.w(i11, y0Var2, eaVar2, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
