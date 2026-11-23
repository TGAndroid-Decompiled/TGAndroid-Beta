package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ti0 implements View.OnClickListener {
    public final int f52411a;
    public final fk0 f52412b;

    public ti0(fk0 fk0Var, int i7) {
        this.f52411a = i7;
        this.f52412b = fk0Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f52411a;
        fk0 fk0Var = this.f52412b;
        switch (i7) {
            case 0:
                fk0Var.T0 = 2;
                fk0Var.H1();
                return;
            case 1:
                fk0Var.h1();
                return;
            case 2:
                fk0Var.T0 = 3;
                fk0Var.H1();
                return;
            case 3:
                fk0Var.T0 = 1;
                fk0Var.H1();
                return;
            case 4:
                fk0Var.T0 = 4;
                fk0Var.H1();
                return;
            case 5:
                if (fk0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    fk0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    return;
                }
                t9 t9Var = new t9(0);
                t9Var.N = new fj0(fk0Var);
                fk0Var.presentFragment(t9Var);
                return;
            case 6:
                fk0Var.f47865f = true;
                fk0Var.M.callOnClick();
                fk0Var.f47865f = false;
                return;
            case 7:
                fk0Var.T0 = 0;
                fk0Var.H1();
                return;
            case 8:
                fk0Var.T0 = 4;
                fk0Var.H1();
                return;
            case 9:
                fk0Var.h1();
                return;
            case 10:
                fk0.g0(fk0Var);
                return;
            case 11:
                fk0.h0(fk0Var);
                return;
            case 12:
                fk0Var.G1();
                return;
            case 13:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fk0Var.getParentActivity());
                String N0 = org.telegram.messenger.gd.N0(2131743987, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.gd.N0(2131743988, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new vi0(fk0Var, 5));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                fk0Var.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
                    return;
                }
                return;
            case 14:
                fk0Var.G1();
                return;
            case 15:
                fk0.a0(fk0Var);
                return;
            default:
                fk0Var.f47865f = true;
                fk0Var.M.callOnClick();
                fk0Var.f47865f = false;
                return;
        }
    }
}
