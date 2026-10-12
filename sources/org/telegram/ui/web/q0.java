package org.telegram.ui.web;

import android.webkit.JsResult;
public final class q0 implements org.telegram.ui.ActionBar.z1 {
    public final int f43383a;
    public final boolean[] f43384b;
    public final JsResult f43385c;

    public q0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f43383a = i10;
        this.f43384b = zArr;
        this.f43385c = jsResult;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f43383a) {
            case 0:
                boolean[] zArr = this.f43384b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f43385c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f43384b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f43385c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f43384b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f43385c.confirm();
                    return;
                }
                return;
        }
    }
}
