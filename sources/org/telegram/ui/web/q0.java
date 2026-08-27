package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;

public final class q0 implements DialogInterface.OnDismissListener {

    public final int f43943a;

    public final boolean[] f43944b;

    public final JsResult f43945c;

    public q0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f43943a = i10;
        this.f43944b = zArr;
        this.f43945c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43943a) {
            case 0:
                boolean[] zArr = this.f43944b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f43945c.cancel();
                }
                break;
            default:
                boolean[] zArr2 = this.f43944b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f43945c.cancel();
                }
                break;
        }
    }
}
