package org.telegram.ui.web;

import android.webkit.JsResult;
public final class n0 implements org.telegram.ui.ActionBar.r1 {
    public final int f51181a;
    public final boolean[] f51182b;
    public final JsResult f51183c;

    public n0(boolean[] zArr, JsResult jsResult, int i7) {
        this.f51181a = i7;
        this.f51182b = zArr;
        this.f51183c = jsResult;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f51181a) {
            case 0:
                boolean[] zArr = this.f51182b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f51183c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f51182b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f51183c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f51182b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f51183c.confirm();
                    return;
                }
                return;
        }
    }
}
