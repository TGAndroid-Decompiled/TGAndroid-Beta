package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f43452a;
    public final boolean[] f43453b;
    public final JsResult f43454c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f43452a = i10;
        this.f43453b = zArr;
        this.f43454c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43452a) {
            case 0:
                boolean[] zArr = this.f43453b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f43454c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f43453b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f43454c.cancel();
                    return;
                }
                return;
        }
    }
}
