package org.telegram.ui.web;

import di.o7;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
public final class n implements v10 {
    public final int f51231a;
    public final x0 f51232b;
    public final o7 f51233c;

    public n(x0 x0Var, o7 o7Var, int i7) {
        this.f51231a = i7;
        this.f51232b = x0Var;
        this.f51233c = o7Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        d0 d0Var;
        String str;
        switch (this.f51231a) {
            case 0:
                String str2 = (String) obj2;
                JSONObject A = x0.A(str2, "status");
                x0 x0Var = this.f51232b;
                x0Var.x(this.f51233c, "emoji_status_access_requested", A);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (d0Var = x0Var.f51352c) != null) {
                    d0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                x0 x0Var2 = this.f51232b;
                if (x0Var2.f51352c != null && bool.booleanValue()) {
                    x0Var2.f51352c.w(bool2.booleanValue());
                }
                x0Var2.f51363k0.j(new o(x0Var2, this.f51233c, 1));
                return;
            case 2:
                String str3 = (String) obj2;
                x0 x0Var3 = this.f51232b;
                x0Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    hi.p pVar = x0Var3.f51362j0;
                    pVar.f14848e = true;
                    pVar.k();
                }
                x0Var3.v(this.f51233c);
                return;
            case 3:
                o7 o7Var = this.f51233c;
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                boolean booleanValue = bool3.booleanValue();
                x0 x0Var4 = this.f51232b;
                if (booleanValue) {
                    x0Var4.f51362j0.f14848e = true;
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
                    x0Var4.x(o7Var, "biometry_auth_requested", jSONObject);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                String str5 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                x0 x0Var5 = this.f51232b;
                o7 o7Var2 = this.f51233c;
                if (str5 == null) {
                    x0Var5.x(o7Var2, "emoji_status_set", null);
                    d0 d0Var2 = x0Var5.f51352c;
                    if (d0Var2 != null) {
                        d0Var2.d(document);
                        return;
                    }
                    return;
                }
                x0Var5.x(o7Var2, "emoji_status_failed", x0.A(str5, "error"));
                return;
        }
    }
}
