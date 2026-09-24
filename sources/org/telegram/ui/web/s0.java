package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f39183a;
    public final boolean[] f39184b;
    public final JsResult f39185c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39183a = i10;
        this.f39184b = zArr;
        this.f39185c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39183a) {
            case 0:
                boolean[] zArr = this.f39184b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39185c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f39184b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39185c.cancel();
                    return;
                }
                return;
        }
    }
}
