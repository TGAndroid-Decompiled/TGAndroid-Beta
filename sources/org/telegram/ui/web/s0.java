package org.telegram.ui.web;

import android.webkit.JsResult;
public final class s0 implements org.telegram.ui.ActionBar.a2 {
    public final int f39039a;
    public final boolean[] f39040b;
    public final JsResult f39041c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39039a = i10;
        this.f39040b = zArr;
        this.f39041c = jsResult;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39039a) {
            case 0:
                boolean[] zArr = this.f39040b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39041c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f39040b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39041c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f39040b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f39041c.confirm();
                    return;
                }
                return;
        }
    }
}
