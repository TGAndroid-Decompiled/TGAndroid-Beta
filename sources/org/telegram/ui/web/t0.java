package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class t0 implements DialogInterface.OnDismissListener {
    public final int f42272a;
    public final boolean[] f42273b;
    public final JsResult f42274c;

    public t0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42272a = i10;
        this.f42273b = zArr;
        this.f42274c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42272a) {
            case 0:
                boolean[] zArr = this.f42273b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42274c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f42273b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42274c.cancel();
                    return;
                }
                return;
        }
    }
}
