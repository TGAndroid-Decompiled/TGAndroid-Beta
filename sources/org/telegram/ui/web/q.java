package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q implements Utilities.Callback2 {
    public final int f38809a;
    public final b1 f38810b;
    public final da f38811c;

    public q(b1 b1Var, da daVar, int i10) {
        this.f38809a = i10;
        this.f38810b = b1Var;
        this.f38811c = daVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        g0 g0Var;
        String str;
        switch (this.f38809a) {
            case 0:
                String str2 = (String) obj2;
                JSONObject B = b1.B(str2, "status");
                b1 b1Var = this.f38810b;
                b1Var.y(this.f38811c, "emoji_status_access_requested", B);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (g0Var = b1Var.f38633c) != null) {
                    g0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                b1 b1Var2 = this.f38810b;
                if (b1Var2.f38633c != null && bool.booleanValue()) {
                    b1Var2.f38633c.w(bool2.booleanValue());
                }
                b1Var2.f38643k0.k(new r(b1Var2, this.f38811c, 1));
                return;
            case 2:
                String str3 = (String) obj2;
                b1 b1Var3 = this.f38810b;
                b1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ei.r rVar = b1Var3.f38642j0;
                    rVar.e = true;
                    rVar.k();
                }
                b1Var3.w(this.f38811c);
                return;
            case 3:
                da daVar = this.f38811c;
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                b1 b1Var4 = this.f38810b;
                b1Var4.getClass();
                if (bool3.booleanValue()) {
                    b1Var4.f38642j0.e = true;
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
                    b1Var4.y(daVar, "biometry_auth_requested", jSONObject);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                String str5 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                b1 b1Var5 = this.f38810b;
                da daVar2 = this.f38811c;
                if (str5 == null) {
                    b1Var5.y(daVar2, "emoji_status_set", null);
                    g0 g0Var2 = b1Var5.f38633c;
                    if (g0Var2 != null) {
                        g0Var2.d(document);
                        return;
                    }
                    return;
                }
                b1Var5.y(daVar2, "emoji_status_failed", b1.B(str5, "error"));
                return;
        }
    }
}
