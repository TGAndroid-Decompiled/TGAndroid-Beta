package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class n0 implements DialogInterface.OnDismissListener {
    public final int f53254a;
    public final boolean[] f53255b;
    public final JsResult f53256c;

    public n0(boolean[] zArr, JsResult jsResult, int i7) {
        this.f53254a = i7;
        this.f53255b = zArr;
        this.f53256c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f53254a) {
            case 0:
                boolean[] zArr = this.f53255b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f53256c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f53255b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f53256c.cancel();
                    return;
                }
                return;
        }
    }
}
