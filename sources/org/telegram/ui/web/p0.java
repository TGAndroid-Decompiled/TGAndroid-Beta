package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class p0 implements DialogInterface.OnDismissListener {
    public final int f43159a;
    public final boolean[] f43160b;
    public final JsResult f43161c;

    public p0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f43159a = i10;
        this.f43160b = zArr;
        this.f43161c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43159a) {
            case 0:
                boolean[] zArr = this.f43160b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f43161c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f43160b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f43161c.cancel();
                    return;
                }
                return;
        }
    }
}
