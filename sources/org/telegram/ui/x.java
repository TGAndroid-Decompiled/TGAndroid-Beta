package org.telegram.ui;

import android.text.TextUtils;
public final class x implements Runnable {
    public final int f51694a;
    public final g4 f51695b;
    public final String f51696c;

    public x(g4 g4Var, String str, int i7) {
        this.f51694a = i7;
        this.f51695b = g4Var;
        this.f51696c = str;
    }

    @Override
    public final void run() {
        switch (this.f51694a) {
            case 0:
                g4 g4Var = this.f51695b;
                bi.v vVar = g4Var.f45831h0.f51203b0;
                String str = this.f51696c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                vVar.setText(str);
                bi.v vVar2 = g4Var.f45831h0.f51203b0;
                vVar2.setSelection(vVar2.getText().length());
                org.telegram.messenger.g0.K3(g4Var.f45831h0.f51203b0);
                return;
            default:
                vf.c.n(this.f51695b.L, this.f51696c, false, null);
                return;
        }
    }
}
