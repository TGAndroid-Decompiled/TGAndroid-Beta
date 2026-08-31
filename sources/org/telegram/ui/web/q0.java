package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class q0 implements DialogInterface.OnDismissListener {
    public final int f42673a;
    public final boolean[] f42674b;
    public final JsResult f42675c;

    public q0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42673a = i10;
        this.f42674b = zArr;
        this.f42675c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42673a) {
            case 0:
                boolean[] zArr = this.f42674b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42675c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f42674b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42675c.cancel();
                    return;
                }
                return;
        }
    }
}
