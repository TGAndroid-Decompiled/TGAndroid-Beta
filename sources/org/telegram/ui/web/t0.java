package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class t0 implements DialogInterface.OnDismissListener {
    public final int f42271a;
    public final boolean[] f42272b;
    public final JsResult f42273c;

    public t0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42271a = i10;
        this.f42272b = zArr;
        this.f42273c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42271a) {
            case 0:
                boolean[] zArr = this.f42272b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42273c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f42272b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42273c.cancel();
                    return;
                }
                return;
        }
    }
}
