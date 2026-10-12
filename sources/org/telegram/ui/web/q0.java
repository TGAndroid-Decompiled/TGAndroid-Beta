package org.telegram.ui.web;

import android.webkit.JsResult;
public final class q0 implements org.telegram.ui.ActionBar.z1 {
    public final int f43378a;
    public final boolean[] f43379b;
    public final JsResult f43380c;

    public q0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f43378a = i10;
        this.f43379b = zArr;
        this.f43380c = jsResult;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f43378a) {
            case 0:
                boolean[] zArr = this.f43379b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f43380c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f43379b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f43380c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f43379b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f43380c.confirm();
                    return;
                }
                return;
        }
    }
}
