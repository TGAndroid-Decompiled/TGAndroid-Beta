package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class s implements Utilities.Callback2 {

    public final int f43990a;

    public final z0 f43991b;

    public s(z0 z0Var, int i10) {
        this.f43990a = i10;
        this.f43991b = z0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        f0 f0Var;
        switch (this.f43990a) {
            case 0:
                String str = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                z0 z0Var = this.f43991b;
                if (str != null) {
                    z0Var.v("emoji_status_failed", z0.x(str, "error"));
                } else {
                    z0Var.v("emoji_status_set", null);
                    f0 f0Var2 = z0Var.f44061c;
                    if (f0Var2 != null) {
                        f0Var2.d(document);
                    }
                }
                break;
            case 1:
                String str2 = (String) obj2;
                JSONObject jSONObjectX = z0.x(str2, "status");
                z0 z0Var2 = this.f43991b;
                z0Var2.v("emoji_status_access_requested", jSONObjectX);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (f0Var = z0Var2.f44061c) != null) {
                    f0Var.a();
                    break;
                }
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                z0 z0Var3 = this.f43991b;
                if (z0Var3.f44061c != null && bool.booleanValue()) {
                    z0Var3.f44061c.w(bool2.booleanValue());
                }
                z0Var3.f44068g0.k(new r(z0Var3, 2));
                break;
            case 3:
                z0 z0Var4 = this.f43991b;
                z0Var4.getClass();
                if (((Boolean) obj).booleanValue()) {
                    nh.q qVar = z0Var4.f44067f0;
                    qVar.f18890e = true;
                    qVar.k();
                }
                z0Var4.t();
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                String str3 = (String) obj2;
                z0 z0Var5 = this.f43991b;
                z0Var5.getClass();
                if (bool3.booleanValue()) {
                    z0Var5.f44067f0.f18890e = true;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool3.booleanValue() ? "authorized" : "failed");
                    jSONObject.put("token", str3);
                    z0Var5.v("biometry_auth_requested", jSONObject);
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                break;
        }
    }
}
