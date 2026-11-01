package org.telegram.ui.web;

import android.webkit.JsResult;
public final class o0 implements org.telegram.ui.ActionBar.u1 {
    public final int f42951a;
    public final boolean[] f42952b;
    public final JsResult f42953c;

    public o0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42951a = i10;
        this.f42952b = zArr;
        this.f42953c = jsResult;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f42951a) {
            case 0:
                boolean[] zArr = this.f42952b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42953c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f42952b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42953c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f42952b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f42953c.confirm();
                    return;
                }
                return;
        }
    }
}
