package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class si0 implements View.OnClickListener {
    public final int f51229a;
    public final ek0 f51230b;

    public si0(ek0 ek0Var, int i7) {
        this.f51229a = i7;
        this.f51230b = ek0Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f51229a;
        ek0 ek0Var = this.f51230b;
        switch (i7) {
            case 0:
                ek0Var.T0 = 2;
                ek0Var.H1();
                return;
            case 1:
                ek0Var.h1();
                return;
            case 2:
                ek0Var.T0 = 3;
                ek0Var.H1();
                return;
            case 3:
                ek0Var.T0 = 1;
                ek0Var.H1();
                return;
            case 4:
                ek0Var.T0 = 4;
                ek0Var.H1();
                return;
            case 5:
                if (ek0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    ek0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    return;
                }
                t9 t9Var = new t9(0);
                t9Var.N = new ej0(ek0Var);
                ek0Var.presentFragment(t9Var);
                return;
            case 6:
                ek0Var.f46816f = true;
                ek0Var.M.callOnClick();
                ek0Var.f46816f = false;
                return;
            case 7:
                ek0Var.T0 = 0;
                ek0Var.H1();
                return;
            case 8:
                ek0Var.T0 = 4;
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
                String M0 = org.telegram.messenger.hd.M0(2131744232, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.hd.M0(2131744233, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new ui0(ek0Var, 5));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                ek0Var.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
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
                ek0Var.f46816f = true;
                ek0Var.M.callOnClick();
                ek0Var.f46816f = false;
                return;
        }
    }
}
