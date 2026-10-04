package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wl0 implements View.OnTouchListener {
    public final int f42525a;
    public final kn0 f42526b;

    public wl0(kn0 kn0Var, int i10) {
        this.f42525a = i10;
        this.f42526b = kn0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f42525a;
        kn0 kn0Var = this.f42526b;
        switch (i10) {
            case 0:
                if (kn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    zt ztVar = new zt(null, false);
                    ztVar.f43884r = new pw(25, kn0Var, view);
                    kn0Var.presentFragment(ztVar);
                }
                return true;
            case 1:
                if (kn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kn0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20367a;
                    b2Var.R = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new vv(kn0Var, 2));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    kn0Var.showDialog(b2Var);
                }
                return true;
            case 2:
                if (kn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    zt ztVar2 = new zt(null, false);
                    ztVar2.f43884r = new xl0(kn0Var, 2);
                    kn0Var.presentFragment(ztVar2);
                }
                return true;
            default:
                if (kn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    zt ztVar3 = new zt(null, false);
                    ztVar3.f43884r = new xl0(kn0Var, 3);
                    kn0Var.presentFragment(ztVar3);
                }
                return true;
        }
    }
}
