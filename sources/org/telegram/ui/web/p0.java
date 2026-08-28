package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class p0 implements DialogInterface.OnDismissListener {
    public final int f43956a;
    public final boolean[] f43957b;
    public final JsResult f43958c;

    public p0(boolean[] zArr, JsResult jsResult, int i9) {
        this.f43956a = i9;
        this.f43957b = zArr;
        this.f43958c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43956a) {
            case 0:
                boolean[] zArr = this.f43957b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f43958c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f43957b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f43958c.cancel();
                    return;
                }
                return;
        }
    }
}
