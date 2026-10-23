package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f43250a;
    public final boolean[] f43251b;
    public final JsResult f43252c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f43250a = i10;
        this.f43251b = zArr;
        this.f43252c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43250a) {
            case 0:
                boolean[] zArr = this.f43251b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f43252c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f43251b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f43252c.cancel();
                    return;
                }
                return;
        }
    }
}
