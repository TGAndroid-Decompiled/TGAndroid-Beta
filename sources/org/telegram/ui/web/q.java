package org.telegram.ui.web;

import bi.n9;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q implements Utilities.Callback2 {
    public final int f41156a;
    public final c1 f41157b;
    public final n9 f41158c;

    public q(c1 c1Var, n9 n9Var, int i10) {
        this.f41156a = i10;
        this.f41157b = c1Var;
        this.f41158c = n9Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        h0 h0Var;
        String str;
        switch (this.f41156a) {
            case 0:
                String str2 = (String) obj2;
                JSONObject A = c1.A(str2, "status");
                c1 c1Var = this.f41157b;
                c1Var.x(this.f41158c, "emoji_status_access_requested", A);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (h0Var = c1Var.f40985c) != null) {
                    h0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                c1 c1Var2 = this.f41157b;
                if (c1Var2.f40985c != null && bool.booleanValue()) {
                    c1Var2.f40985c.w(bool2.booleanValue());
                }
                c1Var2.f40995k0.j(new r(c1Var2, this.f41158c, 1));
                return;
            case 2:
                String str3 = (String) obj2;
                c1 c1Var3 = this.f41157b;
                c1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    fi.r rVar = c1Var3.f40994j0;
                    rVar.e = true;
                    rVar.k();
                }
                c1Var3.v(this.f41158c);
                return;
            case 3:
                n9 n9Var = this.f41158c;
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                c1 c1Var4 = this.f41157b;
                c1Var4.getClass();
                if (bool3.booleanValue()) {
                    c1Var4.f40994j0.e = true;
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
                    c1Var4.x(n9Var, "biometry_auth_requested", jSONObject);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                String str5 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                c1 c1Var5 = this.f41157b;
                n9 n9Var2 = this.f41158c;
                if (str5 == null) {
                    c1Var5.x(n9Var2, "emoji_status_set", null);
                    h0 h0Var2 = c1Var5.f40985c;
                    if (h0Var2 != null) {
                        h0Var2.d(document);
                        return;
                    }
                    return;
                }
                c1Var5.x(n9Var2, "emoji_status_failed", c1.A(str5, "error"));
                return;
        }
    }
}
