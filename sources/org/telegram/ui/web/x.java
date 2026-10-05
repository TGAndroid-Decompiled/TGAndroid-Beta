package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class x implements Runnable {
    public final int f42427a;
    public final String[] f42428b;
    public final int f42429c;
    public final z0 d;
    public final da f42430e;

    public x(String[] strArr, int i10, z0 z0Var, da daVar, int i11) {
        this.f42427a = i11;
        this.f42428b = strArr;
        this.f42429c = i10;
        this.d = z0Var;
        this.f42430e = daVar;
    }

    @Override
    public final void run() {
        switch (this.f42427a) {
            case 0:
                int i10 = this.f42429c;
                z0 z0Var = this.d;
                da daVar = this.f42430e;
                String[] strArr = this.f42428b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        c1.x(i10, z0Var, daVar, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            default:
                String[] strArr2 = this.f42428b;
                int i11 = this.f42429c;
                z0 z0Var2 = this.d;
                da daVar2 = this.f42430e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    c1.x(i11, z0Var2, daVar2, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
