package org.telegram.ui.web;

import android.webkit.JsResult;
public final class s0 implements org.telegram.ui.ActionBar.z1 {
    public final int f41174a;
    public final boolean[] f41175b;
    public final JsResult f41176c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f41174a = i10;
        this.f41175b = zArr;
        this.f41176c = jsResult;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f41174a) {
            case 0:
                boolean[] zArr = this.f41175b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f41176c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f41175b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f41176c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f41175b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f41176c.confirm();
                    return;
                }
                return;
        }
    }
}
