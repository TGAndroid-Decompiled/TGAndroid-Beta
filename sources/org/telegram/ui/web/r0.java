package org.telegram.ui.web;

import android.webkit.JsResult;
public final class r0 implements org.telegram.ui.ActionBar.b2 {
    public final int f38916a;
    public final boolean[] f38917b;
    public final JsResult f38918c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f38916a = i10;
        this.f38917b = zArr;
        this.f38918c = jsResult;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f38916a) {
            case 0:
                boolean[] zArr = this.f38917b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f38918c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f38917b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f38918c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f38917b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f38918c.confirm();
                    return;
                }
                return;
        }
    }
}
