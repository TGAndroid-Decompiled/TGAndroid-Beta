package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class o0 implements DialogInterface.OnDismissListener {
    public final int f51250a;
    public final boolean[] f51251b;
    public final JsResult f51252c;

    public o0(boolean[] zArr, JsResult jsResult, int i7) {
        this.f51250a = i7;
        this.f51251b = zArr;
        this.f51252c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f51250a) {
            case 0:
                boolean[] zArr = this.f51251b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f51252c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f51251b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f51252c.cancel();
                    return;
                }
                return;
        }
    }
}
