package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class o0 implements DialogInterface.OnDismissListener {
    public final int f51238a;
    public final boolean[] f51239b;
    public final JsResult f51240c;

    public o0(boolean[] zArr, JsResult jsResult, int i7) {
        this.f51238a = i7;
        this.f51239b = zArr;
        this.f51240c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f51238a) {
            case 0:
                boolean[] zArr = this.f51239b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f51240c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f51239b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f51240c.cancel();
                    return;
                }
                return;
        }
    }
}
