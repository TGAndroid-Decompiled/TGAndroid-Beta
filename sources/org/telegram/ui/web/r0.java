package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class r0 implements DialogInterface.OnDismissListener {
    public final int f42761a;
    public final boolean[] f42762b;
    public final JsResult f42763c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42761a = i10;
        this.f42762b = zArr;
        this.f42763c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42761a) {
            case 0:
                boolean[] zArr = this.f42762b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42763c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f42762b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42763c.cancel();
                    return;
                }
                return;
        }
    }
}
