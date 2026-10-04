package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f42333a;
    public final boolean[] f42334b;
    public final JsResult f42335c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42333a = i10;
        this.f42334b = zArr;
        this.f42335c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42333a) {
            case 0:
                boolean[] zArr = this.f42334b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42335c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f42334b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42335c.cancel();
                    return;
                }
                return;
        }
    }
}
