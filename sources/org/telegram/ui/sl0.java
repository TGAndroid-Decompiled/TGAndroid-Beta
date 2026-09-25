package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class sl0 implements View.OnTouchListener {
    public final int f37823a;
    public final gn0 f37824b;

    public sl0(gn0 gn0Var, int i10) {
        this.f37823a = i10;
        this.f37824b = gn0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f37823a;
        gn0 gn0Var = this.f37824b;
        switch (i10) {
            case 0:
                if (gn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    wt wtVar = new wt(null, false);
                    wtVar.f39759r = new ow(24, gn0Var, view);
                    gn0Var.presentFragment(wtVar);
                }
                return true;
            case 1:
                if (gn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gn0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18662a;
                    a2Var.R = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new qv(gn0Var, 2));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    gn0Var.showDialog(a2Var);
                }
                return true;
            case 2:
                if (gn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    wt wtVar2 = new wt(null, false);
                    wtVar2.f39759r = new tl0(gn0Var, 2);
                    gn0Var.presentFragment(wtVar2);
                }
                return true;
            default:
                if (gn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    wt wtVar3 = new wt(null, false);
                    wtVar3.f39759r = new tl0(gn0Var, 3);
                    gn0Var.presentFragment(wtVar3);
                }
                return true;
        }
    }
}
