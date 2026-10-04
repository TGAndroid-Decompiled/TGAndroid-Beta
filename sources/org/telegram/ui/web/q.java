package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q implements Utilities.Callback2 {
    public final int f42323a;
    public final c1 f42324b;
    public final da f42325c;

    public q(c1 c1Var, da daVar, int i10) {
        this.f42323a = i10;
        this.f42324b = c1Var;
        this.f42325c = daVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        h0 h0Var;
        String str;
        switch (this.f42323a) {
            case 0:
                String str2 = (String) obj2;
                JSONObject B = c1.B(str2, "status");
                c1 c1Var = this.f42324b;
                c1Var.y(this.f42325c, "emoji_status_access_requested", B);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (h0Var = c1Var.f42130c) != null) {
                    h0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                c1 c1Var2 = this.f42324b;
                if (c1Var2.f42130c != null && bool.booleanValue()) {
                    c1Var2.f42130c.w(bool2.booleanValue());
                }
                c1Var2.f42141k0.k(new r(c1Var2, this.f42325c, 1));
                return;
            case 2:
                String str3 = (String) obj2;
                c1 c1Var3 = this.f42324b;
                c1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ei.s sVar = c1Var3.f42140j0;
                    sVar.f9318e = true;
                    sVar.k();
                }
                c1Var3.w(this.f42325c);
                return;
            case 3:
                da daVar = this.f42325c;
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                c1 c1Var4 = this.f42324b;
                c1Var4.getClass();
                if (bool3.booleanValue()) {
                    c1Var4.f42140j0.f9318e = true;
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                String str5 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                c1 c1Var5 = this.f42324b;
                da daVar2 = this.f42325c;
                if (str5 == null) {
                    c1Var5.y(daVar2, "emoji_status_set", null);
                    h0 h0Var2 = c1Var5.f42130c;
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
