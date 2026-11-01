package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class p0 implements DialogInterface.OnDismissListener {
    public final int f42961a;
    public final boolean[] f42962b;
    public final JsResult f42963c;

    public p0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42961a = i10;
        this.f42962b = zArr;
        this.f42963c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42961a) {
            case 0:
                boolean[] zArr = this.f42962b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42963c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f42962b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42963c.cancel();
                    return;
                }
                return;
        }
    }
}
