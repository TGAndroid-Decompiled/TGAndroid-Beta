package org.telegram.ui.web;

import android.webkit.JsResult;
public final class s0 implements org.telegram.ui.ActionBar.a2 {
    public final int f39060a;
    public final boolean[] f39061b;
    public final JsResult f39062c;

    public s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f39060a = i10;
        this.f39061b = zArr;
        this.f39062c = jsResult;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39060a) {
            case 0:
                boolean[] zArr = this.f39061b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f39062c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f39061b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f39062c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f39061b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f39062c.confirm();
                    return;
                }
                return;
        }
    }
}
