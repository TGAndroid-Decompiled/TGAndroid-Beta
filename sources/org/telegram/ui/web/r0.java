package org.telegram.ui.web;

import android.webkit.JsResult;
public final class r0 implements org.telegram.ui.ActionBar.a2 {
    public final int f43447a;
    public final boolean[] f43448b;
    public final JsResult f43449c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f43447a = i10;
        this.f43448b = zArr;
        this.f43449c = jsResult;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f43447a) {
            case 0:
                boolean[] zArr = this.f43448b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f43449c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f43448b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f43449c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f43448b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f43449c.confirm();
                    return;
                }
                return;
        }
    }
}
