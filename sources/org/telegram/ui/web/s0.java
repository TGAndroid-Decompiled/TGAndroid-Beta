package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f42341a;
    public final boolean[] f42342b;
    public final JsResult f42343c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42341a = i10;
        this.f42342b = zArr;
        this.f42343c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42341a) {
            case 0:
                boolean[] zArr = this.f42342b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42343c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f42342b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42343c.cancel();
                    return;
                }
                return;
        }
    }
}
