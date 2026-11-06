package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class o0 implements DialogInterface.OnDismissListener {
    public final int f51255a;
    public final boolean[] f51256b;
    public final JsResult f51257c;

    public o0(boolean[] zArr, JsResult jsResult, int i7) {
        this.f51255a = i7;
        this.f51256b = zArr;
        this.f51257c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f51255a) {
            case 0:
                boolean[] zArr = this.f51256b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f51257c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f51256b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f51257c.cancel();
                    return;
                }
                return;
        }
    }
}
