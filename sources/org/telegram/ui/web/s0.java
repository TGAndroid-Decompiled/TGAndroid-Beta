package org.telegram.ui.web;

import android.webkit.JsResult;
public final class s0 implements org.telegram.ui.ActionBar.a2 {
    public final int f42264a;
    public final boolean[] f42265b;
    public final JsResult f42266c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42264a = i10;
        this.f42265b = zArr;
        this.f42266c = jsResult;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42264a) {
            case 0:
                boolean[] zArr = this.f42265b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42266c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f42265b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42266c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f42265b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f42266c.confirm();
                    return;
                }
                return;
        }
    }
}
