package org.telegram.ui.web;

import android.webkit.JsResult;
public final class r0 implements org.telegram.ui.ActionBar.c2 {
    public final int f38066a;
    public final boolean[] f38067b;
    public final JsResult f38068c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f38066a = i10;
        this.f38067b = zArr;
        this.f38068c = jsResult;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f38066a) {
            case 0:
                boolean[] zArr = this.f38067b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f38068c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f38067b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f38068c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f38067b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f38068c.confirm();
                    return;
                }
                return;
        }
    }
}
