package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ti0 implements View.OnClickListener {
    public final int f50289a;
    public final ek0 f50290b;

    public ti0(ek0 ek0Var, int i7) {
        this.f50289a = i7;
        this.f50290b = ek0Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f50289a;
        ek0 ek0Var = this.f50290b;
        switch (i7) {
            case 0:
                ek0Var.S0 = 2;
                ek0Var.H1();
                return;
            case 1:
                ek0Var.h1();
                return;
            case 2:
                ek0Var.S0 = 3;
                ek0Var.H1();
                return;
            case 3:
                ek0Var.S0 = 1;
                ek0Var.H1();
                return;
            case 4:
                ek0Var.S0 = 4;
                ek0Var.H1();
                return;
            case 5:
                if (ek0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    ek0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    return;
                }
                s9 s9Var = new s9(0);
                s9Var.M = new ej0(ek0Var);
                ek0Var.presentFragment(s9Var);
                return;
            case 6:
                ek0Var.f45329f = true;
                ek0Var.L.callOnClick();
                ek0Var.f45329f = false;
                return;
            case 7:
                ek0Var.S0 = 0;
                ek0Var.H1();
                return;
            case 8:
                ek0Var.S0 = 4;
                ek0Var.H1();
                return;
            case 9:
                ek0Var.h1();
                return;
            case 10:
                ek0.g0(ek0Var);
                return;
            case 11:
                ek0.h0(ek0Var);
                return;
            case 12:
                ek0Var.G1();
                return;
            case 13:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ek0Var.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131744232, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131744233, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new vi0(ek0Var, 5));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                ek0Var.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, null);
                    return;
                }
                return;
            case 14:
                ek0Var.G1();
                return;
            case 15:
                ek0.a0(ek0Var);
                return;
            default:
                ek0Var.f45329f = true;
                ek0Var.L.callOnClick();
                ek0Var.f45329f = false;
                return;
        }
    }
}
