package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class r0 implements DialogInterface.OnDismissListener {
    public final int f44877a;
    public final boolean[] f44878b;
    public final JsResult f44879c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f44877a = i10;
        this.f44878b = zArr;
        this.f44879c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44877a) {
            case 0:
                boolean[] zArr = this.f44878b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f44879c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f44878b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f44879c.cancel();
                    return;
                }
                return;
        }
    }
}
