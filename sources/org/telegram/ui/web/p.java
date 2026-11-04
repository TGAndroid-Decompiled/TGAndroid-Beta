package org.telegram.ui.web;

import ei.p7;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
public final class p implements n10 {
    public final int f50982a;
    public final w0 f50983b;
    public final p7 f50984c;

    public p(w0 w0Var, p7 p7Var, int i3) {
        this.f50982a = i3;
        this.f50983b = w0Var;
        this.f50984c = p7Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        d0 d0Var;
        String str;
        switch (this.f50982a) {
            case 0:
                String str2 = (String) obj2;
                JSONObject A = w0.A(str2, "status");
                w0 w0Var = this.f50983b;
                w0Var.x(this.f50984c, "emoji_status_access_requested", A);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (d0Var = w0Var.f51064c) != null) {
                    d0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                w0 w0Var2 = this.f50983b;
                if (w0Var2.f51064c != null && bool.booleanValue()) {
                    w0Var2.f51064c.w(bool2.booleanValue());
                }
                w0Var2.f51076l0.j(new q(w0Var2, this.f50984c, 1));
                return;
            case 2:
                String str3 = (String) obj2;
                w0 w0Var3 = this.f50983b;
                w0Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ii.r rVar = w0Var3.f51075k0;
                    rVar.f15185e = true;
                    rVar.k();
                }
                w0Var3.v(this.f50984c);
                return;
            case 3:
                p7 p7Var = this.f50984c;
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                boolean booleanValue = bool3.booleanValue();
                w0 w0Var4 = this.f50983b;
                if (booleanValue) {
                    w0Var4.f51075k0.f15185e = true;
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
                    w0Var4.x(p7Var, "biometry_auth_requested", jSONObject);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                String str5 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                w0 w0Var5 = this.f50983b;
                p7 p7Var2 = this.f50984c;
                if (str5 == null) {
                    w0Var5.x(p7Var2, "emoji_status_set", null);
                    d0 d0Var2 = w0Var5.f51064c;
                    if (d0Var2 != null) {
                        d0Var2.d(document);
                        return;
                    }
                    return;
                }
                w0Var5.x(p7Var2, "emoji_status_failed", w0.A(str5, "error"));
                return;
        }
    }
}
