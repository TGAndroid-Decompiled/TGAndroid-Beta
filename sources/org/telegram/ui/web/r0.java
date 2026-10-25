package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class r0 implements DialogInterface.OnDismissListener {
    public final int f45363a;
    public final boolean[] f45364b;
    public final JsResult f45365c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f45363a = i10;
        this.f45364b = zArr;
        this.f45365c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45363a) {
            case 0:
                boolean[] zArr = this.f45364b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f45365c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f45364b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f45365c.cancel();
                    return;
                }
                return;
        }
    }
}
