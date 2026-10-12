package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class r0 implements DialogInterface.OnDismissListener {
    public final int f43391a;
    public final boolean[] f43392b;
    public final JsResult f43393c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f43391a = i10;
        this.f43392b = zArr;
        this.f43393c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43391a) {
            case 0:
                boolean[] zArr = this.f43392b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f43393c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f43392b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f43393c.cancel();
                    return;
                }
                return;
        }
    }
}
