package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f41481a;
    public final boolean[] f41482b;
    public final JsResult f41483c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f41481a = i10;
        this.f41482b = zArr;
        this.f41483c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41481a) {
            case 0:
                boolean[] zArr = this.f41482b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f41483c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f41482b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f41483c.cancel();
                    return;
                }
                return;
        }
    }
}
