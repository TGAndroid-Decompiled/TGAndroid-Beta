package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yj0 implements View.OnClickListener {
    public final int f43856a;
    public final ll0 f43857b;

    public yj0(ll0 ll0Var, int i10) {
        this.f43856a = i10;
        this.f43857b = ll0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f43856a;
        ll0 ll0Var = this.f43857b;
        switch (i10) {
            case 0:
                ll0Var.S0 = 2;
                ll0Var.G1();
                return;
            case 1:
                ll0Var.g1();
                return;
            case 2:
                ll0Var.S0 = 3;
                ll0Var.G1();
                return;
            case 3:
                ll0Var.S0 = 1;
                ll0Var.G1();
                return;
            case 4:
                ll0Var.S0 = 4;
                ll0Var.G1();
                return;
            case 5:
                if (ll0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    ll0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    return;
                }
                u9 u9Var = new u9(0);
                u9Var.M = new kk0(ll0Var);
                ll0Var.presentFragment(u9Var);
                return;
            case 6:
                ll0Var.f39270f = true;
                ll0Var.L.callOnClick();
                ll0Var.f39270f = false;
                return;
            case 7:
                ll0Var.S0 = 0;
                ll0Var.G1();
                return;
            case 8:
                ll0Var.S0 = 4;
                ll0Var.G1();
                return;
            case 9:
                ll0Var.g1();
                return;
            case 10:
                ll0.f0(ll0Var);
                return;
            case 11:
                ll0.g0(ll0Var);
                return;
            case 12:
                ll0Var.F1();
                return;
            case 13:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ll0Var.getParentActivity());
                String L0 = org.telegram.messenger.cd.L0(2131744257, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.cd.L0(2131744258, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new ak0(ll0Var, 5));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                ll0Var.showDialog(x1Var);
                TextView textView = (TextView) x1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                    return;
                }
                return;
            case 14:
                ll0Var.F1();
                return;
            case 15:
                ll0.Z(ll0Var);
                return;
            default:
                ll0Var.f39270f = true;
                ll0Var.L.callOnClick();
                ll0Var.f39270f = false;
                return;
        }
    }
}
