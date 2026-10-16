package org.telegram.ui.web;

import bi.n9;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class x implements Runnable {
    public final int f41245a;
    public final String[] f41246b;
    public final int f41247c;
    public final z0 d;
    public final n9 e;

    public x(String[] strArr, int i10, z0 z0Var, n9 n9Var, int i11) {
        this.f41245a = i11;
        this.f41246b = strArr;
        this.f41247c = i10;
        this.d = z0Var;
        this.e = n9Var;
    }

    @Override
    public final void run() {
        switch (this.f41245a) {
            case 0:
                int i10 = this.f41247c;
                z0 z0Var = this.d;
                n9 n9Var = this.e;
                String[] strArr = this.f41246b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        c1.w(i10, z0Var, n9Var, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                String[] strArr2 = this.f41246b;
                int i11 = this.f41247c;
                z0 z0Var2 = this.d;
                n9 n9Var2 = this.e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    c1.w(i11, z0Var2, n9Var2, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
