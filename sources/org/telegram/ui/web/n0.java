package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class n0 implements DialogInterface.OnDismissListener {
    public final int f52722a;
    public final boolean[] f52723b;
    public final JsResult f52724c;

    public n0(boolean[] zArr, JsResult jsResult, int i7) {
        this.f52722a = i7;
        this.f52723b = zArr;
        this.f52724c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52722a) {
            case 0:
                boolean[] zArr = this.f52723b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f52724c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f52723b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f52724c.cancel();
                    return;
                }
                return;
        }
    }
}
