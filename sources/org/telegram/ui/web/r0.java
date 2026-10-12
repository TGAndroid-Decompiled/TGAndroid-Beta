package org.telegram.ui.web;

import android.webkit.JsResult;
public final class r0 implements org.telegram.ui.ActionBar.z1 {
    public final int f41474a;
    public final boolean[] f41475b;
    public final JsResult f41476c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f41474a = i10;
        this.f41475b = zArr;
        this.f41476c = jsResult;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f41474a) {
            case 0:
                boolean[] zArr = this.f41475b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f41476c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f41475b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f41476c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f41475b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f41476c.confirm();
                    return;
                }
                return;
        }
    }
}
