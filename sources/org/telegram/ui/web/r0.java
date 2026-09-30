package org.telegram.ui.web;

import android.webkit.JsResult;
public final class r0 implements org.telegram.ui.ActionBar.z1 {
    public final int f39280a;
    public final boolean[] f39281b;
    public final JsResult f39282c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39280a = i10;
        this.f39281b = zArr;
        this.f39282c = jsResult;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f39280a) {
            case 0:
                boolean[] zArr = this.f39281b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39282c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f39281b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39282c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f39281b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f39282c.confirm();
                    return;
                }
                return;
        }
    }
}
