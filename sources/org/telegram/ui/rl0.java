package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rl0 implements View.OnTouchListener {
    public final int f37886a;
    public final fn0 f37887b;

    public rl0(fn0 fn0Var, int i10) {
        this.f37886a = i10;
        this.f37887b = fn0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f37886a;
        fn0 fn0Var = this.f37887b;
        switch (i10) {
            case 0:
                if (fn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    au auVar = new au(null, false);
                    auVar.f32646r = new vl0(1, fn0Var, view);
                    fn0Var.presentFragment(auVar);
                }
                return true;
            case 1:
                if (fn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fn0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                    d2Var.O = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new sv(fn0Var, 2));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    fn0Var.showDialog(d2Var);
                }
                return true;
            case 2:
                if (fn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    au auVar2 = new au(null, false);
                    auVar2.f32646r = new sl0(fn0Var, 2);
                    fn0Var.presentFragment(auVar2);
                }
                return true;
            default:
                if (fn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    au auVar3 = new au(null, false);
                    auVar3.f32646r = new sl0(fn0Var, 3);
                    fn0Var.presentFragment(auVar3);
                }
                return true;
        }
    }
}
