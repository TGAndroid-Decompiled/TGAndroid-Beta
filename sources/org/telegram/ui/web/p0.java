package org.telegram.ui.web;

import android.webkit.JsResult;
public final class p0 implements org.telegram.ui.ActionBar.b2 {
    public final int f44139a;
    public final boolean[] f44140b;
    public final JsResult f44141c;

    public p0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f44139a = i10;
        this.f44140b = zArr;
        this.f44141c = jsResult;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f44139a) {
            case 0:
                boolean[] zArr = this.f44140b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f44141c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f44140b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f44141c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f44140b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f44141c.confirm();
                    return;
                }
                return;
        }
    }
}
