package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f43454a;
    public final boolean[] f43455b;
    public final JsResult f43456c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f43454a = i10;
        this.f43455b = zArr;
        this.f43456c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43454a) {
            case 0:
                boolean[] zArr = this.f43455b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f43456c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f43455b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f43456c.cancel();
                    return;
                }
                return;
        }
    }
}
