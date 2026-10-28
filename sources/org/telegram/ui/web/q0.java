package org.telegram.ui.web;

import android.webkit.JsResult;
public final class q0 implements org.telegram.ui.ActionBar.b2 {
    public final int f44869a;
    public final boolean[] f44870b;
    public final JsResult f44871c;

    public q0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f44869a = i10;
        this.f44870b = zArr;
        this.f44871c = jsResult;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f44869a) {
            case 0:
                boolean[] zArr = this.f44870b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f44871c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f44870b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f44871c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f44870b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f44871c.confirm();
                    return;
                }
                return;
        }
    }
}
