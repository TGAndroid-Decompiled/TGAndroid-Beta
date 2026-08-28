package org.telegram.ui.web;

import android.webkit.JsResult;
public final class o0 implements org.telegram.ui.ActionBar.b2 {
    public final int f43949a;
    public final boolean[] f43950b;
    public final JsResult f43951c;

    public o0(boolean[] zArr, JsResult jsResult, int i9) {
        this.f43949a = i9;
        this.f43950b = zArr;
        this.f43951c = jsResult;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f43949a) {
            case 0:
                boolean[] zArr = this.f43950b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f43951c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f43950b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f43951c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f43950b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f43951c.confirm();
                    return;
                }
                return;
        }
    }
}
