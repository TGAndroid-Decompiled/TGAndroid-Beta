package org.telegram.ui;

import android.text.TextUtils;
public final class w implements Runnable {
    public final int f52339a;
    public final g4 f52340b;
    public final String f52341c;

    public w(g4 g4Var, String str, int i7) {
        this.f52339a = i7;
        this.f52340b = g4Var;
        this.f52341c = str;
    }

    @Override
    public final void run() {
        switch (this.f52339a) {
            case 0:
                g4 g4Var = this.f52340b;
                di.q qVar = g4Var.f47314i0.f52652c0;
                String str = this.f52341c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                qVar.setText(str);
                di.q qVar2 = g4Var.f47314i0.f52652c0;
                qVar2.setSelection(qVar2.getText().length());
                org.telegram.messenger.g0.J3(g4Var.f47314i0.f52652c0);
                return;
            default:
                vf.c.n(this.f52340b.M, this.f52341c, false, null);
                return;
        }
    }
}
