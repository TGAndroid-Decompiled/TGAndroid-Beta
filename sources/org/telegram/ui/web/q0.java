package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class q0 implements DialogInterface.OnDismissListener {
    public final int f39610a;
    public final boolean[] f39611b;
    public final JsResult f39612c;

    public q0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39610a = i10;
        this.f39611b = zArr;
        this.f39612c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39610a) {
            case 0:
                boolean[] zArr = this.f39611b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39612c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f39611b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39612c.cancel();
                    return;
                }
                return;
        }
    }
}
