package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f43239a;
    public final boolean[] f43240b;
    public final JsResult f43241c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f43239a = i10;
        this.f43240b = zArr;
        this.f43241c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43239a) {
            case 0:
                boolean[] zArr = this.f43240b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f43241c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f43240b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f43241c.cancel();
                    return;
                }
                return;
        }
    }
}
