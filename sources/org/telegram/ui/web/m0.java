package org.telegram.ui.web;

import android.webkit.JsResult;
public final class m0 implements org.telegram.ui.ActionBar.q1 {
    public final int f53236a;
    public final boolean[] f53237b;
    public final JsResult f53238c;

    public m0(boolean[] zArr, JsResult jsResult, int i7) {
        this.f53236a = i7;
        this.f53237b = zArr;
        this.f53238c = jsResult;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f53236a) {
            case 0:
                boolean[] zArr = this.f53237b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f53238c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f53237b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f53238c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f53237b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f53238c.confirm();
                    return;
                }
                return;
        }
    }
}
