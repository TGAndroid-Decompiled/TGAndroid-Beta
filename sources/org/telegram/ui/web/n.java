package org.telegram.ui.web;

import di.o7;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
public final class n implements v10 {
    public final int f51236a;
    public final x0 f51237b;
    public final o7 f51238c;

    public n(x0 x0Var, o7 o7Var, int i7) {
        this.f51236a = i7;
        this.f51237b = x0Var;
        this.f51238c = o7Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        d0 d0Var;
        String str;
        switch (this.f51236a) {
            case 0:
                String str2 = (String) obj2;
                JSONObject A = x0.A(str2, "status");
                x0 x0Var = this.f51237b;
                x0Var.x(this.f51238c, "emoji_status_access_requested", A);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (d0Var = x0Var.f51357c) != null) {
                    d0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                x0 x0Var2 = this.f51237b;
                if (x0Var2.f51357c != null && bool.booleanValue()) {
                    x0Var2.f51357c.w(bool2.booleanValue());
                }
                x0Var2.f51368k0.j(new o(x0Var2, this.f51238c, 1));
                return;
            case 2:
                String str3 = (String) obj2;
                x0 x0Var3 = this.f51237b;
                x0Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    hi.p pVar = x0Var3.f51367j0;
                    pVar.f14848e = true;
                    pVar.k();
                }
                x0Var3.v(this.f51238c);
                return;
            case 3:
                o7 o7Var = this.f51238c;
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                boolean booleanValue = bool3.booleanValue();
                x0 x0Var4 = this.f51237b;
                if (booleanValue) {
                    x0Var4.f51367j0.f14848e = true;
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
                x0 x0Var5 = this.f51237b;
                o7 o7Var2 = this.f51238c;
                if (str5 == null) {
                    x0Var5.x(o7Var2, "emoji_status_set", null);
                    d0 d0Var2 = x0Var5.f51357c;
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
