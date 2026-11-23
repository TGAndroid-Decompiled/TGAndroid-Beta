package org.telegram.ui;

import android.text.TextUtils;
public final class w implements Runnable {
    public final int f52925a;
    public final g4 f52926b;
    public final String f52927c;

    public w(g4 g4Var, String str, int i7) {
        this.f52925a = i7;
        this.f52926b = g4Var;
        this.f52927c = str;
    }

    @Override
    public final void run() {
        switch (this.f52925a) {
            case 0:
                g4 g4Var = this.f52926b;
                di.q qVar = g4Var.f47961i0.f53179c0;
                String str = this.f52927c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                qVar.setText(str);
                di.q qVar2 = g4Var.f47961i0.f53179c0;
                qVar2.setSelection(qVar2.getText().length());
                org.telegram.messenger.g0.I3(g4Var.f47961i0.f53179c0);
                return;
            default:
                vf.c.n(this.f52926b.M, this.f52927c, false, null);
                return;
        }
    }
}
