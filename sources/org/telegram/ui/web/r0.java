package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class r0 implements DialogInterface.OnDismissListener {
    public final int f42760a;
    public final boolean[] f42761b;
    public final JsResult f42762c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42760a = i10;
        this.f42761b = zArr;
        this.f42762c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42760a) {
            case 0:
                boolean[] zArr = this.f42761b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42762c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f42761b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42762c.cancel();
                    return;
                }
                return;
        }
    }
}
