package org.telegram.ui.web;

import android.webkit.JsResult;
public final class q0 implements org.telegram.ui.ActionBar.a2 {
    public final int f42762a;
    public final boolean[] f42763b;
    public final JsResult f42764c;

    public q0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42762a = i10;
        this.f42763b = zArr;
        this.f42764c = jsResult;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42762a) {
            case 0:
                boolean[] zArr = this.f42763b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42764c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f42763b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42764c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f42763b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f42764c.confirm();
                    return;
                }
                return;
        }
    }
}
