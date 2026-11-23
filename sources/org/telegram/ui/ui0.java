package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ui0 implements View.OnTouchListener {
    public final int f52677a;
    public final fk0 f52678b;

    public ui0(fk0 fk0Var, int i7) {
        this.f52677a = i7;
        this.f52678b = fk0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i7 = this.f52677a;
        fk0 fk0Var = this.f52678b;
        switch (i7) {
            case 0:
                if (fk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ts tsVar = new ts(null, false);
                    tsVar.f52468r = new yi0(1, fk0Var, view);
                    fk0Var.presentFragment(tsVar);
                }
                return true;
            case 1:
                if (fk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fk0Var.getParentActivity());
                    String N0 = org.telegram.messenger.gd.N0(2131747272, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    t1Var.S = N0;
                    alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.gd.N0(2131747314, null), org.telegram.messenger.gd.N0(2131747375, null)}, new k4(fk0Var, 3));
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752577, null), null);
                    fk0Var.showDialog(t1Var);
                }
                return true;
            case 2:
                if (fk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ts tsVar2 = new ts(null, false);
                    tsVar2.f52468r = new vi0(fk0Var, 2);
                    fk0Var.presentFragment(tsVar2);
                }
                return true;
            default:
                if (fk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ts tsVar3 = new ts(null, false);
                    tsVar3.f52468r = new vi0(fk0Var, 3);
                    fk0Var.presentFragment(tsVar3);
                }
                return true;
        }
    }
}
