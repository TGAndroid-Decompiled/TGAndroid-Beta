package org.telegram.ui;

import android.text.TextUtils;
public final class w implements Runnable {
    public final int f52880a;
    public final g4 f52881b;
    public final String f52882c;

    public w(g4 g4Var, String str, int i7) {
        this.f52880a = i7;
        this.f52881b = g4Var;
        this.f52882c = str;
    }

    @Override
    public final void run() {
        switch (this.f52880a) {
            case 0:
                g4 g4Var = this.f52881b;
                di.q qVar = g4Var.f47887i0.f53132c0;
                String str = this.f52882c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                qVar.setText(str);
                di.q qVar2 = g4Var.f47887i0.f53132c0;
                qVar2.setSelection(qVar2.getText().length());
                org.telegram.messenger.g0.I3(g4Var.f47887i0.f53132c0);
                return;
            default:
                vf.c.n(this.f52881b.M, this.f52882c, false, null);
                return;
        }
    }
}
