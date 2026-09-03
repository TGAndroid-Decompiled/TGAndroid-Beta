package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s implements Utilities.Callback2 {
    public final int f42647a;
    public final a1 f42648b;

    public s(a1 a1Var, int i10) {
        this.f42647a = i10;
        this.f42648b = a1Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        f0 f0Var;
        String str;
        switch (this.f42647a) {
            case 0:
                String str2 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                a1 a1Var = this.f42648b;
                if (str2 == null) {
                    a1Var.v("emoji_status_set", null);
                    f0 f0Var2 = a1Var.f42433c;
                    if (f0Var2 != null) {
                        f0Var2.d(document);
                        return;
                    }
                    return;
                }
                a1Var.v("emoji_status_failed", a1.x(str2, "error"));
                return;
            case 1:
                String str3 = (String) obj2;
                JSONObject x10 = a1.x(str3, "status");
                a1 a1Var2 = this.f42648b;
                a1Var2.v("emoji_status_access_requested", x10);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str3) && (f0Var = a1Var2.f42433c) != null) {
                    f0Var.a();
                    return;
                }
                return;
            case 2:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                a1 a1Var3 = this.f42648b;
                if (a1Var3.f42433c != null && bool.booleanValue()) {
                    a1Var3.f42433c.w(bool2.booleanValue());
                }
                a1Var3.f42441h0.k(new r(a1Var3, 2));
                return;
            case 3:
                String str4 = (String) obj2;
                a1 a1Var4 = this.f42648b;
                a1Var4.getClass();
                if (((Boolean) obj).booleanValue()) {
                    sh.p pVar = a1Var4.f42440g0;
                    pVar.f47605e = true;
                    pVar.k();
                }
                a1Var4.t();
                return;
            default:
                Boolean bool3 = (Boolean) obj;
                String str5 = (String) obj2;
                a1 a1Var5 = this.f42648b;
                a1Var5.getClass();
                if (bool3.booleanValue()) {
                    a1Var5.f42440g0.f47605e = true;
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
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }
}
