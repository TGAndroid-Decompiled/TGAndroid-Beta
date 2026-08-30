package org.telegram.ui.web;

import android.webkit.JsResult;
public final class p0 implements org.telegram.ui.ActionBar.c2 {
    public final int f39602a;
    public final boolean[] f39603b;
    public final JsResult f39604c;

    public p0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39602a = i10;
        this.f39603b = zArr;
        this.f39604c = jsResult;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f39602a) {
            case 0:
                boolean[] zArr = this.f39603b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39604c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f39603b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39604c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f39603b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f39604c.confirm();
                    return;
                }
                return;
        }
    }
}
