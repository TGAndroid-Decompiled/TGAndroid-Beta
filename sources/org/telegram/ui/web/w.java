package org.telegram.ui.web;

import ai.ea;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class w implements Runnable {
    public final int f43523a;
    public final String[] f43524b;
    public final int f43525c;
    public final y0 d;
    public final ea f43526e;

    public w(String[] strArr, int i10, y0 y0Var, ea eaVar, int i11) {
        this.f43523a = i11;
        this.f43524b = strArr;
        this.f43525c = i10;
        this.d = y0Var;
        this.f43526e = eaVar;
    }

    @Override
    public final void run() {
        switch (this.f43523a) {
            case 0:
                int i10 = this.f43525c;
                y0 y0Var = this.d;
                ea eaVar = this.f43526e;
                String[] strArr = this.f43524b;
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
                String[] strArr2 = this.f43524b;
                int i11 = this.f43525c;
                y0 y0Var2 = this.d;
                ea eaVar2 = this.f43526e;
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
