package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zl0 implements View.OnTouchListener {
    public final int f44693a;
    public final mn0 f44694b;

    public zl0(mn0 mn0Var, int i10) {
        this.f44693a = i10;
        this.f44694b = mn0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f44693a;
        mn0 mn0Var = this.f44694b;
        switch (i10) {
            case 0:
                if (mn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    yt ytVar = new yt(null, false);
                    ytVar.f44498r = new nw(25, mn0Var, view);
                    mn0Var.presentFragment(ytVar);
                }
                return true;
            case 1:
                if (mn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mn0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                    a2Var.R = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new sv(mn0Var, 2));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    mn0Var.showDialog(a2Var);
                }
                return true;
            case 2:
                if (mn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    yt ytVar2 = new yt(null, false);
                    ytVar2.f44498r = new am0(mn0Var, 2);
                    mn0Var.presentFragment(ytVar2);
                }
                return true;
            default:
                if (mn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    yt ytVar3 = new yt(null, false);
                    ytVar3.f44498r = new am0(mn0Var, 3);
                    mn0Var.presentFragment(ytVar3);
                }
                return true;
        }
    }
}
