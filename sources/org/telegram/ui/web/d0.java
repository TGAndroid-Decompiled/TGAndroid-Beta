package org.telegram.ui.web;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
import xh.v5;
public final class d0 implements DialogInterface.OnDismissListener {
    public final int f37916a;
    public final boolean[] f37917b;
    public final Object f37918c;
    public final Object d;
    public final Object e;

    public d0(c1 c1Var, boolean[] zArr, a1 a1Var, String str) {
        this.f37916a = 0;
        this.f37918c = c1Var;
        this.f37917b = zArr;
        this.d = a1Var;
        this.e = str;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37916a) {
            case 0:
                c1 c1Var = (c1) this.f37918c;
                a1 a1Var = (a1) this.d;
                String str = (String) this.e;
                c1Var.getClass();
                boolean[] zArr = this.f37917b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    c1Var.z(a1Var, "requested_chat_failed", c1.B(str, "req_id"));
                    return;
                }
                return;
            case 1:
                Utilities.Callback callback = (Utilities.Callback) this.f37918c;
                boolean[] zArr2 = (boolean[]) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                if (callback != null && !this.f37917b[0]) {
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
                Utilities.Callback callback3 = (Utilities.Callback) this.f37918c;
                boolean[] zArr3 = (boolean[]) this.d;
                Utilities.Callback callback4 = (Utilities.Callback) this.e;
                if (callback3 != null && !this.f37917b[0]) {
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

    public d0(v5 v5Var, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.f37916a = i10;
        this.f37918c = callback;
        this.f37917b = zArr;
        this.d = zArr2;
        this.e = obj;
    }
}
