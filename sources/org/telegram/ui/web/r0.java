package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class r0 implements DialogInterface.OnDismissListener {
    public final int f38820a;
    public final boolean[] f38821b;
    public final JsResult f38822c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f38820a = i10;
        this.f38821b = zArr;
        this.f38822c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38820a) {
            case 0:
                boolean[] zArr = this.f38821b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f38822c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f38821b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f38822c.cancel();
                    return;
                }
                return;
        }
    }
}
