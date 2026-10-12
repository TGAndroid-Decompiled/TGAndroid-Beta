package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class r0 implements DialogInterface.OnDismissListener {
    public final int f43386a;
    public final boolean[] f43387b;
    public final JsResult f43388c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f43386a = i10;
        this.f43387b = zArr;
        this.f43388c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43386a) {
            case 0:
                boolean[] zArr = this.f43387b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f43388c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f43387b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f43388c.cancel();
                    return;
                }
                return;
        }
    }
}
