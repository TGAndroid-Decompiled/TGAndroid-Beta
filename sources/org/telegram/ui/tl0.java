package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tl0 implements View.OnTouchListener {
    public final int f37712a;
    public final in0 f37713b;

    public tl0(in0 in0Var, int i10) {
        this.f37712a = i10;
        this.f37713b = in0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f37712a;
        in0 in0Var = this.f37713b;
        switch (i10) {
            case 0:
                if (in0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    xt xtVar = new xt(null, false);
                    xtVar.f39660r = new w10(23, in0Var, view);
                    in0Var.presentFragment(xtVar);
                }
                return true;
            case 1:
                if (in0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(in0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                    b2Var.R = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new rv(in0Var, 2));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    in0Var.showDialog(b2Var);
                }
                return true;
            case 2:
                if (in0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    xt xtVar2 = new xt(null, false);
                    xtVar2.f39660r = new ul0(in0Var, 2);
                    in0Var.presentFragment(xtVar2);
                }
                return true;
            default:
                if (in0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    xt xtVar3 = new xt(null, false);
                    xtVar3.f39660r = new ul0(in0Var, 3);
                    in0Var.presentFragment(xtVar3);
                }
                return true;
        }
    }
}
