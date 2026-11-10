package org.telegram.ui;

import android.text.TextUtils;
public final class x implements Runnable {
    public final int f51470a;
    public final g4 f51471b;
    public final String f51472c;

    public x(g4 g4Var, String str, int i7) {
        this.f51470a = i7;
        this.f51471b = g4Var;
        this.f51472c = str;
    }

    @Override
    public final void run() {
        switch (this.f51470a) {
            case 0:
                g4 g4Var = this.f51471b;
                bi.v vVar = g4Var.f45959h0.f51124b0;
                String str = this.f51472c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                vVar.setText(str);
                bi.v vVar2 = g4Var.f45959h0.f51124b0;
                vVar2.setSelection(vVar2.getText().length());
                org.telegram.messenger.g0.K3(g4Var.f45959h0.f51124b0);
                return;
            default:
                vf.c.n(this.f51471b.L, this.f51472c, false, null);
                return;
        }
    }
}
