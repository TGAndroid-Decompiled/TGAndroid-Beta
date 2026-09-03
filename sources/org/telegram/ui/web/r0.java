package org.telegram.ui.web;

import android.webkit.JsResult;
public final class r0 implements org.telegram.ui.ActionBar.c2 {
    public final int f39567a;
    public final boolean[] f39568b;
    public final JsResult f39569c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39567a = i10;
        this.f39568b = zArr;
        this.f39569c = jsResult;
    }

    @Override
    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f39567a) {
            case 0:
                boolean[] zArr = this.f39568b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39569c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f39568b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39569c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f39568b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f39569c.confirm();
                    return;
                }
                return;
        }
    }
}
