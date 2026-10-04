package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q implements Utilities.Callback2 {
    public final int f42316a;
    public final c1 f42317b;
    public final da f42318c;

    public q(c1 c1Var, da daVar, int i10) {
        this.f42316a = i10;
        this.f42317b = c1Var;
        this.f42318c = daVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        h0 h0Var;
        String str;
        switch (this.f42316a) {
            case 0:
                String str2 = (String) obj2;
                JSONObject B = c1.B(str2, "status");
                c1 c1Var = this.f42317b;
                c1Var.y(this.f42318c, "emoji_status_access_requested", B);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (h0Var = c1Var.f42123c) != null) {
                    h0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                c1 c1Var2 = this.f42317b;
                if (c1Var2.f42123c != null && bool.booleanValue()) {
                    c1Var2.f42123c.w(bool2.booleanValue());
                }
                c1Var2.f42134k0.k(new r(c1Var2, this.f42318c, 1));
                return;
            case 2:
                String str3 = (String) obj2;
                c1 c1Var3 = this.f42317b;
                c1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ei.s sVar = c1Var3.f42133j0;
                    sVar.f9317e = true;
                    sVar.k();
                }
                c1Var3.w(this.f42318c);
                return;
            case 3:
                da daVar = this.f42318c;
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                c1 c1Var4 = this.f42317b;
                c1Var4.getClass();
                if (bool3.booleanValue()) {
                    c1Var4.f42133j0.f9317e = true;
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
                c1 c1Var5 = this.f42317b;
                da daVar2 = this.f42318c;
                if (str5 == null) {
                    c1Var5.y(daVar2, "emoji_status_set", null);
                    h0 h0Var2 = c1Var5.f42123c;
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
