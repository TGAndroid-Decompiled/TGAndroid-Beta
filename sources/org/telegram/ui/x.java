package org.telegram.ui;

import android.text.TextUtils;
public final class x implements Runnable {
    public final int f51699a;
    public final g4 f51700b;
    public final String f51701c;

    public x(g4 g4Var, String str, int i7) {
        this.f51699a = i7;
        this.f51700b = g4Var;
        this.f51701c = str;
    }

    @Override
    public final void run() {
        switch (this.f51699a) {
            case 0:
                g4 g4Var = this.f51700b;
                bi.v vVar = g4Var.f45807h0.f51189b0;
                String str = this.f51701c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                vVar.setText(str);
                bi.v vVar2 = g4Var.f45807h0.f51189b0;
                vVar2.setSelection(vVar2.getText().length());
                org.telegram.messenger.g0.K3(g4Var.f45807h0.f51189b0);
                return;
            default:
                vf.c.n(this.f51700b.L, this.f51701c, false, null);
                return;
        }
    }
}
