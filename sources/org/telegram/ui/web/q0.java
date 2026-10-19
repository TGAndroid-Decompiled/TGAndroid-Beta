package org.telegram.ui.web;

import android.webkit.JsResult;
public final class q0 implements org.telegram.ui.ActionBar.a2 {
    public final int f42752a;
    public final boolean[] f42753b;
    public final JsResult f42754c;

    public q0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42752a = i10;
        this.f42753b = zArr;
        this.f42754c = jsResult;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42752a) {
            case 0:
                boolean[] zArr = this.f42753b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42754c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f42753b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42754c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f42753b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f42754c.confirm();
                    return;
                }
                return;
        }
    }
}
