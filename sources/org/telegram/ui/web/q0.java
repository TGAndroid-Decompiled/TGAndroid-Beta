package org.telegram.ui.web;

import android.webkit.JsResult;
public final class q0 implements org.telegram.ui.ActionBar.z1 {
    public final int f43662a;
    public final boolean[] f43663b;
    public final JsResult f43664c;

    public q0(boolean[] zArr, JsResult jsResult, int i10) {
        this.f43662a = i10;
        this.f43663b = zArr;
        this.f43664c = jsResult;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f43662a) {
            case 0:
                boolean[] zArr = this.f43663b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f43664c.cancel();
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f43663b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f43664c.confirm();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f43663b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f43664c.confirm();
                    return;
                }
                return;
        }
    }
}
