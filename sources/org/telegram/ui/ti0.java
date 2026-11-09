package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ti0 implements View.OnTouchListener {
    public final int f50190a;
    public final dk0 f50191b;

    public ti0(dk0 dk0Var, int i7) {
        this.f50190a = i7;
        this.f50191b = dk0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i7 = this.f50190a;
        dk0 dk0Var = this.f50191b;
        switch (i7) {
            case 0:
                if (dk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ss ssVar = new ss(null, false);
                    ssVar.f49987r = new ru(28, dk0Var, view);
                    dk0Var.presentFragment(ssVar);
                }
                return true;
            case 1:
                if (dk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dk0Var.getParentActivity());
                    String M0 = org.telegram.messenger.id.M0(2131747466, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.R = M0;
                    alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.id.M0(2131747508, null), org.telegram.messenger.id.M0(2131747569, null)}, new k4(dk0Var, 3));
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752589, null), null);
                    dk0Var.showDialog(u1Var);
                }
                return true;
            case 2:
                if (dk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ss ssVar2 = new ss(null, false);
                    ssVar2.f49987r = new ui0(dk0Var, 2);
                    dk0Var.presentFragment(ssVar2);
                }
                return true;
            default:
                if (dk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ss ssVar3 = new ss(null, false);
                    ssVar3.f49987r = new ui0(dk0Var, 3);
                    dk0Var.presentFragment(ssVar3);
                }
                return true;
        }
    }
}
