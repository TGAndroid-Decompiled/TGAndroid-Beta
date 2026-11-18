package org.telegram.ui;

import android.text.TextUtils;
public final class w implements Runnable {
    public final int f52890a;
    public final g4 f52891b;
    public final String f52892c;

    public w(g4 g4Var, String str, int i7) {
        this.f52890a = i7;
        this.f52891b = g4Var;
        this.f52892c = str;
    }

    @Override
    public final void run() {
        switch (this.f52890a) {
            case 0:
                g4 g4Var = this.f52891b;
                di.q qVar = g4Var.f47923i0.f53181c0;
                String str = this.f52892c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                qVar.setText(str);
                di.q qVar2 = g4Var.f47923i0.f53181c0;
                qVar2.setSelection(qVar2.getText().length());
                org.telegram.messenger.g0.I3(g4Var.f47923i0.f53181c0);
                return;
            default:
                vf.c.n(this.f52891b.M, this.f52892c, false, null);
                return;
        }
    }
}
