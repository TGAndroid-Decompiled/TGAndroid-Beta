package org.telegram.ui.web;

import di.o7;
import org.json.JSONObject;
import org.telegram.messenger.a8;
public final class t implements Runnable {
    public final int f51306a;
    public final String[] f51307b;
    public final int f51308c;
    public final u0 d;
    public final o7 f51309e;

    public t(String[] strArr, int i7, u0 u0Var, o7 o7Var, int i10) {
        this.f51306a = i10;
        this.f51307b = strArr;
        this.f51308c = i7;
        this.d = u0Var;
        this.f51309e = o7Var;
    }

    @Override
    public final void run() {
        switch (this.f51306a) {
            case 0:
                int i7 = this.f51308c;
                u0 u0Var = this.d;
                o7 o7Var = this.f51309e;
                String[] strArr = this.f51307b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        x0.w(i7, u0Var, o7Var, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
                return;
            default:
                String[] strArr2 = this.f51307b;
                int i10 = this.f51308c;
                u0 u0Var2 = this.d;
                o7 o7Var2 = this.f51309e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    x0.w(i10, u0Var2, o7Var2, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
