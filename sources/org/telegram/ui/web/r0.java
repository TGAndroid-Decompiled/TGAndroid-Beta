package org.telegram.ui.web;

import android.webkit.JsResult;
public final class r0 implements org.telegram.ui.ActionBar.a2 {
    public final int f39073a;
    public final boolean[] f39074b;
    public final JsResult f39075c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39073a = i10;
        this.f39074b = zArr;
        this.f39075c = jsResult;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39073a) {
            case 0:
                boolean[] zArr = this.f39074b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39075c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f39074b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39075c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f39074b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f39075c.confirm();
                    return;
                }
                return;
        }
    }
}
