package org.telegram.ui.web;

import android.webkit.JsResult;
public final class o0 implements org.telegram.ui.ActionBar.u1 {
    public final int f43149a;
    public final boolean[] f43150b;
    public final JsResult f43151c;

    public o0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f43149a = i10;
        this.f43150b = zArr;
        this.f43151c = jsResult;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f43149a) {
            case 0:
                boolean[] zArr = this.f43150b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f43151c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f43150b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f43151c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f43150b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f43151c.confirm();
                    return;
                }
                return;
        }
    }
}
