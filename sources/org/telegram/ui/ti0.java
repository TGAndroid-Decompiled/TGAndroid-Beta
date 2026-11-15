package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ti0 implements View.OnTouchListener {
    public final int f51602a;
    public final ek0 f51603b;

    public ti0(ek0 ek0Var, int i7) {
        this.f51602a = i7;
        this.f51603b = ek0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i7 = this.f51602a;
        ek0 ek0Var = this.f51603b;
        switch (i7) {
            case 0:
                if (ek0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ts tsVar = new ts(null, false);
                    tsVar.f51664r = new xi0(2, ek0Var, view);
                    ek0Var.presentFragment(tsVar);
                }
                return true;
            case 1:
                if (ek0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ek0Var.getParentActivity());
                    String M0 = org.telegram.messenger.hd.M0(2131747466, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.S = M0;
                    alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.hd.M0(2131747508, null), org.telegram.messenger.hd.M0(2131747569, null)}, new k4(ek0Var, 3));
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752589, null), null);
                    ek0Var.showDialog(t1Var);
                }
                return true;
            case 2:
                if (ek0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ts tsVar2 = new ts(null, false);
                    tsVar2.f51664r = new ui0(ek0Var, 2);
                    ek0Var.presentFragment(tsVar2);
                }
                return true;
            default:
                if (ek0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ts tsVar3 = new ts(null, false);
                    tsVar3.f51664r = new ui0(ek0Var, 3);
                    ek0Var.presentFragment(tsVar3);
                }
                return true;
        }
    }
}
