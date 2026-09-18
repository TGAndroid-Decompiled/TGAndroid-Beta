package org.telegram.ui.web;

import android.webkit.JsResult;
public final class r0 implements org.telegram.ui.ActionBar.a2 {
    public final int f39032a;
    public final boolean[] f39033b;
    public final JsResult f39034c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39032a = i10;
        this.f39033b = zArr;
        this.f39034c = jsResult;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39032a) {
            case 0:
                boolean[] zArr = this.f39033b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39034c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f39033b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39034c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f39033b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f39034c.confirm();
                    return;
                }
                return;
        }
    }
}
