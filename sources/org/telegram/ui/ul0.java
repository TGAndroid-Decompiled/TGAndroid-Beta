package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ul0 implements View.OnTouchListener {
    public final int f44163a;
    public final in0 f44164b;

    public ul0(in0 in0Var, int i10) {
        this.f44163a = i10;
        this.f44164b = in0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f44163a;
        in0 in0Var = this.f44164b;
        switch (i10) {
            case 0:
                if (in0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ot otVar = new ot(null, false);
                    otVar.f42286r = new af0(4, in0Var, view);
                    in0Var.presentFragment(otVar);
                }
                return true;
            case 1:
                if (in0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(in0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                    e2Var.R = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new n4(in0Var, 3));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    in0Var.showDialog(e2Var);
                }
                return true;
            case 2:
                if (in0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ot otVar2 = new ot(null, false);
                    otVar2.f42286r = new vl0(in0Var, 2);
                    in0Var.presentFragment(otVar2);
                }
                return true;
            default:
                if (in0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ot otVar3 = new ot(null, false);
                    otVar3.f42286r = new vl0(in0Var, 3);
                    in0Var.presentFragment(otVar3);
                }
                return true;
        }
    }
}
