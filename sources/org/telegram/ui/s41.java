package org.telegram.ui;

import android.view.View;
import android.widget.Toast;
public final class s41 implements View.OnClickListener {
    public final int f41372a;
    public final e51 f41373b;

    public s41(e51 e51Var, int i10) {
        this.f41372a = i10;
        this.f41373b = e51Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f41372a;
        e51 e51Var = this.f41373b;
        switch (i10) {
            case 0:
                gf.f.r(e51Var.getParentActivity(), e51Var.getMessagesController().M5);
                e51Var.getMessagesController().h4(0L, "PREMIUM_GRACE");
                return;
            case 1:
                e51Var.getClass();
                e51Var.presentFragment(new f(3));
                return;
            case 2:
                e51Var.getMessagesController().h4(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                e51Var.getClass();
                e51Var.presentFragment(new tc1(8, null));
                return;
            case 4:
                e51Var.getMessagesController().h4(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                e51.Z(e51Var);
                return;
            default:
                int i11 = e51Var.Q + 1;
                e51Var.Q = i11;
                if (i11 < 2) {
                    boolean z10 = org.telegram.messenger.v2.f18448a;
                    try {
                        Toast.makeText(e51Var.getParentActivity(), org.telegram.messenger.cd.L0(2131751626, null), 0).show();
                        return;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
                e51Var.presentFragment(new org.telegram.ui.Components.r51());
                return;
        }
    }
}
