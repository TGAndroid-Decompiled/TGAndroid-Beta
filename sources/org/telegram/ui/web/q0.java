package org.telegram.ui.web;

import android.webkit.JsResult;
public final class q0 implements org.telegram.ui.ActionBar.a2 {
    public final int f42711a;
    public final boolean[] f42712b;
    public final JsResult f42713c;

    public q0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42711a = i10;
        this.f42712b = zArr;
        this.f42713c = jsResult;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42711a) {
            case 0:
                boolean[] zArr = this.f42712b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42713c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f42712b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42713c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f42712b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f42713c.confirm();
                    return;
                }
                return;
        }
    }
}
