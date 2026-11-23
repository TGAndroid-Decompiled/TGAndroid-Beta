package org.telegram.ui;

import android.text.TextUtils;
public final class w implements Runnable {
    public final int f53059a;
    public final g4 f53060b;
    public final String f53061c;

    public w(g4 g4Var, String str, int i7) {
        this.f53059a = i7;
        this.f53060b = g4Var;
        this.f53061c = str;
    }

    @Override
    public final void run() {
        switch (this.f53059a) {
            case 0:
                g4 g4Var = this.f53060b;
                di.q qVar = g4Var.f48072i0.f53414c0;
                String str = this.f53061c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                qVar.setText(str);
                di.q qVar2 = g4Var.f48072i0.f53414c0;
                qVar2.setSelection(qVar2.getText().length());
                org.telegram.messenger.g0.I3(g4Var.f48072i0.f53414c0);
                return;
            default:
                vf.c.n(this.f53060b.M, this.f53061c, false, null);
                return;
        }
    }
}
