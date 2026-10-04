package org.telegram.ui.web;

import android.webkit.JsResult;
public final class r0 implements org.telegram.ui.ActionBar.a2 {
    public final int f42327a;
    public final boolean[] f42328b;
    public final JsResult f42329c;

    public r0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42327a = i10;
        this.f42328b = zArr;
        this.f42329c = jsResult;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42327a) {
            case 0:
                boolean[] zArr = this.f42328b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42329c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f42328b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42329c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f42328b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f42329c.confirm();
                    return;
                }
                return;
        }
    }
}
