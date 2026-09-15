package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zl0 implements View.OnTouchListener {
    public final int f40233a;
    public final on0 f40234b;

    public zl0(on0 on0Var, int i10) {
        this.f40233a = i10;
        this.f40234b = on0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f40233a;
        on0 on0Var = this.f40234b;
        switch (i10) {
            case 0:
                if (on0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    au auVar = new au(null, false);
                    auVar.f31955r = new d20(22, on0Var, view);
                    on0Var.presentFragment(auVar);
                }
                return true;
            case 1:
                if (on0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(on0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18437a;
                    b2Var.R = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new uv(on0Var, 2));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    on0Var.showDialog(b2Var);
                }
                return true;
            case 2:
                if (on0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    au auVar2 = new au(null, false);
                    auVar2.f31955r = new am0(on0Var, 2);
                    on0Var.presentFragment(auVar2);
                }
                return true;
            default:
                if (on0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    au auVar3 = new au(null, false);
                    auVar3.f31955r = new am0(on0Var, 3);
                    on0Var.presentFragment(auVar3);
                }
                return true;
        }
    }
}
