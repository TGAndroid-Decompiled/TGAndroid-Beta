package org.telegram.ui.web;

import android.webkit.JsResult;
public final class q0 implements org.telegram.ui.ActionBar.a2 {
    public final int f42763a;
    public final boolean[] f42764b;
    public final JsResult f42765c;

    public q0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42763a = i10;
        this.f42764b = zArr;
        this.f42765c = jsResult;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42763a) {
            case 0:
                boolean[] zArr = this.f42764b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42765c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f42764b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42765c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f42764b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f42765c.confirm();
                    return;
                }
                return;
        }
    }
}
