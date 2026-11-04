package org.telegram.ui.web;

import android.webkit.JsResult;
public final class n0 implements org.telegram.ui.ActionBar.p1 {
    public final int f50963a;
    public final boolean[] f50964b;
    public final JsResult f50965c;

    public n0(boolean[] zArr, JsResult jsResult, int i3) {
        this.f50963a = i3;
        this.f50964b = zArr;
        this.f50965c = jsResult;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f50963a) {
            case 0:
                boolean[] zArr = this.f50964b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f50965c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f50964b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f50965c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f50964b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f50965c.confirm();
                    return;
                }
                return;
        }
    }
}
