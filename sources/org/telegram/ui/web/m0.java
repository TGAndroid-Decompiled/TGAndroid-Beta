package org.telegram.ui.web;

import android.webkit.JsResult;
public final class m0 implements org.telegram.ui.ActionBar.q1 {
    public final int f52713a;
    public final boolean[] f52714b;
    public final JsResult f52715c;

    public m0(boolean[] zArr, JsResult jsResult, int i7) {
        this.f52713a = i7;
        this.f52714b = zArr;
        this.f52715c = jsResult;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f52713a) {
            case 0:
                boolean[] zArr = this.f52714b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f52715c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f52714b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f52715c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f52714b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f52715c.confirm();
                    return;
                }
                return;
        }
    }
}
