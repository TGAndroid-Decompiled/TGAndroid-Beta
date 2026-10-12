package org.telegram.ui.web;

import bi.n9;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q implements Utilities.Callback2 {
    public final int f41463a;
    public final b1 f41464b;
    public final n9 f41465c;

    public q(b1 b1Var, n9 n9Var, int i10) {
        this.f41463a = i10;
        this.f41464b = b1Var;
        this.f41465c = n9Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        h0 h0Var;
        String str;
        switch (this.f41463a) {
            case 0:
                String str2 = (String) obj2;
                JSONObject A = b1.A(str2, "status");
                b1 b1Var = this.f41464b;
                b1Var.x(this.f41465c, "emoji_status_access_requested", A);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (h0Var = b1Var.f41286c) != null) {
                    h0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                b1 b1Var2 = this.f41464b;
                if (b1Var2.f41286c != null && bool.booleanValue()) {
                    b1Var2.f41286c.w(bool2.booleanValue());
                }
                b1Var2.f41296k0.j(new r(b1Var2, this.f41465c, 1));
                return;
            case 2:
                String str3 = (String) obj2;
                b1 b1Var3 = this.f41464b;
                b1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    fi.r rVar = b1Var3.f41295j0;
                    rVar.e = true;
                    rVar.k();
                }
                b1Var3.v(this.f41465c);
                return;
            case 3:
                n9 n9Var = this.f41465c;
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                b1 b1Var4 = this.f41464b;
                b1Var4.getClass();
                if (bool3.booleanValue()) {
                    b1Var4.f41295j0.e = true;
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
                    b1Var4.x(n9Var, "biometry_auth_requested", jSONObject);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                String str5 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                b1 b1Var5 = this.f41464b;
                n9 n9Var2 = this.f41465c;
                if (str5 == null) {
                    b1Var5.x(n9Var2, "emoji_status_set", null);
                    h0 h0Var2 = b1Var5.f41286c;
                    if (h0Var2 != null) {
                        h0Var2.d(document);
                        return;
                    }
                    return;
                }
                b1Var5.x(n9Var2, "emoji_status_failed", b1.A(str5, "error"));
                return;
        }
    }
}
