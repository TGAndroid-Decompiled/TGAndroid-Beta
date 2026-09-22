package org.telegram.ui.web;

import android.webkit.JsResult;
public final class r0 implements org.telegram.ui.ActionBar.a2 {
    public final int f39077a;
    public final boolean[] f39078b;
    public final JsResult f39079c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39077a = i10;
        this.f39078b = zArr;
        this.f39079c = jsResult;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39077a) {
            case 0:
                boolean[] zArr = this.f39078b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39079c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f39078b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39079c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f39078b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f39079c.confirm();
                    return;
                }
                return;
        }
    }
}
