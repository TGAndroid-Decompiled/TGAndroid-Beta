package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class n0 implements DialogInterface.OnDismissListener {
    public final int f53252a;
    public final boolean[] f53253b;
    public final JsResult f53254c;

    public n0(boolean[] zArr, JsResult jsResult, int i7) {
        this.f53252a = i7;
        this.f53253b = zArr;
        this.f53254c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f53252a) {
            case 0:
                boolean[] zArr = this.f53253b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f53254c.cancel();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f53253b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f53254c.cancel();
                    return;
                }
                return;
        }
    }
}
