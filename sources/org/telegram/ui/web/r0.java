package org.telegram.ui.web;

import android.webkit.JsResult;
public final class r0 implements org.telegram.ui.ActionBar.z1 {
    public final int f39176a;
    public final boolean[] f39177b;
    public final JsResult f39178c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39176a = i10;
        this.f39177b = zArr;
        this.f39178c = jsResult;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f39176a) {
            case 0:
                boolean[] zArr = this.f39177b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39178c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f39177b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39178c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f39177b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f39178c.confirm();
                    return;
                }
                return;
        }
    }
}
