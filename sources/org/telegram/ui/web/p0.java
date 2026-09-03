package org.telegram.ui.web;

import android.webkit.JsResult;
public final class p0 implements org.telegram.ui.ActionBar.c2 {
    public final int f42628a;
    public final boolean[] f42629b;
    public final JsResult f42630c;

    public p0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f42628a = i10;
        this.f42629b = zArr;
        this.f42630c = jsResult;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f42628a) {
            case 0:
                boolean[] zArr = this.f42629b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f42630c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f42629b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f42630c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f42629b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f42630c.confirm();
                    return;
                }
                return;
        }
    }
}
