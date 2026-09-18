package org.telegram.ui.web;

import ai.da;
import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
import yh.t5;
public final class d0 implements DialogInterface.OnDismissListener {
    public final int f38848a;
    public final boolean[] f38849b;
    public final Object f38850c;
    public final Object d;
    public final Object e;

    public d0(d1 d1Var, boolean[] zArr, da daVar, String str) {
        this.f38848a = 0;
        this.f38850c = d1Var;
        this.f38849b = zArr;
        this.d = daVar;
        this.e = str;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38848a) {
            case 0:
                d1 d1Var = (d1) this.f38850c;
                da daVar = (da) this.d;
                String str = (String) this.e;
                d1Var.getClass();
                boolean[] zArr = this.f38849b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    d1Var.y(daVar, "requested_chat_failed", d1.B(str, "req_id"));
                    return;
                }
                return;
            case 1:
                Utilities.Callback callback = (Utilities.Callback) this.f38850c;
                boolean[] zArr2 = (boolean[]) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                if (callback != null && !this.f38849b[0]) {
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
                Utilities.Callback callback3 = (Utilities.Callback) this.f38850c;
                boolean[] zArr3 = (boolean[]) this.d;
                Utilities.Callback callback4 = (Utilities.Callback) this.e;
                if (callback3 != null && !this.f38849b[0]) {
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
        this.f38848a = i10;
        this.f38850c = callback;
        this.f38849b = zArr;
        this.d = zArr2;
        this.e = obj;
    }
}
