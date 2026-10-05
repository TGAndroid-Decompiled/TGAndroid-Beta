package org.telegram.ui.web;

import android.webkit.JsResult;
public final class r0 implements org.telegram.ui.ActionBar.a2 {
    public final int f42346a;
    public final boolean[] f42347b;
    public final JsResult f42348c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42346a = i10;
        this.f42347b = zArr;
        this.f42348c = jsResult;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42346a) {
            case 0:
                boolean[] zArr = this.f42347b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42348c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f42347b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42348c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f42347b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f42348c.confirm();
                    return;
                }
                return;
        }
    }
}
