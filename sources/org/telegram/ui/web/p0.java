package org.telegram.ui.web;

import android.webkit.JsResult;

public final class p0 implements org.telegram.ui.ActionBar.a2 {

    public final int f43936a;

    public final boolean[] f43937b;

    public final JsResult f43938c;

    public p0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f43936a = i10;
        this.f43937b = zArr;
        this.f43938c = jsResult;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f43936a) {
            case 0:
                boolean[] zArr = this.f43937b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f43938c.cancel();
                }
                break;
            case 1:
                boolean[] zArr2 = this.f43937b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f43938c.confirm();
                }
                break;
            default:
                boolean[] zArr3 = this.f43937b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f43938c.confirm();
                }
                break;
        }
    }
}
