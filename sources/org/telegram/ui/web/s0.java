package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f42353a;
    public final boolean[] f42354b;
    public final JsResult f42355c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42353a = i10;
        this.f42354b = zArr;
        this.f42355c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42353a) {
            case 0:
                boolean[] zArr = this.f42354b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42355c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f42354b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42355c.cancel();
                    return;
                }
                return;
        }
    }
}
