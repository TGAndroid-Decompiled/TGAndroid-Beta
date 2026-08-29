package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class q0 implements DialogInterface.OnDismissListener {
    public final int f44146a;
    public final boolean[] f44147b;
    public final JsResult f44148c;

    public q0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f44146a = i10;
        this.f44147b = zArr;
        this.f44148c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44146a) {
            case 0:
                boolean[] zArr = this.f44147b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f44148c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f44147b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f44148c.cancel();
                    return;
                }
                return;
        }
    }
}
