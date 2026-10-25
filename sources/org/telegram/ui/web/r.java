package org.telegram.ui.web;

import di.x7;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r implements Utilities.Callback2 {
    public final int f45360a;
    public final a1 f45361b;
    public final x7 f45362c;

    public r(a1 a1Var, x7 x7Var, int i10) {
        this.f45360a = i10;
        this.f45361b = a1Var;
        this.f45362c = x7Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        g0 g0Var;
        String str;
        switch (this.f45360a) {
            case 0:
                String str2 = (String) obj2;
                JSONObject A = a1.A(str2, "status");
                a1 a1Var = this.f45361b;
                a1Var.x(this.f45362c, "emoji_status_access_requested", A);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (g0Var = a1Var.f45155c) != null) {
                    g0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                a1 a1Var2 = this.f45361b;
                if (a1Var2.f45155c != null && bool.booleanValue()) {
                    a1Var2.f45155c.w(bool2.booleanValue());
                }
                a1Var2.f45165k0.j(new s(a1Var2, this.f45362c, 1));
                return;
            case 2:
                String str3 = (String) obj2;
                a1 a1Var3 = this.f45361b;
                a1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    hi.y yVar = a1Var3.f45164j0;
                    yVar.e = true;
                    yVar.k();
                }
                a1Var3.v(this.f45362c);
                return;
            case 3:
                x7 x7Var = this.f45362c;
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                a1 a1Var4 = this.f45361b;
                a1Var4.getClass();
                if (bool3.booleanValue()) {
                    a1Var4.f45164j0.e = true;
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
                    a1Var4.x(x7Var, "biometry_auth_requested", jSONObject);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                String str5 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                a1 a1Var5 = this.f45361b;
                x7 x7Var2 = this.f45362c;
                if (str5 == null) {
                    a1Var5.x(x7Var2, "emoji_status_set", null);
                    g0 g0Var2 = a1Var5.f45155c;
                    if (g0Var2 != null) {
                        g0Var2.d(document);
                        return;
                    }
                    return;
                }
                a1Var5.x(x7Var2, "emoji_status_failed", a1.A(str5, "error"));
                return;
        }
    }
}
