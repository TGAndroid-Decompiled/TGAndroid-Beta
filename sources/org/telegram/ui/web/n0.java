package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class n0 implements DialogInterface.OnDismissListener {
    public final int f53248a;
    public final boolean[] f53249b;
    public final JsResult f53250c;

    public n0(boolean[] zArr, JsResult jsResult, int i7) {
        this.f53248a = i7;
        this.f53249b = zArr;
        this.f53250c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f53248a) {
            case 0:
                boolean[] zArr = this.f53249b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f53250c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f53249b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f53250c.cancel();
                    return;
                }
                return;
        }
    }
}
