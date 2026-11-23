package org.telegram.ui.web;

import fi.f7;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
public final class o implements p10 {
    public final int f53496a;
    public final v0 f53497b;
    public final f7 f53498c;

    public o(v0 v0Var, f7 f7Var, int i7) {
        this.f53496a = i7;
        this.f53497b = v0Var;
        this.f53498c = f7Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        c0 c0Var;
        String str;
        switch (this.f53496a) {
            case 0:
                String str2 = (String) obj2;
                JSONObject A = v0.A(str2, "status");
                v0 v0Var = this.f53497b;
                v0Var.x(this.f53498c, "emoji_status_access_requested", A);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (c0Var = v0Var.f53579c) != null) {
                    c0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                v0 v0Var2 = this.f53497b;
                if (v0Var2.f53579c != null && bool.booleanValue()) {
                    v0Var2.f53579c.w(bool2.booleanValue());
                }
                v0Var2.f53591l0.j(new p(v0Var2, this.f53498c, 1));
                return;
            case 2:
                String str3 = (String) obj2;
                v0 v0Var3 = this.f53497b;
                v0Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ki.p pVar = v0Var3.f53590k0;
                    pVar.f18918e = true;
                    pVar.k();
                }
                v0Var3.v(this.f53498c);
                return;
            case 3:
                f7 f7Var = this.f53498c;
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                boolean booleanValue = bool3.booleanValue();
                v0 v0Var4 = this.f53497b;
                if (booleanValue) {
                    v0Var4.f53590k0.f18918e = true;
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
                    v0Var4.x(f7Var, "biometry_auth_requested", jSONObject);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                String str5 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                v0 v0Var5 = this.f53497b;
                f7 f7Var2 = this.f53498c;
                if (str5 == null) {
                    v0Var5.x(f7Var2, "emoji_status_set", null);
                    c0 c0Var2 = v0Var5.f53579c;
                    if (c0Var2 != null) {
                        c0Var2.d(document);
                        return;
                    }
                    return;
                }
                v0Var5.x(f7Var2, "emoji_status_failed", v0.A(str5, "error"));
                return;
        }
    }
}
