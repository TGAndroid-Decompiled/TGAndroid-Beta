package org.telegram.ui.web;

import fi.i7;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
public final class o implements s10 {
    public final int f52734a;
    public final v0 f52735b;
    public final i7 f52736c;

    public o(v0 v0Var, i7 i7Var, int i7) {
        this.f52734a = i7;
        this.f52735b = v0Var;
        this.f52736c = i7Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        c0 c0Var;
        String str;
        switch (this.f52734a) {
            case 0:
                String str2 = (String) obj2;
                JSONObject A = v0.A(str2, "status");
                v0 v0Var = this.f52735b;
                v0Var.x(this.f52736c, "emoji_status_access_requested", A);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (c0Var = v0Var.f52818c) != null) {
                    c0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                v0 v0Var2 = this.f52735b;
                if (v0Var2.f52818c != null && bool.booleanValue()) {
                    v0Var2.f52818c.w(bool2.booleanValue());
                }
                v0Var2.f52830l0.j(new p(v0Var2, this.f52736c, 1));
                return;
            case 2:
                String str3 = (String) obj2;
                v0 v0Var3 = this.f52735b;
                v0Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ki.r rVar = v0Var3.f52829k0;
                    rVar.f18517e = true;
                    rVar.k();
                }
                v0Var3.v(this.f52736c);
                return;
            case 3:
                i7 i7Var = this.f52736c;
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                boolean booleanValue = bool3.booleanValue();
                v0 v0Var4 = this.f52735b;
                if (booleanValue) {
                    v0Var4.f52829k0.f18517e = true;
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
                    v0Var4.x(i7Var, "biometry_auth_requested", jSONObject);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                String str5 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                v0 v0Var5 = this.f52735b;
                i7 i7Var2 = this.f52736c;
                if (str5 == null) {
                    v0Var5.x(i7Var2, "emoji_status_set", null);
                    c0 c0Var2 = v0Var5.f52818c;
                    if (c0Var2 != null) {
                        c0Var2.d(document);
                        return;
                    }
                    return;
                }
                v0Var5.x(i7Var2, "emoji_status_failed", v0.A(str5, "error"));
                return;
        }
    }
}
