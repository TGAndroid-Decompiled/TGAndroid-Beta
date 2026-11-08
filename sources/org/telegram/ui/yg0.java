package org.telegram.ui;

import android.text.TextUtils;
public final class yg0 implements ps, r9 {
    public final ah0 f52216a;

    public yg0(ah0 ah0Var) {
        this.f52216a = ah0Var;
    }

    @Override
    public void M(String str) {
        String c10 = vf.c.c(str);
        if (!TextUtils.isEmpty(c10)) {
            org.telegram.messenger.qp.s1(this.f52216a.f28616a).d2().a(c10, null, new di.e(19));
        } else {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.vs(25));
        }
    }

    @Override
    public String R0() {
        return null;
    }

    @Override
    public void b(ms msVar) {
        ah0 ah0Var = this.f52216a;
        ah0Var.f43667u1 = true;
        String str = msVar.f47871c;
        ah0Var.E1.setText(str);
        ah0Var.M0(str, msVar);
        ah0Var.f43667u1 = false;
        org.telegram.messenger.g0.i3(new ef0(this, 1), 300L);
        ah0Var.G1.requestFocus();
        zg0 zg0Var = ah0Var.G1;
        zg0Var.setSelection(zg0Var.length());
    }

    @Override
    public boolean h1(String str, j9 j9Var) {
        return false;
    }

    @Override
    public void V0(org.telegram.messenger.zr zrVar) {
    }

    @Override
    public void onDismiss() {
    }
}
