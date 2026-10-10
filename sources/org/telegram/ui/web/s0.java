package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f43498a;
    public final boolean[] f43499b;
    public final JsResult f43500c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f43498a = i10;
        this.f43499b = zArr;
        this.f43500c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43498a) {
            case 0:
                boolean[] zArr = this.f43499b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f43500c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f43499b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f43500c.cancel();
                    return;
                }
                return;
        }
    }
}
