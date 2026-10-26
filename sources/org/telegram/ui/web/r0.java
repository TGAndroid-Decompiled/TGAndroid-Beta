package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class r0 implements DialogInterface.OnDismissListener {
    public final int f45366a;
    public final boolean[] f45367b;
    public final JsResult f45368c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f45366a = i10;
        this.f45367b = zArr;
        this.f45368c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45366a) {
            case 0:
                boolean[] zArr = this.f45367b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f45368c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f45367b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f45368c.cancel();
                    return;
                }
                return;
        }
    }
}
