package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f39040a;
    public final boolean[] f39041b;
    public final JsResult f39042c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39040a = i10;
        this.f39041b = zArr;
        this.f39042c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39040a) {
            case 0:
                boolean[] zArr = this.f39041b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39042c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f39041b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39042c.cancel();
                    return;
                }
                return;
        }
    }
}
