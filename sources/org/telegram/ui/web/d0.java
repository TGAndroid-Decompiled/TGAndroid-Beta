package org.telegram.ui.web;

import ai.da;
import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
import yh.t5;
public final class d0 implements DialogInterface.OnDismissListener {
    public final int f42160a;
    public final boolean[] f42161b;
    public final Object f42162c;
    public final Object d;
    public final Object f42163e;

    public d0(c1 c1Var, boolean[] zArr, da daVar, String str) {
        this.f42160a = 0;
        this.f42162c = c1Var;
        this.f42161b = zArr;
        this.d = daVar;
        this.f42163e = str;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42160a) {
            case 0:
                c1 c1Var = (c1) this.f42162c;
                da daVar = (da) this.d;
                String str = (String) this.f42163e;
                c1Var.getClass();
                boolean[] zArr = this.f42161b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    c1Var.y(daVar, "requested_chat_failed", c1.B(str, "req_id"));
                    return;
                }
                return;
            case 1:
                Utilities.Callback callback = (Utilities.Callback) this.f42162c;
                boolean[] zArr2 = (boolean[]) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f42163e;
                if (callback != null && !this.f42161b[0]) {
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
                Utilities.Callback callback3 = (Utilities.Callback) this.f42162c;
                boolean[] zArr3 = (boolean[]) this.d;
                Utilities.Callback callback4 = (Utilities.Callback) this.f42163e;
                if (callback3 != null && !this.f42161b[0]) {
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

    public d0(t5 t5Var, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.f42160a = i10;
        this.f42162c = callback;
        this.f42161b = zArr;
        this.d = zArr2;
        this.f42163e = obj;
    }
}
