package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f39287a;
    public final boolean[] f39288b;
    public final JsResult f39289c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39287a = i10;
        this.f39288b = zArr;
        this.f39289c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39287a) {
            case 0:
                boolean[] zArr = this.f39288b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39289c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f39288b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39289c.cancel();
                    return;
                }
                return;
        }
    }
}
