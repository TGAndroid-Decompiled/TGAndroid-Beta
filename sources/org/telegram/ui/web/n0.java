package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class n0 implements DialogInterface.OnDismissListener {
    public final int f53487a;
    public final boolean[] f53488b;
    public final JsResult f53489c;

    public n0(boolean[] zArr, JsResult jsResult, int i7) {
        this.f53487a = i7;
        this.f53488b = zArr;
        this.f53489c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f53487a) {
            case 0:
                boolean[] zArr = this.f53488b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f53489c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f53488b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f53489c.cancel();
                    return;
                }
                return;
        }
    }
}
