package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class n0 implements DialogInterface.OnDismissListener {
    public final int f53205a;
    public final boolean[] f53206b;
    public final JsResult f53207c;

    public n0(boolean[] zArr, JsResult jsResult, int i7) {
        this.f53205a = i7;
        this.f53206b = zArr;
        this.f53207c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f53205a) {
            case 0:
                boolean[] zArr = this.f53206b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f53207c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f53206b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f53207c.cancel();
                    return;
                }
                return;
        }
    }
}
