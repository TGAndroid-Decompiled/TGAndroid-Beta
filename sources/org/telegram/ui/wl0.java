package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wl0 implements View.OnTouchListener {
    public final int f45027a;
    public final kn0 f45028b;

    public wl0(kn0 kn0Var, int i10) {
        this.f45027a = i10;
        this.f45028b = kn0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f45027a;
        kn0 kn0Var = this.f45028b;
        switch (i10) {
            case 0:
                if (kn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    qt qtVar = new qt(null, false);
                    qtVar.f42787r = new cf0(4, kn0Var, view);
                    kn0Var.presentFragment(qtVar);
                }
                return true;
            case 1:
                if (kn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kn0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                    e2Var.R = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new n4(kn0Var, 3));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    kn0Var.showDialog(e2Var);
                }
                return true;
            case 2:
                if (kn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    qt qtVar2 = new qt(null, false);
                    qtVar2.f42787r = new xl0(kn0Var, 2);
                    kn0Var.presentFragment(qtVar2);
                }
                return true;
            default:
                if (kn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    qt qtVar3 = new qt(null, false);
                    qtVar3.f42787r = new xl0(kn0Var, 3);
                    kn0Var.presentFragment(qtVar3);
                }
                return true;
        }
    }
}
