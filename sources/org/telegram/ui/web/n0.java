package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class n0 implements DialogInterface.OnDismissListener {
    public final int f53216a;
    public final boolean[] f53217b;
    public final JsResult f53218c;

    public n0(boolean[] zArr, JsResult jsResult, int i7) {
        this.f53216a = i7;
        this.f53217b = zArr;
        this.f53218c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f53216a) {
            case 0:
                boolean[] zArr = this.f53217b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f53218c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f53217b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f53218c.cancel();
                    return;
                }
                return;
        }
    }
}
