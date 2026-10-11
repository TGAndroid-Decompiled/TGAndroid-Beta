package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class r0 implements DialogInterface.OnDismissListener {
    public final int f43636a;
    public final boolean[] f43637b;
    public final JsResult f43638c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f43636a = i10;
        this.f43637b = zArr;
        this.f43638c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43636a) {
            case 0:
                boolean[] zArr = this.f43637b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f43638c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f43637b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f43638c.cancel();
                    return;
                }
                return;
        }
    }
}
