package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class r0 implements DialogInterface.OnDismissListener {
    public final int f43670a;
    public final boolean[] f43671b;
    public final JsResult f43672c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f43670a = i10;
        this.f43671b = zArr;
        this.f43672c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43670a) {
            case 0:
                boolean[] zArr = this.f43671b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f43672c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f43671b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f43672c.cancel();
                    return;
                }
                return;
        }
    }
}
