package org.telegram.ui;

import android.text.TextUtils;
public final class x implements Runnable {
    public final int f51692a;
    public final g4 f51693b;
    public final String f51694c;

    public x(g4 g4Var, String str, int i7) {
        this.f51692a = i7;
        this.f51693b = g4Var;
        this.f51694c = str;
    }

    @Override
    public final void run() {
        switch (this.f51692a) {
            case 0:
                g4 g4Var = this.f51693b;
                bi.v vVar = g4Var.f45830h0.f51182b0;
                String str = this.f51694c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                vVar.setText(str);
                bi.v vVar2 = g4Var.f45830h0.f51182b0;
                vVar2.setSelection(vVar2.getText().length());
                org.telegram.messenger.g0.K3(g4Var.f45830h0.f51182b0);
                return;
            default:
                vf.c.n(this.f51693b.L, this.f51694c, false, null);
                return;
        }
    }
}
