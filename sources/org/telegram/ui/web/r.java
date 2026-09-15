package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r implements Utilities.Callback2 {
    public final int f39070a;
    public final d1 f39071b;
    public final da f39072c;

    public r(d1 d1Var, da daVar, int i10) {
        this.f39070a = i10;
        this.f39071b = d1Var;
        this.f39072c = daVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        h0 h0Var;
        String str;
        switch (this.f39070a) {
            case 0:
                String str2 = (String) obj2;
                JSONObject B = d1.B(str2, "status");
                d1 d1Var = this.f39071b;
                d1Var.y(this.f39072c, "emoji_status_access_requested", B);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (h0Var = d1Var.f38897c) != null) {
                    h0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                d1 d1Var2 = this.f39071b;
                if (d1Var2.f38897c != null && bool.booleanValue()) {
                    d1Var2.f38897c.w(bool2.booleanValue());
                }
                d1Var2.f38907k0.k(new s(d1Var2, this.f39072c, 1));
                return;
            case 2:
                String str3 = (String) obj2;
                d1 d1Var3 = this.f39071b;
                d1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ei.r rVar = d1Var3.f38906j0;
                    rVar.e = true;
                    rVar.k();
                }
                d1Var3.w(this.f39072c);
                return;
            case 3:
                da daVar = this.f39072c;
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                d1 d1Var4 = this.f39071b;
                d1Var4.getClass();
                if (bool3.booleanValue()) {
                    d1Var4.f38906j0.e = true;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (bool3.booleanValue()) {
                        str = "authorized";
                    } else {
                        str = "failed";
                    }
                    jSONObject.put("status", str);
                    jSONObject.put("token", str4);
                    d1Var4.y(daVar, "biometry_auth_requested", jSONObject);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                String str5 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                d1 d1Var5 = this.f39071b;
                da daVar2 = this.f39072c;
                if (str5 == null) {
                    d1Var5.y(daVar2, "emoji_status_set", null);
                    h0 h0Var2 = d1Var5.f38897c;
                    if (h0Var2 != null) {
                        h0Var2.d(document);
                        return;
                    }
                    return;
                }
                d1Var5.y(daVar2, "emoji_status_failed", d1.B(str5, "error"));
                return;
        }
    }
}
