package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f39575a;
    public final boolean[] f39576b;
    public final JsResult f39577c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39575a = i10;
        this.f39576b = zArr;
        this.f39577c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39575a) {
            case 0:
                boolean[] zArr = this.f39576b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39577c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f39576b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39577c.cancel();
                    return;
                }
                return;
        }
    }
}
