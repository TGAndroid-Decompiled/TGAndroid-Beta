package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class q0 implements DialogInterface.OnDismissListener {
    public final int f42636a;
    public final boolean[] f42637b;
    public final JsResult f42638c;

    public q0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42636a = i10;
        this.f42637b = zArr;
        this.f42638c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42636a) {
            case 0:
                boolean[] zArr = this.f42637b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42638c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f42637b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42638c.cancel();
                    return;
                }
                return;
        }
    }
}
