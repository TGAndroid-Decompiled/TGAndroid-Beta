package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rl0 implements View.OnTouchListener {
    public final int f40878a;
    public final fn0 f40879b;

    public rl0(fn0 fn0Var, int i10) {
        this.f40878a = i10;
        this.f40879b = fn0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f40878a;
        fn0 fn0Var = this.f40879b;
        switch (i10) {
            case 0:
                if (fn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    zt ztVar = new zt(null, false);
                    ztVar.f44022r = new vl0(1, fn0Var, view);
                    fn0Var.presentFragment(ztVar);
                }
                return true;
            case 1:
                if (fn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fn0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                    d2Var.O = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new rv(fn0Var, 2));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    fn0Var.showDialog(d2Var);
                }
                return true;
            case 2:
                if (fn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    zt ztVar2 = new zt(null, false);
                    ztVar2.f44022r = new sl0(fn0Var, 2);
                    fn0Var.presentFragment(ztVar2);
                }
                return true;
            default:
                if (fn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    zt ztVar3 = new zt(null, false);
                    ztVar3.f44022r = new sl0(fn0Var, 3);
                    fn0Var.presentFragment(ztVar3);
                }
                return true;
        }
    }
}
