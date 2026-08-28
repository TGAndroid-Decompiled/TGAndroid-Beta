package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r implements Utilities.Callback2 {
    public final int f44003a;
    public final y0 f44004b;

    public r(y0 y0Var, int i9) {
        this.f44003a = i9;
        this.f44004b = y0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        e0 e0Var;
        String str;
        switch (this.f44003a) {
            case 0:
                String str2 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                y0 y0Var = this.f44004b;
                if (str2 == null) {
                    y0Var.v("emoji_status_set", null);
                    e0 e0Var2 = y0Var.f44074c;
                    if (e0Var2 != null) {
                        e0Var2.d(document);
                        return;
                    }
                    return;
                }
                y0Var.v("emoji_status_failed", y0.x(str2, "error"));
                return;
            case 1:
                String str3 = (String) obj2;
                JSONObject x10 = y0.x(str3, "status");
                y0 y0Var2 = this.f44004b;
                y0Var2.v("emoji_status_access_requested", x10);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str3) && (e0Var = y0Var2.f44074c) != null) {
                    e0Var.a();
                    return;
                }
                return;
            case 2:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                y0 y0Var3 = this.f44004b;
                if (y0Var3.f44074c != null && bool.booleanValue()) {
                    y0Var3.f44074c.w(bool2.booleanValue());
                }
                y0Var3.f44081g0.k(new q(y0Var3, 2));
                return;
            case 3:
                String str4 = (String) obj2;
                y0 y0Var4 = this.f44004b;
                y0Var4.getClass();
                if (((Boolean) obj).booleanValue()) {
                    mh.r rVar = y0Var4.f44080f0;
                    rVar.f18064e = true;
                    rVar.k();
                }
                y0Var4.t();
                return;
            default:
                Boolean bool3 = (Boolean) obj;
                String str5 = (String) obj2;
                y0 y0Var5 = this.f44004b;
                y0Var5.getClass();
                if (bool3.booleanValue()) {
                    y0Var5.f44080f0.f18064e = true;
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
                    y0Var5.v("biometry_auth_requested", jSONObject);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
