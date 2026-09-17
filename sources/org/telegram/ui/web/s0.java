package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f38924a;
    public final boolean[] f38925b;
    public final JsResult f38926c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f38924a = i10;
        this.f38925b = zArr;
        this.f38926c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38924a) {
            case 0:
                boolean[] zArr = this.f38925b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f38926c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f38925b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f38926c.cancel();
                    return;
                }
                return;
        }
    }
}
