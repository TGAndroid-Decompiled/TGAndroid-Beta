package org.telegram.ui;

import android.text.TextUtils;
public final class yg0 implements ss, s9 {
    public final bh0 f53512a;

    public yg0(bh0 bh0Var) {
        this.f53512a = bh0Var;
    }

    @Override
    public String J0() {
        return null;
    }

    @Override
    public void M(String str) {
        String c10 = vf.c.c(str);
        if (!TextUtils.isEmpty(c10)) {
            org.telegram.messenger.np.s1(this.f53512a.f29679a).d2().a(c10, null, new fi.e(19));
        } else {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ih(29));
        }
    }

    @Override
    public boolean d1(String str, j9 j9Var) {
        return false;
    }

    @Override
    public void e(ps psVar) {
        bh0 bh0Var = this.f53512a;
        bh0Var.f45755y1 = true;
        String str = psVar.f50351c;
        bh0Var.I1.setText(str);
        bh0Var.M0(str, psVar);
        bh0Var.f45755y1 = false;
        org.telegram.messenger.g0.i3(new ef0(this, 1), 300L);
        bh0Var.K1.requestFocus();
        zg0 zg0Var = bh0Var.K1;
        zg0Var.setSelection(zg0Var.length());
    }

    @Override
    public void S0(org.telegram.messenger.wr wrVar) {
    }

    @Override
    public void onDismiss() {
    }
}
