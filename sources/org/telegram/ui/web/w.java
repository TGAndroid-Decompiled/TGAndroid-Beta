package org.telegram.ui.web;

import ai.ea;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class w implements Runnable {
    public final int f43466a;
    public final String[] f43467b;
    public final int f43468c;
    public final y0 d;
    public final ea f43469e;

    public w(String[] strArr, int i10, y0 y0Var, ea eaVar, int i11) {
        this.f43466a = i11;
        this.f43467b = strArr;
        this.f43468c = i10;
        this.d = y0Var;
        this.f43469e = eaVar;
    }

    @Override
    public final void run() {
        switch (this.f43466a) {
            case 0:
                int i10 = this.f43468c;
                y0 y0Var = this.d;
                ea eaVar = this.f43469e;
                String[] strArr = this.f43467b;
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
                String[] strArr2 = this.f43467b;
                int i11 = this.f43468c;
                y0 y0Var2 = this.d;
                ea eaVar2 = this.f43469e;
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
