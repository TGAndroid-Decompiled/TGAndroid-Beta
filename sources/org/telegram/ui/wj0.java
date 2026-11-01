package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wj0 implements View.OnClickListener {
    public final int f43123a;
    public final jl0 f43124b;

    public wj0(jl0 jl0Var, int i10) {
        this.f43123a = i10;
        this.f43124b = jl0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f43123a;
        jl0 jl0Var = this.f43124b;
        switch (i10) {
            case 0:
                jl0Var.S0 = 2;
                jl0Var.H1();
                return;
            case 1:
                jl0Var.h1();
                return;
            case 2:
                jl0Var.S0 = 3;
                jl0Var.H1();
                return;
            case 3:
                jl0Var.S0 = 1;
                jl0Var.H1();
                return;
            case 4:
                jl0Var.S0 = 4;
                jl0Var.H1();
                return;
            case 5:
                if (jl0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    jl0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    return;
                }
                u9 u9Var = new u9(0);
                u9Var.M = new ik0(jl0Var);
                jl0Var.presentFragment(u9Var);
                return;
            case 6:
                jl0Var.f38422f = true;
                jl0Var.L.callOnClick();
                jl0Var.f38422f = false;
                return;
            case 7:
                jl0Var.S0 = 0;
                jl0Var.H1();
                return;
            case 8:
                jl0Var.S0 = 4;
                jl0Var.H1();
                return;
            case 9:
                jl0Var.h1();
                return;
            case 10:
                jl0.g0(jl0Var);
                return;
            case 11:
                jl0.h0(jl0Var);
                return;
            case 12:
                jl0Var.G1();
                return;
            case 13:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jl0Var.getParentActivity());
                String L0 = org.telegram.messenger.dd.L0(2131744257, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.dd.L0(2131744258, null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new yj0(jl0Var, 5));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                jl0Var.showDialog(x1Var);
                TextView textView = (TextView) x1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
                    return;
                }
                return;
            case 14:
                jl0Var.G1();
                return;
            case 15:
                jl0.a0(jl0Var);
                return;
            default:
                jl0Var.f38422f = true;
                jl0Var.L.callOnClick();
                jl0Var.f38422f = false;
                return;
        }
    }
}
