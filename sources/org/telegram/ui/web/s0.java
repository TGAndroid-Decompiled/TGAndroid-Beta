package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f42334a;
    public final boolean[] f42335b;
    public final JsResult f42336c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42334a = i10;
        this.f42335b = zArr;
        this.f42336c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42334a) {
            case 0:
                boolean[] zArr = this.f42335b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42336c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f42335b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42336c.cancel();
                    return;
                }
                return;
        }
    }
}
