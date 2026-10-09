package org.telegram.ui.web;

import ai.ea;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q implements Utilities.Callback2 {
    public final int f43435a;
    public final b1 f43436b;
    public final ea f43437c;

    public q(b1 b1Var, ea eaVar, int i10) {
        this.f43435a = i10;
        this.f43436b = b1Var;
        this.f43437c = eaVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        g0 g0Var;
        String str;
        switch (this.f43435a) {
            case 0:
                String str2 = (String) obj2;
                JSONObject A = b1.A(str2, "status");
                b1 b1Var = this.f43436b;
                b1Var.x(this.f43437c, "emoji_status_access_requested", A);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (g0Var = b1Var.f43239c) != null) {
                    g0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                b1 b1Var2 = this.f43436b;
                if (b1Var2.f43239c != null && bool.booleanValue()) {
                    b1Var2.f43239c.w(bool2.booleanValue());
                }
                b1Var2.f43250k0.j(new r(b1Var2, this.f43437c, 1));
                return;
            case 2:
                String str3 = (String) obj2;
                b1 b1Var3 = this.f43436b;
                b1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ei.r rVar = b1Var3.f43249j0;
                    rVar.f9319e = true;
                    rVar.k();
                }
                b1Var3.v(this.f43437c);
                return;
            case 3:
                ea eaVar = this.f43437c;
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                b1 b1Var4 = this.f43436b;
                b1Var4.getClass();
                if (bool3.booleanValue()) {
                    b1Var4.f43249j0.f9319e = true;
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
                    b1Var4.x(eaVar, "biometry_auth_requested", jSONObject);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                String str5 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                b1 b1Var5 = this.f43436b;
                ea eaVar2 = this.f43437c;
                if (str5 == null) {
                    b1Var5.x(eaVar2, "emoji_status_set", null);
                    g0 g0Var2 = b1Var5.f43239c;
                    if (g0Var2 != null) {
                        g0Var2.d(document);
                        return;
                    }
                    return;
                }
                b1Var5.x(eaVar2, "emoji_status_failed", b1.A(str5, "error"));
                return;
        }
    }
}
