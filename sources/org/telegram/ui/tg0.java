package org.telegram.ui;

import android.text.TextUtils;
public final class tg0 implements ns, r9 {
    public final vg0 f49801a;

    public tg0(vg0 vg0Var) {
        this.f49801a = vg0Var;
    }

    @Override
    public void M(String str) {
        String c2 = sf.c.c(str);
        if (!TextUtils.isEmpty(c2)) {
            org.telegram.messenger.hp.s1(this.f49801a.f28583a).d2().a(c2, null, new ei.e(18));
        } else {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.go(24));
        }
    }

    @Override
    public String M0() {
        return null;
    }

    @Override
    public void c(ks ksVar) {
        vg0 vg0Var = this.f49801a;
        vg0Var.f50522v1 = true;
        String str = ksVar.f47006c;
        vg0Var.F1.setText(str);
        vg0Var.M0(str, ksVar);
        vg0Var.f50522v1 = false;
        org.telegram.messenger.g0.i3(new sg0(this, 0), 300L);
        vg0Var.H1.requestFocus();
        ug0 ug0Var = vg0Var.H1;
        ug0Var.setSelection(ug0Var.length());
    }

    @Override
    public boolean e1(String str, i9 i9Var) {
        return false;
    }

    @Override
    public void V0(org.telegram.messenger.rr rrVar) {
    }

    @Override
    public void onDismiss() {
    }
}
