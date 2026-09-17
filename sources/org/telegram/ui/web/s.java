package org.telegram.ui.web;

import bi.k9;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s implements Utilities.Callback2 {
    public final int f42234a;
    public final d1 f42235b;
    public final k9 f42236c;

    public s(d1 d1Var, k9 k9Var, int i10) {
        this.f42234a = i10;
        this.f42235b = d1Var;
        this.f42236c = k9Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        i0 i0Var;
        String str;
        switch (this.f42234a) {
            case 0:
                String str2 = (String) obj2;
                JSONObject B = d1.B(str2, "status");
                d1 d1Var = this.f42235b;
                d1Var.y(this.f42236c, "emoji_status_access_requested", B);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (i0Var = d1Var.f42040c) != null) {
                    i0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                d1 d1Var2 = this.f42235b;
                if (d1Var2.f42040c != null && bool.booleanValue()) {
                    d1Var2.f42040c.w(bool2.booleanValue());
                }
                d1Var2.f42051k0.k(new t(d1Var2, this.f42236c, 1));
                return;
            case 2:
                String str3 = (String) obj2;
                d1 d1Var3 = this.f42235b;
                d1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    fi.s sVar = d1Var3.f42050j0;
                    sVar.f9941e = true;
                    sVar.k();
                }
                d1Var3.w(this.f42236c);
                return;
            case 3:
                k9 k9Var = this.f42236c;
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                d1 d1Var4 = this.f42235b;
                d1Var4.getClass();
                if (bool3.booleanValue()) {
                    d1Var4.f42050j0.f9941e = true;
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
                    d1Var4.y(k9Var, "biometry_auth_requested", jSONObject);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                String str5 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                d1 d1Var5 = this.f42235b;
                k9 k9Var2 = this.f42236c;
                if (str5 == null) {
                    d1Var5.y(k9Var2, "emoji_status_set", null);
                    i0 i0Var2 = d1Var5.f42040c;
                    if (i0Var2 != null) {
                        i0Var2.d(document);
                        return;
                    }
                    return;
                }
                d1Var5.y(k9Var2, "emoji_status_failed", d1.B(str5, "error"));
                return;
        }
    }
}
