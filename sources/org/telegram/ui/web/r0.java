package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class r0 implements DialogInterface.OnDismissListener {
    public final int f42744a;
    public final boolean[] f42745b;
    public final JsResult f42746c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42744a = i10;
        this.f42745b = zArr;
        this.f42746c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42744a) {
            case 0:
                boolean[] zArr = this.f42745b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42746c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f42745b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42746c.cancel();
                    return;
                }
                return;
        }
    }
}
