package org.telegram.ui;

import android.view.View;
import android.widget.Toast;
public final class r21 implements View.OnClickListener {
    public final int f49009a;
    public final c31 f49010b;

    public r21(c31 c31Var, int i3) {
        this.f49009a = i3;
        this.f49010b = c31Var;
    }

    @Override
    public final void onClick(View view) {
        int i3 = this.f49009a;
        c31 c31Var = this.f49010b;
        switch (i3) {
            case 0:
                sf.c.t(c31Var.getParentActivity(), c31Var.getMessagesController().L5);
                c31Var.getMessagesController().k4(0L, "PREMIUM_GRACE");
                return;
            case 1:
                c31Var.getClass();
                c31Var.presentFragment(new g(3));
                return;
            case 2:
                c31Var.getMessagesController().k4(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                c31Var.getClass();
                c31Var.presentFragment(new ra1(8, null));
                return;
            case 4:
                c31Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                c31.a0(c31Var);
                return;
            default:
                int i10 = c31Var.R + 1;
                c31Var.R = i10;
                if (i10 < 2) {
                    boolean z10 = org.telegram.messenger.r2.f25040a;
                    try {
                        Toast.makeText(c31Var.getParentActivity(), org.telegram.messenger.bd.M0(2131751626, null), 0).show();
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                c31Var.presentFragment(new org.telegram.ui.Components.h41());
                return;
        }
    }
}
