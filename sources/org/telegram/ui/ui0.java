package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ui0 implements View.OnTouchListener {
    public final int f50509a;
    public final ek0 f50510b;

    public ui0(ek0 ek0Var, int i7) {
        this.f50509a = i7;
        this.f50510b = ek0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i7 = this.f50509a;
        ek0 ek0Var = this.f50510b;
        switch (i7) {
            case 0:
                if (ek0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ts tsVar = new ts(null, false);
                    tsVar.f50336r = new su(28, ek0Var, view);
                    ek0Var.presentFragment(tsVar);
                }
                return true;
            case 1:
                if (ek0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ek0Var.getParentActivity());
                    String M0 = org.telegram.messenger.id.M0(2131747466, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                    u1Var.R = M0;
                    alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.id.M0(2131747508, null), org.telegram.messenger.id.M0(2131747569, null)}, new k4(ek0Var, 3));
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752589, null), null);
                    ek0Var.showDialog(u1Var);
                }
                return true;
            case 2:
                if (ek0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ts tsVar2 = new ts(null, false);
                    tsVar2.f50336r = new vi0(ek0Var, 2);
                    ek0Var.presentFragment(tsVar2);
                }
                return true;
            default:
                if (ek0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ts tsVar3 = new ts(null, false);
                    tsVar3.f50336r = new vi0(ek0Var, 3);
                    ek0Var.presentFragment(tsVar3);
                }
                return true;
        }
    }
}
