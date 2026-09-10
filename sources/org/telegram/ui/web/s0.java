package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f38074a;
    public final boolean[] f38075b;
    public final JsResult f38076c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f38074a = i10;
        this.f38075b = zArr;
        this.f38076c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38074a) {
            case 0:
                boolean[] zArr = this.f38075b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f38076c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f38075b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f38076c.cancel();
                    return;
                }
                return;
        }
    }
}
