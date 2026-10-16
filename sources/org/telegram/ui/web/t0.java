package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class t0 implements DialogInterface.OnDismissListener {
    public final int f41182a;
    public final boolean[] f41183b;
    public final JsResult f41184c;

    public t0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f41182a = i10;
        this.f41183b = zArr;
        this.f41184c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41182a) {
            case 0:
                boolean[] zArr = this.f41183b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f41184c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f41183b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f41184c.cancel();
                    return;
                }
                return;
        }
    }
}
