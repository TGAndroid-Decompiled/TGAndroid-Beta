package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f39081a;
    public final boolean[] f39082b;
    public final JsResult f39083c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39081a = i10;
        this.f39082b = zArr;
        this.f39083c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39081a) {
            case 0:
                boolean[] zArr = this.f39082b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39083c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f39082b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39083c.cancel();
                    return;
                }
                return;
        }
    }
}
