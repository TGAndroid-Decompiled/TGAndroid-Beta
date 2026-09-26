package org.telegram.ui.web;

import ai.da;
import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
import yh.s5;
public final class c0 implements DialogInterface.OnDismissListener {
    public final int f39036a;
    public final boolean[] f39037b;
    public final Object f39038c;
    public final Object d;
    public final Object e;

    public c0(b1 b1Var, boolean[] zArr, da daVar, String str) {
        this.f39036a = 0;
        this.f39038c = b1Var;
        this.f39037b = zArr;
        this.d = daVar;
        this.e = str;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39036a) {
            case 0:
                b1 b1Var = (b1) this.f39038c;
                da daVar = (da) this.d;
                String str = (String) this.e;
                b1Var.getClass();
                boolean[] zArr = this.f39037b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    b1Var.y(daVar, "requested_chat_failed", b1.B(str, "req_id"));
                    return;
                }
                return;
            case 1:
                Utilities.Callback callback = (Utilities.Callback) this.f39038c;
                boolean[] zArr2 = (boolean[]) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                if (callback != null && !this.f39037b[0]) {
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
                Utilities.Callback callback3 = (Utilities.Callback) this.f39038c;
                boolean[] zArr3 = (boolean[]) this.d;
                Utilities.Callback callback4 = (Utilities.Callback) this.e;
                if (callback3 != null && !this.f39037b[0]) {
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

    public c0(s5 s5Var, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.f39036a = i10;
        this.f39038c = callback;
        this.f39037b = zArr;
        this.d = zArr2;
        this.e = obj;
    }
}
