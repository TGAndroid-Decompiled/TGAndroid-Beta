package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vi0 implements View.OnClickListener {
    public final int f52790a;
    public final hk0 f52791b;

    public vi0(hk0 hk0Var, int i7) {
        this.f52790a = i7;
        this.f52791b = hk0Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f52790a;
        hk0 hk0Var = this.f52791b;
        switch (i7) {
            case 0:
                hk0Var.T0 = 2;
                hk0Var.H1();
                return;
            case 1:
                hk0Var.h1();
                return;
            case 2:
                hk0Var.T0 = 3;
                hk0Var.H1();
                return;
            case 3:
                hk0Var.T0 = 1;
                hk0Var.H1();
                return;
            case 4:
                hk0Var.T0 = 4;
                hk0Var.H1();
                return;
            case 5:
                if (hk0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    hk0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    return;
                }
                t9 t9Var = new t9(0);
                t9Var.N = new hj0(hk0Var);
                hk0Var.presentFragment(t9Var);
                return;
            case 6:
                hk0Var.f48383f = true;
                hk0Var.M.callOnClick();
                hk0Var.f48383f = false;
                return;
            case 7:
                hk0Var.T0 = 0;
                hk0Var.H1();
                return;
            case 8:
                hk0Var.T0 = 4;
                hk0Var.H1();
                return;
            case 9:
                hk0Var.h1();
                return;
            case 10:
                hk0.g0(hk0Var);
                return;
            case 11:
                hk0.h0(hk0Var);
                return;
            case 12:
                hk0Var.G1();
                return;
            case 13:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hk0Var.getParentActivity());
                String M0 = org.telegram.messenger.gd.M0(2131743997, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                u1Var.S = M0;
                u1Var.U = org.telegram.messenger.gd.M0(2131743998, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new xi0(hk0Var, 5));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                hk0Var.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29635q7, null);
                    return;
                }
                return;
            case 14:
                hk0Var.G1();
                return;
            case 15:
                hk0.a0(hk0Var);
                return;
            default:
                hk0Var.f48383f = true;
                hk0Var.M.callOnClick();
                hk0Var.f48383f = false;
                return;
        }
    }
}
