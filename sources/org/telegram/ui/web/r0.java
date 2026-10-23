package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class r0 implements DialogInterface.OnDismissListener {
    public final int f42771a;
    public final boolean[] f42772b;
    public final JsResult f42773c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42771a = i10;
        this.f42772b = zArr;
        this.f42773c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42771a) {
            case 0:
                boolean[] zArr = this.f42772b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42773c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f42772b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42773c.cancel();
                    return;
                }
                return;
        }
    }
}
