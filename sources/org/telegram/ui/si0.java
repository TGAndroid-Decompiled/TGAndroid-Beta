package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class si0 implements View.OnClickListener {
    public final int f49922a;
    public final dk0 f49923b;

    public si0(dk0 dk0Var, int i7) {
        this.f49922a = i7;
        this.f49923b = dk0Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f49922a;
        dk0 dk0Var = this.f49923b;
        switch (i7) {
            case 0:
                dk0Var.S0 = 2;
                dk0Var.H1();
                return;
            case 1:
                dk0Var.h1();
                return;
            case 2:
                dk0Var.S0 = 3;
                dk0Var.H1();
                return;
            case 3:
                dk0Var.S0 = 1;
                dk0Var.H1();
                return;
            case 4:
                dk0Var.S0 = 4;
                dk0Var.H1();
                return;
            case 5:
                if (dk0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    dk0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    return;
                }
                s9 s9Var = new s9(0);
                s9Var.M = new dj0(dk0Var);
                dk0Var.presentFragment(s9Var);
                return;
            case 6:
                dk0Var.f45005f = true;
                dk0Var.L.callOnClick();
                dk0Var.f45005f = false;
                return;
            case 7:
                dk0Var.S0 = 0;
                dk0Var.H1();
                return;
            case 8:
                dk0Var.S0 = 4;
                dk0Var.H1();
                return;
            case 9:
                dk0Var.h1();
                return;
            case 10:
                dk0.g0(dk0Var);
                return;
            case 11:
                dk0.h0(dk0Var);
                return;
            case 12:
                dk0Var.G1();
                return;
            case 13:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dk0Var.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131744232, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131744233, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new ui0(dk0Var, 5));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                dk0Var.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, null);
                    return;
                }
                return;
            case 14:
                dk0Var.G1();
                return;
            case 15:
                dk0.a0(dk0Var);
                return;
            default:
                dk0Var.f45005f = true;
                dk0Var.L.callOnClick();
                dk0Var.f45005f = false;
                return;
        }
    }
}
