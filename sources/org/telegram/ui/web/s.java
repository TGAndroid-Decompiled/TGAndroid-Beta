package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s implements Utilities.Callback2 {
    public final int f39623a;
    public final a1 f39624b;

    public s(a1 a1Var, int i10) {
        this.f39623a = i10;
        this.f39624b = a1Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        e0 e0Var;
        String str;
        switch (this.f39623a) {
            case 0:
                String str2 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                a1 a1Var = this.f39624b;
                if (str2 == null) {
                    a1Var.v("emoji_status_set", null);
                    e0 e0Var2 = a1Var.f39424c;
                    if (e0Var2 != null) {
                        e0Var2.d(document);
                        return;
                    }
                    return;
                }
                a1Var.v("emoji_status_failed", a1.x(str2, "error"));
                return;
            case 1:
                String str3 = (String) obj2;
                JSONObject x10 = a1.x(str3, "status");
                a1 a1Var2 = this.f39624b;
                a1Var2.v("emoji_status_access_requested", x10);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str3) && (e0Var = a1Var2.f39424c) != null) {
                    e0Var.a();
                    return;
                }
                return;
            case 2:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                a1 a1Var3 = this.f39624b;
                if (a1Var3.f39424c != null && bool.booleanValue()) {
                    a1Var3.f39424c.w(bool2.booleanValue());
                }
                a1Var3.f39431h0.k(new r(a1Var3, 2));
                return;
            case 3:
                String str4 = (String) obj2;
                a1 a1Var4 = this.f39624b;
                a1Var4.getClass();
                if (((Boolean) obj).booleanValue()) {
                    rh.q qVar = a1Var4.f39430g0;
                    qVar.e = true;
                    qVar.k();
                }
                a1Var4.t();
                return;
            default:
                Boolean bool3 = (Boolean) obj;
                String str5 = (String) obj2;
                a1 a1Var5 = this.f39624b;
                a1Var5.getClass();
                if (bool3.booleanValue()) {
                    a1Var5.f39430g0.e = true;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (bool3.booleanValue()) {
                        str = "authorized";
                    } else {
                        str = "failed";
                    }
                    jSONObject.put("status", str);
                    jSONObject.put("token", str5);
                    a1Var5.v("biometry_auth_requested", jSONObject);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
        }
    }
}
