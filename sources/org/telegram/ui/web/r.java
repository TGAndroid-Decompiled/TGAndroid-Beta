package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r implements Utilities.Callback2 {
    public final int f38063a;
    public final c1 f38064b;
    public final a1 f38065c;

    public r(c1 c1Var, a1 a1Var, int i10) {
        this.f38063a = i10;
        this.f38064b = c1Var;
        this.f38065c = a1Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        h0 h0Var;
        String str;
        switch (this.f38063a) {
            case 0:
                String str2 = (String) obj2;
                JSONObject B = c1.B(str2, "status");
                c1 c1Var = this.f38064b;
                c1Var.z(this.f38065c, "emoji_status_access_requested", B);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (h0Var = c1Var.f37880c) != null) {
                    h0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                c1 c1Var2 = this.f38064b;
                if (c1Var2.f37880c != null && bool.booleanValue()) {
                    c1Var2.f37880c.w(bool2.booleanValue());
                }
                c1Var2.f37890k0.k(new s(c1Var2, this.f38065c, 1));
                return;
            case 2:
                String str3 = (String) obj2;
                c1 c1Var3 = this.f38064b;
                c1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    di.u uVar = c1Var3.f37889j0;
                    uVar.e = true;
                    uVar.k();
                }
                c1Var3.w(this.f38065c);
                return;
            case 3:
                a1 a1Var = this.f38065c;
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                c1 c1Var4 = this.f38064b;
                c1Var4.getClass();
                if (bool3.booleanValue()) {
                    c1Var4.f37889j0.e = true;
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
                    c1Var4.z(a1Var, "biometry_auth_requested", jSONObject);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                String str5 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                c1 c1Var5 = this.f38064b;
                a1 a1Var2 = this.f38065c;
                if (str5 == null) {
                    c1Var5.z(a1Var2, "emoji_status_set", null);
                    h0 h0Var2 = c1Var5.f37880c;
                    if (h0Var2 != null) {
                        h0Var2.d(document);
                        return;
                    }
                    return;
                }
                c1Var5.z(a1Var2, "emoji_status_failed", c1.B(str5, "error"));
                return;
        }
    }
}
