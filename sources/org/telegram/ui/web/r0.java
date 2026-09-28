package org.telegram.ui.web;

import android.webkit.JsResult;
public final class r0 implements org.telegram.ui.ActionBar.z1 {
    public final int f39191a;
    public final boolean[] f39192b;
    public final JsResult f39193c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39191a = i10;
        this.f39192b = zArr;
        this.f39193c = jsResult;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f39191a) {
            case 0:
                boolean[] zArr = this.f39192b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39193c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f39192b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39193c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f39192b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f39193c.confirm();
                    return;
                }
                return;
        }
    }
}
