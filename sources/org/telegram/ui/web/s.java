package org.telegram.ui.web;

import ci.y7;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s implements Utilities.Callback2 {
    public final int f42725a;
    public final b1 f42726b;
    public final y7 f42727c;

    public s(b1 b1Var, y7 y7Var, int i10) {
        this.f42725a = i10;
        this.f42726b = b1Var;
        this.f42727c = y7Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        h0 h0Var;
        String str;
        switch (this.f42725a) {
            case 0:
                String str2 = (String) obj2;
                JSONObject A = b1.A(str2, "status");
                b1 b1Var = this.f42726b;
                b1Var.x(this.f42727c, "emoji_status_access_requested", A);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (h0Var = b1Var.f42523c) != null) {
                    h0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                b1 b1Var2 = this.f42726b;
                if (b1Var2.f42523c != null && bool.booleanValue()) {
                    b1Var2.f42523c.w(bool2.booleanValue());
                }
                b1Var2.f42533k0.j(new t(b1Var2, this.f42727c, 1));
                return;
            case 2:
                String str3 = (String) obj2;
                b1 b1Var3 = this.f42726b;
                b1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    gi.r rVar = b1Var3.f42532j0;
                    rVar.e = true;
                    rVar.k();
                }
                b1Var3.v(this.f42727c);
                return;
            case 3:
                y7 y7Var = this.f42727c;
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                b1 b1Var4 = this.f42726b;
                b1Var4.getClass();
                if (bool3.booleanValue()) {
                    b1Var4.f42532j0.e = true;
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
                    b1Var4.x(y7Var, "biometry_auth_requested", jSONObject);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                String str5 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                b1 b1Var5 = this.f42726b;
                y7 y7Var2 = this.f42727c;
                if (str5 == null) {
                    b1Var5.x(y7Var2, "emoji_status_set", null);
                    h0 h0Var2 = b1Var5.f42523c;
                    if (h0Var2 != null) {
                        h0Var2.d(document);
                        return;
                    }
                    return;
                }
                b1Var5.x(y7Var2, "emoji_status_failed", b1.A(str5, "error"));
                return;
        }
    }
}
