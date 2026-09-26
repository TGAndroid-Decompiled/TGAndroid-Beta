package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f39197a;
    public final boolean[] f39198b;
    public final JsResult f39199c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39197a = i10;
        this.f39198b = zArr;
        this.f39199c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39197a) {
            case 0:
                boolean[] zArr = this.f39198b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39199c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f39198b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39199c.cancel();
                    return;
                }
                return;
        }
    }
}
