package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f39154a;
    public final boolean[] f39155b;
    public final JsResult f39156c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39154a = i10;
        this.f39155b = zArr;
        this.f39156c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39154a) {
            case 0:
                boolean[] zArr = this.f39155b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39156c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f39155b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39156c.cancel();
                    return;
                }
                return;
        }
    }
}
