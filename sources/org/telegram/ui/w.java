package org.telegram.ui;

import android.text.TextUtils;
public final class w implements Runnable {
    public final int f52921a;
    public final g4 f52922b;
    public final String f52923c;

    public w(g4 g4Var, String str, int i7) {
        this.f52921a = i7;
        this.f52922b = g4Var;
        this.f52923c = str;
    }

    @Override
    public final void run() {
        switch (this.f52921a) {
            case 0:
                g4 g4Var = this.f52922b;
                di.q qVar = g4Var.f47957i0.f53175c0;
                String str = this.f52923c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                qVar.setText(str);
                di.q qVar2 = g4Var.f47957i0.f53175c0;
                qVar2.setSelection(qVar2.getText().length());
                org.telegram.messenger.g0.I3(g4Var.f47957i0.f53175c0);
                return;
            default:
                vf.c.n(this.f52922b.M, this.f52923c, false, null);
                return;
        }
    }
}
