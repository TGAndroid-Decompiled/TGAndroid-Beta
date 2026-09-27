package org.telegram.ui.web;

import android.webkit.JsResult;
public final class r0 implements org.telegram.ui.ActionBar.b2 {
    public final int f39147a;
    public final boolean[] f39148b;
    public final JsResult f39149c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39147a = i10;
        this.f39148b = zArr;
        this.f39149c = jsResult;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f39147a) {
            case 0:
                boolean[] zArr = this.f39148b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39149c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f39148b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39149c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f39148b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f39149c.confirm();
                    return;
                }
                return;
        }
    }
}
