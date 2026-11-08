package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class o0 implements DialogInterface.OnDismissListener {
    public final int f51257a;
    public final boolean[] f51258b;
    public final JsResult f51259c;

    public o0(boolean[] zArr, JsResult jsResult, int i7) {
        this.f51257a = i7;
        this.f51258b = zArr;
        this.f51259c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f51257a) {
            case 0:
                boolean[] zArr = this.f51258b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f51259c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f51258b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f51259c.cancel();
                    return;
                }
                return;
        }
    }
}
