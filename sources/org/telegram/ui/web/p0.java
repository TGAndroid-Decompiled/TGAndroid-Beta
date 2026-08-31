package org.telegram.ui.web;

import android.webkit.JsResult;
public final class p0 implements org.telegram.ui.ActionBar.c2 {
    public final int f42665a;
    public final boolean[] f42666b;
    public final JsResult f42667c;

    public p0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42665a = i10;
        this.f42666b = zArr;
        this.f42667c = jsResult;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f42665a) {
            case 0:
                boolean[] zArr = this.f42666b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42667c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f42666b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42667c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f42666b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f42667c.confirm();
                    return;
                }
                return;
        }
    }
}
