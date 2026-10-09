package org.telegram.ui.web;

import android.webkit.JsResult;
public final class r0 implements org.telegram.ui.ActionBar.a2 {
    public final int f43445a;
    public final boolean[] f43446b;
    public final JsResult f43447c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f43445a = i10;
        this.f43446b = zArr;
        this.f43447c = jsResult;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f43445a) {
            case 0:
                boolean[] zArr = this.f43446b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f43447c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f43446b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f43447c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f43446b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f43447c.confirm();
                    return;
                }
                return;
        }
    }
}
