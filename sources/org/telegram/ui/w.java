package org.telegram.ui;

import android.text.TextUtils;
public final class w implements Runnable {
    public final int f52893a;
    public final g4 f52894b;
    public final String f52895c;

    public w(g4 g4Var, String str, int i7) {
        this.f52893a = i7;
        this.f52894b = g4Var;
        this.f52895c = str;
    }

    @Override
    public final void run() {
        switch (this.f52893a) {
            case 0:
                g4 g4Var = this.f52894b;
                di.q qVar = g4Var.f47908i0.f53143c0;
                String str = this.f52895c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                qVar.setText(str);
                di.q qVar2 = g4Var.f47908i0.f53143c0;
                qVar2.setSelection(qVar2.getText().length());
                org.telegram.messenger.g0.I3(g4Var.f47908i0.f53143c0);
                return;
            default:
                vf.c.n(this.f52894b.M, this.f52895c, false, null);
                return;
        }
    }
}
