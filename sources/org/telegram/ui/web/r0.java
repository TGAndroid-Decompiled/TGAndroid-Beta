package org.telegram.ui.web;

import android.webkit.JsResult;
public final class r0 implements org.telegram.ui.ActionBar.z1 {
    public final int f39192a;
    public final boolean[] f39193b;
    public final JsResult f39194c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39192a = i10;
        this.f39193b = zArr;
        this.f39194c = jsResult;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f39192a) {
            case 0:
                boolean[] zArr = this.f39193b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39194c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f39193b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39194c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f39193b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f39194c.confirm();
                    return;
                }
                return;
        }
    }
}
