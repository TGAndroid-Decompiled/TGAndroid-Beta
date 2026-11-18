package org.telegram.ui.web;

import android.webkit.JsResult;
public final class m0 implements org.telegram.ui.ActionBar.r1 {
    public final int f53193a;
    public final boolean[] f53194b;
    public final JsResult f53195c;

    public m0(boolean[] zArr, JsResult jsResult, int i7) {
        this.f53193a = i7;
        this.f53194b = zArr;
        this.f53195c = jsResult;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f53193a) {
            case 0:
                boolean[] zArr = this.f53194b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f53195c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f53194b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f53195c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f53194b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f53195c.confirm();
                    return;
                }
                return;
        }
    }
}
