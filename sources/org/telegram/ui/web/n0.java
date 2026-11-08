package org.telegram.ui.web;

import android.webkit.JsResult;
public final class n0 implements org.telegram.ui.ActionBar.r1 {
    public final int f51246a;
    public final boolean[] f51247b;
    public final JsResult f51248c;

    public n0(boolean[] zArr, JsResult jsResult, int i7) {
        this.f51246a = i7;
        this.f51247b = zArr;
        this.f51248c = jsResult;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f51246a) {
            case 0:
                boolean[] zArr = this.f51247b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f51248c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f51247b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f51248c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f51247b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f51248c.confirm();
                    return;
                }
                return;
        }
    }
}
