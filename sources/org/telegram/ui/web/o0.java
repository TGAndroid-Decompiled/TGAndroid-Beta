package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class o0 implements DialogInterface.OnDismissListener {
    public final int f51192a;
    public final boolean[] f51193b;
    public final JsResult f51194c;

    public o0(boolean[] zArr, JsResult jsResult, int i7) {
        this.f51192a = i7;
        this.f51193b = zArr;
        this.f51194c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f51192a) {
            case 0:
                boolean[] zArr = this.f51193b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f51194c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f51193b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f51194c.cancel();
                    return;
                }
                return;
        }
    }
}
