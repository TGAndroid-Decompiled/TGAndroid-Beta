package org.telegram.ui.web;

import nh.j7;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r implements Utilities.Callback2 {
    public final int f39564a;
    public final c1 f39565b;
    public final j7 f39566c;

    public r(c1 c1Var, j7 j7Var, int i10) {
        this.f39564a = i10;
        this.f39565b = c1Var;
        this.f39566c = j7Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        g0 g0Var;
        String str;
        switch (this.f39564a) {
            case 0:
                String str2 = (String) obj2;
                JSONObject B = c1.B(str2, "status");
                c1 c1Var = this.f39565b;
                c1Var.z(this.f39566c, "emoji_status_access_requested", B);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (g0Var = c1Var.f39385c) != null) {
                    g0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                c1 c1Var2 = this.f39565b;
                if (c1Var2.f39385c != null && bool.booleanValue()) {
                    c1Var2.f39385c.w(bool2.booleanValue());
                }
                c1Var2.f39392h0.k(new s(c1Var2, this.f39566c, 1));
                return;
            case 2:
                String str3 = (String) obj2;
                c1 c1Var3 = this.f39565b;
                c1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    rh.p pVar = c1Var3.f39391g0;
                    pVar.e = true;
                    pVar.k();
                }
                c1Var3.w(this.f39566c);
                return;
            case 3:
                j7 j7Var = this.f39566c;
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                c1 c1Var4 = this.f39565b;
                c1Var4.getClass();
                if (bool3.booleanValue()) {
                    c1Var4.f39391g0.e = true;
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
                    c1Var4.z(j7Var, "biometry_auth_requested", jSONObject);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                String str5 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                c1 c1Var5 = this.f39565b;
                j7 j7Var2 = this.f39566c;
                if (str5 == null) {
                    c1Var5.z(j7Var2, "emoji_status_set", null);
                    g0 g0Var2 = c1Var5.f39385c;
                    if (g0Var2 != null) {
                        g0Var2.d(document);
                        return;
                    }
                    return;
                }
                c1Var5.z(j7Var2, "emoji_status_failed", c1.B(str5, "error"));
                return;
        }
    }
}
