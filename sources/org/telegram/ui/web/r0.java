package org.telegram.ui.web;

import android.webkit.JsResult;
public final class r0 implements org.telegram.ui.ActionBar.z1 {
    public final int f43242a;
    public final boolean[] f43243b;
    public final JsResult f43244c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f43242a = i10;
        this.f43243b = zArr;
        this.f43244c = jsResult;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f43242a) {
            case 0:
                boolean[] zArr = this.f43243b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f43244c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f43243b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f43244c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f43243b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f43244c.confirm();
                    return;
                }
                return;
        }
    }
}
