package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class t0 implements DialogInterface.OnDismissListener {
    public final int f42244a;
    public final boolean[] f42245b;
    public final JsResult f42246c;

    public t0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42244a = i10;
        this.f42245b = zArr;
        this.f42246c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42244a) {
            case 0:
                boolean[] zArr = this.f42245b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42246c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f42245b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42246c.cancel();
                    return;
                }
                return;
        }
    }
}
