package org.telegram.ui;

import android.text.TextUtils;
public final class w implements Runnable {
    public final int f52336a;
    public final g4 f52337b;
    public final String f52338c;

    public w(g4 g4Var, String str, int i7) {
        this.f52336a = i7;
        this.f52337b = g4Var;
        this.f52338c = str;
    }

    @Override
    public final void run() {
        switch (this.f52336a) {
            case 0:
                g4 g4Var = this.f52337b;
                di.q qVar = g4Var.f47324i0.f52649c0;
                String str = this.f52338c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                qVar.setText(str);
                di.q qVar2 = g4Var.f47324i0.f52649c0;
                qVar2.setSelection(qVar2.getText().length());
                org.telegram.messenger.g0.J3(g4Var.f47324i0.f52649c0);
                return;
            default:
                vf.c.n(this.f52337b.M, this.f52338c, false, null);
                return;
        }
    }
}
