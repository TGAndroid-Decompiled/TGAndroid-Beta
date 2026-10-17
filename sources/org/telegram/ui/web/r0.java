package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class r0 implements DialogInterface.OnDismissListener {
    public final int f42719a;
    public final boolean[] f42720b;
    public final JsResult f42721c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42719a = i10;
        this.f42720b = zArr;
        this.f42721c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42719a) {
            case 0:
                boolean[] zArr = this.f42720b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42721c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f42720b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42721c.cancel();
                    return;
                }
                return;
        }
    }
}
