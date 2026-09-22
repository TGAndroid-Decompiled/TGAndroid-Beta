package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f39085a;
    public final boolean[] f39086b;
    public final JsResult f39087c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39085a = i10;
        this.f39086b = zArr;
        this.f39087c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39085a) {
            case 0:
                boolean[] zArr = this.f39086b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39087c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f39086b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39087c.cancel();
                    return;
                }
                return;
        }
    }
}
