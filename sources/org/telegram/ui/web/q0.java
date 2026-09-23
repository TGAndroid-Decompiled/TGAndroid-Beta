package org.telegram.ui.web;

import android.webkit.JsResult;
public final class q0 implements org.telegram.ui.ActionBar.a2 {
    public final int f38812a;
    public final boolean[] f38813b;
    public final JsResult f38814c;

    public q0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f38812a = i10;
        this.f38813b = zArr;
        this.f38814c = jsResult;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38812a) {
            case 0:
                boolean[] zArr = this.f38813b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f38814c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f38813b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f38814c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f38813b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f38814c.confirm();
                    return;
                }
                return;
        }
    }
}
