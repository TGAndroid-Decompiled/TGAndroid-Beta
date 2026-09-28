package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f39199a;
    public final boolean[] f39200b;
    public final JsResult f39201c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39199a = i10;
        this.f39200b = zArr;
        this.f39201c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39199a) {
            case 0:
                boolean[] zArr = this.f39200b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39201c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f39200b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39201c.cancel();
                    return;
                }
                return;
        }
    }
}
