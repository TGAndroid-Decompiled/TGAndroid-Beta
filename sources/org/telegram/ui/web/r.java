package org.telegram.ui.web;

import ci.z7;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r implements Utilities.Callback2 {
    public final int f42767a;
    public final a1 f42768b;
    public final z7 f42769c;

    public r(a1 a1Var, z7 z7Var, int i10) {
        this.f42767a = i10;
        this.f42768b = a1Var;
        this.f42769c = z7Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        g0 g0Var;
        String str;
        switch (this.f42767a) {
            case 0:
                String str2 = (String) obj2;
                JSONObject A = a1.A(str2, "status");
                a1 a1Var = this.f42768b;
                a1Var.x(this.f42769c, "emoji_status_access_requested", A);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (g0Var = a1Var.f42568c) != null) {
                    g0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                a1 a1Var2 = this.f42768b;
                if (a1Var2.f42568c != null && bool.booleanValue()) {
                    a1Var2.f42568c.w(bool2.booleanValue());
                }
                a1Var2.f42578k0.j(new s(a1Var2, this.f42769c, 1));
                return;
            case 2:
                String str3 = (String) obj2;
                a1 a1Var3 = this.f42768b;
                a1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    gi.r rVar = a1Var3.f42577j0;
                    rVar.e = true;
                    rVar.k();
                }
                a1Var3.v(this.f42769c);
                return;
            case 3:
                z7 z7Var = this.f42769c;
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                a1 a1Var4 = this.f42768b;
                a1Var4.getClass();
                if (bool3.booleanValue()) {
                    a1Var4.f42577j0.e = true;
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
                    a1Var4.x(z7Var, "biometry_auth_requested", jSONObject);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                String str5 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                a1 a1Var5 = this.f42768b;
                z7 z7Var2 = this.f42769c;
                if (str5 == null) {
                    a1Var5.x(z7Var2, "emoji_status_set", null);
                    g0 g0Var2 = a1Var5.f42568c;
                    if (g0Var2 != null) {
                        g0Var2.d(document);
                        return;
                    }
                    return;
                }
                a1Var5.x(z7Var2, "emoji_status_failed", a1.A(str5, "error"));
                return;
        }
    }
}
