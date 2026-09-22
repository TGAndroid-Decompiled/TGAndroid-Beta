package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class t0 implements DialogInterface.OnDismissListener {
    public final int f39067a;
    public final boolean[] f39068b;
    public final JsResult f39069c;

    public t0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39067a = i10;
        this.f39068b = zArr;
        this.f39069c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39067a) {
            case 0:
                boolean[] zArr = this.f39068b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39069c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f39068b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39069c.cancel();
                    return;
                }
                return;
        }
    }
}
