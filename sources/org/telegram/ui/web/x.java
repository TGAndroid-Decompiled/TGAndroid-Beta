package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class x implements Runnable {
    public final int f42407a;
    public final String[] f42408b;
    public final int f42409c;
    public final z0 d;
    public final da f42410e;

    public x(String[] strArr, int i10, z0 z0Var, da daVar, int i11) {
        this.f42407a = i11;
        this.f42408b = strArr;
        this.f42409c = i10;
        this.d = z0Var;
        this.f42410e = daVar;
    }

    @Override
    public final void run() {
        switch (this.f42407a) {
            case 0:
                int i10 = this.f42409c;
                z0 z0Var = this.d;
                da daVar = this.f42410e;
                String[] strArr = this.f42408b;
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
                String[] strArr2 = this.f42408b;
                int i11 = this.f42409c;
                z0 z0Var2 = this.d;
                da daVar2 = this.f42410e;
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
