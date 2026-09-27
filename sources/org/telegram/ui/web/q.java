package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q implements Utilities.Callback2 {
    public final int f39136a;
    public final c1 f39137b;
    public final da f39138c;

    public q(c1 c1Var, da daVar, int i10) {
        this.f39136a = i10;
        this.f39137b = c1Var;
        this.f39138c = daVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        h0 h0Var;
        String str;
        switch (this.f39136a) {
            case 0:
                String str2 = (String) obj2;
                JSONObject B = c1.B(str2, "status");
                c1 c1Var = this.f39137b;
                c1Var.y(this.f39138c, "emoji_status_access_requested", B);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (h0Var = c1Var.f38962c) != null) {
                    h0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                c1 c1Var2 = this.f39137b;
                if (c1Var2.f38962c != null && bool.booleanValue()) {
                    c1Var2.f38962c.w(bool2.booleanValue());
                }
                c1Var2.f38972k0.k(new r(c1Var2, this.f39138c, 1));
                return;
            case 2:
                String str3 = (String) obj2;
                c1 c1Var3 = this.f39137b;
                c1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ei.r rVar = c1Var3.f38971j0;
                    rVar.e = true;
                    rVar.k();
                }
                c1Var3.w(this.f39138c);
                return;
            case 3:
                da daVar = this.f39138c;
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                c1 c1Var4 = this.f39137b;
                c1Var4.getClass();
                if (bool3.booleanValue()) {
                    c1Var4.f38971j0.e = true;
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
                    c1Var4.y(daVar, "biometry_auth_requested", jSONObject);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                String str5 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                c1 c1Var5 = this.f39137b;
                da daVar2 = this.f39138c;
                if (str5 == null) {
                    c1Var5.y(daVar2, "emoji_status_set", null);
                    h0 h0Var2 = c1Var5.f38962c;
                    if (h0Var2 != null) {
                        h0Var2.d(document);
                        return;
                    }
                    return;
                }
                c1Var5.y(daVar2, "emoji_status_failed", c1.B(str5, "error"));
                return;
        }
    }
}
