package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class t0 implements DialogInterface.OnDismissListener {
    public final int f39046a;
    public final boolean[] f39047b;
    public final JsResult f39048c;

    public t0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39046a = i10;
        this.f39047b = zArr;
        this.f39048c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39046a) {
            case 0:
                boolean[] zArr = this.f39047b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39048c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f39047b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39048c.cancel();
                    return;
                }
                return;
        }
    }
}
