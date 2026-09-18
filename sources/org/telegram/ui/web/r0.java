package org.telegram.ui.web;

import android.webkit.JsResult;
public final class r0 implements org.telegram.ui.ActionBar.b2 {
    public final int f38921a;
    public final boolean[] f38922b;
    public final JsResult f38923c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f38921a = i10;
        this.f38922b = zArr;
        this.f38923c = jsResult;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f38921a) {
            case 0:
                boolean[] zArr = this.f38922b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f38923c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f38922b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f38923c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f38922b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f38923c.confirm();
                    return;
                }
                return;
        }
    }
}
