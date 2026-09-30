package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rl0 implements View.OnTouchListener {
    public final int f37473a;
    public final fn0 f37474b;

    public rl0(fn0 fn0Var, int i10) {
        this.f37473a = i10;
        this.f37474b = fn0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f37473a;
        fn0 fn0Var = this.f37474b;
        switch (i10) {
            case 0:
                if (fn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    wt wtVar = new wt(null, false);
                    wtVar.f39853r = new ow(24, fn0Var, view);
                    fn0Var.presentFragment(wtVar);
                }
                return true;
            case 1:
                if (fn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fn0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18678a;
                    a2Var.R = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new qv(fn0Var, 2));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    fn0Var.showDialog(a2Var);
                }
                return true;
            case 2:
                if (fn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    wt wtVar2 = new wt(null, false);
                    wtVar2.f39853r = new sl0(fn0Var, 2);
                    fn0Var.presentFragment(wtVar2);
                }
                return true;
            default:
                if (fn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    wt wtVar3 = new wt(null, false);
                    wtVar3.f39853r = new sl0(fn0Var, 3);
                    fn0Var.presentFragment(wtVar3);
                }
                return true;
        }
    }
}
