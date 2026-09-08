package org.telegram.ui.web;

import android.content.DialogInterface;
import bi.k9;
import org.telegram.messenger.Utilities;
import zh.s5;
public final class e0 implements DialogInterface.OnDismissListener {
    public final int f42099a;
    public final boolean[] f42100b;
    public final Object f42101c;
    public final Object d;
    public final Object f42102e;

    public e0(d1 d1Var, boolean[] zArr, k9 k9Var, String str) {
        this.f42099a = 0;
        this.f42101c = d1Var;
        this.f42100b = zArr;
        this.d = k9Var;
        this.f42102e = str;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42099a) {
            case 0:
                d1 d1Var = (d1) this.f42101c;
                k9 k9Var = (k9) this.d;
                String str = (String) this.f42102e;
                d1Var.getClass();
                boolean[] zArr = this.f42100b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    d1Var.y(k9Var, "requested_chat_failed", d1.B(str, "req_id"));
                    return;
                }
                return;
            case 1:
                Utilities.Callback callback = (Utilities.Callback) this.f42101c;
                boolean[] zArr2 = (boolean[]) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f42102e;
                if (callback != null && !this.f42100b[0]) {
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
                Utilities.Callback callback3 = (Utilities.Callback) this.f42101c;
                boolean[] zArr3 = (boolean[]) this.d;
                Utilities.Callback callback4 = (Utilities.Callback) this.f42102e;
                if (callback3 != null && !this.f42100b[0]) {
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

    public e0(s5 s5Var, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.f42099a = i10;
        this.f42101c = callback;
        this.f42100b = zArr;
        this.d = zArr2;
        this.f42102e = obj;
    }
}
