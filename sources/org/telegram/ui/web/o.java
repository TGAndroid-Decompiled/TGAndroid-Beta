package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.f8;
import org.telegram.messenger.j20;
import org.telegram.tgnet.TLRPC;
public final class o implements j20 {
    public final int f43146a;
    public final z0 f43147b;
    public final x0 f43148c;

    public o(z0 z0Var, x0 x0Var, int i10) {
        this.f43146a = i10;
        this.f43147b = z0Var;
        this.f43148c = x0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        d0 d0Var;
        String str;
        switch (this.f43146a) {
            case 0:
                String str2 = (String) obj2;
                JSONObject A = z0.A(str2, "status");
                z0 z0Var = this.f43147b;
                z0Var.y(this.f43148c, "emoji_status_access_requested", A);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (d0Var = z0Var.f43261c) != null) {
                    d0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                z0 z0Var2 = this.f43147b;
                if (z0Var2.f43261c != null && bool.booleanValue()) {
                    z0Var2.f43261c.w(bool2.booleanValue());
                }
                z0Var2.f43271k0.j(new p(z0Var2, this.f43148c, 1));
                return;
            case 2:
                String str3 = (String) obj2;
                z0 z0Var3 = this.f43147b;
                z0Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    xh.n nVar = z0Var3.f43270j0;
                    nVar.e = true;
                    nVar.k();
                }
                z0Var3.v(this.f43148c);
                return;
            case 3:
                x0 x0Var = this.f43148c;
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                boolean booleanValue = bool3.booleanValue();
                z0 z0Var4 = this.f43147b;
                if (booleanValue) {
                    z0Var4.f43270j0.e = true;
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
                    z0Var4.y(x0Var, "biometry_auth_requested", jSONObject);
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            default:
                String str5 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                z0 z0Var5 = this.f43147b;
                x0 x0Var2 = this.f43148c;
                if (str5 == null) {
                    z0Var5.y(x0Var2, "emoji_status_set", null);
                    d0 d0Var2 = z0Var5.f43261c;
                    if (d0Var2 != null) {
                        d0Var2.d(document);
                        return;
                    }
                    return;
                }
                z0Var5.y(x0Var2, "emoji_status_failed", z0.A(str5, "error"));
                return;
        }
    }
}
