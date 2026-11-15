package org.telegram.ui.web;

import android.webkit.JsResult;
public final class m0 implements org.telegram.ui.ActionBar.q1 {
    public final int f52710a;
    public final boolean[] f52711b;
    public final JsResult f52712c;

    public m0(boolean[] zArr, JsResult jsResult, int i7) {
        this.f52710a = i7;
        this.f52711b = zArr;
        this.f52712c = jsResult;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f52710a) {
            case 0:
                boolean[] zArr = this.f52711b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f52712c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f52711b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f52712c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f52711b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f52712c.confirm();
                    return;
                }
                return;
        }
    }
}
