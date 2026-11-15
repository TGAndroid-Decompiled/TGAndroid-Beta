package org.telegram.ui;

import android.view.View;
import android.widget.Toast;
public final class z21 implements View.OnClickListener {
    public final int f53819a;
    public final k31 f53820b;

    public z21(k31 k31Var, int i7) {
        this.f53819a = i7;
        this.f53820b = k31Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f53819a;
        k31 k31Var = this.f53820b;
        switch (i7) {
            case 0:
                vf.c.t(k31Var.getParentActivity(), k31Var.getMessagesController().M5);
                k31Var.getMessagesController().k4(0L, "PREMIUM_GRACE");
                return;
            case 1:
                k31Var.getClass();
                k31Var.presentFragment(new g(3));
                return;
            case 2:
                k31Var.getMessagesController().k4(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                k31Var.getClass();
                k31Var.presentFragment(new xa1(8, null));
                return;
            case 4:
                k31Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                k31.a0(k31Var);
                return;
            default:
                int i10 = k31Var.R + 1;
                k31Var.R = i10;
                if (i10 < 2) {
                    boolean z10 = org.telegram.messenger.r2.f26198a;
                    try {
                        Toast.makeText(k31Var.getParentActivity(), org.telegram.messenger.hd.M0(2131751625, null), 0).show();
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                k31Var.presentFragment(new org.telegram.ui.Components.r41());
                return;
        }
    }
}
