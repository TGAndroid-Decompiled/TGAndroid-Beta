package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class n0 implements DialogInterface.OnDismissListener {
    public final int f52725a;
    public final boolean[] f52726b;
    public final JsResult f52727c;

    public n0(boolean[] zArr, JsResult jsResult, int i7) {
        this.f52725a = i7;
        this.f52726b = zArr;
        this.f52727c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52725a) {
            case 0:
                boolean[] zArr = this.f52726b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f52727c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f52726b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f52727c.cancel();
                    return;
                }
                return;
        }
    }
}
