package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;

public final class x implements Runnable {

    public final int f44039a;

    public final String[] f44040b;

    public final int f44041c;
    public final w0 d;

    public x(String[] strArr, int i10, w0 w0Var, int i11) {
        this.f44039a = i11;
        this.f44040b = strArr;
        this.f44041c = i10;
        this.d = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f44039a) {
            case 0:
                int i10 = this.f44041c;
                w0 w0Var = this.d;
                String[] strArr = this.f44040b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        z0.u(i10, w0Var, "phone_requested", jSONObject);
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return;
                    }
                    break;
                }
                break;
            default:
                String[] strArr2 = this.f44040b;
                int i11 = this.f44041c;
                w0 w0Var2 = this.d;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    z0.u(i11, w0Var2, "write_access_requested", jSONObject2);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                break;
        }
    }
}
