package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class o0 implements DialogInterface.OnDismissListener {
    public final int f50975a;
    public final boolean[] f50976b;
    public final JsResult f50977c;

    public o0(boolean[] zArr, JsResult jsResult, int i3) {
        this.f50975a = i3;
        this.f50976b = zArr;
        this.f50977c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f50975a) {
            case 0:
                boolean[] zArr = this.f50976b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f50977c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f50976b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f50977c.cancel();
                    return;
                }
                return;
        }
    }
}
