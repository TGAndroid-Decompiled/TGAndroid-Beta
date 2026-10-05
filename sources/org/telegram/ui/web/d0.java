package org.telegram.ui.web;

import ai.da;
import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
import yh.u5;
public final class d0 implements DialogInterface.OnDismissListener {
    public final int f42179a;
    public final boolean[] f42180b;
    public final Object f42181c;
    public final Object d;
    public final Object f42182e;

    public d0(c1 c1Var, boolean[] zArr, da daVar, String str) {
        this.f42179a = 0;
        this.f42181c = c1Var;
        this.f42180b = zArr;
        this.d = daVar;
        this.f42182e = str;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42179a) {
            case 0:
                c1 c1Var = (c1) this.f42181c;
                da daVar = (da) this.d;
                String str = (String) this.f42182e;
                c1Var.getClass();
                boolean[] zArr = this.f42180b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    c1Var.y(daVar, "requested_chat_failed", c1.B(str, "req_id"));
                    return;
                }
                return;
            case 1:
                Utilities.Callback callback = (Utilities.Callback) this.f42181c;
                boolean[] zArr2 = (boolean[]) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f42182e;
                if (callback != null && !this.f42180b[0]) {
                    callback.run(Boolean.FALSE);
                    if (!zArr2[0]) {
                        callback2.run("cancelled", 0L);
                        zArr2[0] = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                Utilities.Callback callback3 = (Utilities.Callback) this.f42181c;
                boolean[] zArr3 = (boolean[]) this.d;
                Utilities.Callback callback4 = (Utilities.Callback) this.f42182e;
                if (callback3 != null && !this.f42180b[0]) {
                    callback3.run(Boolean.FALSE);
                    if (!zArr3[0] && callback4 != null) {
                        callback4.run("cancelled");
                        zArr3[0] = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public d0(u5 u5Var, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.f42179a = i10;
        this.f42181c = callback;
        this.f42180b = zArr;
        this.d = zArr2;
        this.f42182e = obj;
    }
}
