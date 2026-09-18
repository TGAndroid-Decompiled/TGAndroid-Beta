package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f38929a;
    public final boolean[] f38930b;
    public final JsResult f38931c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f38929a = i10;
        this.f38930b = zArr;
        this.f38931c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38929a) {
            case 0:
                boolean[] zArr = this.f38930b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f38931c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f38930b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f38931c.cancel();
                    return;
                }
                return;
        }
    }
}
