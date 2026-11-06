package org.telegram.ui;

import android.text.TextUtils;
public final class x implements Runnable {
    public final int f51677a;
    public final g4 f51678b;
    public final String f51679c;

    public x(g4 g4Var, String str, int i7) {
        this.f51677a = i7;
        this.f51678b = g4Var;
        this.f51679c = str;
    }

    @Override
    public final void run() {
        switch (this.f51677a) {
            case 0:
                g4 g4Var = this.f51678b;
                bi.v vVar = g4Var.f45804h0.f51177b0;
                String str = this.f51679c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                vVar.setText(str);
                bi.v vVar2 = g4Var.f45804h0.f51177b0;
                vVar2.setSelection(vVar2.getText().length());
                org.telegram.messenger.g0.K3(g4Var.f45804h0.f51177b0);
                return;
            default:
                vf.c.n(this.f51678b.L, this.f51679c, false, null);
                return;
        }
    }
}
