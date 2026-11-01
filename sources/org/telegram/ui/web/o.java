package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.f8;
import org.telegram.messenger.k20;
import org.telegram.tgnet.TLRPC;
public final class o implements k20 {
    public final int f42948a;
    public final z0 f42949b;
    public final x0 f42950c;

    public o(z0 z0Var, x0 x0Var, int i10) {
        this.f42948a = i10;
        this.f42949b = z0Var;
        this.f42950c = x0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        d0 d0Var;
        String str;
        switch (this.f42948a) {
            case 0:
                String str2 = (String) obj2;
                JSONObject A = z0.A(str2, "status");
                z0 z0Var = this.f42949b;
                z0Var.y(this.f42950c, "emoji_status_access_requested", A);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (d0Var = z0Var.f43063c) != null) {
                    d0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                z0 z0Var2 = this.f42949b;
                if (z0Var2.f43063c != null && bool.booleanValue()) {
                    z0Var2.f43063c.w(bool2.booleanValue());
                }
                z0Var2.f43073k0.j(new p(z0Var2, this.f42950c, 1));
                return;
            case 2:
                String str3 = (String) obj2;
                z0 z0Var3 = this.f42949b;
                z0Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    xh.n nVar = z0Var3.f43072j0;
                    nVar.e = true;
                    nVar.k();
                }
                z0Var3.v(this.f42950c);
                return;
            case 3:
                x0 x0Var = this.f42950c;
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                boolean booleanValue = bool3.booleanValue();
                z0 z0Var4 = this.f42949b;
                if (booleanValue) {
                    z0Var4.f43072j0.e = true;
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
                z0 z0Var5 = this.f42949b;
                x0 x0Var2 = this.f42950c;
                if (str5 == null) {
                    z0Var5.y(x0Var2, "emoji_status_set", null);
                    d0 d0Var2 = z0Var5.f43063c;
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
