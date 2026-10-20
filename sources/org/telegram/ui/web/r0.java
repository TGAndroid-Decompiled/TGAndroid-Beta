package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class r0 implements DialogInterface.OnDismissListener {
    public final int f42767a;
    public final boolean[] f42768b;
    public final JsResult f42769c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42767a = i10;
        this.f42768b = zArr;
        this.f42769c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42767a) {
            case 0:
                boolean[] zArr = this.f42768b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42769c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f42768b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42769c.cancel();
                    return;
                }
                return;
        }
    }
}
