package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s implements Utilities.Callback2 {
    public final int f44193a;
    public final z0 f44194b;

    public s(z0 z0Var, int i10) {
        this.f44193a = i10;
        this.f44194b = z0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        f0 f0Var;
        String str;
        switch (this.f44193a) {
            case 0:
                String str2 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                z0 z0Var = this.f44194b;
                if (str2 == null) {
                    z0Var.v("emoji_status_set", null);
                    f0 f0Var2 = z0Var.f44264c;
                    if (f0Var2 != null) {
                        f0Var2.d(document);
                        return;
                    }
                    return;
                }
                z0Var.v("emoji_status_failed", z0.x(str2, "error"));
                return;
            case 1:
                String str3 = (String) obj2;
                JSONObject x4 = z0.x(str3, "status");
                z0 z0Var2 = this.f44194b;
                z0Var2.v("emoji_status_access_requested", x4);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str3) && (f0Var = z0Var2.f44264c) != null) {
                    f0Var.a();
                    return;
                }
                return;
            case 2:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                z0 z0Var3 = this.f44194b;
                if (z0Var3.f44264c != null && bool.booleanValue()) {
                    z0Var3.f44264c.w(bool2.booleanValue());
                }
                z0Var3.f44271g0.k(new r(z0Var3, 2));
                return;
            case 3:
                String str4 = (String) obj2;
                z0 z0Var4 = this.f44194b;
                z0Var4.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ph.p pVar = z0Var4.f44270f0;
                    pVar.f45944e = true;
                    pVar.k();
                }
                z0Var4.t();
                return;
            default:
                Boolean bool3 = (Boolean) obj;
                String str5 = (String) obj2;
                z0 z0Var5 = this.f44194b;
                z0Var5.getClass();
                if (bool3.booleanValue()) {
                    z0Var5.f44270f0.f45944e = true;
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
                    z0Var5.v("biometry_auth_requested", jSONObject);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
