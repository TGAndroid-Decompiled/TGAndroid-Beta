package org.telegram.ui;

import android.text.TextUtils;
public final class x implements Runnable {
    public final int f51508a;
    public final g4 f51509b;
    public final String f51510c;

    public x(g4 g4Var, String str, int i7) {
        this.f51508a = i7;
        this.f51509b = g4Var;
        this.f51510c = str;
    }

    @Override
    public final void run() {
        switch (this.f51508a) {
            case 0:
                g4 g4Var = this.f51509b;
                bi.v vVar = g4Var.f45890h0.f51170b0;
                String str = this.f51510c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                vVar.setText(str);
                bi.v vVar2 = g4Var.f45890h0.f51170b0;
                vVar2.setSelection(vVar2.getText().length());
                org.telegram.messenger.g0.K3(g4Var.f45890h0.f51170b0);
                return;
            default:
                vf.c.n(this.f51509b.L, this.f51510c, false, null);
                return;
        }
    }
}
