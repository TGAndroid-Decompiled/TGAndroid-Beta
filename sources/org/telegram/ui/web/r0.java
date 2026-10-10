package org.telegram.ui.web;

import android.webkit.JsResult;
public final class r0 implements org.telegram.ui.ActionBar.a2 {
    public final int f43491a;
    public final boolean[] f43492b;
    public final JsResult f43493c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f43491a = i10;
        this.f43492b = zArr;
        this.f43493c = jsResult;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f43491a) {
            case 0:
                boolean[] zArr = this.f43492b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f43493c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f43492b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f43493c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f43492b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f43493c.confirm();
                    return;
                }
                return;
        }
    }
}
