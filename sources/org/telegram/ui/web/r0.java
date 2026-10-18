package org.telegram.ui.web;

import android.webkit.JsResult;
public final class r0 implements org.telegram.ui.ActionBar.a2 {
    public final int f42720a;
    public final boolean[] f42721b;
    public final JsResult f42722c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42720a = i10;
        this.f42721b = zArr;
        this.f42722c = jsResult;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42720a) {
            case 0:
                boolean[] zArr = this.f42721b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42722c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f42721b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42722c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f42721b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f42722c.confirm();
                    return;
                }
                return;
        }
    }
}
