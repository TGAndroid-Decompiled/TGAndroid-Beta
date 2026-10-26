package org.telegram.ui.web;

import android.webkit.JsResult;
public final class q0 implements org.telegram.ui.ActionBar.b2 {
    public final int f45358a;
    public final boolean[] f45359b;
    public final JsResult f45360c;

    public q0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f45358a = i10;
        this.f45359b = zArr;
        this.f45360c = jsResult;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f45358a) {
            case 0:
                boolean[] zArr = this.f45359b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f45360c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f45359b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f45360c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f45359b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f45360c.confirm();
                    return;
                }
                return;
        }
    }
}
