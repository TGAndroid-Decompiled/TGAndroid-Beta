package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class o0 implements DialogInterface.OnDismissListener {
    public final int f51245a;
    public final boolean[] f51246b;
    public final JsResult f51247c;

    public o0(boolean[] zArr, JsResult jsResult, int i7) {
        this.f51245a = i7;
        this.f51246b = zArr;
        this.f51247c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f51245a) {
            case 0:
                boolean[] zArr = this.f51246b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f51247c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f51246b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f51247c.cancel();
                    return;
                }
                return;
        }
    }
}
