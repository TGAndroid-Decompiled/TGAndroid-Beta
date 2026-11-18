package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wi0 implements View.OnTouchListener {
    public final int f53445a;
    public final hk0 f53446b;

    public wi0(hk0 hk0Var, int i7) {
        this.f53445a = i7;
        this.f53446b = hk0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i7 = this.f53445a;
        hk0 hk0Var = this.f53446b;
        switch (i7) {
            case 0:
                if (hk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ts tsVar = new ts(null, false);
                    tsVar.f52351r = new aj0(1, hk0Var, view);
                    hk0Var.presentFragment(tsVar);
                }
                return true;
            case 1:
                if (hk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hk0Var.getParentActivity());
                    String M0 = org.telegram.messenger.gd.M0(2131747273, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                    u1Var.S = M0;
                    alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.gd.M0(2131747315, null), org.telegram.messenger.gd.M0(2131747376, null)}, new k4(hk0Var, 3));
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752578, null), null);
                    hk0Var.showDialog(u1Var);
                }
                return true;
            case 2:
                if (hk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ts tsVar2 = new ts(null, false);
                    tsVar2.f52351r = new xi0(hk0Var, 2);
                    hk0Var.presentFragment(tsVar2);
                }
                return true;
            default:
                if (hk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ts tsVar3 = new ts(null, false);
                    tsVar3.f52351r = new xi0(hk0Var, 3);
                    hk0Var.presentFragment(tsVar3);
                }
                return true;
        }
    }
}
