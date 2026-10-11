package org.telegram.ui.web;

import android.webkit.JsResult;
public final class q0 implements org.telegram.ui.ActionBar.z1 {
    public final int f43628a;
    public final boolean[] f43629b;
    public final JsResult f43630c;

    public q0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f43628a = i10;
        this.f43629b = zArr;
        this.f43630c = jsResult;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f43628a) {
            case 0:
                boolean[] zArr = this.f43629b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f43630c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f43629b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f43630c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f43629b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f43630c.confirm();
                    return;
                }
                return;
        }
    }
}
